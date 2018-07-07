FROM openjdk:8-jre
VOLUME /tmp
ADD admin-system-0.0.1-SNAPSHOT.jar app.jar
CMD java -jar app.jar