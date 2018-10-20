pipeline {
    agent any
    parameters {
        string(name: 'otms-base')
    }
    stages {
        stage('build') {
            steps {
                git branch: ${params.'otms-base'}, credentialsId: '301e3cef-a065-46fd-9c14-c80f74c06968', url: 'https://github.com/zouyue735/jenkins-items-test.git'
            }
        }
    }
}
