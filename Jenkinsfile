pipeline {
    agent any
    stages {
        stage('test') {
            steps {
                script {
                    echo 'test start'
                    echo com.opentrans.otms.jenkins.Modules.getModules()
                    echo 'test end'
                }
            }
        }
    }
}