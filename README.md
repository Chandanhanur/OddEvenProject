# Even or Odd Continuous Integration (CI) Pipeline

This project implements a complete CI/CD pipeline using **Java 17**, **JUnit 5**, **Maven**, **Docker**, and **GitHub Actions**.

---

## 📁 Project Structure

```text
├── .github/
│   └── workflows/
│       └── ci.yml               # GitHub Actions CI/CD pipeline definition
├── src/
│   ├── main/
│   │   └── java/
│   │       └── EvenOdd.java     # Main Java program for Even or Odd logic
│   └── test/
│       └── java/
│           └── EvenOddtest.java # JUnit 5 test cases
├── Dockerfile                   # Docker image definition (Alpine JRE)
├── pom.xml                      # Maven configuration with Surefire & JUnit
├── .dockerignore                # Ignored files for Docker build
├── .gitignore                   # Ignored files for Git
└── README.md                    # Documentation
```

---

## 🚀 Step-by-Step Execution Guide

### Step 1: Run JUnit Tests Locally
```bash
mvn clean test
```

### Step 2: Package JAR Application
```bash
mvn package
```

### Step 3: Run the Application
```bash
# Demo mode:
java -jar target/even-odd-app-1.0.0.jar

# Custom input:
java -jar target/even-odd-app-1.0.0.jar 4 7 12 15
```

### Step 4: Build & Run Docker Image
```bash
docker build -t even-odd-app .
docker run --rm even-odd-app 10 13 22
```

---

## ⚙️ GitHub Secrets Configuration (Docker Hub)

To allow GitHub Actions to push images to your Docker Hub repository:
1. Go to your repository on GitHub: `Settings` ➔ `Secrets and variables` ➔ `Actions`.
2. Click **New repository secret**:
   - Secret 1: `DOCKERHUB_USERNAME` (Your Docker Hub username)
   - Secret 2: `DOCKERHUB_TOKEN` (Your Docker Hub Personal Access Token with Read & Write access)

