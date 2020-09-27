void call() {
    stage('Install dependencies') {
        sh 'npm install'
    }
     
    stage('Test') {
        sh 'npm test'
    }
}
