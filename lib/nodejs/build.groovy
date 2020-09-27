void call() {
    stage('Install dependencies') {
       String npmCommand = 'npm install'
       sh npmCommand
    }
     
    stage('Test') {
        sh 'npm test'
    }
}
