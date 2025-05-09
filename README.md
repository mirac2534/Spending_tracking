
# Expense Tracking System - Backend Service

## Project Description
This is a **Simple Expense Tracking System Backend** developed using **Java Spring Boot**.  
It allows users to **add**, **list**, **update**, and **delete** personal expenses through REST API endpoints.

---

## Key Features

### 1. Add Single Expense
- Add one expense record to the system.

### 2. Add Multiple Expenses
- Add multiple expenses at once with a single API request.

### 3. List All Expenses
- Retrieve all recorded expenses.

### 4. Update an Expense
- Update details of an existing expense by its ID.

### 5. Delete an Expense
- Remove an expense record by its ID.

---

## Technologies and Tools Used
- Java 17+
- Spring Boot 3.4.5
- Spring Data JPA
- Hibernate ORM
- MSSQL Server
- Lombok

---

## API Endpoints

| Method  | Endpoint                | Description              |
|--------|-------------------------|--------------------------|
| POST   | `/api/expenses`          | Add a single expense     |
| POST   | `/api/expenses/bulk`     | Add multiple expenses    |
| GET    | `/api/expenses`          | List all expenses        |
| PUT    | `/api/expenses/{id}`     | Update an expense by ID  |
| DELETE | `/api/expenses/{id}`     | Delete an expense by ID  |

---

## How to Run the Project

### 1. Database Setup
- Create a database named `HarcamaTakip` in your MSSQL Server instance.

### 2. Configure Application Properties
```properties
spring.datasource.url=jdbc:sqlserver://localhost:1433;databaseName=HarcamaTakip;encrypt=false
spring.datasource.username=your-username
spring.datasource.password=your-password

## Example API Usage

### Add Single Expense

- **POST** `/api/expenses`
- Example Request Body:
  ```json
  [
  {
    "amount": 100.0,
    "category": "Transportation",
    "description": "Bus ticket",
    "createdAt": "2025-05-01"
  },
  {
    "amount": 250.0,
    "category": "Shopping",
    "description": "Clothing purchase",
    "createdAt": "2025-05-02"
  }
  ]
