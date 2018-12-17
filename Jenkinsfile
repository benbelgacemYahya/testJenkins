pipeline {
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