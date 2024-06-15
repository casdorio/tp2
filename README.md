# API de Gerenciamento de Produtos

Esta é uma API simples e RESTful construída com Spring Boot para gerenciar dados de produtos. Ela permite operações CRUD (Create, Read, Update, Delete) em uma lista de produtos.

## Pré-requisitos

Antes de executar este aplicativo, certifique-se de ter o seguinte instalado:

- Java 17 ou superior
- Maven (se não estiver utilizando um IDE com suporte integrado ao Maven)

## Como Iniciar

Para executar o aplicativo localmente, siga estas etapas:

1. **Clone o repositório:**

   ```bash
   git clone https://github.com/casdorio/tp2.git
   cd tp2
   ```

2. **Construa o projeto:**

   Se você tiver o Maven instalado localmente, execute o seguinte comando:

   ```bash
   mvn clean package
   ```
   
   or 
   
   ```bash
   ./mvnw clean package
   ```

   Isso irá compilar o projeto e empacotá-lo em um arquivo JAR.

3. **Execute o aplicativo:**

   Após construir o projeto, execute o seguinte comando:

   ```bash
   java -jar target/tp2-0.0.1-SNAPSHOT.jar
   ```

4. **Acesse a API:**

   Depois que o aplicativo estiver em execução, você pode acessar os endpoints da API usando ferramentas como Postman, Insomnia ou fazendo requisições HTTP diretamente.

   URL base: `http://localhost:8080/products`

## Endpoints da API

- **GET /products/list**
  - Retorna uma lista de todos os produtos.

- **GET /products/list/{id}**
  - Retorna um produto específico pelo seu ID.

- **POST /products/add**
  - Adiciona um novo produto. Requer um payload JSON com `name`, `value` e opcionalmente `description`.

- **PUT /products/update/{id}**
  - Atualiza um produto existente pelo seu ID. Requer um payload JSON com `name`, `value` e `description` atualizados.

- **DELETE /products/remove/{id}**
  - Remove um produto pelo seu ID.

## Exemplos de Uso

Assumindo que o aplicativo está sendo executado localmente:

- Para listar todos os produtos:
  ```
  GET http://localhost:8080/products/list
  ```

- Para exibir um produto existente com ID 1:
  ```
  GET http://localhost:8080/products/list/1
  ```

- Para adicionar um novo produto:
  ```
  POST http://localhost:8080/products/add
  Body:
  {
    "name": "Nome do Produto",
    "value": 99.99,
    "description": "Descrição do produto"
  }
  ```

- Para atualizar um produto existente com ID 1:
  ```
  PUT http://localhost:8080/products/update/1
  Body:
  {
    "name": "Nome do Produto Atualizado",
    "value": 109.99,
    "description": "Descrição do produto atualizada"
  }
  ```

- Para deletar um produto com ID 2:
  ```
  DELETE http://localhost:8080/products/remove/2
  ```


