void call() {

node {
    env.SONAR_HOME = "${tool 'sonarqube-scanner'}"
    env.PATH="${env.SONAR_HOME}/bin:${env.PATH}"
    println 'environment=' + config.env

    withSonarQubeEnv() { // If you have configured more than one global server connection, you can specify its name
         //sh "${NODEJS_HOME1}/bin/sonar-scanner"
	 sh "sonar-scanner"
}
}
}
