void call() {
    stage('Install dependencies') {
nodejs(){
   sh "${tool('nodeproject')}/bin/npm install"
}
} 
}
