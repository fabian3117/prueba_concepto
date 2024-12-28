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

FROM gradle:7.5-jdk17 AS build
WORKDIR /home/gradle
COPY .  .
CMD ["./gradlew build -x test"]
#RUN gradle build -x test
ARG PUERTO=8080
EXPOSE $PUERTO
ENTRYPOINT ["java","-jar","/home/gradle/build/libs/BackBase-0.0.1-SNAPSHOT.jar"]
#CMD ["java -jar /home/gradle/build/libs/BackBase-0.0.1-SNAPSHOT.jar"]

#COPY --chown=gradle:gradle ./ /home/gradle/src
#WORKDIR /home/gradle/src
#RUN gradle
#RUN #gradle build --no-daemon -x test
#EXPOSE 8080
#CMD ["ls"]
#ENTRYPOINT ["java","-jar","/"]

#FROM openjdk:17
#WORKDIR /
#ARG JAR_FILE=build/libs/*.jar
#COPY ${JAR_FILE} ./app.jar
#EXPOSE 8080 9092
#
#ENTRYPOINT ["java","-jar","/app.jar"]

#RUN "./gradle build"
#RUN gradle build