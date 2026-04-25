# Checkpoint 2 - Arquitetura SOA e Web Services

Este projeto consiste em uma API ReST desenvolvida com **Spring Boot** para o gerenciamento de pedidos de clientes. A aplicação segue os padrões de arquitetura em camadas (Controller, Service, Repository e Model) e realiza operações completas de CRUD.

## 👥 Integrantes do Grupo
* **Mateus dos Santos da Silva** - RM: 558436
* **Nickola Moreno Cardoso** - RM: 557132
* **André Giovane de Maria** - RM: 556384

---

## 🚀 Tecnologias Utilizadas
* **Java 17** (ou superior)
* **Spring Boot 3.x**
* **Spring Data JPA** (Persistência de dados)
* **H2 Database** (Banco de dados em memória para desenvolvimento)
* **Lombok** (Produtividade com anotações)
* **Jakarta Validation** (Validação de dados de entrada)
* **Maven** (Gerenciador de dependências)

---

## 🛠️ Funcionalidades (Endpoints)

A API expõe os seguintes endpoints em `http://localhost:8080/pedidos`:

| Método | Endpoint | Descrição |
| :--- | :--- | :--- |
| **POST** | `/pedidos` | Cria um novo pedido. |
| **GET** | `/pedidos` | Lista todos os pedidos cadastrados. |
| **GET** | `/pedidos/{id}` | Busca os detalhes de um pedido específico por ID. |
| **PUT** | `/pedidos/{id}` | Atualiza os dados de um pedido existente. |
| **DELETE** | `/pedidos/{id}` | Remove um pedido do sistema. |

### Exemplo de JSON para POST/PUT:
```json
{
  "clienteNome": "Nome do Cliente",
  "valorTotal": 150.50
}
