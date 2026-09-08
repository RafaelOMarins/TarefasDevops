FROM eclipse-temurin:25
LABEL authors="rafas"

WORKDIR /app

COPY /target/gerenciador-de-tarefas-0.0.1-SNAPSHOT.jar /app

EXPOSE 8080

ENTRYPOINT ["java", "-jar","/app/gerenciador-de-tarefas-0.0.1-SNAPSHOT.jar"]

