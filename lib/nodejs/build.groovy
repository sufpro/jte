void call() {
    stage('Install dependencies') {
    
nodejs('nodeproject'){
   npm install
}

} 
    stage('Test') {
sh("npm test")
    }
}
