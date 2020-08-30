package ru.javawebinar.topjava.graduation;

import lombok.AllArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Properties;

@AllArgsConstructor
@SpringBootApplication(scanBasePackages = {"ru.javawebinar.topjava.graduation.*.*"})
public class Application {

    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.put("server.port", "8080");
        properties.put("server.servlet.contextPath", "/rest");
        SpringApplication application = new SpringApplication(Application.class);
        application.setDefaultProperties(properties);
        application.run(args);
    }
}