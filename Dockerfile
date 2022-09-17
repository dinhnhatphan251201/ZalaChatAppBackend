FROM openjdk:11
WORKDIR /zalo-deploy
COPY ./target/web-socket-project-temp-0.0.1-SNAPSHOT.jar /zalo-deploy
COPY . /zalo-deploy
EXPOSE 8080
CMD ["java","-jar","web-socket-project-temp-0.0.1-SNAPSHOT.jar"]