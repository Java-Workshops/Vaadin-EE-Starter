#!/bin/bash
docker build -t svenruppert/glassfish-openjdk-10 .
#docker push svenruppert/jdk-openjdk-10:latest

docker tag svenruppert/glassfish-openjdk-10:latest svenruppert/glassfish-openjdk-10:5.0.0.Final
#docker push svenruppert/maven-3.5-jdk-openjdk-10:1.10.1

