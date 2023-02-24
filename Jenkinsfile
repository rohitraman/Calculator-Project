pipeline {
    agent any
    stages {
        stage('Build') {
            sh 'mvn clean install -DskipTests=true'
        }
        stage('Test') {
            sh 'mvn test'
        }
    }

}