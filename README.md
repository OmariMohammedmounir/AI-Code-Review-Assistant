## AI Code Review Assistant

## 🚀 Project Overview
**AI Code Review Assistant** is a web platform that automatically reviews code from Git repositories and provides intelligent feedback on:

- Code quality suggestions
- Security vulnerabilities
- Performance issues
- Clean code recommendations

Developers connect their repositories, and the system analyzes pull requests automatically, generating actionable insights.

## 🛠️ Real-World Use Case
When a developer opens a Pull Request (PR):

1. The system fetches the changed files.
2. Sends the code to an AI model.
3. Generates review comments.
4. Displays suggestions in a dashboard.

**Example feedback:**


⚠ Potential SQL injection risk in UserController.php line 45
✔ Consider using prepared statements

## 💻 Technologies Used

**Backend:**  
- Spring Boot  
- REST API  
- GitHub API Integration  
- OpenAI API / Local AI Model  

**Database:**  
- PostgreSQL  
- JPA / Hibernate  

**Frontend:**  
- React or Laravel Blade Dashboard  

**DevOps:**  
- Docker  
- CI/CD pipeline  

## ⚡ Key Features

## 1️⃣ Repository Integration
- Connect GitHub account  
- Import repositories  
- Select branch and analyze commits  

## 2️⃣ AI Code Analysis
- Detects:  
  - Bad coding practices  
  - Duplicated logic  
  - Security issues  
  - Performance problems  
- Generates actionable suggestions  

**Example output:**

```text
Issue detected: Nested loops may reduce performance
Suggestion: Consider using a HashMap instead.
## 3️⃣ Code Metrics Dashboard
- Code complexity  
- Lines changed  
- Technical debt  
- Vulnerability score  
- Charts for professional visualization  

## 4️⃣ Pull Request Review
- Webhook triggered on PR creation  
- Code diff fetched and analyzed  
- AI generates comments automatically  

## 5️⃣ Security Scanner
- Detects common vulnerabilities:  
  - SQL injection  
  - Unsafe input handling  
  - Hardcoded passwords  

## 🔧 Setup Instructions

## Prerequisites
- Java 17  
- Maven  
- PostgreSQL or MySQL  
- Docker (optional)  
- OpenAI API key  

## Run Locally
1. Clone the repository:

```bash
git clone https://github.com/OmariMohammedmounir/AI-Code-Review-Assistant.git
cd ai-code-review
2. Configure database in application.properties:
```bash
spring.datasource.url=jdbc:postgresql://localhost:5432/ai_review_db
spring.datasource.username=your_db_user
spring.datasource.password=your_db_password
3. Add OpenAI API key:
```bash
openai.api.key=your_api_key_here 
4. Build and run:
```bash
mvn clean install
mvn spring-boot:run
5. Open the frontend dashboard at http://localhost:3000 (React) or http://localhost:8080 (Laravel Blade).


