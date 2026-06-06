# Spring Boot Hello World Application (PJ1)

A simple yet comprehensive Spring Boot application demonstrating RESTful API endpoints with full test coverage.

## 📋 Overview

This project showcases:
- Basic Spring Boot setup with Maven
- RESTful API endpoints (GET, POST, PUT, DELETE)
- Request parameters and path variables
- Comprehensive unit testing with JUnit 5 and MockMvc

## 🚀 Quick Start

### Prerequisites
- Java 17 or higher
- Maven 3.6+

### Build
```bash
cd springboot-hello-world-PJ1
mvn clean install
```

### Run
```bash
mvn spring-boot:run
```

The application will start on `http://localhost:8080`

## 📡 API Endpoints

### 1. **Welcome Endpoint**
```
GET /api/
```
Returns a welcome message.

**Response:**
```
Hello, World! Welcome to Spring Boot Hello World Application!
```

---

### 2. **Personalized Greeting**
```
GET /api/hello?name=YourName
```
Returns a personalized greeting. The `name` parameter is optional (defaults to "World").

**Examples:**
- `GET /api/hello` → `Hello, World! Welcome to Spring Boot.`
- `GET /api/hello?name=John` → `Hello, John! Welcome to Spring Boot.`

---

### 3. **Get User by ID**
```
GET /api/user/{id}
```
Retrieves user information by ID.

**Example:**
```
GET /api/user/123
Response: User ID: 123, Name: User123
```

---

### 4. **Application Status**
```
GET /api/status
```
Returns the application status.

**Response:**
```
Application is running successfully!
```

---

### 5. **Echo Service**
```
POST /api/echo
Content-Type: application/json
Body: Your message
```
Echoes back the message sent in the request body.

**Example:**
```
POST /api/echo
Body: "Hello Spring Boot"
Response: You sent: Hello Spring Boot
```

---

### 6. **Application Info**
```
GET /api/info
```
Returns application metadata.

**Response:**
```json
{
  "app": "Spring Boot Hello World",
  "version": "1.0.0",
  "status": "running"
}
```

---

### 7. **Get Current Timestamp**
```
GET /api/timestamp
```
Returns the current system timestamp.

**Response:**
```
Current Timestamp: 1717667400000
```

---

### 8. **Update User**
```
PUT /api/update/{id}
Content-Type: application/json
Body: Update details
```
Updates user information.

**Example:**
```
PUT /api/update/1
Body: "New Details"
Response: User 1 updated with details: New Details
```

---

### 9. **Delete User**
```
DELETE /api/delete/{id}
```
Deletes a user by ID.

**Example:**
```
DELETE /api/delete/1
Response: User 1 has been deleted.
```

---

## 🧪 Testing

### Run All Tests
```bash
mvn test
```

### Test Coverage
The project includes comprehensive tests for all endpoints:
- ✅ GET requests
- ✅ POST requests
- ✅ PUT requests
- ✅ DELETE requests
- ✅ Query parameters
- ✅ Path variables

### Test Classes
- `HelloWorldApplicationTests.java` - Contains 11 unit tests covering all API endpoints

## 📂 Project Structure

```
springboot-hello-world-PJ1/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/helloworld/
│   │   │       └── HelloWorldApplication.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       └── java/
│           └── com/example/helloworld/
│               └── HelloWorldApplicationTests.java
├── pom.xml
└── README.md
```

## 🛠️ Technologies Used

- **Spring Boot 3.1.5** - Framework
- **Spring Web** - REST API support
- **JUnit 5** - Testing framework
- **Maven** - Build tool
- **Java 17** - Programming language

## 📝 Configuration

Key application properties can be modified in `src/main/resources/application.properties`:

```properties
# Server port
server.port=8080

# Application name
spring.application.name=springboot-hello-world

# Logging level
logging.level.root=INFO
```

## 🔧 Building from Source

```bash
# Clone the repository (if applicable)
git clone https://github.com/HrushiGit03/Springboot_repo.git
cd Springboot_repo/springboot-hello-world-PJ1

# Build the project
mvn clean package

# Run the JAR
java -jar target/springboot-hello-world-1.0.0.jar
```

## 📚 Example API Calls

### Using cURL

```bash
# Welcome
curl http://localhost:8080/api/

# Personalized greeting
curl http://localhost:8080/api/hello?name=Alice

# Get user
curl http://localhost:8080/api/user/5

# Get status
curl http://localhost:8080/api/status

# Echo
curl -X POST -H "Content-Type: application/json" \
     -d "Hello from cURL" \
     http://localhost:8080/api/echo

# Update user
curl -X PUT -H "Content-Type: application/json" \
     -d "Updated Information" \
     http://localhost:8080/api/update/2

# Delete user
curl -X DELETE http://localhost:8080/api/delete/3
```

### Using Postman

1. Create a new collection "Spring Boot Hello World"
2. Add requests for each endpoint
3. Test each HTTP method (GET, POST, PUT, DELETE)

## 🚦 Next Steps

- Add database integration (JPA/Hibernate)
- Implement user authentication
- Add request validation
- Create DTOs for better data transfer
- Add logging and error handling
- Deploy to production

## 📄 License

This project is open source and available under the MIT License.

## 👤 Author

HrushiGit03

---

**Happy Coding! 🎉**
