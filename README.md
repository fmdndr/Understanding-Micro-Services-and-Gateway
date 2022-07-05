# Understanding Micro Services And Gateway

## Customers Project
>**This is sample application which we run as main application. This application has crud operations**

<br>

## Gateway Project
> **I have learned how the gateway works. How Load Balancing is working.**

<br>

## Registry Project
>**This project is Eureka Server project for registration of other application. Without registration other we are not able to build micro services.**

<br/> <br>

# Main conclusion of the project

> I have learned how to build a micro servcies and what is the role of the gateway in micro services architecture. Let say we can run multiple Customer application on different ports all of the Customer applications will register the  Registry (Eureka Server).If we request directly one of the Customer application then only that specific Customer application will return the result. <br>
<br>
If we  send request to Gateway application. Gateway will decide to which application is ready to give response. Gateway application with "Load Balancing" alway tries to find most available Customer application  for response to the request.
