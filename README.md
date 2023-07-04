# Simple-Maven-Docker

@ This is a sample Maven project with Docker configuration for handling Global Exception in Springboot.

## Prerequisites

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
6. Check if docker is running using : docker ps  (list all running containers)
7. To stop Docker container you can use following cmds
   1. Find container ID -> docker ps
   2. Stop container -> docker stop <container-id-or-name>


## Contributing
Contributions are welcome! If you encounter any issues or have suggestions for improvement, please feel free to open an issue or submit a pull request.
