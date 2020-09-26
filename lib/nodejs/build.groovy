void call() {
    stage('Cloning Git') {
      steps {
        git 'https://github.com/sufpro/NodeSonarExample.git'
      }
    }
        
    stage('Install dependencies') {
      steps {
        sh 'npm install'
      }
    }
     
    stage('Test') {
      steps {
         sh 'npm test'
      }
    }
}
