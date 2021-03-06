# Sistema-Tarefas
Sistema desenvolvido para gerenciamento de tarefas.

## Proposta ## 
Esse projeto tem como objetivo a criação de um CRUD utilizando Java web para gerenciamento de tarefas.

## Objetivos especificos ##
- [x] Criar uma a plicação Java Web utilizando JavaServer Faces (JSF)
- [x] Utilizar persistência em um banco de dados PostgreSQL.
- [x] Utilizar JPA
- [ ] Utilizar testes de unidades
- [ ] Publicar projeto no heroku ou outro ambiente cloud.
- [ ] outros diferenciais que julgar conveniente.

### Tecnologias ### 
Para a criação do projeto foi utilizado as seguintes tecnologias:
- Intellij IDEA Community Edition 2021. 1.2
- PostgreSQL 13 
- JDK 11
- Postman (somente para fins de testes)

## Arquivos ##

- pom.xml: Arquivos das dependecias
- src/main/resources/application.properties: Configurações do banco de dados
- src/main/webapp: JSF
- src/main/java/com/example/sistematarefas: Model, Controller, Repository, Beans

### Execução ### 
- Para a execução recomenda-se a utilização das tecnologias citadas acima.
- Criar banco de dados pgAdmin 4. Nome do banco: bd_tarefas
- Criar um projeto Maven através do site https://start.spring.io/ ou através do proprio IDE Intellij 
- Abrir local do projeto e substituir a pasta 'src' e arquivo 'pom.xml'
- Executar aplicação e visualizar o mesmo no navegador atráves do endereço localhost:8080/Projeto_Tarefas

### Funcionalidades implementadas ###
- Criação da entity Tarefa e adicionados as anotações JPA.
- Criação da página JSF do qual contem a listagem de tarefas, filtros e operações: Cadastrar, editar e deletar, sendo somente a ultima que está funcionando.
- GET, POST, DELETE, PUT no banco de dados funcionando, testados através do Postman.
