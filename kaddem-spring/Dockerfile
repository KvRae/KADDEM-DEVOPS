# Use an official OpenJDK runtime as a parent image
FROM openjdk:11-jre-slim

# Set the working directory in the container
WORKDIR /app

# Copy the Spring Boot application JAR file into the container
COPY target/*.jar app.jar

# Expose the port that your Spring Boot application listens on (default is 8080)
EXPOSE 8089

# Entry point command to run your Spring Boot application
CMD ["java", "-jar", "app.jar"]
