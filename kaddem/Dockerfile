FROM openjdk:11

EXPOSE 8089

# Download the JAR from the remote repository
RUN curl -o kaddem.jar -L "http://192.168.33.10:8081/repository/maven-releases/tn/esprit/spring/kaddem/0.0.1/kaddem-0.0.1.jar"

# Set the entry point to run the application
ENTRYPOINT ["java", "-jar", "kaddem.jar"]

