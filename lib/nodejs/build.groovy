void call() {

node {
    env.NODEJS_HOME = "${tool 'nodeproject'}"
    // on linux / mac
    env.PATH="${env.NODEJS_HOME}/bin:${env.PATH}"
    println 'xxxx' + config.xx
    println env.NODEJS_HOME
stage('Cloning Git') {
        git 'https://github.com/sufpro/NodeSonarExample.git'
}
stage("install") {
    sh 'npm install'
}
stage("test") {
    sh 'npm test'
}

}
}
