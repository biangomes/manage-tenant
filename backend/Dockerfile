# Base otimizada para Java 17 (JDK para build)
FROM eclipse-temurin:17-jdk-alpine AS builder

# Define o diretório de trabalho dentro do contêiner
WORKDIR /app
COPY backend-*.jar backend-*.jar
ENTRYPOINT ["java", "-jar", "backend-*.jar"]