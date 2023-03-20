FROM adoptopenjdk/openjdk11
COPY "target/CalculatorProject-1.0-SNAPSHOT.jar" "home/CalculatorProject.jar"
RUN touch calculator.log
CMD ["java","-jar","home/CalculatorProject.jar"]