# Java e Spring Boot

Repositório de estudos e projetos acadêmicos desenvolvidos com **Java**, **Spring Boot** e Maven.

O objetivo é praticar a construção de aplicações web, organização em camadas, orientação a objetos, formulários e persistência de dados.

## Projetos e exercícios

Entre os diretórios presentes no repositório:

- **Exemplo1_Spring:** aplicação inicial com Spring Boot e controller.
- **ExercicioCadastrarEventos:** exercício de cadastro de eventos.
- **ProjetoBdH2:** aplicação de cadastro de produtos com banco H2.
- **ProjetoDadosVeterinario:** projeto relacionado ao cadastro de dados veterinários.
- **ProjetoLivraria:** exercício/projeto com domínio de livraria.
- **exemplo_paciente:** exemplo de aplicação com domínio de pacientes.
- **formularioExemplo:** exemplo de formulário web.
- **exemplo2_model_atributos** e **exemplo3_model_atributos:** práticas com atributos e model.

Os diretórios são projetos independentes, criados conforme as atividades e conteúdos estudados.

## Tecnologias

- Java
- Spring Boot
- Maven
- H2 (no projeto correspondente)
- HTML e templates Thymeleaf (nas aplicações web)

## Como executar

Cada projeto possui seu próprio `pom.xml`. Para executar um projeto específico, entre em seu diretório e utilize o Maven Wrapper quando disponível:

**Linux / macOS**
```bash
./mvnw spring-boot:run
```

**Windows**
```powershell
.\mvnw.cmd spring-boot:run
```

A porta e as configurações de execução dependem do projeto escolhido; consulte seu `application.properties`.

## Autor

**Rafael Ferrete** · Estudante de Desenvolvimento de Software Multiplataforma na Fatec.

[GitHub](https://github.com/Rafaelferrte)
