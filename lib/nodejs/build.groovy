void call() {
stage('install') {
           sh "${tool('nodeproject')}/bin/npm install"
        }
}
