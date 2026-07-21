# Spring Boot Docker MySQL REST API

A Dockerized Spring Boot REST API application that performs CRUD operations on Student data using Spring Data JPA and MySQL. The project demonstrates how to containerize a Spring Boot application using Docker and orchestrate the application and database with Docker Compose.

---

## Features

- CRUD Operations (Create, Read, Update, Delete)
- RESTful API Design
- Spring Boot
- Spring Data JPA
- MySQL Database
- Docker
- Docker Compose
- Maven Build
- Layered Architecture

---

## Tech Stack

| Technology | Version |
|------------|----------|
| Java | 21+ |
| Spring Boot | 4.x |
| Spring Data JPA | Latest |
| MySQL | 8.x |
| Docker | Latest |
| Docker Compose | Latest |
| Maven | 3.x |

---

## Project Structure

```
springboot-docker-mysql-rest-api
│
├── src
│   ├── main
│   └── test
│
├── Dockerfile
├── docker-compose.yml
├── pom.xml
├── mvnw
├── mvnw.cmd
├── .gitignore
└── README.md
```

---

## Docker Architecture

```
                Docker Compose
                     │
         ┌───────────┴───────────┐
         │                       │
         ▼                       ▼
 Spring Boot Container      MySQL Container
       Port 8082               Port 3306
               │
               ▼
          Student Database
```

---

## Build the Project

```bash
mvn clean package
```

---

## Build Docker Image

```bash
docker build -t springboot-docker-mysql .
```

---

## Run with Docker Compose

```bash
docker compose up --build
```

Run in detached mode:

```bash
docker compose up -d
```

Stop containers:

```bash
docker compose down
```

---

## API Endpoints

| Method | Endpoint | Description |
|----------|--------------------------|----------------|
| GET | /docs/get | Get All Students |
| GET | /docs/get{id} | Get Student By ID |
| POST | /docs/save | Add Student |
| PUT | /docs/put/{id} | Update Student |
| DELETE | /docs/delete/{id} | Delete Student |

---

## Sample JSON

```json
{
    "name": "Kiran",
    "email": "kiran@gmail.com",
    "grade": "A"
}
```

---

## Technologies Demonstrated

- Spring Boot REST API
- Dependency Injection
- Spring Data JPA
- Hibernate ORM
- MySQL Integration
- Docker Image Creation
- Docker Compose
- Container Networking
- Maven Build Lifecycle

---

## Getting Started

1. Clone the repository

```bash
git clone https://github.com/your-username/springboot-docker-mysql-rest-api.git
```

2. Navigate to the project

```bash
cd springboot-docker-mysql-rest-api
```

3. Start the application

```bash
docker compose up --build
```

The application will be available at

```
http://localhost:8082
```

---

## Future Enhancements

- Spring Security with JWT
- Swagger/OpenAPI Documentation
- Unit Testing with JUnit
- Integration Testing
- CI/CD Pipeline using GitHub Actions
- Kubernetes Deployment

---

## Author

**Kiran K**

Java Full Stack Developer

Skills:
- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- REST APIs
- Docker
- MySQL
- Git & GitHub
- Maven

---

## License

This project is created for learning and portfolio purposes.
