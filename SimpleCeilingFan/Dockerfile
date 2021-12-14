FROM openjdk:17.0.1-slim-buster

WORKDIR /ceilingfan

COPY /src/ca/com/cgi/*.java  /ceilingfan/

RUN ["javac" , "CeilingFanOperations.java", "MainCeilingFan.java"]
CMD ["cd", "src"]

ENTRYPOINT ["java", "ca.com.cgi.MainCeilingFan"]

