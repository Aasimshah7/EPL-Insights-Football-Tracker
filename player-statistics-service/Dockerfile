FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/player-statistics-service-1.0-SNAPSHOT.jar player-statistics-service-1.0-SNAPSHOT.jar
#EXPOSE 8080
ENTRYPOINT ["java","-jar","player-statistics-service-1.0-SNAPSHOT.jar"]