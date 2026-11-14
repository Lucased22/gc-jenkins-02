pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                // ignore=true: testes falhando geram UNSTABLE (nao FAILURE), via junit
                bat 'mvn -Dmaven.test.failure.ignore=true test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
    }
}
