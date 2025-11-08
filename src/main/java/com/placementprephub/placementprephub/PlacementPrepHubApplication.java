package com.placementprephub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.placementprephub")
public class PlacementPrepHubApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlacementPrepHubApplication.class, args);
    }
}