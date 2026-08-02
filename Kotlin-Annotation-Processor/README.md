🇵🇹 [Versão em Português disponível em README_PT.md](README_PT.md)

# Assignment 3 — Annotation Processor  
**Course:** Desenvolvimento de Aplicações Móveis (DAM)  
**Student(s):** Guilherme Graça A51827  
**Date:** May 2, 2026  
**Repository URL:** https://github.com/GuilhermeGraca/Kotlin-Exercises/tree/main/Kotlin-Annotation-Processor  

---

## 1. Introduction
The objective of this assignment is to develop a custom Kotlin annotation processor for compile-time code generation. This project corresponds to Exercise 1 of Tutorial 3. The main goal is to create a `@Greeting` annotation that generates a helper class responsible for printing a greeting message before executing the annotated method.

## 2. System Overview
The solution is structured as a multi-module Gradle project. Its primary functionality is compile-time code generation triggered by the `@Greeting` annotation, allowing developers to inject greeting messages into existing methods without altering their original source code.

## 3. Architecture and Design
The project is divided into three specialized Gradle modules:
- `annotations`: Defines the `@Greeting` annotation.
- `processor`: Contains the annotation processor logic responsible for analyzing annotated code and generating new classes (`kapt`).
- `app`: Test application module used to apply and verify the generated code.

This modular structure was chosen to ensure clean separation of concerns between annotation definitions, processing logic, and application usage.

## 4. Implementation
Implementation focuses on the annotation definition in the `annotations` module and the processing logic in `processor`. The processor inspects the AST (Abstract Syntax Tree) during compilation and writes the generated source files. The `app` module applies `@Greeting` to test the generated behavior.

## 5. Testing and Validation
Validation is performed in the `app` module by verifying that the generated code compiles cleanly and runs correctly. It confirms that the greeting message is printed to the console before the execution of the annotated method.

## 6. Usage Instructions
To execute the project, build the project using Gradle. The build process automatically triggers the Kotlin annotation processor (`kapt`) to generate the required source files. Then, run the `app` module to inspect the console output:
```bash
./gradlew build
./gradlew :app:run
```

---

# Development Process

## 12. Version Control and Commit History
Git was used to track project code changes and milestones.

## 13. Difficulties and Lessons Learned
Frequent Gradle dependency and plugin configuration issues occurred throughout development. Resolving these challenges provided deeper insight into multi-module Gradle builds, dependency management, and Kotlin Annotation Processing (`kapt`).

## 14. Future Improvements
- Expand the annotation processor to support additional configuration options and parameters.
- Complete Exercise 2 of the tutorial series.

---

## 15. AI Usage Disclosure (Mandatory)
Gemini 3 was used to assist in diagnosing Gradle dependency and configuration errors during troubleshooting, as well as aiding in drafting this README. The author confirms full responsibility for all final code and documentation.
