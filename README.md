## SCRIPTS SQL PARA CRIAÇÃO DO BANCO DE DADOS.
~~~ SQL
create database baseReiDoGado;
use baseReiDoGado;
create table Cliente(
  id_Cli int primary key auto_increment,
  nome varchar(50) not null,
  sexo varchar(50) not null,
  telefone varchar(50) not null,
  email varchar(50) not null,
  cpf varchar(50) not null,
  endereco varchar(50) not null,
  cep varchar (50) not null,
  estadoCivil varchar (50) not null
);

create table Produto(
  cod_Prod int primary key auto_increment,
  nome varchar(50) not null
  quantidade int not null,
  valorEntrada double not null,
  valorVenda double not null,
  faturacao varchar(50)
);

CREATE TABLE Vendas (
 idVenda int PRIMARY KEY AUTO_INCREMENT,
 vlrTotal double NOT NULL,
 id_Cli int NOT NULL,
 dataVenda date,
 FOREIGN KEY (id_Cli) REFERENCES Cliente(id_Cli)
);

CREATE TABLE itemVenda (
 idItemVenda int PRIMARY KEY AUTO_INCREMENT,
 idVenda int NOT NULL,
 idProduto int NOT NULL,nomeProduto varchar (50),
 vlrUnitario double NOT NULL,
 qtd int NOT NULL,
 FOREIGN KEY (idVenda) REFERENCES Vendas(idVenda),
 FOREIGN KEY (idProduto) REFERENCES Produto(cod_Prod)
);

UPDATE itemVenda
SET nomeProduto = (
 SELECT nome
 FROM Produto p
 WHERE p.cod_Prod = itemVenda.idProduto
);

CREATE VIEW vw_itemVenda AS
SELECT iv.idItemVenda, iv.idVenda, iv.idProduto, p.nome AS nomeProduto,
iv.vlrUnitario, iv.qtd
FROM itemVenda iv
JOIN Produto p ON iv.idProduto = p.cod_Prod;
~~~
