pipeline {

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
    
   stage ('Killing Containers') {
        steps {
 
            echo "====== killing Containers====="
            echo "Current Container: ${TEST_CONTAINER_NAME} "
            echo "Previous Container ${PREV_CONTAINER_NAME}"
            script {
                try {
                    bat "docker rm ${PREV_CONTAINER_NAME}"
                }catch(Exception e) {
                    echo e.getMessage() 
                    echo "Container not found ${PREV_CONTAINER_NAME}"
                }
            }
        }
    }
 
  }
}
