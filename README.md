#  Kubernetes Demo with `minikube`

## Requirements

* Docker
* kubectl
* Minikube

## About  the  image 

There is a public image `cfaife/k8sdemo` hosted in docker hub: https://hub.docker.com/ 

By default the image was set to run using the port `8087` inside its container.

## installation guide

### Docker 
    
Follow the link:
    
    https://docs.docker.com/engine/install/binaries/

### Kubectl or Kube control

    https://kubernetes.io/docs/tasks/tools/

### Minikube

    https://kubernetes.io/docs/tasks/tools/

## Post installation  steps

After installing the required tools, we need to start our `cluster` by the command:

    minikube start

The above command will pull the `base image` into the localmachine, for more details see: https://minikube.sigs.k8s.io/docs/drivers/.

After the process finish, `kubectl` will be configured to use `minikube` cluster and "default" namespace by default.

## Getting stared

The two(2) yaml files called `deployment.yaml`  and  `service.yaml` are the `Kubernetes Resources` where put our `derised state`. And its up to the cluster to  process those manifests to our infrastructure(`workers`) in this use case we are local machine holds our infrastructure.

###  Deploy the `Pod`

    kubectl create    -f  deployment.yaml 

#### Check the `Pod` status

    kubectl get pods

#### Check the `deployment` status

After the deployment creation the status of the `Pod` will be `ContainerCreating`. We also check the deployment 
status with: 

    kubectl get deployments

###   LoadBalancer Service 

#### creating the serice

    kubectl create  -f service.yaml

#### Get the service 

    kubectl get svc










