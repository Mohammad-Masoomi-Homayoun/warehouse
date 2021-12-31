FROM openjdk:11.0.6-slim
COPY ./target/warehouse.jar /opt/app.jar
WORKDIR /opt
ENTRYPOINT ["java", "-jar", "app.jar"]
EXPOSE 9020