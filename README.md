# Simple-Maven-Docker

@ This is a sample Maven project with Docker configuration for handling Global Exception in Springboot.

# Prerequisites

Before getting started, ensure that you have the following software installed on your local machine:

- Java Development Kit (JDK) - I am using version 1.8
- Apache Maven
- Docker

@ To run this project locally, follow these steps:

1. Clone the repository: git clone https://github.com/PavanMane1995/Simple-Maven-Docker.git
2. Build the project using Maven : mvn clean install
3. Build the Docker image: docker build --tag <Repo name> .    I have used following name -> **docker build --tag global-exception .**
4. Run the Docker container: docker run -d -p 8080:8080 <Repo name>  -> docker run -d -p 8080:8080 global-exception
5. Check if image is created using : docker images

