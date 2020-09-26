void call() {
    stage('Install dependencies') {
      node {
        sh 'npm install'
      }
    }
     
    stage('Test') {
      node {
        sh 'npm test'
      }
    }
}
