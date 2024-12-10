# GerenciarProdutos
![image](https://github.com/user-attachments/assets/e938512e-43f7-4011-b379-c83f1fae04de)


## Descrição
GerenciarProdutos é um sistema simples de loja que vende diversos tipos de produtos, implementado em Java seguindo o paradigma de Programação Orientada a Objetos (POO). O sistema permite calcular o preço final de diferentes tipos de produtos, aplicando regras específicas de acordo com o tipo do produto.

## Estrutura do Projeto
- **Produto**: Classe base representando um produto genérico com atributos `nome` e `preco`.
- **ProdutoPerecivel**: Subclasse de `Produto` que adiciona o atributo `dataDeValidade`. Sobrescreve o método `calcularPrecoFinal` para aplicar um desconto de 10% caso o produto esteja próximo da data de validade.
- **ProdutoEletronico**: Subclasse de `Produto` que adiciona o atributo `garantiaEmMeses`. Sobrescreve o método `calcularPrecoFinal` para incluir uma taxa de garantia de 5% no preço.
- **Loja**: Classe principal que cria uma lista de produtos de diferentes tipos e exibe o preço final de cada produto usando polimorfismo.

## Funcionalidades
- **Calculo do Preço Final**:
  - **ProdutoPerecivel**: Aplica um desconto de 10% caso a data de validade esteja próxima.
  - **ProdutoEletronico**: Adiciona uma taxa de garantia de 5% ao preço.

## Estrutura de Pastas
```plaintext
GerenciarProdutos
|-- src
|   |-- main
|       |-- java
|           |-- gerenciarprodutos
|               |-- model
|                   |-- Produto.java
|                   |-- ProdutoPerecivel.java
|                   |-- ProdutoEletronico.java
|               |-- Loja.java
|-- .gitignore
|-- mvnw
|-- mvnw.cmd
|-- pom.xml

```

## Como executar

 - Clone o repositório.

 - Navegue até o diretório do projeto.

 - Execute o projeto através da classe Loja no IntelliJ IDEA ou utilize o comando Maven:
   
   ```
     mvn clean install
     mvn exec:java -Dexec.mainClass="gerenciarprodutos.Loja"
   
   ```
 ## Tecnologias Utilizadas:
  - Java

  - Maven

  - IntelliJ IDEA

   
