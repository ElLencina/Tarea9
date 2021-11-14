pipeline {
    agent { docker { image 'maven:3.3.3' } }
    stages {
        stage('build') {
            steps {
                sh "chmod +x -R ${env.WORKSPACE}"
                sh'./gradlew test'
            }
        }
    }
}
