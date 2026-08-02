🇵🇹 [Versão em Português disponível em README_PT.md](README_PT.md)

<a id="readme-top"></a>

<!-- PROJECT LOGO & HEADER -->
<br />
<div align="center">
  <h3 align="center">Kotlin Exercises & Practical Assignments</h3>
  <p align="center">
    An academic project developed for the <strong>Desenvolvimento de Aplicações Móveis (DAM)</strong> course at <strong>ISEL (Instituto Superior de Engenharia de Lisboa)</strong>.
    <br />
    <br />
    <a href="#about-the-project"><strong>Explore the Documentation »</strong></a>
    <br />
    <br />
    <a href="https://github.com/GuilhermeGraca/Kotlin-Exercises/issues">Report Bug</a>
    &middot;
    <a href="https://github.com/GuilhermeGraca/Kotlin-Exercises/issues">Request Feature</a>
  </p>
</div>

<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
        <li><a href="#features--key-highlights">Features & Key Highlights</a></li>
      </ul>
    </li>
    <li><a href="#lessons-learned">Lessons Learned</a></li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation--running-locally">Installation & Running Locally</a></li>
      </ul>
    </li>
    <li><a href="#usage">Usage</a></li>
    <li><a href="#contact">Contact</a></li>
    <li><a href="#acknowledgments">Acknowledgments</a></li>
  </ol>
</details>

---

<!-- ABOUT THE PROJECT -->
## About The Project

This repository contains **Kotlin Exercises & Practical Assignments**, an academic project developed from scratch for the *Desenvolvimento de Aplicações Móveis (DAM)* course at **ISEL (Instituto Superior de Engenharia de Lisboa)**.

The primary goal of this project is to consolidate practical Kotlin programming skills, ranging from language fundamentals and Object-Oriented design to functional programming, sealed classes, generics, and compile-time annotation processing across three distinct assignments.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

---

### Built With

* [![Kotlin](https://img.shields.io/badge/kotlin-%237F52FF.svg?style=for-the-badge&logo=kotlin&logoColor=white)](https://kotlinlang.org/)
* [![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.java.com/)
* [![Apache Maven](https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white)](https://maven.apache.org/)
* [![Gradle](https://img.shields.io/badge/Gradle-02303A.svg?style=for-the-badge&logo=Gradle&logoColor=white)](https://gradle.org)
* [![IntelliJ IDEA](https://img.shields.io/badge/IntelliJIDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)](https://www.jetbrains.com/idea/)

<p align="right">(<a href="#readme-top">back to top</a>)</p>

---

### Features & Key Highlights

* **[Kotlin-Fundamentals-and-Virtual-Library](./Kotlin-Fundamentals-and-Virtual-Library)**: Implements Kotlin console exercises (including a multi-base CLI Calculator) and an Object-Oriented **Virtual Library** management system supporting physical and digital books.
* **[Kotlin-Advanced-Exercises](./Kotlin-Advanced-Exercises)**: Explores advanced functional Kotlin across four CLI modules: Event Log Processing (`sealed class`), Type-Safe In-Memory Cache (`Cache<K, V>`), Configurable Data Pipeline (higher-order functions), and a 2D Vector Math Library (operator overloading).
* **[Kotlin-Annotation-Processor](./Kotlin-Annotation-Processor)**: Features a multi-module Gradle project implementing a compile-time custom Kotlin annotation processor (`@Greeting`) for automatic code generation via `kapt`.
* **Modular Architecture**: Complete separation of concerns where each project module is fully independent and runnable on the command line or directly inside IDEs.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

---

<!-- LESSONS LEARNED -->
## Lessons Learned

* **Exhaustive Control Flow**: Mastering Kotlin's `when` expressions with sealed classes to design type-safe and compile-time verified event handling architectures.
* **Generic Type Safety**: Using generics with upper bounds (`Cache<K, V>`) and extension functions to write expressive, reusable, and type-safe data structures.
* **Functional Programming Paradigms**: Utilizing higher-order functions, function types, and lambdas to implement configurable, sequential data processing pipelines.
* **Compile-Time Code Generation**: Configuring multi-module Gradle builds with Kotlin Annotation Processing (`kapt`) to analyze source code and generate helper classes automatically during compilation.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

---

<!-- GETTING STARTED -->
## Getting Started

Follow these instructions to set up a local copy of the project on your machine.

### Prerequisites

* **Java Development Kit (JDK 17+)**: Ensure a compatible Java JDK is installed (`java -version`).
* **Build Tools**: Apache Maven (for Assignments 1 & 2) and Gradle (included via Gradle Wrapper in Assignment 3).
* **IDE / Editor**: IntelliJ IDEA or Android Studio is strongly recommended for Kotlin projects.

### Installation & Running Locally

1. **Clone the repository**:
   ```sh
   git clone https://github.com/GuilhermeGraca/Kotlin-Exercises.git
   ```
2. **Navigate into the project directory**:
   ```sh
   cd Kotlin-Exercises
   ```
3. **Run Maven-based modules ([Kotlin-Fundamentals-and-Virtual-Library](./Kotlin-Fundamentals-and-Virtual-Library) & [Kotlin-Advanced-Exercises](./Kotlin-Advanced-Exercises))**:
   ```sh
   cd Kotlin-Fundamentals-and-Virtual-Library
   mvn clean package
   ```
4. **Run Gradle-based module ([Kotlin-Annotation-Processor](./Kotlin-Annotation-Processor))**:
   ```sh
   cd ../Kotlin-Annotation-Processor
   ./gradlew build
   ```

<p align="right">(<a href="#readme-top">back to top</a>)</p>

---

<!-- USAGE -->
## Usage

Each module is structured to be executed independently:

* **In IntelliJ IDEA / Android Studio**:
  - Open any file containing a `main()` function (for example, `src/main/kotlin/dam/virtual_library/main.kt`) and click the **Run** button in the gutter.
* **From the Command Line**:
  - Execute the built artifacts via Maven or Gradle tasks to test console interaction, calculators, and annotation-generated outputs.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

---

<!-- CONTACT -->
## Contact

* **Guilherme Graça** - A51827
* **GitHub**: [https://github.com/GuilhermeGraca](https://github.com/GuilhermeGraca)
* **Project Link**: [https://github.com/GuilhermeGraca/Kotlin-Exercises](https://github.com/GuilhermeGraca/Kotlin-Exercises)

<p align="right">(<a href="#readme-top">back to top</a>)</p>

---

<!-- ACKNOWLEDGMENTS -->
## Acknowledgments

* **ISEL — Instituto Superior de Engenharia de Lisboa**: For the academic curriculum and assignment specifications.
* **Kotlin Official Documentation**: For comprehensive language references and guides.
* **Shields.io**: For markdown repository badges.

<p align="right">(<a href="#readme-top">back to top</a>)</p>
