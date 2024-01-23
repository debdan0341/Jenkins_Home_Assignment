pipeline {
    agent any
    
	 stages {
		        stage('Checkout') {
		            steps {
		                // Checkout Selenium UI testing framework code from the Git repository
				
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
				    {
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
		         }'

		                echo 'checkout'
		              }
		           }
		        
		        stage('Build') {
		            steps {
		                // Build Selenium project using Maven
				    {
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
    
