# Project Roadmap

## Objectives

### General Objective
Restore and enhance the reliability of MELI's order management system by restructuring its backend using Spring Boot, implementing robust environment configurations, comprehensive API documentation, and automated testing to prevent future failures.

### Specific Objectives
1. Analyze and resolve technical failures in the order management system.
2. Design and implement a Spring Boot-based backend for order processing.
3. Establish environment-specific configurations and secure variable management.
4. Document the API using Swagger/OpenAPI and provide detailed usage instructions.
5. Implement comprehensive unit and integration tests.
6. Ensure smooth deployment and reproducibility using Docker and startup scripts.
7. Facilitate team learning by documenting key decisions and changes.

## Timeline and Milestones

### Sprint 1 (October 14-16, 2025)
- Setup Spring Boot project structure (Java 17+)
- Implement core Order entity and REST CRUD resource
- Configure database connection (H2/PostgreSQL)
- Initial code documentation and comments
- Create and export Postman collection for API
- Develop Docker startup script
- Draft technical decisions and justifications

### Sprint 2 (October 17-19, 2025)
- Configure Spring profiles for dev/test/prod environments
- Securely manage system variables
- Update configuration files for each environment
- Conduct partial peer reviews and integrate feedback
- Document profile/configuration usage in README
- Upload all source/configuration files

### Sprint 3 (October 20-21, 2025)
- Integrate Swagger/OpenAPI for API documentation
- Write and run unit and integration tests
- Finalize test scripts and checklists
- Ensure API documentation is published and accessible
- Complete all code quality and documentation requirements

### Final Delivery (October 22-23, 2025)
- Deliver analysis and results presentation
- Record and upload solution presentation video

## Deliverables

### Sprint 1
- Spring Boot project initialized with Java 17+
- Order entity and CRUD REST controller
- Connected database (H2 for dev, PostgreSQL for prod)
- Postman collection for API endpoints
- Docker-based startup script
- Initial README and technical notes

### Sprint 2
- Environment-specific configuration files (application-dev.yml, application-test.yml, application-prod.yml)
- Secure and documented system variable setup
- Updated README with environment usage instructions
- Source code and configuration files in repo
- Peer review feedback log

### Sprint 3
- Integrated Swagger/OpenAPI documentation
- JUnit (or similar) test suite for API
- Checklist of requirements and test results
- Published and accessible API documentation

### Final Delivery
- Analysis and Results documentation
- Solution presentation video

## Project Gantt Chart
![Project Gantt Chart](GanttChart.png)

## Technologies and Tools
- Java 17+: Backend programming language
- Spring Boot 3.x: Backend framework
- PostgreSQL: Production database
- H2: Development database
- Docker: Containerization and deployment
- Swagger/OpenAPI: API documentation and testing
- Postman: API endpoint testing
- JUnit: Unit and integration testing
- GitHub: Version control and collaboration

## Stakeholders
- Juan Ventura: Tech Transformation Manager (project sponsor)
- Arturo Bandini: Lead backend developer (solution implementer)
- MELI Operations Team: End users of the order management system
- Digital NAO Team: QA and stakeholders for final review

## Risk Management

| Risk | Impact | Probability | Mitigation Strategy |
|------|--------|------------|---------------------|
| Incorrect environment configuration | High | Medium | Use profiles, automate config validation, peer reviews |
| Database connectivity issues | High | Medium | Use robust connection pooling, fallback configs, logging |
| Incomplete or outdated API documentation | Medium | Medium | Integrate Swagger, enforce doc updates in PR reviews |
| Security of environment variables | High | Medium | Use .env files, avoid hardcoding, restrict repo access |
| Test coverage gaps | Medium | Medium | Use checklists, enforce test writing in workflow |
| Docker/containerization issues | Medium | Low | Test locally, provide clear startup scripts and docs |
| Team knowledge loss | Medium | Low | Maintain change logs and decision documentation |
