void call() {


node {
    env.SONAR_HOME = "${tool 'sonarqube-scanner'}"
    // on linux / mac
    env.PATH="${env.SONAR_HOME}/bin:${env.PATH}"

       println 'xxxxxxxxxxxxxxxxxxxxxx-----------xxxxxxxxxxxxxx' + config.projectKey


stage('Code Quality Check via SonarQube') {
       println 'xxxxxxxxxxxxxxxxxxxxxx-----------xxxxxxxxxxxxxx' + config.projectKey
       def scannerHome = tool 'sonarqube-scanner';
           withSonarQubeEnv() {
           sh "${tool('sonarqube-scanner')}/bin/sonar-scanner \
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
