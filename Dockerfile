FROM openjdk:11

WORKDIR /app

COPY ./*.jar /app/app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]
