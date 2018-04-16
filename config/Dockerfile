FROM openjdk:8
ADD config/target/config-0.0.1-SNAPSHOT.jar config-server.jar
EXPOSE 9001
ENV PATH $PATH:/usr/bin/
ENTRYPOINT ["java", "-jar", "config-server.jar"]
