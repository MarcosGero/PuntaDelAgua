# Punta Del Agua API

Punta Del Agua is a backend system designed to manage sales and inventory operations efficiently. Built with Java and Spring Boot.

## Overview

This project was developed to address core business needs in sales and inventory management in Punta del Agua company located in San Luis, Argentina. The architecture is structured to ensure maintainability, clear separation of concerns, and data integrity. It serves as a comprehensive backend solution capable of tracking products across different warehouses, managing specific product batches, and processing sales with detailed invoicing support.

## Key Features

- **Inventory Tracking:** Manage products, warehouses, and product batches.
- **Sales Management:** Process sales transactions, including line items, sale types, and invoicing formats.
- **Data Persistence:** Robust relational database integration for reliable data storage and retrieval.
- **Layered Architecture:** Clear separation between controllers, business services, and data access objects.

## Stack

- **Language:** Java 17
- **Framework:** Spring Boot 3
- **Database:** PostgreSQL (via Spring Data JPA)
- **Build Tool:** Maven

## Architecture Details

The application is built using a standard enterprise layered approach:

- **Models:** Define domain entities like products, sales, warehouses, and batches.
- **Controllers:** Expose RESTful endpoints for frontend or external system integration.
- **Services:** Encapsulate the core business logic and rules.
- **Repositories (DAO):** Handle database operations and interactions.
