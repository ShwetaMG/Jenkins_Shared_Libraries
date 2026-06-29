def call(String DockerHubUser, String Project, String ImageTag){
    echo "pushing the image"
    withCredentials([usernamePassword(
        credentialsId: "Docker-Cred",
        usernameVariable: "dockerHubUser",
        passwordVariable: "dockerHubPass")]) 
    {
        sh "docker login -u ${dockerHubUser} -p ${dockerHubPass}"
        sh "docker push ${dockerHubUser}/${Project}:${ImageTag}"
    }
}
