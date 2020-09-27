void call() {
    stage('Install dependencies') {
nodejs(){
   sh sh "${tool('nodeproject')}/bin/npm install"
}
} 
    stage('Test') {
sh("npm test")
    }
}
