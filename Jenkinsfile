pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'master', url:'https://github.com/debdan0341/Jenkins_Home_Assignment.git'
                echo 'checkout'
            }
        }
         stage('Build') {
            steps {
                dir('.'){
                echo 'build'
                bat 'mvn clean'
            }
        }
         }
        stage('Test') {
            steps {
                echo 'test'
                bat 'mmvn clean'
            }
        }
        post {
             always{
                 echo 'post section command'
             }
             success{
                 echo 'Pipeline is Succeeded!!'
             }
             failure{
                 echo 'Pipeline is Failed'
             }
        }
        
        
    }
}
