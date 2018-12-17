pipeline {
  agent {
    docker {
      image '3.6.0-jdk-11-slim'
    }

  }
  stages {
    stage('Initialization') {
      steps {
        sh 'mvn clean'
      }
    }
    stage('Build') {
      steps {
        sh 'mvn install'
      }
    }
  }
}