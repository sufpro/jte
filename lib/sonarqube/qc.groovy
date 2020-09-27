void call() {
stage('Code Quality Check via SonarQube') {

   node {
       def scannerHome = tool 'sonarqube-scanner';
           withSonarQubeEnv() {
           sh "${tool('sonarqube-scanner')}/bin/sonar-scanner" \
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
