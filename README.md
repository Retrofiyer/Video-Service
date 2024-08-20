<div>
    <h1>Video Microservice</h1>
</div>

## About The Project

This microservice is responsible for handling video uploads within the streaming application. It allows users to upload videos to the platform, ensuring that each file is processed, stored, and made 
available for streaming.

## Table of Contents

<ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#overview">Overview</a></li>
        <li><a href="#features">Features</a></li>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
        <li><a href="#configuration">Configuration</a></li>
        <li><a href="#running-the-service">Running the service</a></li>
      </ul>
    </li>
    <li>
      <a href="#contributing">Contributing</a>
    </li>
 </ol>

## Overview

The Video Service is a RESTful API built using Spring Boot. The Video Service plays a critical role in enabling content creators to share their videos seamlessly with the audience.

## Features

<div>
  <ul>
      <li> <b>Video Upload:</b> Users can upload videos in various formats, which are then processed for streaming.</li>
      <li> <b>Video Privacy Settings:</b> Allows content creators to set privacy levels for their videos.</li>
  </ul>
</div>


## Built With

[![Spring Boot][springboot.com]][springboot-url]
[![MongoDB][mongodb.com]][mongodb-url]
[![RabbitMQ][rabbitmq.com]][rabbitmq-url]
[![Swagger][swagger.com]][swagger-url] [![Docker][docker.com]][docker-url]

<!-- GETTING STARTED -->
## Getting Started

## Prerequisites

Before you begin, make sure you have the following tools installed on your machine:

- **Java 17 or higher** - [Download Java](https://www.oracle.com/java/technologies/javase-downloads.html)
- **Spring Boot 3.3.2** - [Spring Boot Documentation](https://spring.io/projects/spring-boot)
- **Maven** - [Maven](https://maven.apache.org/install.html)

If you don't have any of these tools installed, follow the provided links to install them.


## Installation

1.- Clone the repository
   ```sh
   git clone https://github.com/Retrofiyer/Video-Service.git
   cd Video-Service
   ```
2.- Build project using maven
 ```sh
   mvn clean install
   ```

## Configuration

The configuration for the User Service is located in `src/main/resources/application.properties`. Below is an example configuration:

 ```sh
spring.data.mongodb.uri=mongodb://username:password@host:port/db-name
   ```

## Running the service

  ```sh
    mvn spring-boot:run
   ```

## Contributing

I would like you to contribute to this project. Whether it's fixing a bug, adding a new feature or improving the documentation, your help is always welcome. Please email me at `sebitas5225@gmail.com` with all the details for improvement.

<!-- LINKS & IMAGES -->

[docker.com]: https://img.shields.io/badge/Docker-black?style=for-the-badge&logo=docker&logoColor=white
[docker-url]: https://www.docker.com/
[springboot.com]: https://img.shields.io/badge/SpringBoot-black?style=for-the-badge&logo=springboot&logoColor=white
[springboot-url]: https://spring.io/projects/spring-boot
[java.com]: https://img.shields.io/badge/Java-black?style=for-the-badge&logo=java&logoColor=white
[java-url]: https://www.oracle.com/java/
[rabbitmq.com]: https://img.shields.io/badge/RabbitMQ-black?style=for-the-badge&logo=rabbitmq&logoColor=white
[rabbitmq-url]: https://www.rabbitmq.com/
[swagger.com]: https://img.shields.io/badge/Swagger-black?style=for-the-badge&logo=swagger&logoColor=white
[swagger-url]: https://swagger.io/
[mongodb.com]: https://img.shields.io/badge/MongoDB-black?style=for-the-badge&logo=mongodb&logoColor=white
[mongodb-url]: https://www.mongodb.com/
