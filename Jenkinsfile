pipeline {
    agent any
    stages {
        stage('test') {
            steps {
                script {
                    // TODO read envName param

                    echo 'test start'

                    model.Loader loader = new model.Loader()
                    model.Environment env = new model.Environment('test')
                    env.registerModules(loader.loadModules())

                    echo env.toString()

                    echo 'test end'
                }
            }
        }
    }
}