FROM openjdk:11

EXPOSE 8083

# Create a directory for your application
WORKDIR /app

# Copy the Maven POM file
COPY pom.xml .

# Resolve dependencies (this step fetches the artifact from Nexus)
RUN mvn dependency:resolve

# Copy the application source code
COPY src ./src

# Package your application into a JAR file
RUN mvn package -DskipTests

# Your JAR file will be available in the target directory
CMD ["java", "-jar", "target/your-app.jar"]