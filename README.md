## Team Name - GoalSync
### Team Members
1. Aasim Shah (aasim.shah@2000)
2. Gokul Sajeev (Gokulsajeev15)

## Overview

EPL Insights is a microservices-based system that provides real-time analytics and statistics for English Premier League football players and teams. The system consists of two main services:
- Player Statistics Service: Manages individual player data and statistics
- Team Statistics Service: Processes team-level analytics based on player data

The system is built using:
- Spring Boot 2.5.5
- MongoDB 4.4
- Docker & Docker Compose
- Kubernetes
- Lombok

## Prerequisites
- Java 8
- Maven 3.6+
- Docker & Docker Compose
- Kubernetes cluster (minikube or any other)
- MongoDB 4.4
- kubectl CLI

## Quick Start

### Local Development with Docker Compose

1. Clone the repository
```bash
git clone https://gitlab.com/aasimshah.2000/football_tracker.git
cd epl-insights
```

2. Start Kubernetes
```bash
minikube start
```

3. Apply Kubernetes manifests

```bash
kubectl apply -f .
```

4. Start Player Service
```bash
kubectl port-forward svc/player-statistics-service 8080:8080
```

5. Start Team Service
```bash
kubectl port-forward svc/team-statistics-service 8081:8081
```

## API Documentation

### Player Statistics Service (Port 8080)
1. Create Player
```bash
POST /api/players
Content-Type: application/json

{
    "name": "Diogo Jota",
    "team": "Liverpool",
    "position": "Forward",
    "goalsScored": 20,
    "assists": 10,
    "performance": 8.5
}
```

2. Get All Players
```bash
GET /api/players
```

3. Get Player by ID
```bash
GET /api/players/{id}
```

4. Get Players by Team
```bash
GET /api/players/team/{team}
```

### Team Statistics Service (Port 8081)
Generate Team Statistics
```bash
GET /api/team-statistics/generate/{teamName}
```