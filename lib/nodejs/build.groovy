void call() {
stage('install') {
           nodejs() {
           sh "${tool('nodeproject')}/bin/npm install"
          }
        }
}
