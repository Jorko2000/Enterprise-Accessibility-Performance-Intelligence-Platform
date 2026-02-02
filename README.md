# A11yPulse  
## Enterprise Accessibility & Performance Intelligence Platform

A11yPulse is a **Java-based, enterprise-ready platform** designed to help organizations monitor, analyze, and improve **web accessibility (WCAG compliance)** and **front-end performance** at scale.

The system combines **secure Java microservices** with a **modern React front end** to provide actionable insights, historical analytics, and audit-ready reporting for large engineering teams.

---

## 🚀 Key Capabilities

- Secure API Gateway with JWT-based authentication
- Java Spring Boot microservices architecture
- Accessibility and performance audit services
- Enterprise dashboards built with IBM Carbon Design System
- Interactive data visualizations using D3.js
- React performance optimization
- Server-state management with React Query
- UI state management with Redux Toolkit
- Sass and Less for scalable component styling
- Automated testing (JUnit, Jest, Selenium)
- CI/CD pipeline with GitHub Actions
- Dockerized services for easy local setup
- Secure REST APIs
- React + TypeScript
- REST API integration
- 14.TDD mindset
- Selenium UI automation
- Agile / Jira usage
---

## 🧠 System Architecture 

+------------------------+        HTTPS/JWT         +------------------------+
|      React Front-End   | <---------------------> |    API Gateway (Java)   |
|------------------------|                         |------------------------|
| - React + TypeScript    |                         | - Spring Boot          |
| - Redux Toolkit (UI)    |                         | - JWT-based auth       |
| - React Query (Server)  |                         | - REST Routing         |
| - D3.js (Visualizations)|                         +----------+-------------+
| - IBM Carbon Design     |                                    |
| - Sass / Less Styling   |                                    |
| - Performance Optimizations                               |
+------------------------+                                    |
                                                              v
          ---------------------------------------------------------------
          |                        Microservices Layer                  |
          ---------------------------------------------------------------
          |                               |                             |
+-------------------------+     +-------------------------+     +------------------------+
| Audit Service           |     | Metrics Service         |     | Auth Service           |
|-------------------------|     |-------------------------|     |------------------------|
| - Spring Boot           |     | - Spring Boot           |     | - Spring Boot          |
| - Accessibility Analysis|     | - Historical Data Store |     | - JWT Issuer / Validator|
| - Performance Analysis  |     | - Aggregation & Trends  |     | - User Roles           |
| - PostgreSQL / H2       |     | - PostgreSQL            |     | - PostgreSQL            |
+-------------------------+     +-------------------------+     +------------------------+


## Detailed Component Flow

## 1.React Front-End
User inputs URL to audit or views historical trends.
Redux Toolkit manages UI state.
React Query handles server-state: fetching and caching audit/metrics data.
D3.js renders interactive charts (performance over time, accessibility scores).
Performance optimizations:
React.memo for reusable components
React.lazy + code splitting
Virtualized lists for large audit datasets

## 2.API Gateway (Java Spring Boot)
Acts as the single entry point.
Validates JWT access and refresh tokens.
Routes requests to the correct microservice.
Enforces security and rate-limiting rules.
## 3.Audit Service
Core service for accessibility and performance analysis.
Evaluates submitted URLs against WCAG compliance.
Calculates performance metrics (load times, render times).
Stores results in PostgreSQL or H2 (for demo).
Exposes REST endpoints /api/audits.
## 4.Metrics Service
Aggregates historical audit data.
Calculates trends, averages, regressions.
Supplies endpoints for charts and reporting: /api/metrics.
## 5.Auth Service
Issues JWTs (access + refresh tokens).
Validates user roles (Admin, Developer, Viewer).
Ensures secure access to audit and metrics data.
## 6.Database Layer
PostgreSQL used for microservices storage.
Separate schemas per service (Audit, Metrics, Auth).
Allows scaling microservices independently.
## 7.CI/CD & DevOps
GitHub Actions pipeline runs on each push:
Java microservices tests (JUnit)
React front-end tests (Jest)
Linting and build
Docker Compose orchestrates:
API Gateway
Audit Service
Metrics Service
Optional future Kubernetes deployment possible.
## 8.Automated Testing
Unit Testing: JUnit (Java) + Jest (React)
UI Automation: Selenium
Ensures end-to-end quality across services.


##  Running the Project Locally

### Prerequisites
- Java 17+
- Node.js 18+
- Docker & Docker Compose

### Start Backend Services
```bash
cd backend
docker-compose up --build

### Start Frontend

cd frontend/a11ypulse-ui
npm install
npm start

Frontend runs at: http://localhost:3000
API Gateway runs at: http://localhost:8080


