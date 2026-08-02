# Assignment 3 — Annotation Processor
Course: Desenvolvimento de Aplicações Móveis
Student(s): Guilherme Graça A51827
Date: 2 de Maio de 2026
Repository URL: https://github.com/GuilhermeGraca/Kotlin-Exercises/tree/main/Kotlin-Annotation-Processor
---

## 1. Introduction
O objetivo deste trabalho é desenvolver um processador de anotações em Kotlin para gerar código na compilação. O projeto corresponde ao Exercício 1 do Tutorial 3. O objetivo principal é criar uma anotação `@Greeting` que gera uma classe responsável por imprimir uma mensagem antes da execução do método original.

## 2. System Overview
A solução é um projeto multi-módulo. A funcionalidade principal é a geração de código através da anotação `@Greeting`. O caso de uso é adicionar a impressão de uma mensagem a métodos existentes sem alterar o seu código base.

## 3. Architecture and Design
O projeto divide-se em três módulos:
- `annotations`: Define a anotação `@Greeting`.
- `processor`: Contém a lógica do processador de anotações para gerar código.
- `app`: Módulo para testar o código gerado.

Optou-se por esta estrutura para separar as responsabilidades.

## 4. Implementation
A implementação foca-se na anotação no módulo `annotations` e no processador no módulo `processor`. O processador analisa o código e escreve as novas classes. O módulo `app` aplica a anotação para teste.

## 5. Testing and Validation
A validação é feita no módulo `app`. Verifica-se se o código gerado compila e executa corretamente. Confirma-se que a mensagem é exibida na consola antes da execução do método anotado.

## 6. Usage Instructions
Para executar o projeto, compila-se o código com o Gradle. A compilação aciona o processador que gera os ficheiros necessários. De seguida, executa-se o módulo `app` para ver o resultado.

---
# Development Process
## 12. Version Control and Commit History
Utilizou-se o Git para guardar as alterações efetuadas no código do projeto.

## 13. Difficulties and Lessons Learned
Ocorreram erros constantes de dependências do Gradle do início ao fim. Estes problemas causaram atraso e levaram a que se saltasse o exercício 2. Aprendeu-se sobre a configuração e resolução de dependências nestes tipos de projetos.

## 14. Future Improvements
Pretende-se concluir o exercício 2 futuramente. Pode-se também expandir a anotação para suportar opções de configuração adicionais.

---
## 15. AI Usage Disclosure (Mandatory)
Utilizou-se o modelo Gemini 3 para diagnosticar erros de dependências do Gradle, após muita tentativa e erro sem saber como resolver. A ferramenta foi também usada na redação deste README. Confirma-se a responsabilidade total pelo conteúdo final.
