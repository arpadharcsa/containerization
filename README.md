
# Containerization and Spring Boot
## How to build the app
### Create the runnable application via Maven
    mvn clean package
### Create the docker image
    docker build -t spring-docker:1.0.0 .

## Start the container instance

    docker run -d -p 8888:8080 --name demo spring-docker:1.0.0


## Build results

| Description                                                  | Version | Size |
|--------------------------------------------------------------|---------|------|
| Basic Docker image has been created without any optimisation | 1.0.0   |  486MB    |
