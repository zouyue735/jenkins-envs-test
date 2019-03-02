pipeline {
    agent any
    stages {
        stage('test') {
            steps {
                script {
                    // TODO read envName param

                    echo 'test start'

                    Loader loader = new Loader()
                    Environment env = new Environment(envName)
                    env.registerModules(loader.loadModules())

                    echo env.toString()

                    echo 'test end'
                }
            }
        }
    }
}