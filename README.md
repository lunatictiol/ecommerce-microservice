## README

### Microservices-Based E-commerce Platform

**Overview**
This project implements a microservices architecture for an e-commerce platform, utilizing Spring Boot, Spring Cloud, and Kafka. The system comprises multiple services for product management, user management, order processing, payments, email notifications, and service discovery.

**Services**
* **Product Service:** Manages product catalog data, stored in PostgreSQL.
* **UserService:** Handles user information.
* **OrderService:** Processes orders, including creation, status updates, and order details. Uses PostgreSQL.
* **PaymentService:** Handles payment processing. Uses PostgreSQL.
* **EmailService:** Sends transactional emails for order confirmation.
* **Eureka Server:** Acts as the service discovery registry.
* **Config Server:** Centralized configuration management for microservices.

**Technology Stack**
* **Spring Boot:** Framework for building microservices.
* **Spring Cloud:** Provides tools for service discovery, configuration management, and circuit breaking.
* **Kafka:** Message broker for asynchronous communication between services.
* **PostgreSQL:** Database for product, order, and payment data.
* **MongoDB:** Database for user data.


**Running the Application**
Start the Eureka server, Config server, and other services in the following order:
1. Eureka Server
2. Config Server
3. Product Service
4. UserService
5. Order Service
6. Payment Service
7. Email Service
## Acknowledgments

This project was inspired by a tutorial by @BoualiAli. Their content provided valuable insights and guidance throughout the development process.



