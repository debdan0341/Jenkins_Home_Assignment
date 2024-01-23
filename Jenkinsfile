pipeline {
   agent any

   tools {
      // Install the Maven version configured as "M3" and add it to the path.
      maven "MAVEN_HOME"
   }

   stages {
      stage('Build') {
         steps {
            // Get some code from a GitHub repository 
            git 'https://github.com/debdan0341/Jenkins_Home_Assignment.git'
            sh "mvn -Dmaven.test.failure.ignore=true clean compile"
         }
         }
      stage("Test") {
          steps {
            git 'https://github.com/debdan0341/Jenkins_Home_Assignment.git'  
            sh "mvn -Dmaven.test.failure.ignore=true clean test"
            
          }

      }
      stage("Deploy") {
          steps {
            git 'https://github.com/debdan0341/Jenkins_Home_Assignment.git'  
            sh "mvn -Dmaven.test.failure.ignore=true clean install"
            
          }
          post {
              success {
                  archiveArtifacts 'target/*.jar'
              }

          }


      }

      }
   }
