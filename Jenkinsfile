pipeline {
    agent any

    tools {
        maven 'Maven-3'
        jdk 'JDK17'
    }

    stages {

        stage('Clone Code') {
            steps {
                echo 'Cloning from GitHub...'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }

    }
}