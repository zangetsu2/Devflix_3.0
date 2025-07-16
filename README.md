Project: DevFlix – The Developer’s Movie Hub
🎯 Concept
A microservices-based web application where developers can:
- Discover tech-themed movies and documentaries
- Vote and review them
- Get daily recommendations
- Track viewing history and preferences
This blends entertainment with tech culture and gives you a rich playground to apply DevOps principles.
devflix/
├── .gitignore
├── README.md
├── docker-compose.yml
├── frontend/
│   ├── src/
│   │   └── index.js
│   ├── package.json
│   ├── Dockerfile
│   └── .dockerignore
├── catalogue/
│   ├── app.py
│   ├── requirements.txt
│   ├── Dockerfile
│   └── .dockerignore
├── voting/
│   ├── pom.xml
│   ├── src/
│   │   └── main/java/com/devflix/voting/
│   │       ├── VotingApplication.java
│   │       └── controller/
│   │           └── VoteController.java
│   ├── Dockerfile
│   └── .dockerignore
├── recommendation/
│   ├── go.mod
│   ├── main.go
│   ├── Dockerfile
│   └── .dockerignore
└── k8s/
    ├── ingress.yaml
    ├── frontend-deployment.yaml
    ├── catalogue-deployment.yaml
    ├── voting-deployment.yaml
    └── recommendation-deployment.yaml
