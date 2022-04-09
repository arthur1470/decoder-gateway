package com.ead.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DecoderGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(DecoderGatewayApplication.class, args);
    }

}
