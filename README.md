# EatStreet

EatStreet is a sophisticated food ordering system developed using the Java Spring Boot Framework. The system follows a microservice-based architecture that adheres to Clean and Hexagonal architecture principles, making it scalable, maintainable, and easily extendable. Some of the key technical features of EatStreet include:

* Implementation of the domain layer using Domain Driven Design (DDD) principles to ensure that the business logic is decoupled from the infrastructure layer.
* Use of SAGA, Outbox, and CQRS patterns to manage complex workflows in the system. SAGA pattern is used to handle distributed transactions, while Outbox pattern is used to ensure that the database writes are atomic and idempotent. CQRS pattern is used to separate the read and write models, providing a more scalable solution.
* Use of Apache Kafka as the event store, which enables the system to communicate between services and to implement the architectural patterns. Kafka allows for reliable messaging between the microservices, ensuring that each service operates independently of the others.
* Use of Spring Data JPA for PostgreSQL to communicate with the data stores in the microservices. The use of JPA allows for a simplified database access layer, while PostgreSQL provides a secure and scalable data storage solution.
* Use of Spring Kafka for Kafka, providing a streamlined and efficient method of communication between the services.

## Module Dependency Diagram
![dependency-module diagram](.//docs/images/dependency-graph.png)
## Domain Driven Design Diagrams
### Order Service
![DDD diagram](.//docs/images/orderServiceDDD.png)
### Payment Service
![DDD diagram](.//docs/images/paymentServiceDDD.png)

## Class Diagrams
### Order Service
![Class diagram](.//docs/images/order-service.png)
### Payment Service
![Class diagram](.//docs/images/payment-service.png)
### Combined System Class Diagram
![UML diagram](.//docs/images/EatStreet.png)

