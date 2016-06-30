package com.github.dabuild.proxy.server

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.zuul.EnableZuulProxy

@EnableZuulProxy
@SpringBootApplication
class ProxyServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProxyServerApplication.class, args);
    }
}
