void call() {

node {
    env.SONAR_HOME = "${tool 'sonarqube-scanner'}"
    env.PATH="${env.SONAR_HOME}/bin:${env.PATH}"
    env.NODEJS_HOME = "${tool 'nodeproject'}"
    env.PATH="${env.NODEJS_HOME}/bin:${env.PATH}"
    println 'environment=' + config.env
    withSonarQubeEnv() { 
	 //sh "sonar-scanner"
         sh 'npm run sonar'
    }
}
}
