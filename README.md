# Microservices com Java

Bem-vindo ao repositório **Microservices com Java**! Este projeto tem como objetivo explorar e exemplificar a arquitetura de microservices utilizando a linguagem Java. O foco principal deste repositório não é implementar lógicas de negócios complexas, mas sim entender e praticar os conceitos fundamentais da arquitetura de microservices de maneira clara e objetiva.

## Objetivo

O objetivo deste repositório é fornecer exemplos práticos , testar e implementar microservices em Java, facilitando o entendimento e a aplicação desses conceitos em projetos reais.  desafios e melhores práticas para trabalhar com microservices.

## Serviços e Componentes

1. **auth-server**
   - Implementação de um servidor de autenticação.
   - Comunicação com o gateway para autenticação e liberação de CSRF.
   - [Ver diretório auth-server](./auth-server)

2. **hr-api-gateway-zuul**
   - API Gateway para rotear e filtrar requisições.
   - [Ver diretório hr-api-gateway-zuul](./hr-api-gateway-zuul)

3. **hr-config-server**
   - Servidor de configuração centralizada utilizando Spring Cloud Config.
   - [Ver diretório hr-config-server](./hr-config-server)

4. **hr-eureka-server**
   - Servidor Eureka para serviço de descoberta.
   - [Ver diretório hr-eureka-server](./hr-eureka-server)

5. **hr-payroll**
   - Serviço de folha de pagamento.
   - [Ver diretório hr-payroll](./hr-payroll)

6. **hr-user**
   - Serviço de gerenciamento de usuários com funcionalidade de login.
   - [Ver diretório hr-user](./hr-user)

7. **hr-worker**
   - Serviço de gerenciamento de trabalhadores com Actuator para atualização de configurações em runtime.
   - [Ver diretório hr-worker](./hr-worker)
