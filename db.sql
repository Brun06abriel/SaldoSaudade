CREATE DATABASE db_saldoSaudade;

USE db_saldoSaudade;

CREATE TABLE Funcionario(
	id INT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(100),
    cpf VARCHAR(11),
    dataAdmissao DATE,
    cargo VARCHAR(100),
    salarioBase DOUBLE,
    horasTrabalhadas INT,
    valorHora DOUBLE,
    PRIMARY KEY (id)
);

CREATE TABLE FolhaPagamento(
	id INT NOT NULL AUTO_INCREMENT,
    totalSalarioPago DOUBLE,
    funcionarioId INT,
    PRIMARY KEY (id),
    FOREIGN KEY (funcionarioId) REFERENCES funcionario (id) 
);

CREATE TABLE Holerite(
	id INT NOT NULL AUTO_INCREMENT,
    salarioBruto DOUBLE,
    desconto DOUBLE,
    salarioLiquido DOUBLE,
    funcionarioId INT,
    folhaPagamentoId INT,
    PRIMARY KEY (id),
    FOREIGN KEY (funcionarioId) REFERENCES funcionario (id),
    FOREIGN KEY (folhaPagamentoId) REFERENCES folhaPagamento (id)
);

CREATE TABLE Imposto(
	id INT NOT NULL AUTO_INCREMENT,
    nomeImposto VARCHAR(100),
    tipoImposto VARCHAR(100),
    valorImposto DOUBLE,
    PRIMARY KEY (id)
);

CREATE TABLE Beneficio(
	id INT NOT NULL AUTO_INCREMENT,
    nomeBeneficio VARCHAR(100),
    tipoBeneficio VARCHAR(100),
    valorDesconto DOUBLE,
    PRIMARY KEY (id)
);

SELECT * FROM Funcionario;