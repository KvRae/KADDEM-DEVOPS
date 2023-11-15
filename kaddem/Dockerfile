# Utilisez une image Java officielle en tant qu'image parente
FROM openjdk:11

# Définissez le répertoire de travail dans le conteneur
WORKDIR /app

# Utilisez curl pour télécharger le fichier JAR depuis Nexus
RUN curl -o kaddem-2.1.jar -L http://192.168.33.10:8081/repository/maven-releases/tn/esprit/spring/kaddem/2.1/kaddem-2.1.jar

# Exposez le port sur lequel votre application s'exécute
EXPOSE 8082

# Définissez la commande pour exécuter votre application
CMD ["java", "-jar", "kaddem-2.1.jar"]