# Utilisez une image de base
FROM openjdk:11

# Définissez le répertoire de travail
WORKDIR /app

# Copiez le fichier JAR (assurez-vous que le JAR est dans le même répertoire que le Dockerfile)
COPY ./*.jar /app/app.jar

# Exposez le port sur lequel l'application s'exécute
EXPOSE 8080

# Commande pour exécuter l'application lorsque le conteneur démarre
CMD ["java", "-jar", "app.jar"]