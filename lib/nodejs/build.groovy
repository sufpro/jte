void call() {
    stage('Install dependencies') {
node {    
nodejs('nodeproject'){
   npm install
}
}
} 
    stage('Test') {
sh("npm test")
    }
}
