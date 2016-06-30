FROM java:8

EXPOSE 80
ENV PORT=80

VOLUME /tmp

RUN mkdir -p /dabuild-config && \
  cd /dabuild-config && \
  git init && \
  git config --local user.name "FirstName LastName" && \
  git config --local user.email "emailname@mycompany.com" && \
  touch eu && \
  git add . && \
  git commit -m "first"

RUN mkdir -p /app
ADD . /app/
WORKDIR /app
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","config-server.jar", "-Dspring.config.location=file:config/"]
