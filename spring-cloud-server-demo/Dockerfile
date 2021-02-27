#FROM openjdk:7-jre
FROM openjdk:8-jdk-alpine
MAINTAINER robosloveu@163.com

COPY target/spring-cloud-server-demo-0.0.1-SNAPSHOT.jar /spring-cloud-server.jar

ENTRYPOINT [ "java", "-jar", "/spring-cloud-server.jar" ]