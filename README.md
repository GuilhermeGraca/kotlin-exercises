🇵🇹 [Versão em Português disponível em README_PT.md](README_PT.md)

# Kotlin Exercises & Practical Assignments

**Author:** Guilherme Graça (A51827)  
**Course:** Desenvolvimento de Aplicações Móveis (DAM)  
**Language:** Kotlin  

---

## 📌 Repository Overview

This unified repository consolidates practical Kotlin exercises, assignments, and mini-projects developed during the course. Each module explores different features and programming paradigms of the Kotlin language, ranging from syntax fundamentals to advanced functional programming and compile-time code generation.

---

## 📂 Projects & Modules

| Module | Description | Key Topics & Technologies |
| :--- | :--- | :--- |
| **[Kotlin-Fundamentals-and-Virtual-Library](./Kotlin-Fundamentals-and-Virtual-Library)** | Foundational Kotlin exercises (including a CLI Calculator) and an Object-Oriented **Virtual Library** management system. | • OOP (Inheritance, Abstract Classes, Polymorphism)<br>• Control flow (`when`) & Exception handling<br>• `companion object` & Data classes |
| **[Kotlin-Advanced-Exercises](./Kotlin-Advanced-Exercises)** | Advanced Kotlin CLI exercises organized into four independent modules: Event Log Processing, Type-Safe Cache, Configurable Data Pipeline, and a 2D Vector Math Library. | • Sealed classes & exhaustive `when`<br>• Generics with Upper Bounds (`Cache<K, V>`)<br>• Higher-Order Functions & Lambdas<br>• Operator Overloading (`Vec2`) |
| **[Kotlin-Annotation-Processor](./Kotlin-Annotation-Processor)** | A multi-module Gradle project implementing a compile-time custom annotation processor (`@Greeting`) for automatic code generation. | • Kotlin Annotation Processing (`kapt`)<br>• Multi-module Gradle build<br>• Compile-time code generation |

---

## 🚀 How to Run

1. **Clone the repository:**
   ```bash
   git clone https://github.com/GuilhermeGraca/Kotlin-Exercises.git
   cd Kotlin-Exercises
   ```
2. **Open in IntelliJ IDEA / Android Studio:**
   - For **[Kotlin-Fundamentals-and-Virtual-Library](./Kotlin-Fundamentals-and-Virtual-Library)** and **[Kotlin-Advanced-Exercises](./Kotlin-Advanced-Exercises)**: Open the respective Maven project and run `mvn clean package` or execute the `main()` functions directly in the IDE.
   - For **[Kotlin-Annotation-Processor](./Kotlin-Annotation-Processor)**: Open the Gradle multi-module project and run via Gradle tasks (`./gradlew build`).

---
