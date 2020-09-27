void call() {

node {
    env.NODEJS_HOME = "${tool 'nodeproject'}"
    // on linux / mac
    env.PATH="${env.NODEJS_HOME}/bin:${env.PATH}"
stage("install") {
    sh 'npm install'
}
}

}
