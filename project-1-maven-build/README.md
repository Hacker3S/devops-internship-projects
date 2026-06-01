# Project 1: Build Automation Using Maven

## Objective

Automate the build process of a Java application using Maven.

---

## Problem Statement

Create a Maven project, manage dependencies, and generate a build artifact using Maven commands.

---

## Tools & Technologies

![Java](https://img.shields.io/badge/Java-ED8B00?style=flat&logo=openjdk&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=flat&logo=apachemaven&logoColor=white)
![Linux](https://img.shields.io/badge/Linux-FCC624?style=flat&logo=linux&logoColor=black)

---

## Project Structure

```
project-1-maven-build/
├── pom.xml
└── src/
    ├── main/
    │   └── java/
    │       └── com/devops/demo/
    │           └── App.java
    └── test/
        └── java/
            └── com/devops/demo/
                └── AppTest.java
```

---

## Prerequisites

- Java JDK 8 or above
- Apache Maven 3.x

**Verify installations:**
```bash
java -version
mvn -version
```

---

## Steps Performed

### 1. Created Maven Project
Generated the project using Maven's quickstart archetype:
```bash
mvn archetype:generate \
  -DgroupId=com.devops.demo \
  -DartifactId=my-maven-app \
  -DarchetypeArtifactId=maven-archetype-quickstart \
  -DarchetypeVersion=1.4 \
  -DinteractiveMode=false
```

### 2. Understood pom.xml Structure
The `pom.xml` defines the project identity, Java version, and dependencies. Key sections include `groupId`, `artifactId`, `version`, `properties`, and `dependencies`.

### 3. Added a Dependency
Added **Apache Commons Lang 3** to `pom.xml` for string utility functions:
```xml
<dependency>
  <groupId>org.apache.commons</groupId>
  <artifactId>commons-lang3</artifactId>
  <version>3.12.0</version>
</dependency>
```

### 4. Built the Project
```bash
mvn clean package
```

Maven automatically:
- Compiled the source code
- Ran unit tests
- Packaged the app into a `.jar` file

### 5. Verified Build Output
```bash
ls target/
java -cp target/my-maven-app-1.0-SNAPSHOT.jar com.devops.demo.App
```

---

## Build Output

```
[INFO] BUILD SUCCESS
[INFO] Building jar: target/my-maven-app-1.0-SNAPSHOT.jar
```

---

## Output

```
Original:    hello devops world
Capitalized: Hello devops world
```

---

## Key Maven Commands

| Command | Description |
|---------|-------------|
| `mvn compile` | Compiles source code |
| `mvn test` | Runs unit tests |
| `mvn package` | Builds and packages into JAR |
| `mvn clean` | Deletes the target/ folder |
| `mvn clean package` | Fresh build from scratch |

---

## Outcome

Successfully built a Java application using Maven — demonstrating dependency management, build lifecycle understanding, and artifact generation.

---
