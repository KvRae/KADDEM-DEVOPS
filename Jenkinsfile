pipeline {
    agent any

      stages {

  stage("MVN Clean") {

             steps{
                             dir('kaddem') {

             sh 'mvn clean'
    }
            }
        }


  stage("MVN Compile") {

             steps{
                             dir('kaddem') {

             sh 'mvn compile'
}
            }
        }
  stage("Junit") {

             steps{
                             dir('kaddem') {

             sh 'mvn test'
            }
            }
        }
    }
}