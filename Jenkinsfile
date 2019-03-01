pipeline {
    agent any
    stages {
        stage('test') {
            steps {
                script {
                    echo 'test start'
                    com.opentrans.otms.jenkins.Pipeline.print()
                    echo com.opentrans.otms.jenkins.Modules.modules.toString()
                    echo 'test end'
                }
            }
        }
    }
}