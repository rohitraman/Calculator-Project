FROM adoptopenjdk/openjdk11
COPY "target/CalculatorProject-1.0-SNAPSHOT.jar" "home/CalculatorProject.jar"
CMD ["java","-jar","home/CalculatorProject.jar"]