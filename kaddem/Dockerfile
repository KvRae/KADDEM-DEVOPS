# Use the official OpenJDK 11 image as the base image
FROM openjdk:11

# Use the curl command to download the JAR file from the Maven repository and save it as "kaddem-2.1.jar"
# Adjust the URL based on the actual location of your artifact in the Maven repository
# Note: It's generally better to COPY local files, but if you prefer using curl, this is the syntax
ADD curl -o kaddem-2.1.jar -L "http://192.168.1.17:8081/repository/maven-releases/tn/esprit/spring/kaddem/2.1/kaddem-2.1.jar"/

# Expose port 8082 to allow external connections to the application
EXPOSE 8082

# Set the default command to run the application when the container starts
# Adjust the JAR file name based on your actual JAR file
ENTRYPOINT ["java", "-jar", "kaddem-1.0.jar"]
