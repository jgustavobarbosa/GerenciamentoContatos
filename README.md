# GerenciamentoContatos

## Sistema de Gerenciamento de Contatos

Este é um sistema simples de gerenciamento de contatos implementado em Java, que permite ao usuário realizar as seguintes operações:

* **Adicionar um novo contato:** Inclui nome, telefone e email.
* **Buscar um contato:** Por nome ou telefone.
* **Remover um contato:** Por nome ou telefone.
* **Listar todos os contatos:** Exibe a lista completa de contatos.

O sistema utiliza uma estrutura de lista encadeada para armazenar os contatos em memória e oferece uma interface de linha de comando (CLI) para interação com o usuário.

## Como executar

1. **Certifique-se de ter o Java instalado em sua máquina.** Você pode baixar o Java JDK no site oficial da Oracle: [https://www.oracle.com/java/technologies/javase/jdk.html](https://www.oracle.com/java/technologies/javase/jdk.html)

2. **Salve o código fornecido em um arquivo chamado `SistemaGerenciamentoContatos.java`.**

3. **Compile o código:** Abra um terminal ou prompt de comando e navegue até o diretório onde você salvou o arquivo `.java`. Execute o seguinte comando:

   ```bash
   javac SistemaGerenciamentoContatos.java
   ```

4. **Execute o programa:** Após a compilação bem-sucedida, execute o seguinte comando:

   ```bash
   java SistemaGerenciamentoContatos
   ```

   O sistema será iniciado e exibirá o menu de opções.

## Funcionalidades

* **Adicionar Contato:** Permite adicionar um novo contato à lista, informando nome, telefone e email.
* **Buscar Contato:** Permite buscar um contato existente na lista, informando o nome ou o telefone.
* **Remover Contato:** Permite remover um contato da lista, informando o nome ou o telefone.
* **Listar Contatos:** Exibe todos os contatos armazenados na lista.
* **Sair:** Encerra o programa.

## Estrutura do Código

* **Classe `Contato`:** Representa um contato individual, armazenando nome, telefone, email e uma referência para o próximo contato na lista encadeada.
* **Classe `ListaContatos`:** Implementa a estrutura de lista encadeada para armazenar os contatos e fornece métodos para adicionar, buscar, remover e listar contatos.
* **Classe `SistemaGerenciamentoContatos`:** Contém o método `main`, que inicia o programa, exibe o menu de opções e processa as entradas do usuário, chamando os métodos da classe `ListaContatos` conforme necessário.

## Considerações

* Este é um sistema básico de gerenciamento de contatos em memória. Os dados são perdidos quando o programa é encerrado.
* O sistema não implementa recursos avançados, como ordenação de contatos, edição de informações ou persistência de dados em um arquivo ou banco de dados.
* O código pode ser aprimorado com a aplicação de padrões de projeto, tratamento de exceções mais robusto e outras otimizações.


## Licença

Este projeto está licenciado sob codigo aberto por ser um exercício. Consulte o arquivo LICENSE para obter mais detalhes. 

todos os direitos reservados @janioguga 
