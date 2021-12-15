FROM openjdk:17.0.1-slim-buster

WORKDIR /

COPY ./ca/com/cgi/*.java /ca/com/cgi/

RUN ["javac" , "/ca/com/cgi/CeilingFanOperations.java", "/ca/com/cgi/MainCeilingFan.java" ]
RUN chmod +xw -R /ca
RUN cd /ca/com/cgi/

ENTRYPOINT [ "java", "ca.com.cgi.MainCeilingFan"]


