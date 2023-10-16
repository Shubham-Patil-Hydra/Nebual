pipeline {
    agent any
    stages {
        stage ('pull') {
            steps {
                echo 'Pulling Completed'
            }
        }
         stage ('build') {
            steps {
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