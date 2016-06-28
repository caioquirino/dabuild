FROM java:8

EXPOSE 80
ENV PORT=80

VOLUME /tmp
RUN mkdir -p /app
ADD . /app/
WORKDIR /app
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","webhook-api.jar", "-Dspring.config.location=file:config/"]
