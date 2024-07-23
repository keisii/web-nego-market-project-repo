FROM openjdk:17-ea-11-jdk-slim
VOLUME /tmp
COPY target/record-service-1.0.jar ProjectRecordService.jar
ENTRYPOINT ["java", "-jar", "ProjectRecordService.jar"]