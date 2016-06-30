#!/bin/bash
java -Djava.security.egd=file:/dev/./urandom \
  -Dspring.config.location=file:config/ \
  -Deureka.service.remoteRegionUrls=http://discovery-server:8080/eureka/ \
  -Deureka.region=default \
  -jar discovery-server.jar