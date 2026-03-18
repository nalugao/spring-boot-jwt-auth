# JWT Authentication Project

## Overview
This project demonstrates how to implement JWT (JSON Web Token) authentication in a Spring Boot application.

## Features
- User registration
- User login with JWT token generation
- Secured endpoints requiring authentication
- Token-based authentication for APIs

## Technologies Used
- Java
- Spring Boot
- Spring Security
- JWT (Java JSON Web Token)
- PostgreSQL
- JPA / Hibernate

## Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/nalugao/spring-boot-jwt-auth.git
   ```
2. Navigate to the project directory:
   ```bash
   cd spring-boot-jwt-auth
   ```
3. Build the project using Maven:
   ```bash
   mvn clean install
   ```

## Configuration
- Set up application properties in `src/main/resources/application.properties`.
  - Change the JWT secret and expiration time as needed.

## API Endpoints

| Method | Endpoint         | Description                      |
|--------|------------------|----------------------------------|
| POST   | /auth/register   | Register a new user              |
| POST   | /auth/login      | Authenticate user and return JWT |

### Register

```json
POST /auth/register
{
  "username": "your_username",
  "password": "123456"
}
```

### Login

```json
POST /auth/login
{
  "username": "your_username",
  "password": "123456"
}
```

**Response:**
```json
{
  "token": "eyJhbGciOiJIUzI1NiJ9..."
}
```

### Using the token

Include the token in the `Authorization` header for protected routes:

```
Authorization: Bearer <your_token>
```
