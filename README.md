# cs1660-course-project

Source code for main application: ProcecssingToolbox.java

Dockerfile: just one Dockerfile

Docker image URLs: 
* https://hub.docker.com/repository/docker/eakbari/apachehadoop
* https://hub.docker.com/repository/docker/eakbari/apachespark
* https://hub.docker.com/repository/docker/eakbari/jupyter-notebook
* https://hub.docker.com/repository/docker/eakbari/sonar

Steps for running images:
All are deployed from kubernetes cluster: cs1660-data-processing-toolbox
Deploy > expose
From cli:
* docker run -p 8080:8080 eakbari/apachehadoop:latest
* docker run -p 8080:80880 eakbari/apachespark:latest
* docker run -p 8888:8888 eakbari/jupyter-notebook:latest
* docker run --name sonarscannertest --network=host -e SONAR_HOST_URL='http://127.0.0.1:9000' -e SONAR_LOGIN="027a9a2e537c4f79633393f301a746c29d582268" -v "/C/Users/akbar/Documents/Pitt/2021/cs1660/cs1660-course-project:/usr/src" sonarsource/sonar-scanner-cli -D"sonar.projectKey=Test"
