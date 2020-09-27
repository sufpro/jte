void call() {
nodejs {

stage('install') {
           sh "${tool('nodeproject')}/bin/npm install"
        }
}
}
