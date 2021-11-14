pipeline {
    agent { docker { image 'maven:3.3.3' } }
    stages {
        stage('build') {
            steps {
                sh'chmod -R 777 /var/lib/jenkins'
                sh'./gradlew test'
            }
        }
    }
}
