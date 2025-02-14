 use db_saldosaudade;
-- select * from funcionario;

-- DROP VIEW listaFuncionarios;
 -- CREATE VIEW listaFuncionarios AS
 -- SELECT F.id, F.nome, C.NomeCargo, F.dataAdmissao, H.Turno FROM
 -- cargo AS C JOIN funcionario AS F JOIN Horario AS H ON F.cargo_id = C.id AND F.turno_id = H.id ORDER BY f.id ;


-- CREATE VIEW FuncCalcularSalario AS
 SELECT F.nome, C.Nomecargo , H.Turno, F.salarioBase, F.horasTrabalhadas FROM 
 cargo AS C JOIN funcionario AS F JOIN Horario AS H ON 
 F.cargo_id = C.id AND F.turno_id = H.id ;

SELECT * FROM Horario;