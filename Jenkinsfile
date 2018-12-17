node {
    stage('docker') {
        sudo systemctl start docker
        docker.image('hello-world').run()
    }
}