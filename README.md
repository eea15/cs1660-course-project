# cs1660-course-project

### This is the cs1660 course project option 1. ###

Video walkthrough:

Source code for main application: ProcessingToolbox.java

Dockerfile: just one Dockerfile

Docker image URLs: 
* Apache Hadoop: bde2020/hadoop-datanode, bde2020/hadoop-namenode
* Apache Spark: bde2020/spark-base, bde2020/spark-master, bde2020/spark-worker
* Jupyter Notebook: jupyter/all-spark-notebook
* SonarQube and SonarScanner: sonarqube

### Steps ###

#### Running the Main Application ####
1. Compile: javac ProcessingToolbox.java
2. Run: java ProcessingToolbox.java
3. Enter a valid number to choose a microservice
    1. Follow the listed URL
4. Enter an invalid number to quit

#### Deployment Steps I Took #####

Apache Hadoop:
Source: https://github.com/big-data-europe/docker-hadoop
1. Create Kubernetes workloads from Apache Hadoop images listed above
2. From the container registry in GCP, deploy Namenode to GKE
    1. Copy in CLUSTER_NAME to environment variables from docker-compose.yml
    2. Copy in first 8 vars from hadoop.env
    3. Input an app name
    4. Deploy
3. Change replicas to 1 in yaml
4. Expose on ports 9870 and 9000
5. Load balancer > create
6. Click endpoint url
For Datanode, do same steps except copy SERVICE_PRECONDITION (change port), update replicas to 2, and no service is needed

Apache Spark:
1. Pull the 3 spark images from Docker Hub (bde2020/spark-base, bde2020/spark-master, bde2020/spark-worker)
2. Push to google container registry
3. Run Kubernetes deployment steps listed here: https://github.com/big-data-europe/docker-spark
4. Expose master pod

Jupyter Notebook:
1. Follow https://cloud.google.com/architecture/spawning-notebook-servers-on-gke-tutorial

SonarQube and SonarScanner:
1. Pull sonarqube image from Docker Hub
2. Push to google container registry
3. Create deployment
4. Expose

