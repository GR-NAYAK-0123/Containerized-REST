FROM eclipse-temurin:17
WORKDIR /app
COPY target/Containerized-REST-0.0.1-SNAPSHOT.jar  /app/containerized-rest.jar
ENTRYPOINT ["java", "-jar", "containerized-rest.jar"]
