# dabuild
Docker Automated Build Infrastructure made easy with dabuild


## Components:

dabuild-webhook-api: Receive all Github (or webhook API) requests via HTTP - Spring MVC

dabuild-web: Web Interface - TBD

dabuild-service: REST Services Interface for Web component - Spring MVC

dabuild-repository: REST Repository for Service Interface - Spring Data REST

dabuild-config-server: Configuration Server - Spring Cloud Config

dabuild-discovery-server: Discovery Server - Eureka


## Deployment

With dabuild you can have two deployment types:

1 - As a single docker container, used for small environments or for testing.

2 - As a set of docker containers, used for clustered and production environments.
