ORM: A Simple ORM for Java Using the Reflections API

ORM is a simple object-relational mapper (ORM) written in Java, which uses the Reflections API to automatically convert Java objects into SQL queries and vice versa. This project is intended for small applications where a full-fledged ORM framework like Hibernate is not required.

Features:

Conversion of Java objects into SQL queries (INSERT, UPDATE, DELETE).
Generation of SQL queries for creating tables based on Java classes.
Use of the Reflections API for dynamic analysis of classes and fields.

Prerequisites:

Java 8 or a later version.
Maven for building the project.
PostgreSQL database for data storage.

## Database Setup

1. Install PostgreSQL on your local machine or server.
2. Configure the database connection in your `database.properties` file 
   with the following settings:
