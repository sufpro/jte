void call() {



    stage('Install Dependencies') {
            node {
                nodejs() {
                    sh 'npm install'
                }
            }
        }


}
