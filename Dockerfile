FROM openjdk:8
EXPOSE 8081
ADD target/github-actions-demo-app-0.0.1-SNAPSHOT.jar github-actions-demo-app.jar
ENTRYPOINT ["java","-jar","/github-actions-demo-app.jar"]