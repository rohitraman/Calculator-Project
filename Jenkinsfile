pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean install -DskipTests=true'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Docker Build') {
            steps {
                sh 'docker build -t calculator-project .'
            }
        }
        stage('Docker Run') {
            steps {
                sh 'docker run calculator-project'
            }
        }
    }

}