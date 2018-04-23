FROM openjdk:8
ADD ./target/product-server-0.0.1-SNAPSHOT.jar product-server.jar
EXPOSE 8082
ENV PATH $PATH:/usr/bin/
ENTRYPOINT ["java", "-jar", "product-server.jar"]
