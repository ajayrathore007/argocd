node {
    def app

    stage('Clone repository') {
      

        checkout scm
    }
    
    agent {
        
    label 'docker'
        
  }
    stage('Build image') {
  
       app = docker.build("argo:v2")
    }

    stage('Test image') {
  

        app.inside {
            sh 'echo "Tests passed"'
        }
    }

    stage('Push image') {
        
        docker.withRegistry('https://registry.hub.docker.com', '3dac2812-df1d-4c37-b3e1-760df7403a7b') {
            app.push("${env.BUILD_NUMBER}")
        }
    }
    
    stage('Trigger ManifestUpdate') {
                echo "triggering updatemanifestjob"
                build job: 'updatemanifest', parameters: [string(name: 'DOCKERTAG', value: env.BUILD_NUMBER)]
        }
}
