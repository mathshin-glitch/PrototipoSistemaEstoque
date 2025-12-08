# Sistema de Controle de Estoque  
Projeto Integrador – Etapa 5  

## 📌 Status do Projeto  
**Em desenvolvimento**

## 🛠 Tecnologias Utilizadas  
Este projeto utiliza apenas tecnologias vistas no curso:  
- **Java (JDK)**  
- **Interface gráfica com Swing**  
- **MySQL**  
- **JDBC (Driver de conexão)**  
- **Git e GitHub**

## 👨‍💻 Time de Desenvolvimento  
- **Matheus Silva Melo**

## 🎯 Objetivo do Software  
O objetivo deste sistema é auxiliar no gerenciamento de estoque, permitindo o cadastro e a consulta de produtos e fornecedores. O software oferece uma interface simples e funcional, conectada a um banco MySQL, permitindo que os dados sejam persistidos corretamente.

## 📦 Funcionalidades Implementadas  
- Tela de Login por níveis de acesso (Administrador, Operador e Usuário)  
- Leitura de credenciais a partir de arquivo TXT  
- Cadastro de Fornecedores  
- Cadastro de Produtos  
- Consulta de Fornecedores  
- Consulta de Produtos  
- Conexão e manipulação de dados no MySQL  
- Organização do código seguindo boas práticas (DAO, Classes, Views separadas)

## 📝 Observações Importantes  
- O projeto contém um arquivo `.TXT` com os usuários:  
  - **ADMINISTRADOR** – senha: 123  
  - **OPERADOR** – senha: 123  
  - **USER** – senha: 123  

- Um arquivo `.SQL` acompanha o repositório para facilitar a criação das tabelas e inserção de dados.

- Há um pacote extra contendo telas de exclusão que não foram implementadas devido a problemas na exclusão via banco, e por limitação de tempo considerando o desenvolvimento simultâneo da UC11.

## 📁 Estrutura geral do projeto  
- **/src** → Código-fonte Java  
- **/Telas** → Interface gráfica  
- **/DAO** → Classes de acesso ao banco de dados  
- **/Classes** → Entidades do sistema  
- **/Conexao** → Classe de conexão MySQL  
- **usuario.txt** → Arquivo de níveis de acesso  
- **backup.sql** → Script com informações de produtos e fornecedores  
