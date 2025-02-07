FROM bellsoft/liberica-openjdk-alpine:17.0.3

WORKDIR /hafeez

COPY target/*.war app.war

EXPOSE 9000

CMD [ "java","-jar","app.war"]
