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
        stage('Docker Push') {
            steps {
                catchError(buildResult: 'SUCCESS', stageResult: 'SUCCESS') {
                    sh 'docker stop calculator'
                    sh 'docker rm calculator'
                    sh 'docker rmi rohitraman/calculator-project'
                }
                sh 'docker tag calculator-project rohitraman/calculator-project'
                sh 'docker rmi calculator-project'
                withDockerRegistry([ credentialsId: "Docker-Hub", url: "" ]) {
                    sh 'docker push rohitraman/calculator-project'
                }
            }
        }
        stage('Ansible') {
            steps {
                sh 'ansible-playbook deploy-docker.yml -i inventory'
            }
        }
    }

}