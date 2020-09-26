void call() {
stage('Code Quality Check via SonarQube') {

  //config vars
  projectKey= config.productKey
  sources= config.sources
  tests= config.tests 
  inclusions= config.inclusions ?: '**' 
  test.inclusions= config.testInclusions
  javascript.lcov.reportPaths= config.lcov
  testExecutionReportPaths= config.testExecutionReportPath


   node {
       def scannerHome = tool 'sonarqube-scanner';
           withSonarQubeEnv() {
           sh "${tool('sonarqube-scanner')}/bin/sonar-scanner
           }
        }
   }
}
