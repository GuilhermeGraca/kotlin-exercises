🇵🇹 [Versão em Português disponível em README_PT.md](README_PT.md)

# Assignment 1 — Kotlin Fundamentals & Virtual Library  
**Course:** Desenvolvimento de Aplicações Móveis (DAM)  
**Student(s):** Guilherme Graça A51827  
**Date:** 08/03/2026  
**Repository URL:** https://github.com/GuilhermeGraca/Kotlin-Exercises/tree/main/Kotlin-Fundamentals-and-Virtual-Library  

---

## 1. Introduction
This project aims to apply fundamental Kotlin concepts in a practical context through various console exercises and an object-oriented mini-system (**Virtual Library**). Key topics covered include control flow, exception handling, object-oriented modeling, inheritance, encapsulation, and modular project organization.

## 2. System Overview
The solution is structured into independent training exercises and a main domain for the virtual library.

### Core Features:
- **Practice Exercises (1, 2, and 3)** focusing on Kotlin syntax and logical reasoning.
- **Console Calculator (Exercise 2)**, including:
  - Arithmetic operations;
  - Boolean operators;
  - Bitwise shift operators;
  - Result display in decimal, hexadecimal, and boolean formats;
  - Input error handling and division-by-zero protection.
- **Virtual Library:**
  - Management of digital and physical books;
  - Operations to add, search, borrow, and return books;
  - Support for library members;
  - Global book count tracking via `companion object`.

## 3. Architecture and Design
### Main Project Structure:
- `src/main/kotlin/Main.kt`
- `src/main/kotlin/dam/exer_1/exer_1.kt`
- `src/main/kotlin/dam/exer_2/exer_2.kt`
- `src/main/kotlin/dam/exer_3/exer_3.kt`
- `src/main/kotlin/dam/virtual_library/Book.kt`
- `src/main/kotlin/dam/virtual_library/DigitalBook.kt`
- `src/main/kotlin/dam/virtual_library/PhysicalBook.kt`
- `src/main/kotlin/dam/virtual_library/Library.kt`
- `src/main/kotlin/dam/virtual_library/LibraryMember.kt`
- `src/main/kotlin/dam/virtual_library/main.kt`

### Design Decisions:
- Followed all steps outlined in the assignment specification to achieve the required architecture.

## 4. Implementation
### Main Modules:
- **Exercises 1 / 2 / 3**: Console practice modules.
- **Virtual Library**:
  - `Book`: Base class featuring `init`, `toString`, computed `age` property, and abstract method `getStorageInfo()`.
  - `DigitalBook` and `PhysicalBook`: Add format-specific attributes.
  - `Library`: Internal book list and business operations (`add`, `borrow`, `return`, `show`, `search`).
  - `LibraryMember`: Represents a library member holding a list of borrowed books.

### Key Highlights:
- Application of exhaustive `when` expressions in the calculator exercise.
- Robust exception handling for user input and invalid operations.
- Polymorphic behavior via `getStorageInfo()` depending on book type.
- Feedback messages throughout creation, borrowing, and returning workflows.

## 5. Testing and Validation
### Strategy Used:
- Manual console testing to validate core flows and error handling cases.
- Validated scenarios:
  - Borrowing a book that is out of stock;
  - Returning an already existing book;
  - Searching books by author;
  - Invalid inputs in the CLI calculator;
  - Division by zero handling.

### Current Limitations:
- No automated tests in `src/test/kotlin` at this stage.
- Coverage relies on manual execution of test scenarios.

## 6. Usage Instructions
### Prerequisites:
- JDK 17+
- Maven
- IntelliJ IDEA / Android Studio

### Steps:
1. Clone the repository.
2. Open the Maven project in IntelliJ IDEA.
3. Build the project:
   ```bash
   mvn clean package
   ```
4. Run:
   - Run the files containing a `main` function from the IDE (e.g., `src/main/kotlin/dam/virtual_library/main.kt`);
   - Or execute via appropriate Maven configuration targeting `MainKt`.

---

# Development Process

## 12. Version Control and Commit History
Version control was used to track incremental progress (exercises followed by the library), maintaining a commit history oriented around features and progressive fixes.

## 13. Difficulties and Lessons Learned
### Main Challenges:
- Initial familiarity with Kotlin syntax;
- Balancing state validation with console UX simplicity;
- Ensuring strict compliance with detailed assignment specifications.

### Key Learnings:
- Improved understanding of Kotlin language syntax;
- Mastery of abstract classes, `companion object`, and `data class`;
- Increased attention to edge cases and console application UX.

## 14. Future Improvements
- Add automated unit tests;
- Implement data persistence (file-based or database);
- Provide a graphical user interface (GUI) alongside the console app;
- Add advanced search and member management features.

---

## 15. AI Usage Disclosure (Mandatory)
### AI Tools Used:
- Assistance learning Kotlin syntax via examples of data structures, arrays, functions, and switch/when expressions.
- Support drafting the technical README documentation.

### Declaration:
- The author retains full responsibility for the final content, code quality, and academic integrity.
