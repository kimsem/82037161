# base image
FROM cepgbaseacr.azurecr.io/docker.io/openjdk:17-slim

COPY target/template-0.0.1-SNAPSHOT.jar /template-0.0.1-SNAPSHOT.jar

EXPOSE 8080