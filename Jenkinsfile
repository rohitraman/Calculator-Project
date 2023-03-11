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
                
                sh 'docker tag calculator-project rohitraman/calculator-project'
                withDockerRegistry([ credentialsId: "Docker-Hub", url: "" ]) {
                    sh 'docker push rohitraman/calculator-project'
                }
            }
        }
        stage('Ansible') {
            steps {
                ansiblePlaybook becomeUser: 'null',
                colorized: true,
                installation: 'Ansible',
                inventory: 'inventory',
                playbook: 'deploy-docker.yml',
                sudoUser: 'null'
            }
        }
    }

}