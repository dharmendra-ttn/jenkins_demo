node {

  def myGradleContainer = docker.image('gradle:8.10-jdk21-alpine') // Update to a Gradle image with JDK 21
  myGradleContainer.pull()

  stage('prep') {
    checkout scm
  }

  stage('test') {
    myGradleContainer.inside("-v ${env.HOME}/.gradle:/home/gradle/.gradle --user jenkins") {
      sh './gradlew test'
    }
  }

  stage('build') {
    myGradleContainer.inside("-v ${env.HOME}/.gradle:/home/gradle/.gradle --user jenkins") {
      sh './gradlew build'
    }
  }

  stage('run') {
    def jarFile = 'build/libs/jenkins-demo-0.0.1-SNAPSHOT.jar'
    myGradleContainer.inside() {
      sh "java -jar ${jarFile}"
    }
  }
}