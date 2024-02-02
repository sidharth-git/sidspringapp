# Use the official OpenJDK base image
FROM openjdk:11-jre-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the packaged Spring Boot application JAR file into the container
COPY target/sidspringapp.jar app.jar

# Specify the command to run the Spring Boot application
CMD ["java", "-jar", "app.jar"]

