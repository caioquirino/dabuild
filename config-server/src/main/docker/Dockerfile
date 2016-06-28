FROM java:8

EXPOSE 80

VOLUME /tmp
RUN mkdir -p /app
ADD . /app/
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app/config-server.jar"]
