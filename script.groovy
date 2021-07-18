pipeline {
    agent {any}
    stages {
        stage('Generate Report') {
            steps {
                script {
                    dir('config-repo') {
                        python lib/main.py create-report
                    }
                }
            }
        }
    }
}
