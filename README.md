# Game Web Service

Um Web Service, com ações para manipular o cadastro de jogos, que o usuário possui.

## Descrição

Este projeto é um Web Service desenvolvido em Java utilizando o Spring Boot. Ele permite a manipulação do cadastro de jogos que o usuário possui, incluindo operações de criação, leitura, atualização e exclusão (CRUD).

## Tecnologias Utilizadas

- Java 17
- Spring Boot 3.4.4
- Spring Data JPA
- H2 Database (Runtime)
- MySQL Connector (Runtime)
- Maven

## Configuração do Projeto

### Pré-requisitos

- Java 17 ou superior
- Maven 3.6.3 ou superior

### Clonando o Repositório

```bash
git clone https://github.com/luizhsgassis/game-web-service.git
cd game-web-service
```

### Executando o Projeto

Para rodar o projeto, utilize o comando abaixo:

```bash
mvn spring-boot:run
```

### Endpoints Disponíveis

#### 1. Obter Todos os Jogos

- **Método:** GET
- **URL:** `/games`
- **Resposta:** Lista de todos os jogos cadastrados

#### 2. Obter um Jogo por ID

- **Método:** GET
- **URL:** `/games/{id}`
- **Parâmetro de URL:** `id` - ID do jogo
- **Resposta:** Detalhes do jogo correspondente ao ID

#### 3. Criar um Novo Jogo

- **Método:** POST
- **URL:** `/games`
- **Body (JSON):**
    ```json
    {
        "title": "The Legend of Zelda: Breath of the Wild",
        "genre": "Action-adventure",
        "platform": "Nintendo Switch",
        "publisher": "Nintendo",
        "release_year": 2017,
        "rating": 4.9,
        "description": "An open-world action-adventure game set in a world of exploration and discovery."
    }
    ```
- **Resposta:** Detalhes do jogo criado

#### 4. Atualizar um Jogo

- **Método:** PUT
- **URL:** `/games/{id}`
- **Parâmetro de URL:** `id` - ID do jogo
- **Body (JSON):**
    ```json
    {
        "title": "Updated Game Title",
        "genre": "Adventure",
        "platform": "Console",
        "publisher": "Updated Publisher",
        "release_year": 2026,
        "rating": 4.7,
        "description": "Updated description of the game"
    }
    ```
- **Resposta:** Detalhes do jogo atualizado

#### 5. Deletar um Jogo

- **Método:** DELETE
- **URL:** `/games/{id}`
- **Parâmetro de URL:** `id` - ID do jogo
- **Resposta:** Status de sucesso ou erro

## Utilizando o Postman para Testar os Endpoints

### Passo 1: Iniciar a Aplicação

Certifique-se de que a aplicação está em execução conforme descrito na seção "Executando o Projeto".

### Passo 2: Configurar as Requisições no Postman

1. **Abra o Postman** e crie uma nova requisição.
2. **Selecione o método HTTP** (GET, POST, PUT, DELETE).
3. **Insira a URL do endpoint** conforme descrito na seção "Endpoints Disponíveis".
4. **Adicione os parâmetros e body** conforme necessário.
5. **Envie a requisição** e verifique a resposta.

### Exemplo de Requisição POST para Criar um Novo Jogo

- **Método:** POST
- **URL:** `http://localhost:8080/games`
- **Body:**
    ```json
    {
        "title": "The Legend of Zelda: Breath of the Wild",
        "genre": "Action-adventure",
        "platform": "Nintendo Switch",
        "publisher": "Nintendo",
        "release_year": 2017,
        "rating": 4.9,
        "description": "An open-world action-adventure game set in a world of exploration and discovery."
    }
    ```
- **Headers:** 
    - Content-Type: application/json

### Exemplo de Requisição GET para Obter Todos os Jogos

- **Método:** GET
- **URL:** `http://localhost:8080/games`

## Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e pull requests.

## Licença

Este projeto está licenciado sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.
