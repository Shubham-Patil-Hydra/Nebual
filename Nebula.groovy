pipeline {
    agent any
    stages {
        stage ('pull') {
            steps {
                git 'https://github.com/Shubham-Patil-Hydra/studentapp-ui.git'
                echo 'Pulling Completed'
            }
        }
         stage ('build') {
            steps {
                sh '/opt/apache-maven-3.9.5/bin/mvn clean package'
                echo 'Building Completed'
            }
        }
         stage ('test') {
            steps {
                echo 'Testting Completed'
            }
        }
    }
}