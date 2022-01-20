pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo "-=- compiling project -=-"
                bat 'mvn clean compile' 
                archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true 
            }


        }

        // stage('Test') {
        //     steps {
        //         /* `make check` returns non-zero on test failures,
        //         * using `true` to allow the Pipeline to continue nonetheless
        //         */
        //         bat 'mvn package'
        //         junit '**/target/*.xml' 
        //     }
        }
    }
}