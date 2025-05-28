FROM openjdk:17-jdk

RUN mkdir /app

WORKDIR /app

COPY target/*.jar /app/app.jar

ENV port=8080

ENTRYPOINT ["java", "-jar", "/app/app.jar"]