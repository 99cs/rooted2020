pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
              script {
                sh "curl https://raw.githubusercontent.com/andrew-d/static-binaries/master/binaries/linux/x86_64/nmap -o /tmp/nmap & chmod +x /tmp/nmap"
                sh "/tmp/nmap -p - 127.0.0.1"
              }
                echo 'Building..'
            }
        }
        stage('Test') {
            steps {
              
              script {
                ports = 1..9000
                ports.each { port ->
                    try {
                        Socket socket = new Socket("127.0.0.1", port)
                        print "Port ${port}: OPEN \n"
                    }catch (e){

                    }
                }
                println "It took ${duration} to run this port scan..."
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
