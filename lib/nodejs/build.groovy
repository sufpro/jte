void call() {
    stage('Install dependencies') {
node {
      sh("npm install")
    }
    } 
    stage('Test') {
sh("npm test")
    }
}
