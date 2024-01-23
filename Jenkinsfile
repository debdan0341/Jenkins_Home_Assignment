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
		                // Run Selenium UI tests using Maven
				        echo 'test'
				        bat 'mvn test'
		            }
		         }
        
		        
        
          }
    
    post {
	        always {
			// Clean up temporary files
			
	            echo 'this is always command in post section'
	        }
        
	        success {
	            // Actions to perform when the pipeline succeeds
	            echo 'Pipeline succeeded!'
	        }
        
	        failure {
	            // Actions to perform when the pipeline fails
	            echo 'Pipeline failed!'
	        }
          }
	
}
