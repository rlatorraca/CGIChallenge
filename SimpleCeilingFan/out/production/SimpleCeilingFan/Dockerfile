FROM openjdk:17.0.1-slim-buster

WORKDIR /

COPY ./ca/com/cgi/*.java /ca/com/cgi/

RUN ["javac" , "/ca/com/cgi/CeilingFanOperations.java", "/ca/com/cgi/MainCeilingFan.java" ]
RUN chmod +xw -R /ca
RUN ls -la -R /
RUN cd /ca/com/cgi/
RUN pwd
ENTRYPOINT [ "java", "ca.com.cgi.MainCeilingFan"]


