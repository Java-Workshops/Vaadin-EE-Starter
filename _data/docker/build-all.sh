#!/usr/bin/env bash

cd jdk-openjdk-10; chmod 777 build.sh ; ./build.sh ; cd .. ;
cd wildfly-openjdk-10; chmod 777 build.sh ; ./build.sh ; cd .. ;