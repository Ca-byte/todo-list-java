## Overview

This is a Maven project named "todolist," which serves as a task manager. It is built using the Spring Boot framework and is designed to manage tasks and to-do lists. Project developed during Curso gratuito e online de Java, run by **[@Rocketseat](https://github.com/Rocketseat)** during October 9, 10, 11, 12 and 13 2023.


## Project Details

- **Group ID**: br.com.carolinevieira
- **Artifact ID**: todolist
- **Version**: 1.0.0
- **Java Version**: 17

## Dependencies

The project has several dependencies, which are managed via Maven. Here are the main dependencies used:

- **Spring Boot Starter Actuator**: Provides production-ready features to monitor and manage your application.
- **Spring Boot Starter Web**: Enables building web applications with Spring Boot.
- **Spring Boot Starter Test**: Provides testing tools and dependencies for Spring Boot applications.
- **Spring Boot Starter Data JPA**: Simplifies the setup of Spring Data JPA.
- **H2 Database**: An in-memory database for development and testing.
- **Project Lombok**: A library that helps reduce boilerplate code.
- **Bcrypt**: A library for hashing passwords securely.
- **Spring Boot Devtools**: Provides tools for faster application development.

## Build and Run

This project is built and managed with Maven. You can use the following commands to build and run the application:

```bash
# Clone this project
$ git@github.com:Ca-byte/todo-list-java.git

# To build the project:
$ mvn clean install

# To run the application:
$ mvn spring-boot:run

# The application will be accessible at the default Spring Boot port (usually http://localhost:8080).

```


### Important Notes
- The project uses Spring Boot 3.1.3 as the parent version.
Java 17 is the targeted Java version.
- Spring Boot Devtools is marked as an optional dependency, which is typically used for development and should be removed in a production build.
- For database setup, the project is configured to use the H2 in-memory database by default.

---

## Deployment on Render

This project can be easily deployed on the Render platform. Render provides a simple and scalable way to host web applications.

[**Live Deployment**](https://todo-list-java-5oak.onrender.com)


### Deployment Steps

1. Sign up for a Render account if you haven't already: [Render Sign Up](https://render.com/sign-up).

2. Create a new web service on Render.

3. Connect your repository to the Render service and configure the build settings.

4. Render will automatically build and deploy your application whenever you push changes to your repository.

5. Access your deployed application on the provided URL.

For more details on deploying your project on Render, refer to Render's official documentation: [Render Documentation](https://render.com/docs/).

Remember to configure any environment variables or specific settings required for your application to run correctly on Render.

---

<br>

<p align="center">Developed with 💜 by Caroline Vieira</p>

