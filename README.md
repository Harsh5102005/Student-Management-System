# 📚 Student Management System (Spring Boot + JWT)

A secure backend application built using **Spring Boot** that allows user registration, authentication, and management of student records with **role-based access control**.

---

## 🚀 Features

- 🔐 User Registration & Login
- 🔑 JWT-based Authentication
- 🛡️ Role-Based Access Control (USER / ADMIN)
- 📊 CRUD Operations on Student Data
- 🔒 Secure Password Storage using BCrypt
- ⚙️ Custom JWT Filter integrated with Spring Security

---

## 🛠️ Tech Stack

- **Backend:** Spring Boot, Spring Security
- **Authentication:** JWT (JSON Web Token)
- **Database:** MySQL
- **ORM:** Spring Data JPA
- **Tools:** Postman, Git, GitHub

---

## 📌 API Endpoints

### 🔐 Authentication

- `POST /auth/register` → Register new user  
- `POST /auth/login` → Login and get JWT token  

---

### 👨‍🎓 Student APIs (Protected)

> Require Authorization Header:
