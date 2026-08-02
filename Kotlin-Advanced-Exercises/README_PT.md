🇬🇧 [English version available in README.md](README.md)

# Assignment 2 — Section 1: Kotlin Exercises
Course: Desenvolvimento de Aplicações Móveis (DAM)
Student(s): Guilherme Graça A51827
Date: 12/04/2026
Repository URL: https://github.com/GuilhermeGraca/Kotlin-Exercises/tree/main/Kotlin-Advanced-Exercises
---

## 1. Introduction
O objetivo desta primeira secção do trabalho prático foi aprofundar e consolidar conceitos avançados da linguagem Kotlin antes de avançar para o desenvolvimento da interface Android. Os exercícios focaram-se na exploração da documentação e na implementação de soluções utilizando programação funcional, *extension functions*, *higher-order functions*, genéricos e *operator overloading*.

## 2. System Overview
O projeto é composto por quatro módulos lógicos independentes, executados via linha de comandos (CLI):
1. **Event Log Processing:** Um sistema de processamento de eventos (Login, Logout, Purchase) focado por utilizador.
2. **Type-Safe In-Memory Cache:** Uma cache genérica (`Cache<K, V>`) para armazenar e transformar dados temporários.
3. **Configurable Data Pipeline:** Um sistema de processamento sequencial de strings de log.
4. **2D Vector Library:** Uma biblioteca matemática de vetores bidimensionais (`Vec2`).

## 3. Architecture and Design
A arquitetura baseia-se em princípios de código limpo e nas valências nativas do Kotlin:
* **Sealed Classes:** Utilizadas no sistema de logs para garantir exaustividade nas expressões `when`.
* **Generics com Upper Bounds:** Implementados na Cache para garantir segurança de tipos em tempo de compilação.
* **Function Types & Lambdas:** Usados extensivamente no Data Pipeline para passar comportamentos como parâmetros.
* **Operator Overloading:** Aplicado na classe `Vec2` para permitir operações matemáticas naturais (ex: `v1 + v2`, `v1 * 2.0`).

## 4. Implementation
Todos os exercícios base e os respetivos *challenges* propostos foram implementados (exeto o no ultimo exercicio, o challenge das componentes não foi realizado devido a não entender o que era proposto):


## 5. Testing and Validation
A validação foi feita localmente através da execução da função `main()` em cada um dos ficheiros Kotlin. Os *outputs* gerados no terminal foram comparados e validados contra os resultados esperados descritos no guião do tutorial.

## 6. Usage Instructions
1. Clonar o repositório para a máquina local.
2. Abrir o projeto no Android Studio ou IntelliJ IDEA.
3. Navegar até à pasta correspondente à Secção 1 de Kotlin.
4. Executar a função `main()` de cada ficheiro `.kt` individualmente utilizando o botão "Run" (seta verde) no editor.
5. Observar os resultados impressos na consola (Logcat/Run tool window).

# Development Process

## 12. Version Control and Commit History
O desenvolvimento foi versionado no Git com commits descritivos por cada fase de trabalho. O histórico reflete o seguinte fluxo de desenvolvimento:
* **18 Mar:** Inicialização do projeto e finalização dos Exercícios 1 e 2 (incluindo o challenge do Ex. 2).
* **19 Mar:** Finalização do Exercício 3 e respetivo challenge de pipelines.
* **20 Mar:** Finalização do Exercício 4 e um dos challenges.

## 13. Difficulties and Lessons Learned
O principal desafio deste trabalho foi a curva de aprendizagem associada aos conceitos avançados da linguagem Kotlin exigidos pelos exercícios. Compreender e aplicar corretamente *Higher-Order Functions*, *Lambdas*, *Extension Functions*, *Generics* (com os seus *upper bounds*) e *Operator Overloading* exigiu bastante estudo da documentação oficial. A maior lição retirada foi perceber como estes conceitos, embora complexos inicialmente,
permitem escrever código muito mais limpo, expressivo e seguro contra erros de tipos do que as abordagens mais tradicionais noutras linguagens.

## 14. Future Improvements
Por exemplo implementar uma interface grafica para visualizar os resultados das apps desenvolvidas em vez de apenas utilizar a consola.
---

## 15. AI Usage Disclosure (Mandatory)
Durante o desenvolvimento desta secção, assumo a responsabilidade por todo o código final submetido. As seguintes ferramentas de IA foram utilizadas exclusivamente como apoio ao estudo e documentação:

* **NotebookLM:** Utilizado como tutor interativo para tirar dúvidas conceptuais estritamente sobre a sintaxe e o funcionamento interno da linguagem Kotlin.
* **Ferramenta de Autocomplete da IDE:** Utilizada para acelerar a redação e auto-completar os comentários explicativos no meio do código, de forma a melhorar a documentação interna das funções sem interferir na lógica de programação implementada.
* **Gemini 3** para auxilio da redação do READ.md
