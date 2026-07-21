FROM openjdk:28-ea-trixie

WORKDIR /app

COPY target/DockerwithMultifiles-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8082

ENTRYPOINT ["java","-jar","app.jar"]