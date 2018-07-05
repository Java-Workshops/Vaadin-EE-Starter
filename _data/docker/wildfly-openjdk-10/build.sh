#!/bin/bash
docker build -t svenruppert/wildfly-openjdk-10 .
#docker push svenruppert/jdk-openjdk-10:latest

docker tag svenruppert/wildfly-openjdk-10:latest svenruppert/wildfly-openjdk-10:13.0.0.Final
#docker push svenruppert/maven-3.5-jdk-openjdk-10:1.10.1

