pipeline {
<<<<<<< HEAD
    agent any 


    parameters {
        string(name:"VERSION", defaultValue:'', description:'version to deploy')
        choice(name:"Version", choices : ['1.1', '1.2', '1.3'], description:'')
        booleanParam(name:'executeTests', defaultValue:true, description:"skip tests")
    }

    tools {
        maven 'maven'
    }

    
    environment {
        ORG_NAME = "ashish"
        APP_NAME = "maven-project"
        APP_VERSION = "1.0-SNAPSHOT"
        APP_CONTEXT_ROOT = "/"
        APP_LISTENING_PORT = "8080"
        TEST_CONTAINER_NAME = "ci-${APP_NAME}-${BUILD_NUMBER}"
        PREV_CONTAINER_NAME="ci-${APP_NAME}-${currentBuild.previousBuild.number}"
    }

  stages {
    stage('Compile') {
        steps {
            echo "-=- compiling project -=-"
            bat "mvn clean compile"
        }
    }
  

    stage('Package') {

// to execute this stage when params.executeTest is true 
        when {
            expression {
                params.executeTests
            }
        }

        steps {
            echo "-=- packaging project -=-"
            bat "mvn package -DskipTests=${params.executeTests}"
            archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
        }
    }
  }
}
=======
    agent any

    stages {
        stage('build') {
            steps {
                echo 'i can do some building here '
            }
        }
        stage('test') {
            steps {
                echo 'test stage goes here '
            }
        }
        stage('deployment') {
            steps {
                echo 'deployment stage '
            }
        }

    }
}
>>>>>>> c3dd6cf5b7e1a332edfb9eec375b3ed95a793d4a
