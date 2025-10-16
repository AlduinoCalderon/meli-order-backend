# Order Management System – Backend API & Documentation

## Overview

This repository contains the backend API and project documentation for the Order Management System, developed as part of a technical challenge focused on Spring and Spring Boot in Java for Web Applications. The primary goal is to restore and enhance the reliability of MELI's order management system, following a real-world incident that resulted in significant operational disruptions.

**Key technologies:**  
- Java 17+  
- Spring Boot 3.x  
- PostgreSQL (prod), H2 (dev/test)  
- Swagger/OpenAPI for API docs  
- Docker for deployment  
- Postman for API testing  
- JUnit for testing

## Project Context

MELI, a leading e-commerce company, experienced major issues with its order management system due to environment misconfiguration and database failures. The challenge was to analyze, re-design, and implement a robust backend solution with clear environment management, comprehensive API documentation, and strong testing practices.

**This repository will:**  
- Serve as the main source of backend documentation  
- Contain the Spring Boot API source code  
- Provide all technical guides, configuration, and API documentation  
- Include Docker and Postman assets  
- Log key team decisions and learning points

*Note: A separate repository will be created later for the frontend application that consumes this API.*

## Getting Started

> **Note:** The first version of this repository focuses on backend setup, project organization, and the documentation foundation.

### How to Run (dev environment)

1. Clone this repository
2. Import into your favorite Java IDE (Java 17+ required)
3. Run with the default profile (`dev`) using the included H2 database
4. API documentation will be accessible via Swagger UI (URL will be provided in later versions)
5. For Docker-based deployment, see the `docker/` directory (to be added in Sprint 1)

### Sprint 1 Milestones

- [ ] Setup Spring Boot project structure
- [ ] Implement Order entity & CRUD API
- [ ] Integrate with H2/PostgreSQL database
- [ ] Basic code documentation and comments
- [ ] Create Postman collection for API testing
- [ ] Prepare Docker startup script
- [ ] Document initial team decisions

## Project Structure

- `/docs` – Project documentation (roadmap, backlog, Gantt chart, etc.)
- `/src` – Java source code (to be added)
- `/docker` – Docker scripts/configs (to be added)
- `/postman` – Postman API collections (to be added)

## Next Steps

- Continue with Sprint 1 tasks and update this README as the project evolves.
- Add detailed API documentation and endpoint usage in later sprints.

---

**For contributors:** Please refer to the project roadmap and backlog in the `/docs` folder for current objectives, milestones, and accepted practices.
