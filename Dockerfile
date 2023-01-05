FROM amazoncorretto:17
MAINTAINER Ajay R
EXPOSE 8085
COPY target/demo-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
