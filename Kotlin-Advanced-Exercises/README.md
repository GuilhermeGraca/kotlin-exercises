🇵🇹 [Versão em Português disponível em README_PT.md](README_PT.md)

# Assignment 2 — Section 1: Kotlin Advanced Exercises  
**Course:** Desenvolvimento de Aplicações Móveis (DAM)  
**Student(s):** Guilherme Graça A51827  
**Date:** 12/04/2026  
**Repository URL:** https://github.com/GuilhermeGraca/Kotlin-Exercises/tree/main/Kotlin-Advanced-Exercises  

---

## 1. Introduction
The goal of this section was to deepen and consolidate advanced Kotlin programming concepts before progressing to Android interface development. The exercises focused on exploring official documentation and implementing solutions using functional programming, *extension functions*, *higher-order functions*, generics, and *operator overloading*.

## 2. System Overview
The project consists of four independent logical modules executed via Command Line Interface (CLI):
1. **Event Log Processing:** A user-centric event processing system (Login, Logout, Purchase).
2. **Type-Safe In-Memory Cache:** A generic cache (`Cache<K, V>`) to store and transform temporary data safely.
3. **Configurable Data Pipeline:** A sequential log string processing pipeline.
4. **2D Vector Library:** A mathematical library for two-dimensional vectors (`Vec2`).

## 3. Architecture and Design
The architecture is built on clean code principles and native Kotlin language strengths:
- **Sealed Classes:** Used in the event logging system to guarantee exhaustiveness in `when` expressions.
- **Generics with Upper Bounds:** Implemented in the cache to enforce compile-time type safety.
- **Function Types & Lambdas:** Used extensively in the Data Pipeline to pass behaviors as parameters.
- **Operator Overloading:** Applied in the `Vec2` class to enable natural mathematical expressions (e.g., `v1 + v2`, `v1 * 2.0`).

## 4. Implementation
All core exercises and their proposed challenges were implemented (with the exception of the component challenge in the final exercise, which was omitted due to ambiguity in the requirements).

## 5. Testing and Validation
Validation was performed locally by executing the `main()` function in each Kotlin file. The outputs generated in the terminal were compared and validated against the expected results described in the tutorial guide.

## 6. Usage Instructions
1. Clone the repository to your local machine.
2. Open the project in Android Studio or IntelliJ IDEA.
3. Navigate to the `Kotlin-Advanced-Exercises` folder.
4. Run the `main()` function in each individual `.kt` file using the run button in the editor.
5. Observe the results printed in the console (Logcat / Run tool window).

---

# Development Process

## 12. Version Control and Commit History
Development was versioned in Git with descriptive commits for each phase of work. The history reflects the following workflow:
- **Mar 18:** Project initialization and completion of Exercises 1 and 2 (including Exercise 2 challenge).
- **Mar 19:** Completion of Exercise 3 and pipeline challenge.
- **Mar 20:** Completion of Exercise 4 and one of the challenges.

## 13. Difficulties and Lessons Learned
The main challenge was the learning curve associated with advanced Kotlin features required by the exercises. Understanding and correctly applying *Higher-Order Functions*, *Lambdas*, *Extension Functions*, *Generics* (with upper bounds), and *Operator Overloading* required thorough documentation review. The main lesson learned was recognizing how these features, although initially complex, enable writing much cleaner, more expressive, and type-safe code compared to traditional approaches in other languages.

## 14. Future Improvements
- Implement a graphical user interface (GUI) to visualize app outputs rather than relying solely on the console.

---

## 15. AI Usage Disclosure (Mandatory)
During the development of this section, the author assumes full responsibility for all submitted final code. The following AI tools were used exclusively for study and documentation assistance:
- **NotebookLM:** Used as an interactive tutor to resolve conceptual doubts strictly regarding Kotlin syntax and internal language mechanics.
- **IDE Autocomplete Tool:** Used to speed up drafting and autocompleting explanatory code comments without interfering with the programming logic.
- **Gemini 3:** Assisted with README technical drafting.
