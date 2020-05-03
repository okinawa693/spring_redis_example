FROM openjdk:8-jdk-alpine3.9
RUN apk upgrade
# COPY build/libs/test_s-takeuchi_api-*.jar test_s-takeuchi_api.jar
# ENTRYPOINT  ["java", "-jar", "test_s-takeuchi_api.jar"]
