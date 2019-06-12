# Sample Project to demonstrate how to deploy to openshift

### Steps 
1. oc new-project demo-jvm
2. oc new-app registry.access.redhat.com/redhat-openjdk-18/openjdk18-openshift~https://github.com/litts/openshift-quarkus-jvm-deploy-demo.git
3. Expose service  oc expose svc demo-jvm-app




