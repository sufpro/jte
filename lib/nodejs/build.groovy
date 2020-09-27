void call() {



    stage('Install Dependencies') {
            steps {
                nodejs() {
                    sh 'npm install'
                }
            }
        }


}
