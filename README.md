# Spring Boot Hello World Application

A simple Spring Boot application demonstrating REST API endpoints with a Hello World example.

## Project Overview

This is a basic Spring Boot application built with:
- **Spring Boot 3.2.5** (Latest stable version)
- **Java 17**
- **Maven**
- **Spring Web Starter**

## Project Structure

```
spring-boot-hello-world/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/
│   │   │       ├── SpringBootHelloWorldApplication.java (Main class)
│   │   │       └── controller/
│   │   │           └── HelloController.java (REST Controller)
│   │   └── resources/
│   │       └── application.properties (Configuration)
│   └── test/
│       └── java/
│           └── com/example/
│               └── SpringBootHelloWorldApplicationTests.java
├── pom.xml (Maven configuration)
└── README.md
```

## Prerequisites

- **JDK 17** or higher
- **Maven 3.6** or higher
- **Git** (optional)

## Build Instructions

### Step 1: Navigate to Project Directory

```bash
cd spring-boot-hello-world
```

### Step 2: Clean and Build

```bash
mvn clean install
```

### Step 3: Run the Application

```bash
mvn spring-boot:run
```

Or run the JAR directly:

```bash
java -jar target/spring-boot-hello-world-1.0.0.jar
```

## API Endpoints

Once the application is running, you can access:

### 1. Hello World Endpoint
- **URL:** `http://localhost:8080/api/hello`
- **Method:** GET
- **Response:** `Hello, World! Welcome to Spring Boot!`

### 2. Personalized Greeting
- **URL:** `http://localhost:8080/api/hello/{name}`
- **Method:** GET
- **Example:** `http://localhost:8080/api/hello/John`
- **Response:** `Hello, John! Welcome to Spring Boot!`

### 3. Health Check
- **URL:** `http://localhost:8080/api/health`
- **Method:** GET
- **Response:** `Application is running successfully!`

## Testing

Run the test suite:

```bash
mvn test
```

## Dependencies

The project includes the following key dependencies:

1. **spring-boot-starter-web** - For building REST APIs
2. **spring-boot-devtools** - For development convenience (hot reload)
3. **spring-boot-starter-test** - For unit testing
4. **lombok** - For reducing boilerplate code (optional)

## Configuration

Application settings can be modified in `src/main/resources/application.properties`:

- **Server Port:** `server.port=8080`
- **Logging Level:** `logging.level.com.example=DEBUG`
- **DevTools Enabled:** `spring.devtools.restart.enabled=true`

## Using cURL to Test Endpoints

```bash
# Test Hello World
curl http://localhost:8080/api/hello

# Test Personalized Greeting
curl http://localhost:8080/api/hello/Alice

# Test Health Check
curl http://localhost:8080/api/health
```

## Useful Maven Commands

```bash
# Clean the project
mvn clean

# Compile the project
mvn compile

# Run tests
mvn test

# Build the JAR
mvn package

# Skip tests during build
mvn package -DskipTests

# View dependency tree
mvn dependency:tree
```

## IDE Setup

### IntelliJ IDEA
1. Open the project directory
2. Click "Open"
3. Select pom.xml and click "Open as Project"

### Eclipse
1. Import → Maven → Existing Maven Projects
2. Select the project directory

### VS Code
1. Install Java Extension Pack
2. Open the folder in VS Code
3. Maven extension will automatically detect pom.xml

## Next Steps

To extend this application:

1. **Add Database Support:** Include `spring-boot-starter-data-jpa` and database driver
2. **Add Validation:** Include `spring-boot-starter-validation`
3. **Add Security:** Include `spring-boot-starter-security`
4. **Add API Documentation:** Include `springdoc-openapi-starter-webmvc-ui`

## Troubleshooting

### Port Already in Use
Change the port in `application.properties`:
```properties
server.port=8081
```

### Maven Command Not Found
Ensure Maven is installed and added to PATH:
```bash
mvn -version
```

### Java Version Mismatch
Ensure you have Java 17+ installed:
```bash
java -version
```

## References

- [Spring Boot Official Documentation](https://spring.io/projects/spring-boot)
- [Spring Boot Getting Started Guide](https://spring.io/guides/gs/spring-boot/)
- [Maven Documentation](https://maven.apache.org/)

## License

MIT License

---

**Happy Coding!** 🚀
