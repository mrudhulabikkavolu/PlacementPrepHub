pipeline {
    agent any

    environment {
        APP_NAME = 'PlacementPrepHub'
        DOCKER_IMAGE = 'placementprephub-local'
    }

    stages {

        stage('Checkout Code') {
            steps {
                echo 'Cloning repository from GitHub...'
                git branch: 'main', url: 'https://github.com/mrudhulabikkavolu/PlacementPrepHub.git'
            }
        }

        stage('Build with Maven') {
            steps {
                echo 'Building the Maven project...'
                bat 'mvn clean package -DskipTests'
            }
        }

        stage('Build Docker Image') {
            steps {
                echo 'Building Docker image...'
                bat "docker build -t %DOCKER_IMAGE% ."
            }
        }

        stage('Run Docker Container') {
            steps {
                echo 'Running Docker container on port 9090...'
                bat "docker run -d -p 9090:9090 %DOCKER_IMAGE%"
            }
        }
    }
}