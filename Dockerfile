FROM java:8

COPY ./target/sabre-api-1.2.4.RELEASE-spring-boot.jar /var/tmp/app.jar

EXPOSE 8180

CMD ["java","-jar","/var/tmp/app.jar"]
