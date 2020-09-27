void call() {

node {
    env.NODEJS_HOME = "${tool 'nodeproject'}/bin"
    // on linux / mac
    env.PATH="${env.NODEJS_HOME};${env.PATH}"
    sh 'npm --version'
}


}
