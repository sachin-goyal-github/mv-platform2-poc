# platform2-poc

Platform2 Proof Of Concept Service

### Installation
Docker: https://docs.docker.com/docker-for-mac/install/  
Virtual Box if you don't already have it: `brew install --cask virtualbox`  
Minikube: `brew install minikube`  
Kubernetes cli tools: `brew install kubernetes-cli`  

# Deployments (Local Minikube Cluster)

## Create New Cluster
```
minikube config set disk-size 20GB
minikube config set memory 6144
minikube delete
minikube start
```

## Deploy service
```
./redeployAll.sh
```

## Port forwarding (Preferred)
```
kubectl port-forward service/platform2-poc 8081:8080 --namespace=platform2-poc
```
