pipeline {
    agent any
    
	 stages {
		        stage('Checkout') {
		            steps {
		                // Checkout Selenium UI testing framework code from the Git repository
				 git branch: 'master', url:'https://github.com/debdan0341/Jenkins_Home_Assignment.git'

		                echo 'checkout'
		              }
		           }
		        
		        stage('Build') {
		            steps {
		                // Build Selenium project using Maven
				    dir('.'){
				        echo 'build'
				        bat 'mvn clean'
				    }
		             }
		          }
        
		        stage('Test') {
		            steps {
		                // Run Selenium tests using Maven
				        echo 'test'
				        bat 'mvn test'
		            }
		         }
        
		        stage('Publish Reports') {
		            steps {
		                // Publishing repots using HTML Publisher plugin
		               echo 'You are in publish reports section'
			                publishHTML(target:[
			                    allowMissing: false,
			                    alwaysLinkToLastBuild: true,
			                    keepAll: true,
			                    reportDir: 'test-output',
			                    reportFiles: 'index.html',
			                    reportName: 'HTML Report'
			                ])
			    }
		        }
        
          }
    
    post {
	        always {
			// Cleaning  up tmp
			
	            echo 'this is for post section'
	        }
        
	        success {
	            // Actions when pipeline succeeds
	            echo 'Pipeline is Succeeded!'
	        }
        
	        failure {
	            // Actions when pipeline fails
	            echo 'Pipeline is Failed!'
	        }
          }
	
}
