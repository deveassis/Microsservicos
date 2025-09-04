# Microsserviços em Java com Spring Boot

Este repositório contém dois microsserviços desenvolvidos em **Java + Spring Boot**, utilizando **RabbitMQ** para mensageria e **PostgreSQL** para persistência de dados.
Objetivo: Estudo de microsserviços com Spring Boot, PostgreSQL, RabbitMQ e SMTP.
## 🚀 Microsserviços

### 1. User Service
- Responsável pelo **cadastro e gerenciamento de usuários**.
- Banco de dados: **PostgreSQL**.
- Exemplo de funcionalidades:
  - Criar usuário
  - Listar usuários
  - Buscar usuário por ID

### 2. Email Service
- Responsável pelo **envio de emails**.
- Integração via **SMTP**.
- Recebe mensagens do **RabbitMQ** para disparar emails.

## 🛠️ Tecnologias Utilizadas
- **Java 17+**
- **Spring Boot**
- **PostgreSQL**
- **RabbitMQ**
- **SMTP (JavaMailSender)**

## 🔗 Comunicação entre Serviços
- O **User Service** envia mensagens para o **RabbitMQ** quando um novo usuário é criado.
- O **Email Service** consome essas mensagens e dispara o email correspondente.

## 📂 Estrutura do Projeto


## ⚙️ Como Rodar
1. Suba os serviços de mensageria e banco de dados:
   - PostgreSQL
   - RabbitMQ

2. Configure as variáveis de ambiente em cada microsserviço (`application.properties` ou `application.yml`).

3. Rode os projetos:
   ```bash
   cd user
   ./mvnw spring-boot:run

   cd ../email
   ./mvnw spring-boot:run
