FROM openjdk:11
EXPOSE 8089

# Download the JAR file from the specified URL and rename it to kaddem-1.0.jar
RUN curl -o kaddem-1.0.jar -L "http://192.168.1.17:8081/:8081/repository/maven-releases/tn/esprit/spring/kaddem/0.0.1/kaddem-0.0.1.jar"

ENTRYPOINT ["java", "-jar", "kaddem-1.0.jar"]