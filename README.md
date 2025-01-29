# Projeto de gerenciamento de inquilinos

## Boas práticas de commit

**Referência:** 
<br> https://github.com/RomuloOliveira/commit-messages-guide/blob/master/README_pt-BR.md

- **fix**: commit do tipo `fix` soluciona um problema (bugs) na sua base de código.
- **feature**: adições ou alterações no código com o objetivo de implementar novas funcionalidades/features.
- **refactor**: refere-se à fatoração do código sem que altere a sua funcionalidade.
- **style**: alterações na formatação do código sem que altere funcionalidade.
- **test**: modificações e adições de novos testes.
- **chore**: pequenas alterações que não modifiquem as funcionalidades.
- **docs**: modificação ou adição de documentação.
- **ci**: processo de build ou CI do projeto
- **study**: estudo de alguma tecnologia, conteúdo, fundamento que auxilie a conclusão de alguma tarefa ou card

## Boas práticas de nome de branch

Ao começar a trabalhar em uma issue, deve ser criado uma branch para ela. O nome da branch deve seguir o modelo:

`tipodealteração-númerodocard-palavraschave`

Exemplo:

`docs-1-entity-relationship-diagram`

- **docs**: refere-se ao **tipo de alteração**.
- **1**: refere-se ao número do card no GH Projects.
- **entity-relationship-diagram**: refere-se às palavras chave.

## Como rodar a aplicação

*Obs.: é necessário ter o docker instalado e docker-compose a partir da versão 2*

Para criar uma imagem da aplicação backend, ir até o diretório do `backend` no mesmo nível do Dockerfile e digitar:
```bash
docker build -t [nome da imagem]:latest
```

Para confirmar que a imagem foi criada:
```bash
docker image
```
deve retornar a imagem com o nome criado.

Para rodar a aplicação completa, junto com banco de dados, ir até o diretório do mesmo nível do arquivo `docker-compose.yml` e rodar:
```bash
docker-compose up 
# ou docker-compose up --build
```

---

# Tenants management project

## Commits good practices

**Reference:** <br> https://github.com/RomuloOliveira/commit-messages-guide/blob/master/README_pt-BR.md

- **fix**: commit of type `fix` solves a bug in your code base.
- **feature**: adds or changing in the code in order to implement new features.
- **refactor**: refers to code refactor without change the functionality.
- **style**: changing in the style of code without change the functionality.
- **test**: updating and changing new tests.
- **chore**: small changing without change the functionalities.
- **docs**: adds or changing the documentation.
- **ci**: build process or CI of the project.
- **study**: study of any technology, subject that helps ending some task.

## Good practices of branches name

When starting to work on a issue, must create a specific branch to it. Branches name must follow:
`kindofchanging-cardsname-wordkey`

Example:

`docs-1-entity-relationship-diagram`

- **docs**: refers to kind of changing.
- **1**: refers to number of the card in the Github Project.
- **entity-relationship-diagram**: refers to key word.

## How to run the application

*Disclaimer: you must have Docker and docker-compose up version 2 installed*

To create an image of backends application, you must be in the directory of `backend` at the same level of Dockerfiles file and type:
```bash
docker build -t [name of image]:latest
```

In order to confirm if the images has been created:
```bash
docker image
```

In order to run the full application including database, you must be in the same directory of `docker-compose.yml` and type:
```bash
docker-compose up
# or "docker-compose up --build"
```