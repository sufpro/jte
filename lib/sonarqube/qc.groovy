void call() {

node {
    env.NODEJS_HOME1 = "${tool 'sonarqube-scanner'}"
    env.PATH="${env.NODEJS_HOME1}/bin:${env.PATH}"
    println 'xxxx' + config.qq

    println 'environment=' + config.env

    withSonarQubeEnv() { // If you have configured more than one global server connection, you can specify its name
	 //sh "${NODEJS_HOME1}/bin/sonar-scanner"
	 sh sonar-scanner"
}
}
}
