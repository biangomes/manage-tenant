FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/backend-*.jar
WORKDIR /app
COPY ${JAR_FILE} backend.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "backend.jar"]
