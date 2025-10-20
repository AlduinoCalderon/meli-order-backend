# Project Backlog

---
**File:** Backlog.md
**Purpose:** Tracks user stories, requirements, and acceptance criteria for the Order Management System backend API project. Maintained for team visibility and planning.
---

## Sprints
- Sprint 1: Project Setup & Core Features (Completed)
- Sprint 2: Profiles & Config (Completed)
- Sprint 3: Docs & Testing (Completed)
- Final Delivery

## Sprint Status
Sprint 1: Completed
Sprint 2: Completed
Sprint 3: Completed

## User Stories

### User Story 1: API Implementation
**As a** backend developer  
**I want to** implement the order management API with CRUD operations and database integration  
**So that** the online store can manage orders efficiently

**Acceptance Criteria:**
- [x] API allows creating, reading, updating, and deleting orders
- [x] Database persists all order information reliably
- [x] Project structure follows Spring Boot best practices

### User Story 2: API Documentation
**As a** API consumer  
**I want to** have clear and up-to-date API documentation  
**So that** I can easily understand and use the endpoints

**Acceptance Criteria:**
- [x] Swagger/OpenAPI documentation is integrated and up to date
- [x] README clearly explains API usage and endpoints

### User Story 3: DevOps & Environment Management
**As a** DevOps engineer  
**I want to** configure environment-specific profiles and system variables  
**So that** the application runs securely and correctly in all environments

**Acceptance Criteria:**
- [x] Spring profiles for dev, test, and prod are implemented
- [x] Environment variables are used for sensitive or environment-specific settings
- [x] Switching profiles is documented and easy to follow
- [x] No sensitive data is committed to the repository

### User Story 4: Cloud Deployment
**As a** deployment engineer  
**I want to** deploy the service to Render (or similar cloud platform)  
**So that** the API is available and reliable for users

**Acceptance Criteria:**
- [x] Service is deployed and running on Render
- [x] Deployment process and troubleshooting steps are documented

### User Story 5: Testing & Monitoring
**As a** QA or operations engineer  
**I want to** have health checks and automated tests for the API  
**So that** I can ensure reliability and quickly detect issues

**Acceptance Criteria:**
- [x] Health check endpoint is implemented and documented
- [x] Unit and integration tests cover main API usage scenarios
- [x] Test results are documented and reviewed
- [x] Monitoring instructions are included in the documentation

## Requirements Tracking Table 1: User Stories and Requirements

| User Story | Requirements |
|------------|-------------|
| API Implementation | - Implement Order entity and CRUD REST API<br>- Integrate database (H2/PostgreSQL)<br>- Establish project structure |
| API Documentation | - Integrate Swagger/OpenAPI<br>- Update README with API usage and endpoints |
| DevOps & Environment Management | - Configure Spring profiles for dev, test, prod<br>- Use environment variables for sensitive/config settings<br>- Document profile switching and environment management |
| Cloud Deployment | - Deploy service to Render<br>- Document deployment process and troubleshooting steps |
| Testing & Monitoring | - Implement health check endpoint<br>- Write unit/integration tests<br>- Document test results and monitoring instructions |

## Requirements Tracking Table 2: Prioritized Requirements

| Requirement | Stage | Time Estimation (hours) | Deliverable |
|-------------|-------|------------------------|-------------|
| Order entity & CRUD REST API | Sprint 1 | 4 | API endpoints for orders |
| Database integration (H2/PostgreSQL) | Sprint 1 | 4 | Persistent order data |
| Project structure setup | Sprint 1 | 2 | Organized codebase |
| Swagger/OpenAPI integration | Sprint 3 | 2 | API documentation |
| README & API usage docs | Sprint 3 | 2 | Updated README |
| Postman collection | Sprint 3 | 2 | API test collection |
| Spring profiles & env vars | Sprint 2 | 3 | Config files for dev/test/prod |
| Environment management docs | Sprint 2 | 2 | Profile switching guide |
| Deployment to Render | Final | 3 | Live API service |
| Deployment docs & troubleshooting | Final | 2 | Deployment guide |
| Health check endpoint | Final | 2 | /health endpoint |
| Unit/integration tests | Final | 4 | Test suite & results |
| Monitoring & requirements checklist | Final | 1 | Monitoring guide & checklist |
