pipeline {
    agent any

      stages {

  stage("MVN Clean") {

             steps{
             sh 'mvn clean'

            }
        }


  stage("MVN Compile") {

             steps{
             sh 'mvn compile'

            }
        }
  stage("Junit") {

             steps{
             sh 'mvn test'
            }
        }
    }
}