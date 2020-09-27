void call() {

node {
    env.NODEJS_HOME1 = "${tool 'sonarqube-scanner'}"
    // on linux / mac
    env.PATH="${env.NODEJS_HOME1}/bin:${env.PATH}"
    withSonarQubeEnv() { // If you have configured more than one global server connection, you can specify its name
    println 'xxxx' + config.projectKey
	sh "${scannerHome}/bin/sonar-scanner"
}
}
}
