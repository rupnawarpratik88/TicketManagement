# Ticket Management System

A backend REST API I built to learn Spring Boot, JWT authentication, and Docker.
Manages support tickets with user authentication and role-based access.

## What I used
- Java 17 + Spring Boot
- PostgreSQL (database)
- Spring Security + JWT (authentication)
- Docker + Docker Compose (containerization)
- Maven

## What it does
- Users can register and login — login returns a JWT token
- All ticket endpoints are protected — you need the token to access them
- Create, view, update and delete tickets
- Filter tickets by status (OPEN, IN_PROGRESS, CLOSED) or priority (LOW, MEDIUM, HIGH)
- Pagination support on the tickets list
- Input validation — rejects empty titles or invalid priority values
- Clean JSON error responses instead of default Spring error pages

## How to run it

### With Docker (recommended)
Make sure Docker Desktop is running, then run:

    docker-compose up --build

App starts at http://localhost:8080

### Without Docker
1. Install Java 17 and PostgreSQL
2. Create a database called ticketdb
3. Update src/main/resources/application.properties with your PostgreSQL password
4. Run the app:

   ./mvnw spring-boot:run

## API Overview

*Auth endpoints (no token needed)*
- POST /auth/register — create a new user
- POST /auth/login — returns JWT token

*Ticket endpoints (JWT token required)*
- GET /tickets — list all tickets (supports pagination and filtering)
- GET /tickets/{id} — get one ticket
- POST /tickets — create a ticket
- PUT /tickets/{id} — update a ticket
- DELETE /tickets/{id} — delete a ticket

## What I learned building this
- How JWT authentication actually works under the hood
- How Spring Security filter chain processes requests
- How Docker containers communicate with each other
- Importance of input validation and proper error handling