#FROM openjdk:17-jdk-alpine
#WORKDIR /app
#COPY build.gradle ./
#COPY gradlew ./

#RUN ./gradle build
#RUN gradle build
#COPY build/libs/*.jar app.jar
#EXPOSE 8080
#
#ENTRYPOINT ["java","-jar","/app.jar"]

#FROM gradle:8.12.0-jdk8 AS build
#COPY --chown=gradle:gradle . /home/gradle/src
#WORKDIR /home/gradle/src
#RUN gradle build --no-daemon
FROM openjdk:17-jdk-alpine
WORKDIR /app
COPY build.gradle ./
COPY gradlew ./
CMD  ["gradle build"]


COPY build/libs/*.jar app.jar

#RUN "./gradle build"
#RUN gradle build