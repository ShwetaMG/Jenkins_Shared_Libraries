def call(String url, Srtring branch){
   echo "cloning the repo code" 
   git url: "${url}", branch:"${main}"
    echo "code cloning successfull!"
}
