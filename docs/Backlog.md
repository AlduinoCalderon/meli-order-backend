# Project Backlog

---
**File:** Backlog.md
**Purpose:** Tracks user stories, requirements, and acceptance criteria for the Order Management System backend API project. Maintained for team visibility and planning.
---

## User Stories

### User Story 1
**As a** backend developer  
**I want to** create an order management API using Spring Boot  
**So that** the online store can efficiently handle order creation, updates, retrieval, and deletion

**Acceptance Criteria:**
- [ ] API allows creating new orders with product details (SKU, name, description, stock, price)
- [ ] API supports reading, updating, and deleting orders
- [ ] Database persists all order information reliably
- [ ] Project structure follows Spring Boot best practices

### User Story 2
**As a** DevOps engineer  
**I want to** configure environment-specific profiles and system variables  
**So that** the application can run securely and correctly in development, testing, and production

**Acceptance Criteria:**
- [ ] Spring profiles for dev, test, and prod are implemented
- [ ] Environment variables are used for sensitive or environment-specific settings
- [ ] Switching profiles is documented and easy to follow
- [ ] No sensitive data is committed to the repository

### User Story 3
**As a** QA engineer  
**I want to** have comprehensive API documentation and test collections  
**So that** I can easily test, validate, and understand the API functionality

**Acceptance Criteria:**
- [ ] Swagger/OpenAPI documentation is integrated and up to date
- [ ] Postman collection covers all CRUD operations with examples
- [ ] README clearly explains API usage and endpoints

### User Story 4
**As a** MELI operations team member  
**I want to** ensure the order system is reliable and well-tested before deployment  
**So that** disruptions and customer complaints are minimized

**Acceptance Criteria:**
- [ ] Unit and integration tests cover main API usage scenarios
- [ ] Test results are documented and reviewed
- [ ] Checklist of final requirements is completed before delivery

## Requirements Tracking Table 1: User Stories and Requirements

| User Story | Requirements |
|------------|-------------|
| User Story 1 | - Requirement 1.1: Implement Order entity and CRUD REST API<br>- Requirement 1.2: Database integration (H2/PostgreSQL)<br>- Requirement 1.3: Project structure and code documentation |
| User Story 2 | - Requirement 2.1: Configure Spring profiles<br>- Requirement 2.2: Secure environment variable management |
| User Story 3 | - Requirement 3.1: Integrate Swagger/OpenAPI<br>- Requirement 3.2: Postman collection for API<br>- Requirement 3.3: Update and document README |
| User Story 4 | - Requirement 4.1: Implement unit/integration tests<br>- Requirement 4.2: Delivery checklist and test results |

## Requirements Tracking Table 2: Prioritized Requirements

| Requirements | Stages | Time Estimation (hours) | Deliverables |
|-------------|--------|------------------------|--------------|
| Requirement 1.1 | Sprint 1 | 4 | Order entity, CRUD REST controller |
| Requirement 1.2 | Sprint 1 | 4 | Database integration (H2/Postgres) |
| Requirement 1.3 | Sprint 1 | 2 | Project structure, code documentation |
| Requirement 2.1 | Sprint 2 | 3 | Profile-specific configuration files |
| Requirement 2.2 | Sprint 2 | 2 | Secure environment setup, .env/sample |
| Requirement 3.1 | Sprint 3 | 2 | Swagger/OpenAPI documentation |
| Requirement 3.2 | Sprint 3 | 2 | Postman collection for API |
| Requirement 3.3 | Sprint 3 | 2 | Updated README |
| Requirement 4.1 | Sprint 3 | 4 | Test suite and coverage reports |
| Requirement 4.2 | Sprint 3 | 1 | Requirements checklist, test results |
