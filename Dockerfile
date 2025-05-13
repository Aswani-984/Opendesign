FROM openjdk:17

MAINTAINER Kirubaa

COPY target/ /usr/a OpenDesign-0.0.1-SNAPSHOT.jar usr/app/

WORKDIR /usr/app/

EXPOSE 8080

ENTRYPOINT ["java", "-jar", " OpenDesign-0.0.1-SNAPSHOT.jar"]
