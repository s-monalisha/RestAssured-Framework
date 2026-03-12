pipeline {
    agent any

    tools {
        maven 'Maven3'
        jdk 'JDK21'
    }

    stages {

        stage('Clone Repository') {
            steps {
                git branch: 'main', url: 'https://github.com/s-monalisha/RestAssured-Framework.git'
            }
        }

        stage('Build Project') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Run API Tests') {
            steps {
                bat 'mvn test'
            }
        }
    }
}
