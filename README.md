# 🚀 Dashira Dashboard

 <img width="1684" height="783" alt="image" src="https://github.com/user-attachments/assets/7f994e2f-78e4-469a-8e9d-e6c695569c16" />


**Dashira** is a lightweight, full-stack user management dashboard built with:

- 🔷 **Angular** (Front-end)  
- ☕ **Java & Spring Boot** (Back-end)  
- 🐬 **MySQL** (Database)

> **Design Note:** A **free template** was used to save design time and focus on functionality.

---

## 🎯 Features

- **User Listing**  
  - Interactive, sortable, paginated table  
- **User Registration**  
- **Login / Authentication**  
- **Security**  
  - Password hashing with **Argon2**  
  - Stateless sessions with **JSON Web Tokens (JWT)**  

---

## 🛠️ Architecture

1. **Controller → Service → DAO** pattern  
2. Modular **Angular** components  
3. **Spring** beans for business logic and persistence  
4. Clear **MVC** separation of concerns  

---

## 📦 Technology Stack

| Layer       | Technology                         |
|:-----------:|:-----------------------------------|
| Front-end   | Angular                            |
| Back-end    | Java & Spring Boot                 |
| Database    | MySQL                              |
| Security    | Argon2 • JJWT (JSON Web Token)     |
| Build Tools | Maven                              |

---

## 🚀 Getting Started

1. **Clone the repository**  
   ```bash
   git clone https://github.com/TU_USERNAME/project.git
   cd project

2. **Configure the database**

   Edit src/main/resources/application.properties:
   
  * spring.datasource.url=jdbc:mysql://localhost/cursojava?useSSL=false
  * spring.datasource.username=root
  * spring.datasource.password=

3. **Run the back-end**

   mvn spring-boot:run

4. **Run the front-end**

   cd your-folder
   npm install
  ng serve

5. **Open in your browser**

   http://localhost:4200

  


   
