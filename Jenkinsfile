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
                bat 'mvn -Dmaven.test.failure.ignore=true test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                    archiveArtifacts artifacts: 'target/site/jacoco/**', allowEmptyArchive: true
                }
            }
        }

        stage('Coverage summary') {
            steps {
                bat 'if exist target\\site\\jacoco\\index.html (echo JaCoCo report OK & type target\\site\\jacoco\\jacoco.csv) else (echo JaCoCo report missing & exit /b 1)'
            }
        }
    }
}