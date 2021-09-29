FROM openjdk:11
VOLUME /tmp
EXPOSE 8080
ADD ./target/hr-api-gateway-springcloud-0.0.1-SNAPSHOT.jar hr-api-gateway-springcloud.jar
ENTRYPOINT ["java","-jar","/hr-api-gateway-springcloud.jar"]