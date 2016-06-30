FROM java:8

EXPOSE 8080
ENV PORT=8080

VOLUME /tmp
RUN mkdir -p /app
ADD . /app/
WORKDIR /app
RUN chmod +x /app/entrypoint.sh
ENTRYPOINT /app/entrypoint.sh
