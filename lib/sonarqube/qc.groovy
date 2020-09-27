void call() {


node {
       

println 'xxxxxxxxxxxxxxxxxxxxxx-----------xxxxxxxxxxxxxx' + config.projectKey
stage('SonarQube analysis') {
    def scannerHome = tool 'SonarScanner 4.0';
    withSonarQubeEnv() { // If you have configured more than one global server connection, you can specify its name
      sh "${scannerHome}/bin/sonar-scanner"
    }
  }
}
}
