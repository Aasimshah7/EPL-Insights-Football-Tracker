FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/team-statistics-service-1.0-SNAPSHOT.jar team-statistics-service-1.0-SNAPSHOT.jar
#EXPOSE 8082
ENTRYPOINT ["java","-jar","team-statistics-service-1.0-SNAPSHOT.jar"]