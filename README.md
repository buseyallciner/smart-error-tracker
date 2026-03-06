# Smart Error Tracker

This is a small Spring Boot project I built while learning backend development.

The idea of the project is simple: store application errors and access them through a REST API.

## What it does

The API allows you to:

- add a new error log
- see all saved errors
- delete an error
- filter errors by severity level

I used Postman to test all endpoints while developing the project.

## Technologies

Java  
Spring Boot  
Spring Data JPA  
Maven  
Postman

## Example

POST /errors

{
 "message": "NullPointerException",
 "stackTrace": "UserService line 42",
 "serviceName": "auth-service",
 "severity": "HIGH"
}
