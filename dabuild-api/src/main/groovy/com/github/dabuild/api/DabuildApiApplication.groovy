package com.github.dabuild.api

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.context.annotation.ComponentScan

@EnableAutoConfiguration
@ComponentScan(basePackageClasses = DabuildApiApplication.class)
@EnableDiscoveryClient
class DabuildApiApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(DabuildApiApplication.class, args)
    }

}
