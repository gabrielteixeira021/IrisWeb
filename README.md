# Backend Java de Consumo de API de IA

Este projeto é uma aplicação de backend, desenvolvida com **Spring Boot**, que consome uma API de machine learning externa (a API Python do projeto `iris-api`). Ele demonstra como integrar serviços de IA em uma aplicação Java.

## 🚀 Tecnologias

- **Java 11**
- **Spring Boot 2.7.18**
- **Maven**
- **RestTemplate**: Para fazer requisições HTTP.

## 📝 Como Usar

### 1. Pré-requisitos

Para rodar esta aplicação, a **API Python de classificação de íris** precisa estar em execução. Siga as instruções no repositório da API para iniciá-la.

Link do repositório da API: [IrisAPI](https://github.com/gabrielteixeira021/IrisAPI)

### 2. Configuração do Projeto

- **JDK**: Certifique-se de ter um **JDK 11** ou superior instalado e configurado no seu projeto.
- **Dependências**: O projeto Maven inclui a dependência `spring-boot-starter-web` para a funcionalidade de API.

### 3. Estrutura do Projeto

A aplicação segue a arquitetura de camadas padrão do Spring Boot:
- `controller`: Recebe as requisições HTTP e delega a lógica.
- `service`: Contém a lógica de negócio, incluindo a comunicação com a API de IA.
- `dto`: Classes POJO (`IrisRequest`, `IrisResponse`) para transportar dados.

### 4. Execução da Aplicação

Execute a classe principal `IrisWebApplication.java` como uma "Java Application" a partir da sua IDE (Eclipse, IntelliJ etc.).

A aplicação estará disponível em `http://localhost:8080`.

### 5. Testando a Integração

Utilize uma ferramenta como **Postman** ou **Insomnia** para enviar uma requisição `POST` para o endpoint da aplicação Java.

- **URL**: `http://localhost:8080/api/v1/iris/predict`
- **Método**: `POST`
- **Corpo da Requisição (JSON)**:
```json
  {
    "sepal_length": 5.1,
    "sepal_width": 3.5,
    "petal_length": 1.4,
    "petal_width": 0.2
  }
```