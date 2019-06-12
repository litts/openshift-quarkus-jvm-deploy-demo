# Sample Project to Deploy on Openshift

### Steps 
1. oc new-project demo-jvm
2. oc new-app registry.access.redhat.com/redhat-openjdk-18/openjdk18-openshift~https://github.com/litts/life-demo.git
3. Expose service  oc expose svc demo-jvm-app




