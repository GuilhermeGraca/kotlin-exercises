🇬🇧 [English version available in README.md](README.md)

# Exercícios e Trabalhos Práticos de Kotlin

**Autor:** Guilherme Graça (A51827)  
**Unidade Curricular:** Desenvolvimento de Aplicações Móveis (DAM)  
**Linguagem:** Kotlin  

---

## 📌 Visão Geral do Repositório

Este repositório unificado consolida os exercícios práticos, trabalhos e mini-projetos desenvolvidos ao longo da unidade curricular. Cada módulo explora diferentes vertentes e paradigmas da linguagem Kotlin, desde a sintaxe fundamental até à programação funcional avançada e geração de código em tempo de compilação.

---

## 📂 Projetos & Módulos

| Módulo | Descrição | Tópicos Principais |
| :--- | :--- | :--- |
| **[Kotlin-Fundamentals-and-Virtual-Library](./Kotlin-Fundamentals-and-Virtual-Library)** | Exercícios iniciais de Kotlin (incluindo Calculadora CLI) e um sistema orientado a objetos de gestão de uma **Biblioteca Virtual**. | • POO (Herança, Classes Abstratas, Polimorfismo)<br>• Controlo de fluxo (`when`) & Tratamento de exceções<br>• `companion object` & Data classes |
| **[Kotlin-Advanced-Exercises](./Kotlin-Advanced-Exercises)** | Exercícios avançados em CLI divididos em quatro módulos independentes: Processamento de Eventos de Log, Cache Genérica, Pipeline de Dados Configurável e Biblioteca de Vetores 2D. | • Sealed classes & `when` exaustivo<br>• Genéricos com Upper Bounds (`Cache<K, V>`)<br>• Higher-Order Functions & Lambdas<br>• Sobrecarga de Operadores (`Vec2`) |
| **[Kotlin-Annotation-Processor](./Kotlin-Annotation-Processor)** | Projeto Gradle multi-módulo com implementação de um processador de anotações personalizado (`@Greeting`) para geração automática de código na compilação. | • Processamento de Anotações Kotlin (`kapt`)<br>• Projeto multi-módulo Gradle<br>• Geração de código na compilação |

---

## 🚀 Como Executar

1. **Clonar o repositório:**
   ```bash
   git clone https://github.com/GuilhermeGraca/Kotlin-Exercises.git
   cd Kotlin-Exercises
   ```
2. **Abrir no IntelliJ IDEA / Android Studio:**
   - Para **[Kotlin-Fundamentals-and-Virtual-Library](./Kotlin-Fundamentals-and-Virtual-Library)** e **[Kotlin-Advanced-Exercises](./Kotlin-Advanced-Exercises)**: Abre o respetivo projeto Maven e executa `mvn clean package` ou corre os métodos `main()` diretamente na IDE.
   - Para **[Kotlin-Annotation-Processor](./Kotlin-Annotation-Processor)**: Abre o projeto Gradle multi-módulo e compila via tarefas Gradle (`./gradlew build`).

---
