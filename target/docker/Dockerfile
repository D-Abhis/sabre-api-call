FROM jamesdbloom/docker-java8-maven
VOLUME /tmp
ADD sabre-api-1.2.4.RELEASE.jar app.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/local/git/app.jar"]
