#!/bin/bash
docker build -t svenruppert/jdk-openjdk-10 .
#docker push svenruppert/jdk-openjdk-10:latest

docker tag svenruppert/jdk-openjdk-10:latest svenruppert/jdk-openjdk-10:1.10.1
#docker push svenruppert/maven-3.5-jdk-openjdk-10:1.10.1

