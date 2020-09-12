@BeforeStep({ hookContext.step.equals("build") })
void call() {
    stage("maven: build"){
        println("build from the maven library")
    }
}
