FROM openjdk:8
ADD ./target/order-service-0.0.1-SNAPSHOT.jar order-service.jar
EXPOSE 8082
ENV PATH $PATH:/usr/bin/
ENTRYPOINT ["java", "-jar", "order-service.jar"]
