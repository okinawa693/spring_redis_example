FROM openjdk:8-jdk-alpine3.9
RUN apk upgrade
COPY build/libs/demo-*.jar demo.jar
ENTRYPOINT  ["java", "-jar", "demo.jar"]
