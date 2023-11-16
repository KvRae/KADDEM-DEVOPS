# Use an official OpenJDK runtime as a parent image
FROM openjdk:11

# Set the working directory to /app
WORKDIR /kaddem



# Download the JAR from Nexus
RUN curl -o kaddem.jar -L "http://192.168.33.10:8081/repository/maven-releases/tn/esprit/spring/kaddem/0.0.1/kaddem-0.0.1.jar"

# Specify the command to run on container start
CMD ["java", "-jar", "kaddem.jar"]