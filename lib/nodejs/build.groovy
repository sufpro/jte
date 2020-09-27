void call() {

tools {nodejs "nodeproject"}

  stages {
    stage('Install Dependencies') {
      steps {
        sh 'npm install'
      }
    }
  }
}
