FROM openjdk:17-ea-11-jdk-slim
VOLUME /tmp
COPY target/config-service-1.0.jar ProjectConfigService.jar
ENTRYPOINT ["java", "-jar", "ProjectConfigService.jar"]