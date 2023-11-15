# Use an OpenJDK runtime as a base image
FROM openjdk:11

# Set the working directory within the container
WORKDIR /app

# Copy the JAR file into the container at /app
COPY target/kaddem-2.1.jar /app/

# Expose the port your app runs on
EXPOSE 8082

# Command to run your application
CMD ["java", "-jar", "kaddem-2.1.jar"]