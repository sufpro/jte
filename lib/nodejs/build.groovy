void call() {
    stage('Install dependencies') {
node {
           sh "${tool('nodeproject')}/bin/npm install"
    }
    } 
    stage('Test') {
sh("npm test")
    }
}
