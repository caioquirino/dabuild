# dabuild
Docker Automated Build Infrastructure made easy with dabuild


## Instructions:

* **Build**: ./gradlew clean build buildDocker
* **Run**: docker-compose up


## Components:

* **webhook-api**: Receive all Github (or webhook API) requests via HTTP - Spring MVC

* **web**: Web Interface - TBD

* **service-api**: REST Services Interface for Web component - Spring MVC

* **service**: REST Services Interface for Web component - Spring MVC

* **repository**: REST Repository for Service Interface - Spring Data REST

* **config-server**: Configuration Server - Spring Cloud Config

* **discovery-server**: Discovery Server - Eureka


## Deployment

With dabuild you can have two deployment types:

1. As a single docker container, used for small environments or for testing.

2. As a set of docker containers, used for clustered and production environments.
