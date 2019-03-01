pipeline {
    agent any
    stages {
        stage('test') {
            steps {
                script {
                    System.out.println("test start")
                    com.opentrans.otms.jenkins.Pipeline.print()
                    System.out.println("test end")
                }
            }
        }
    }
}