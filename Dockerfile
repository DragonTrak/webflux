FROM java:8
MAINTAINER maoyt <myt_ac@163.com>
VOLUME /webflux
COPY target/webflux-0.0.1-SNAPSHOT.jar /webflux/app.jar
# 运行jar包
RUN bash -c 'touch /webflux/app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/webflux/app.jar"]