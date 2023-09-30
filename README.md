
# 5SIM1-G2-KADDEM

<div align="center">

![springboot](https://img.shields.io/badge/springboot-2.4.5-green)
![mysql](https://img.shields.io/badge/mysql-8.0.23-blue)
![maven](https://img.shields.io/badge/maven-3.8.1-red)
![java](https://img.shields.io/badge/java-11-orange)
![docker](https://img.shields.io/badge/docker-20.10.6-blue)
![docker-compose](https://img.shields.io/badge/docker--compose-1.29.1-blue)
![swagger](https://img.shields.io/badge/swagger-3.0.0-green)
![junit](https://img.shields.io/badge/junit-5.7.1-green)
![Jenkins](https://img.shields.io/badge/Jenkins-2.289.1-red)
![SonarQube](https://img.shields.io/badge/SonarQube-8.9.0-red)

</div> 

## Table of Contents
- [Introduction](#introduction)
- [Technologies](#technologies)
- [Architecture](#architecture)
- [Installation](#installation)
- [Usage](#usage)
- [Tests](#tests)
- [Contributors](#contributors)
- [License](#license)
- [References](#references)

## Introduction
This project is a REST API for a library management system. 
It allows to manage books, authors, users and loans. 
It also allows to search for books by title, author or category. 
The API is documented with Swagger and the code is tested with JUnit. 
The project is built with Maven and the application is packaged in a Docker image. 
The project is deployed on a Jenkins server and the code is analyzed with SonarQube.

## Technologies
- Java 11
- Spring Boot 2.4.5
- MySQL 8.0.23
- Maven 3.8.1
- Docker 20.10.6
- Docker Compose 1.29.1
- Swagger 3.0.0
- JUnit 5.7.1
- Jenkins 2.289.1
- SonarQube 8.9.0


## Architecture
The architecture of the project is based on the MVC pattern.
The project is divided into 4 layers:
- **Controller**: This layer is responsible for receiving requests and sending responses.
- **Service**: This layer is responsible for the business logic.
- **Repository**: This layer is responsible for the data access.
- **Model**: This layer is responsible for the data structure.


