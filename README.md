# Springboot Repository - Monorepo Structure

This repository contains multiple Spring Boot projects organized in a monorepo structure.

## Projects

### pj1 - Spring Boot Hello World
- **Location:** `./pj1/`
- **Description:** Hello World Spring Boot application with a basic REST API
- **Main Class:** `com.example.helloworld.HelloWorldApplication`
- **API Endpoints:**
  - `GET /api/hello` - Returns a hello world message

**Setup and Run:**
```bash
cd pj1
mvn clean install
mvn spring-boot:run
```

### pj2 - Spring Boot Project 2
- **Location:** `./pj2/`
- **Description:** Second Spring Boot project (placeholder)
- **Main Class:** `com.example.helloworld.HelloWorldApplication`

**Setup and Run:**
```bash
cd pj2
mvn clean install
mvn spring-boot:run
```

## Repository Structure

```
springboot_repo/
├── pj1/                    # Project 1
│   ├── src/
│   ├── pom.xml
│   └── README.md
├── pj2/                    # Project 2
│   ├── src/
│   ├── pom.xml
│   └── README.md
└── README.md               # This file
```

## Getting Started

1. Clone the repository:
   ```bash
   git clone https://github.com/HrushiGit03/Springboot_repo.git
   cd Springboot_repo
   ```

2. Navigate to a specific project:
   ```bash
   cd pj1  # or cd pj2
   ```

3. Install dependencies and run:
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

## Technologies Used
- Spring Boot
- Maven
- Java

## License
Open source

## Notes
- Each project is independent but shares the same repository
- Follow the structure to add more projects as needed
- Each project maintains its own `pom.xml` and dependencies
