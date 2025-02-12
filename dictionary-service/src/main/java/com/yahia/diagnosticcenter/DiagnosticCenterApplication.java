package com.yahia.diagnosticcenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DiagnosticCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiagnosticCenterApplication.class, args);
    }

}
