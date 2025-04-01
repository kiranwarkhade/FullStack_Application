FROM openjdk:17
LABEL authors="kiran"

COPY target/WhatsApp.jar /usr/app/

WORKDIR /usr/app

ENTRYPOINT ["java", "-jar", "WhatsApp.jar"]