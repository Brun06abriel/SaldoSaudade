/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Control.ConexaoBancoDeDados;
import Model.Funcionario;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;

public class FuncionarioDAO {
    ConexaoBancoDeDados CBD = new ConexaoBancoDeDados();
    PreparedStatement st;
    ResultSet rs;
   
    public int DefinirHorario(int id){
     CBD.conectar();
     int HrsDef=0;
     String sql = "select (cargaHoraria,DiastrabalhoMes) from Horario where id = ?;" ;
        try {
    /* Executando o comando select */
     PreparedStatement stmt = CBD.conn.prepareStatement(sql);
     stmt.setInt(1,id);               
     rs = stmt.executeQuery();    
            while (rs.next()) {
             int carga_dia = rs.getInt("CargaHoraria");
             int carga_mes = rs.getInt("DiastrabalhoMes");
                switch(id){
                 case 1: HrsDef = carga_dia * carga_mes ; break;
                 case 2: HrsDef = carga_dia * carga_mes ; break;
                 case 3: HrsDef = carga_dia * carga_mes ; break;
                 case 4: HrsDef = carga_dia * carga_mes ; break;
                 case 5: HrsDef = carga_dia * carga_mes ; break;
                }
            }
         return HrsDef;
        } catch (SQLException sqle) {
         System.out.println( "Erro efetuar consulta de horario : " + sqle.getMessage() );
         return HrsDef;
        }
    }
    
    public int DefinirValorHora(int id){
     CBD.conectar();
     int SlrDef=0;
     String sql = "SELECT ValorHora FROM Cargo where id = ?;;" ;
        try {
        /* Executando o comando select */
         PreparedStatement stmt = CBD.conn.prepareStatement(sql);
         stmt.setInt(1,id);               
         rs = stmt.executeQuery();    
            while (rs.next()) {
             int carga_bd = rs.getInt("ValorHora");
                switch(id){
                 case 1: SlrDef = carga_bd  ; break;
                 case 2: SlrDef = carga_bd ; break;
                 case 3: SlrDef = carga_bd ; break;
                 case 4: SlrDef = carga_bd  ; break;
                 case 5: SlrDef = carga_bd  ; break;
                }
            }
         return SlrDef;
        } catch (SQLException sqle) {
         System.out.println( "Erro efetuar consulta de Salario : " + sqle.getMessage() );
         return SlrDef;
        }
    }
    
    public Funcionario CarregarCalculoSalarios(int ID) {
     CBD.conectar();
        try {
         st = CBD.conn.prepareStatement(" SELECT F.nome, C.Nomecargo , H.Turno, H.id, F.salarioBase, F.horasTrabalhadas, H.DiastrabalhoMes FROM cargo AS C JOIN funcionario AS F JOIN Horario AS H ON"
         + " F.cargo_id = C.id AND F.turno_id = H.id WHERE F.id = ? ;");
         st.setInt(1, ID);
         rs = st.executeQuery();
         Funcionario user = new Funcionario();
            while (rs.next()) {
             user.setNome(rs.getString("nome"));
             user.setCargoDesc(rs.getString("NomeCargo"));
             user.setTurnoDesc(rs.getString("Turno"));
             user.setHorasDeTrabalho(rs.getInt("horasTrabalhadas"));
             user.setSalarioBase(rs.getFloat("salarioBase"));
             user.setTurno(rs.getInt("id"));
            }
         CBD.desconectar();
         return user;
        } catch (SQLException ex) {
         System.out.println("Erro ao carregar funcionario: " + ex.getMessage());
         return null;
        }
    }
    
    public int SalvarFuncionario(Funcionario Funcionario) {
     CBD.conectar();
     int status;
        try {
         st = CBD.conn.prepareStatement("INSERT INTO Funcionario(nome,cpf,cargo_id,dataAdmissao,SalarioBase,turno_id,horasTrabalhadas,valorHora) VALUES(?,?,?,?,?,?,?,?)");
         st.setString(1,Funcionario.getNome());
         st.setString(2,Funcionario.getCPF());
         st.setInt(3,Funcionario.getCargo());
         st.setDate(4,java.sql.Date.valueOf(Funcionario.getDataAdmissao()));
         st.setDouble(5,Funcionario.getSalarioBase());
         st.setInt(6,Funcionario.getTurno());
         st.setDouble(7,Funcionario.getHorasDeTrabalho());
         st.setDouble(8,Funcionario.getValorHora());
         status = st.executeUpdate();
         return status; //retornar 1
        } catch (SQLException ex) {
         System.out.println("Erro ao cadastrar Funcionario: " + ex.getMessage());
         return ex.getErrorCode();
        }
    }
    
    public java.util.List<Funcionario> ListarFuncionarios(){
     CBD.conectar();
     String sql = "SELECT * FROM listaFuncionarios" ;
        try {
         /* Executando o comando select */
         PreparedStatement stmt = CBD.conn.prepareStatement(sql);
         rs = stmt.executeQuery();            
         java.util.List<Funcionario> listaFuncionario = new ArrayList<>();
         /* Exibindo os resultados */
            while (rs.next()) {
             Funcionario func = new Funcionario();
             int id = rs.getInt("id");
             String nome = rs.getString("nome");
             LocalDate dataAdmissao =  rs.getDate("dataAdmissao").toLocalDate();
             String cargo = rs.getString("NomeCargo");
             String turno = rs.getString("Turno");
             
             func.setId(id);
             func.setNome(nome);
             func.setDataAdmissao(dataAdmissao);
             func.setCargoDesc(cargo);
             func.setTurnoDesc(turno);
             listaFuncionario.add(func);
            }
         return listaFuncionario;
        } catch (SQLException sqle) {
         System.out.println( "Erro efetuando consulta : " + sqle.getMessage() );
         return null;
        }  
    }

}
