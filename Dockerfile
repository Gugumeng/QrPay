FROM java:8

COPY /target/*.jar /app.jar

CMD ["--server.port=8080"]

EXPOSE 8899

ENTRYPOINT ["java","-jar","/app.jar"]

RUN cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime

RUN echo 'Asia/Shanghai' >/etc/timezone