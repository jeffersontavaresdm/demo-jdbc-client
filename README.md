# JDBC Client Demo

Este repositório contém um aplicativo Java simples construído com o Spring Boot que demonstra como interagir com um banco de dados usando JDBC e as facilidades proporcionadas pelo JDBC Client.

### Visão Geral
O aplicativo consiste em três componentes principais:

1. Classe Pet: Um **record** simples em Java que representa uma entidade Pet com os atributos id, nome e idade.

2. Classe PetRepository: Uma classe de repositório responsável por lidar com operações CRUD para a entidade Pet usando JDBC. Ela utiliza o JdbcClient do Spring para executar consultas SQL no banco de dados.

3. Classe DemoJdbcClientApplication: A classe principal do Spring Boot que inicializa o contexto do Spring e contém um método main para iniciar o aplicativo. Também define um **bean runner** do tipo ApplicationRunner, que é usado para demonstrar operações CRUD na entidade Pet.

### Pré-requisitos
- JDK 21
- Apache Maven
- Docker/Docker-compose

### Para executar
1. Clone este repositório: `git clone https://github.com/jeffersontavaresdm/demo-jdbc-client.git`
2. Navegue até o diretório do projeto: `cd demo-jdbc-client`
3. Execute o banco de dados usando Docker: `docker compose up`
4. Construa o projeto usando o Maven: `mvn clean install`
5. Execute o aplicativo Spring Boot: `mvn spring-boot:run`

### Uso
Depois que o aplicativo estiver em execução, ele realizará as seguintes operações:
- Salvar um novo pet no banco de dados.
- Recuperar o pet salvo por ID.
- Atualizar as informações do pet.
- Excluir o pet.
- Recuperar todos os animais do banco de dados.

> Você pode observar a saída no console para ver os resultados dessas operações.

### Configuração
O aplicativo usa a configuração padrão do Spring Boot para se conectar ao banco de dados. Você pode precisar configurar as propriedades de conexão do banco de dados no arquivo application.properties se sua configuração de banco de dados diferir das configurações padrão.

#

<br>

<div align="center" style="display: flex; flex-direction: column; align-items: center;">
  <strong><i>Valeu =)</i></strong>
  <br/>
  <br/>
  <br/>
  <a href="https://github.com/jeffersontavaresdm">
    <img alt="valeu =)" width="30%" src="https://github.com/jeffersontavaresdm/jeffersontavaresdm/blob/main/images/rs.gif" width="25"/>
  </a>
</div>