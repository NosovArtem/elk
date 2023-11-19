FROM eclipse-temurin:17-jdk-jammy
WORKDIR /app
COPY target/elk-0.0.1-SNAPSHOT.jar /app/app.jar
COPY .env /app/.env
ENTRYPOINT ["java", "-jar", "app.jar"]