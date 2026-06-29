def call(){
  echo "deploying the code"
                sh '''
                    cd ${WORKSPACE}
                    ls -la
                    docker compose down || true
                    docker compose up -d
                '''
}
