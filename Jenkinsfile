pipeline {
   agent { label 'dockerserver' }

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
}l