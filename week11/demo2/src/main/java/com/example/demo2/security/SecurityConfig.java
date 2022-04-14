package com.example.demo2.security;


import com.example.demo2.security.jwt.JwtConfig;
import com.example.demo2.security.jwt.JwtTokenVerifier;
import com.example.demo2.security.jwt.JwtUsernameAndPasswordAuthenticationFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.crypto.SecretKey;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private final SecretKey secretKey;
    private final JwtConfig jwtConfig;


    @Autowired
    public SecurityConfig(SecretKey secretKey, JwtConfig jwtConfig) {
        this.secretKey = secretKey;
        this.jwtConfig = jwtConfig;
    }

    public SecurityConfig(boolean disableDefaults, SecretKey secretKey, JwtConfig jwtConfig) {
        super(disableDefaults);
        this.secretKey = secretKey;
        this.jwtConfig = jwtConfig;
    }



    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("osman")
                .password("123")
                .roles("ADMIN")
                .and()
                .withUser("user")
                .password("user")
                .roles("USER");
    }

    @Bean
    public PasswordEncoder getPasswordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
            http
                    .csrf().disable()
                    .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                    .and()
                    .addFilter(new JwtUsernameAndPasswordAuthenticationFilter(authenticationManager(),jwtConfig,secretKey))
                    .addFilterAfter(new JwtTokenVerifier(jwtConfig,secretKey), JwtUsernameAndPasswordAuthenticationFilter.class)
                    .authorizeRequests()
                    .antMatchers("/","cake/1").permitAll()
                    .antMatchers("/**").hasRole("ADMIN")
                    .anyRequest()
                    .authenticated()

                    ;

    }


}
