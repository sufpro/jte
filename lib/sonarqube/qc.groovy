void call() {


node {
       

println 'xxxxxxxxxxxxxxxxxxxxxx-----------xxxxxxxxxxxxxx' + config.projectKey
stage('SonarQube analysis') {
    def scannerHome = tool 'sonarqube-scanner';
    withSonarQubeEnv() { // If you have configured more than one global server connection, you can specify its name
      sh "${scannerHome}/bin/sonar-scanner"
    }
  }
}
}
