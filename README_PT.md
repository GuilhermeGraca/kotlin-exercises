🇬🇧 [English version available in README.md](README.md)

<a id="readme-top"></a>

<!-- PROJECT LOGO & HEADER -->
<br />
<div align="center">
  <h3 align="center">Exercícios e Trabalhos Práticos de Kotlin</h3>
  <p align="center">
    Um projeto académico desenvolvido para a unidade curricular de <strong>Desenvolvimento de Aplicações Móveis (DAM)</strong> no <strong>ISEL (Instituto Superior de Engenharia de Lisboa)</strong>.
    <br />
    <br />
    <a href="#sobre-o-projeto"><strong>Explorar a Documentação »</strong></a>
    <br />
    <br />
    <a href="https://github.com/GuilhermeGraca/kotlin-exercises/issues">Reportar Bug</a>
    &middot;
    <a href="https://github.com/GuilhermeGraca/kotlin-exercises/issues">Sugerir Funcionalidade</a>
  </p>
</div>

<!-- TABLE OF CONTENTS -->
<details>
  <summary>Índice</summary>
  <ol>
    <li>
      <a href="#sobre-o-projeto">Sobre o Projeto</a>
      <ul>
        <li><a href="#tecnologias-utilizadas">Tecnologias Utilizadas</a></li>
        <li><a href="#funcionalidades--destaques">Funcionalidades & Destaques</a></li>
      </ul>
    </li>
    <li><a href="#aprendizagens">Aprendizagens</a></li>
    <li>
      <a href="#como-começar">Como Começar</a>
      <ul>
        <li><a href="#pré-requisitos">Pré-requisitos</a></li>
        <li><a href="#instalação--execução-local">Instalação & Execução Local</a></li>
      </ul>
    </li>
    <li><a href="#utilização">Utilização</a></li>
    <li><a href="#contacto">Contacto</a></li>
    <li><a href="#agradecimentos">Agradecimentos</a></li>
  </ol>
</details>

---

<!-- ABOUT THE PROJECT -->
## Sobre o Projeto

Este repositório contém os **Exercícios e Trabalhos Práticos de Kotlin**, um projeto académico desenvolvido de raiz para a unidade curricular de *Desenvolvimento de Aplicações Móveis (DAM)* no **ISEL (Instituto Superior de Engenharia de Lisboa)**.

O objetivo principal deste projeto é consolidar competências práticas de programação em Kotlin, abrangendo desde os fundamentos da linguagem e modelação Orientada a Objetos até à programação funcional, sealed classes, genéricos e processamento de anotações em tempo de compilação ao longo de três trabalhos práticos.

<p align="right">(<a href="#readme-top">voltar ao topo</a>)</p>

---

### Tecnologias Utilizadas

* [![Kotlin](https://img.shields.io/badge/kotlin-%237F52FF.svg?style=for-the-badge&logo=kotlin&logoColor=white)](https://kotlinlang.org/)
* [![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.java.com/)
* [![Apache Maven](https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white)](https://maven.apache.org/)
* [![Gradle](https://img.shields.io/badge/Gradle-02303A.svg?style=for-the-badge&logo=Gradle&logoColor=white)](https://gradle.org)
* [![IntelliJ IDEA](https://img.shields.io/badge/IntelliJIDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)](https://www.jetbrains.com/idea/)

<p align="right">(<a href="#readme-top">voltar ao topo</a>)</p>

---

### Funcionalidades & Destaques

* **[Kotlin-Fundamentals-and-Virtual-Library](./Kotlin-Fundamentals-and-Virtual-Library)**: Implementa exercícios de consola em Kotlin (incluindo uma Calculadora CLI multi-base) e um sistema orientado a objetos de gestão de uma **Biblioteca Virtual** com suporte para livros físicos e digitais.
* **[Kotlin-Advanced-Exercises](./Kotlin-Advanced-Exercises)**: Explora programação funcional avançada em quatro módulos CLI: Processamento de Eventos de Log (`sealed class`), Cache Genérica (`Cache<K, V>`), Pipeline de Dados Configurável (higher-order functions) e Biblioteca de Vetores 2D (sobrecarga de operadores).
* **[Kotlin-Annotation-Processor](./Kotlin-Annotation-Processor)**: Projeto Gradle multi-módulo com implementação de um processador de anotações personalizado (`@Greeting`) para geração automática de código em tempo de compilação via `kapt`.
* **Arquitetura Modular**: Separação completa de responsabilidades em que cada módulo é totalmente independente e executável no terminal ou diretamente no IDE.

<p align="right">(<a href="#readme-top">voltar ao topo</a>)</p>

---

<!-- LESSONS LEARNED -->
## Aprendizagens

* **Controlo de Fluxo Exaustivo**: Domínio das expressões `when` do Kotlin com *sealed classes* para desenhar arquiteturas de processamento de eventos seguras e verificadas na compilação.
* **Segurança de Tipos Genéricos**: Utilização de genéricos com *upper bounds* (`Cache<K, V>`) e *extension functions* para criar estruturas de dados reutilizáveis e expressivas.
* **Paradigmas de Programação Funcional**: Aplicação de *higher-order functions*, *function types* e lambdas para implementar *pipelines* sequenciais e configuráveis.
* **Geração de Código na Compilação**: Configuração de projetos Gradle multi-módulo com *Kotlin Annotation Processing* (`kapt`) para analisar código-fonte e gerar classes auxiliares automaticamente.

<p align="right">(<a href="#readme-top">voltar ao topo</a>)</p>

---

<!-- GETTING STARTED -->
## Como Começar

Siga estas instruções para configurar uma cópia local do projeto na sua máquina.

### Pré-requisitos

* **Java Development Kit (JDK 17+)**: Certifique-se de que tem um JDK compatível instalado (`java -version`).
* **Ferramentas de Build**: Apache Maven (para Trabalhos 1 & 2) e Gradle (incluído via Gradle Wrapper no Trabalho 3).
* **IDE / Editor**: IntelliJ IDEA ou Android Studio (fortemente recomendados para projetos em Kotlin).

### Instalação & Execução Local

1. **Clonar o repositório**:
   ```sh
   git clone https://github.com/GuilhermeGraca/kotlin-exercises.git
   ```
2. **Navegar para a pasta do projeto**:
   ```sh
   cd kotlin-exercises
   ```
3. **Executar os módulos baseados em Maven ([Kotlin-Fundamentals-and-Virtual-Library](./Kotlin-Fundamentals-and-Virtual-Library) & [Kotlin-Advanced-Exercises](./Kotlin-Advanced-Exercises))**:
   ```sh
   cd Kotlin-Fundamentals-and-Virtual-Library
   mvn clean package
   ```
4. **Executar o módulo baseado em Gradle ([Kotlin-Annotation-Processor](./Kotlin-Annotation-Processor))**:
   ```sh
   cd ../Kotlin-Annotation-Processor
   ./gradlew build
   ```

<p align="right">(<a href="#readme-top">voltar ao topo</a>)</p>

---

<!-- USAGE -->
## Utilização

Cada módulo está estruturado para ser executado de forma independente:

* **No IntelliJ IDEA / Android Studio**:
  - Abra qualquer ficheiro que contenha uma função `main()` (por exemplo, `src/main/kotlin/dam/virtual_library/main.kt`) e clique no botão **Run** ao lado da linha de código.
* **A partir da Linha de Comandos**:
  - Execute os artefactos compilados via tarefas Maven ou Gradle para testar os fluxos na consola, calculadoras e código gerado pelas anotações.

<p align="right">(<a href="#readme-top">voltar ao topo</a>)</p>

---

<!-- CONTACT -->
## Contacto

* **Guilherme Graça** - A51827
* **GitHub**: [https://github.com/GuilhermeGraca](https://github.com/GuilhermeGraca)
* **Link do Projeto**: [https://github.com/GuilhermeGraca/kotlin-exercises](https://github.com/GuilhermeGraca/kotlin-exercises)

<p align="right">(<a href="#readme-top">voltar ao topo</a>)</p>

---

<!-- ACKNOWLEDGMENTS -->
## Agradecimentos

* **ISEL — Instituto Superior de Engenharia de Lisboa**: Pelo plano curricular e especificação dos trabalhos práticos.
* **Documentação Oficial do Kotlin**: Pelas referências e guias da linguagem.
* **Shields.io**: Pelas badges em Markdown do repositório.

<p align="right">(<a href="#readme-top">voltar ao topo</a>)</p>
