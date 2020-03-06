FROM openjdk:8-jdk-alpine
COPY target/*.jar /app/app.jar
CMD ["java", "-jar", "/app/.jar"]