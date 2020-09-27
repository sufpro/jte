void call() {
node {

stage('install') {
           sh "${tool('nodeproject')}/bin/npm install"
        }
}
}
