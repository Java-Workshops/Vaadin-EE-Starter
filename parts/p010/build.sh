#!/bin/bash
docker build -t svenruppert/vaadin-ee-starter-p010 .
#docker push svenruppert/vaadin-ee-starter-p0100:latest

docker tag svenruppert/vaadin-ee-starter-p010:latest svenruppert/vaadin-ee-starter-p010:0.3.0-SNAPSHOT
#docker push svenruppert/maven-3.5-jdk-openjdk-10:1.10.1

#docker run --rm -d -p 8080:8080 -p 4848:4848 --name wildfly svenruppert/vaadin-ee-starter-p010
docker run --rm -it -p 8080:8080 -p 4848:4848 --name wildfly svenruppert/vaadin-ee-starter-p010
#docker run --rm -it -p 4848:4848 -p 8009:8009 -p 8080:8080 -p 8181:8181 --name glassfish svenruppert/vaadin-ee-starter-p010