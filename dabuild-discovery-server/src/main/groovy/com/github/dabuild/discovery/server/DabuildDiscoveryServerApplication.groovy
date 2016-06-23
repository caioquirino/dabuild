package com.github.dabuild.discovery.server


import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class DabuildDiscoveryServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(DabuildDiscoveryServerApplication.class, args)
    }

}
