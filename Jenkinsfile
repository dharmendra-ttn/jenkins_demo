node {

  def myGradleContainer = docker.image('gradle:8.10-jdk21-alpine') // Update to a Gradle image with JDK 21
  myGradleContainer.pull()

  stage('prep') {
    checkout scm
  }

  stage('test') {
    myGradleContainer.inside() {
      sh './gradlew test'
    }
  }

  stage('build') {
    myGradleContainer.inside('-p  9000:9000') {
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