# HireTrack — Full-Stack Job Portal

HireTrack is a full-stack job portal and application tracking platform inspired by products like Naukri and LinkedIn.

The platform allows:

- candidates to register, log in, browse jobs, apply, and track application statuses
- recruiters to create job posts, manage applicants, and update application progress
- admins to manage users, jobs, and platform activity

## Tech Stack

### Backend
- Java 25.0.2-tem
- Spring Boot
- Spring Security
- JWT Authentication
- Spring Data JPA
- PostgreSQL
- Maven

### Frontend
- React
- Vite
- React Router DOM
- Axios
- CSS / Tailwind CSS

### Database
- PostgreSQL

### Tools
- SDKMAN
- NVM
- Git & GitHub
- IntelliJ IDEA CE
- VS Code
- Postman
- DBeaver

## Roles

### Admin
- manage users
- manage recruiters and candidates
- view all jobs
- monitor platform activity

### Recruiter
- create and manage job posts
- review applicants
- update application statuses
- manage hiring workflow

### Candidate
- register and log in
- browse and filter jobs
- apply to jobs
- upload resume
- track application progress

## Planned Features

### Core Features
- user authentication and authorization
- role-based access control
- job CRUD operations
- candidate application flow
- application tracking
- recruiter dashboard
- admin dashboard

### Advanced Features
- resume upload via Cloudinary or AWS S3
- email notifications using Spring Mail
- advanced job search and filtering
- dashboard analytics
- optional Elasticsearch integration

## Folder Structure

```text
job-portal-apr26/
├── backend/        # Spring Boot backend
├── frontend/       # React + Vite frontend
├── docs/           # project planning and notes
├── README.md
└── .gitignore