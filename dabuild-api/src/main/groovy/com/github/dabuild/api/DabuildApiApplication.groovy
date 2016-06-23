package com.github.dabuild.api

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.client.loadbalancer.LoadBalanced
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.web.client.RestTemplate

@EnableAutoConfiguration
@ComponentScan(basePackageClasses = DabuildApiApplication.class)
@EnableDiscoveryClient
class DabuildApiApplication {

    @LoadBalanced
    @Bean
    RestTemplate restTemplate() {
        new RestTemplate()
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(DabuildApiApplication.class, args)
    }

}
