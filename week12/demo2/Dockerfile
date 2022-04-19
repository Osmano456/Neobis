FROM openjdk:11.0.6-jre
COPY target/demo2-0.0.1-SNAPSHOT.jar /app.jar
EXPOSE 8080
CMD ["/usr/local/openjdk-11/bin/java", "-jar", "-Dspring.profiles.active=default", "/app.jar"]