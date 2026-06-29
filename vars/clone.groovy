def call(String url, String branch){
   echo "cloning the repo code" 
   git url: "${url}", branch:"${branch}"
    echo "code cloning successfull!"
}
