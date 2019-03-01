pipeline {
    agent any
    stages {
        stage('test') {
            steps {
                script {
                    echo 'test start'
                    com.opentrans.otms.jenkins.Pipeline.print()
                    echo 'test end'
                }
            }
        }
    }
}