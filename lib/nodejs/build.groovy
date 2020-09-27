void call() {

tools {nodejs "nodeproject"}
 
stages {
        stage('Build') {
            steps {
                    sh 'npm config ls'
                }
            }
        }

}
