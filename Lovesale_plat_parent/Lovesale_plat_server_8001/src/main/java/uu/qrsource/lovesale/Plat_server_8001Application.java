package uu.qrsource.lovesale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import javax.swing.*;

@SpringBootApplication
@EnableEurekaClient
public class Plat_server_8001Application {
    public static void main(String[] args) {
        SpringApplication.run(Plat_server_8001Application.class);
    }
}
