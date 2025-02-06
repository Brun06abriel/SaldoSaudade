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
    
    CREATE TABLE Horario(
	id INT NOT NULL AUTO_INCREMENT,
	Turno VARCHAR(20) NOT NULL,
    diaSemana VARCHAR(100),
    HEntrada TIME,
    HSaida TIME,
    cargaHoraria INT,
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
    turno_id INT NOT NULL,
    PRIMARY KEY (id),
	FOREIGN KEY (cargo_id) REFERENCES cargo (id),
	FOREIGN KEY (turno_id) REFERENCES Horario(id)
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
-- SELECT * FROM Funcionario;


INSERT INTO Horario(Turno, diaSemana,HEntrada,HSaida,CargaHoraria) VALUES
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

UPDATE Cargo SET ValorHora=50 WHERE id=1;
UPDATE Cargo SET ValorHora=40 WHERE id=2;
UPDATE Cargo SET ValorHora=30 WHERE id=3;
UPDATE Cargo SET ValorHora=20 WHERE id=4;
UPDATE Cargo SET ValorHora=15 WHERE id=5;



Select * from Cargo;

-- DROP VIEW listaFuncionarios;
 

 -- FOREIGN KEY (Turno) REFERENCES Horario(id);



SELECT * FROM listaFuncionarios;


SELECT F.nome, F.CPF, F.dataAdmissao, C.NomeCargo, H.Turno, F.salarioBase FROM
cargo AS C JOIN funcionario AS F JOIN Horario AS H ON F.cargo_id = C.id AND F.turno_id = H.id ;


SELECT * FROM listaFuncionarios;
/*
 f, cargo c
WHERE f.id = c.id AND v.id = iv.venda_id AND p.fabricante like '%lar%';
*/
-- DROP VIEW listaFuncionarios;
-- CREATE VIEW listaFuncionarios AS
-- SELECT F.nome, F.CPF, F.dataAdmissao, C.NomeCargo, H.Turno, F.salarioBase FROM
-- cargo AS C JOIN funcionario AS F JOIN Horario AS H ON F.cargo_id = C.id AND F.turno_id = H.id ;
-- select * from Funcionario;
-- SELECT * FROM listaFuncionarios;

-- UPDATE Horario SET CargaHoraria=8 WHERE id=1;
-- UPDATE Horario SET CargaHoraria=8 WHERE id=2;
-- UPDATE Horario SET CargaHoraria=8 WHERE id=3;
-- UPDATE Horario SET CargaHoraria=10 WHERE id=4;
-- UPDATE Horario SET CargaHoraria=10 WHERE id=5;

 -- ALTER TABLE Horario 
 -- ADD cargaHoraria INT NOT NULL;
-- SELECT ValorHora FROM Cargo where id=1; 

SELECT * FROM Funcionario;
