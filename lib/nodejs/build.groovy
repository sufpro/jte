void call() {
    stage('Install dependencies') {
nodejs {
           sh "${tool('nodeproject')}/bin/npm install"
    }
    } 
    stage('Test') {
sh("npm test")
    }
}
