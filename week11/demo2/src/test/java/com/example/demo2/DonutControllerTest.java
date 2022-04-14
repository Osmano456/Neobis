package com.example.demo2;

import com.example.demo2.controller.CakeController;
import com.example.demo2.models.Cake;
import com.example.demo2.models.Customer;
import com.example.demo2.models.Donut;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.junit.Assert.assertEquals;
import static org.springframework.security.test.web.servlet.setup.SecurityMockMvcConfigurers.springSecurity;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class DonutControllerTest {

    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private WebApplicationContext context;

    @Before
    public void setup() {
        mockMvc = MockMvcBuilders.webAppContextSetup(context).apply(springSecurity()).build();
    }



    @Test
    @WithMockUser(username = "osman", roles = {"ADMIN"})
    public void testAddDonuts() throws Exception {
        Donut donut = new Donut(1,"Chocolate",32,"Large");
        String jsonRequest = objectMapper.writeValueAsString(donut);

        MvcResult result = mockMvc
                .perform(post("/donut/add").content(jsonRequest).contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk()).andReturn();

        assertEquals(200, result.getResponse().getStatus());

    }

    @WithMockUser(username = "osman", roles = {"ADMIN"})
    @Test
    public void testGetAllDonuts() throws Exception {


        MvcResult result = mockMvc
                .perform(get("/donut/all").contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk()).andReturn();

        assertEquals(200, result.getResponse().getStatus());

    }

    @WithMockUser(username = "osman", roles = {"ADMIN"})
    @Test
    public void testGetDonutByID() throws Exception {


        MvcResult result = mockMvc
                .perform(get("/donut/1").contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk()).andReturn();

        assertEquals(200, result.getResponse().getStatus());

    }

    @WithMockUser(username = "osman", roles = {"ADMIN"})
    @Test
    public void testDeleteDonutByID() throws Exception {


        MvcResult result = mockMvc
                .perform(delete("/donut/delete/1").contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk()).andReturn();

        assertEquals(200, result.getResponse().getStatus());

    }


    @WithMockUser(username = "osman", roles = {"ADMIN"})
    @Test
    public void testUpdate() throws Exception {

        Donut donut = new Donut(1,"Chocolate",32,"Large");

        MvcResult result = mockMvc
                .perform(put("/donut/1").contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk()).andReturn();

        assertEquals(200, result.getResponse().getStatus());

    }


}
