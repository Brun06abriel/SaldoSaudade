-- DROP DATABASE db_saldoSaudade;
-- CREATE DATABASE db_saldoSaudade;

-- USE db_saldoSaudade;
/*
CREATE TABLE Funcionario(
	id INT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(100),
    cpf VARCHAR(14),
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


CREATE TABLE Horario(
	id INT NOT NULL AUTO_INCREMENT,
	Turno VARCHAR(20) NOT NULL ;
    funcionario_id INT,
    diaSemana VARCHAR(100),
    HEntrada TIME,
    HSaida TIME,
    PRIMARY KEY (id),
    FOREIGN KEY (funcionario_id) REFERENCES funcionario(id)
);

-- SELECT * FROM Funcionario;

CREATE TABLE Cargo(
	id INT NOT NULL AUTO_INCREMENT,
    NomeCargo VARCHAR(100),
    funcionario_id INT,
    PRIMARY KEY (id),
    FOREIGN KEY (funcionario_id) REFERENCES funcionario(id)
);
*/
INSERT INTO Horario(Turno, diaSemana,HEntrada,HSaida) VALUES
('MANHÃ','SEG - SEX', '08:00' , '17:00'),
('TARDE','SEG - SEX', '10:00' , '19:00'),
('NOITE','SEG - SEX', '17:00' , '02:00'),
('SAB','SAB', '09:00' , '21:00'),
('DOM','DOM', '09:00' , '21:00');

Select * from Horario;