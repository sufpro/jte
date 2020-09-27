void call() {
node {
stage('SonarQube analysis') {
    def scannerHome = tool 'sonarqube-scanner';
    withSonarQubeEnv() { // If you have configured more than one global server connection, you can specify its name
      println "aaaaaaaaa" + config.projectKey
      sh "${scannerHome}/bin/sonar-scanner \
           -Dsonar.projectKey=" + config.projectKey + " \
           -Dsonar.sources=" + config.sources + " \
           -Dsonar.tests=" + config.tests + " \
           -Dsonar.inclusions=" + config.inclusions ?: '**' + " \
           -Dsonar.test.inclusions=" + config.testInclusions + " \
           -Dsonar.javascript.lcov.reportPaths=" + config.lcov + " \
           -Dsonar.testExecutionReportPaths=" + config.testExecutionReportPath
    }
  }
}
}
