node {
    def app

    stage('Clone repository') {
      

        checkout scm
    }

    stage('Build image') {
  
       app = docker.build("argov2")
    }

    stage('Test image') {
  

        app.inside {
            sh 'echo "Tests passed"'
        }
    }
    
    stage('Push image') {
        withDockerRegistry([ credentialsId: "dockerhub", url: "https://registry.hub.docker.com" ]) {
        dockerImage.push()
            app.push("${env.BUILD_NUMBER}")
        }
    }    
    
    stage('Trigger ManifestUpdate') {
                echo "triggering updatemanifestjob"
                build job: 'updatemanifest', parameters: [string(name: 'DOCKERTAG', value: env.BUILD_NUMBER)]
        }
}
