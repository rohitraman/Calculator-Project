FROM adoptopenjdk/openjdk11
COPY "target/CalculatorProject-1.0-SNAPSHOT.jar" "home/CalculatorProject-1.0-SNAPSHOT.jar"
CMD ["java","-jar","home/CalculatorProject-1.0-SNAPSHOT.jar"]