pipeline {
    agent any

    tools {
        maven 'Maven3'
        jdk 'JDK21'
    }

    stages {

        stage('Clone Repository') {
            steps {
                git 'https://github.com/s-monalisha/RestAssured-Framework.git'
            }
        }

        stage('Build Project') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Run API Tests') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Archive Reports') {
            steps {
                archiveArtifacts artifacts: '**/target/surefire-reports/*.xml', fingerprint: true
            }
        }
    }
}
