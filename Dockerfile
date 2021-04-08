FROM openjdk
COPY target/ .
CMD java -jar