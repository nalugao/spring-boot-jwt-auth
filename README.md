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
| Method | Endpoint                  | Description                      |
|--------|---------------------------|----------------------------------|
| POST   | /api/auth/register        | Register a new user             |
| POST   | /api/auth/login           | Authenticate user and return JWT |
| GET    | /api/protected            | Secured endpoint (requires JWT) |

## Usage
- Use an API client like Postman to test the endpoints.
- Include the JWT token in the Authorization header for secured endpoints:
  ```bash
  Authorization: Bearer <your_token>
  ```

## Contributing
- Fork the repository.
- Create a new branch for your feature:
  ```bash
  git checkout -b feature/your-feature
  ```
- Commit your changes and push to the branch:
  ```bash
  git push origin feature/your-feature
  ```
- Open a pull request.

## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Contact
For any questions, please reach out to [nalugao](https://github.com/nalugao).