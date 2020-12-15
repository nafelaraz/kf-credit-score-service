FROM openjdk:8
ADD target/*.jar credit-score-service.jar
EXPOSE 8084
ENTRYPOINT ["java", "-jar", "credit-score-service.jar"]