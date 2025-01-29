-- DROP DATABASE db_saldoSaudade;
-- CREATE DATABASE db_saldoSaudade;
 USE db_saldoSaudade;
/*
CREATE TABLE Cargo(
	id INT NOT NULL AUTO_INCREMENT,
    NomeCargo VARCHAR(100),
    ValorHora DOUBLE,
    PRIMARY KEY (id)
    );
    
CREATE TABLE Funcionario(
	id INT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(100),
    cpf VARCHAR(14),
    dataAdmissao DATE,
    cargo_id INT,
    salarioBase DOUBLE,
    horasTrabalhadas INT,
    valorHora DOUBLE,
    PRIMARY KEY (id),
	FOREIGN KEY (cargo_id) REFERENCES cargo (id) 
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
	Turno VARCHAR(20) NOT NULL,
    funcionario_id INT,
    diaSemana VARCHAR(100),
    HEntrada TIME,
    HSaida TIME,
    PRIMARY KEY (id),
    FOREIGN KEY (funcionario_id) REFERENCES funcionario(id)
);

-- SELECT * FROM Funcionario;


INSERT INTO Horario(Turno, diaSemana,HEntrada,HSaida) VALUES
('MANHÃ','SEG - SEX', '08:00' , '17:00'),
('TARDE','SEG - SEX', '10:00' , '19:00'),
('NOITE','SEG - SEX', '17:00' , '02:00'),
('SAB','SAB', '09:00' , '21:00'),
('DOM','DOM', '09:00' , '21:00');

Select * from Horario;



INSERT INTO Cargo(NomeCargo, ValorHora) VALUES
('CEO','500.00'),
('GERENTE','400.00'),
('LIDER DE PRODUÇÃO','300.00'),
('AUXILIAR DE PRODUÇÃO','200.00'),
('FREE LANCE','100.00');

Select * from Cargo;

SELECT funcionario.nome, funcionario.dataAdmissao, cargo.id, funcionario.salarioBase FROM

cargo, funcionario WHERE funcionario.id =cargo.id;
*/

SELECT * FROM funcionario;
/* f, cargo c
WHERE f.id = c.id AND v.id = iv.venda_id AND p.fabricante like '%lar%';
*/