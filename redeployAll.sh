kubectl create namespace platform2 --dry-run=client -o yaml | kubectl apply -f -
kubectl delete -f infrastructure/k8s/database-deployment.yml --namespace=platform2
kubectl delete -f infrastructure/k8s/service-deployment.yml --namespace=platform2
kubectl create -f infrastructure/k8s/database-deployment.yml --namespace=platform2
kubectl create -f infrastructure/k8s/service-deployment.yml --namespace=platform2
