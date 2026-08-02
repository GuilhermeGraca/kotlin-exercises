# Assignment 1 — Kotlin Fundamentals e Virtual LibraryCourse: Desenvolvimento de Aplicações Móveis
Course: Engenharia Informática e Multimédia <br>
Student(s): Guilherme Graça A51827 <br>
Date: 08/03/2026 <br>
Repository URL: https://github.com/GuilhermeGraca/Kotlin-Exercises/tree/main/Kotlin-Fundamentals-and-Virtual-Library <br>
---

---

## 1. Introduction
Este trabalho tem como objetivo aplicar conceitos de Kotlin em contexto prático, através de vários exercícios de consola e de um mini\-sistema orientado a objetos \(Virtual Library\).Foram trabalhados temas como controlo de fluxo, tratamento de exceções, modelação OO, herança, encapsulamento e organização modular do projeto.

## 2. System Overview
A solução está organizada em exercícios independentes e num domínio principal de biblioteca virtual.

Funcionalidades principais:
- <b> Exercícios de treino \(1,2 e3\) com foco em sintaxe e lógica em Kotlin. <b>
- Calculadora de consola \(Exercício2\), incluindo:
   - operações aritméticas;
   - operadores booleanos;
   - operadores de bit shift;
   - apresentação de resultados em decimal, hexadecimal e booleano;
   - tratamento de erros de input e divisão por zero.
- Virtual Library:
   - gestão de livros digitais e físicos;
   - operações de adicionar, procurar, requisitar e devolver livros;
   - suporte a membros da biblioteca;
   - contagem global de livros adicionados via `companion object`.

## 3\. Architecture and DesignEstrutura principal do projeto:
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

Decisões de design:
- Foram seguidos todos os passos descritos no enunciado de modo a obter a arquitetura pretendida.

## 4\. Implementation
### Módulos principais- **Exercícios1/2/3**: módulos de prática em consola.
- **Virtual Library**:
 - `Book`: classe base com `init`, `toString`, `era` calculada e método abstrato `getStorageInfo()`.
 - `DigitalBook` e `PhysicalBook`: acrescentam atributos específicos do formato.
 - `Library`: lista interna de livros e operações de negócio \(add/borrow/return/show/search\).
 - `LibraryMember`: representação de membro com lista de livros requisitados.

### Pontos relevantes- Aplicação de `when` no exercício da calculadora.
- Uso de exceções para robustez de input e operações inválidas.
- Polimorfismo no método `getStorageInfo()` para comportamento por tipo de livro.
- Mensagens de feedback no fluxo de criação/requisição/devolução.

## 5\. Testing and Validation
Estratégia usada:
- Testes manuais em consola para validar fluxos principais e casos de erro.
- Validação de cenários:
 - requisição de livro sem stock;
 - devolução de livro existente;
 - pesquisa por autor;
 - inputs inválidos na calculadora;
 - divisão por zero.

Limitações atuais:
- Não existem, neste estado, testes automatizados em `src/test/kotlin`.
- Cobertura depende de execução manual dos cenários.

## 6\. Usage Instructions
Pré\-requisitos:
- JDK compatível \(ex.:17+\)
- Maven- IntelliJ IDEAPassos:
1. Clonar o repositório.
2. Abrir o projeto Maven no IntelliJ.
3. Compilar:
 - `mvn clean package`
4. Executar:
 - pela IDE, correndo os ficheiros com função `main` \(ex.: `src/main/kotlin/dam/virtual_library/main.kt`\);
 - ou por configuração Maven/exec apropriada à classe `MainKt`.


# Development Process
## 12\. Version Control and Commit History
O controlo de versões foi usado para registar evolução incremental \(exercícios e biblioteca\), com histórico de commits orientado a funcionalidades e correções progressivas.

## 13\. Difficulties and Lessons Learned
Principais desafios:
- Falta de conhecimento sobre a sintaxe do kotlin.
- equilibrar validação de estado com simplicidade no fluxo de consola;
- garantir conformidade com requisitos detalhados do enunciado.

Aprendizagens:
- entendimento da sintaxe da linguagem kotlin
- melhor domínio de classes abstratas, `companion object` e `data class`;
- maior atenção a casos limite e UX de aplicações de consola.

## 14\. Future Improvements
Evoluções sugeridas:
- adicionar testes unitários automatizados;
- persistência de dados \(ficheiro ou base de dados\);
- interface gráfica para além da consola;
- pesquisa avançada e gestão de membros mais completa.

---

## 15\. AI Usage Disclosure \(Mandatory\)
Ferramentas de IA utilizadas:
- apoio na aprendizagem com pedidos de exemplos de estruturas de dados, como arrays, funções, switch cases etc.. para melhor entendimento da sintaxe de kotlin
- apoio à redação técnica do README.

Declaração:
- o autor mantém total responsabilidade pelo conteúdo final, qualidade do código e conformidade académica.
