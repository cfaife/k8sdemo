FROM openjdk
COPY target/k8sdemo-1.0.0-SNAPSHOT.jar .
CMD java -jar
