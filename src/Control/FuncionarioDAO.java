/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Control.ConexaoBancoDeDados;
import Model.Funcionario;
import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.time.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.sql.Connection;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author bruno
 */
public class FuncionarioDAO {
    ConexaoBancoDeDados CBD = new ConexaoBancoDeDados();
    PreparedStatement st;
    
    ResultSet rs;
    
        
    /*
     public boolean conectar(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bibliotecaariano","root", "Bruno123");
            System.out.println(" conectar: " );
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Erro ao conectar1: " + ex.getMessage());
            return false;
        }
    }*/
    
    public int SalvarFuncionario(Funcionario Funcionario) {
       CBD.conectar();
       
        int status;
        try {
            st = CBD.conn.prepareStatement("INSERT INTO Funcionario(nome,cpf,cargo,dataAdmissao,SalarioBase,horasTrabalhadas,valorHora) VALUES(?,?,?,?,?,?,?)");
            st.setString(1,Funcionario.getNome());
            st.setString(2,Funcionario.getCPF());
            st.setString(3,Funcionario.getCargo());
            
            
                    
            st.setDate(4,java.sql.Date.valueOf(Funcionario.getDataAdmissao()));
            st.setDouble(5,Funcionario.getSalarioBase());
            st.setDouble(6,Funcionario.getHorasDeTrabalho());
            st.setDouble(7,Funcionario.getValorHora());
           
            status = st.executeUpdate();
            return status; //retornar 1
        } catch (SQLException ex) {
            System.out.println("Erro ao cadastrar Funcionario: " + ex.getMessage());
            return ex.getErrorCode();
        }
    }
        
        public java.util.List<Funcionario> ListarFuncionarios(){
       
        CBD.conectar();
    String sql = "SELECT id,nome,dataAdmissao,cargo,salarioBase,horasTrabalhadas,valorHora FROM Funcionario" ;
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
        String cargo = rs.getString("cargo");
        Float salarioBase = rs.getFloat("salarioBase");
        int horasTrabalhadas = rs.getInt("horasTrabalhadas");
        Float valorHora = rs.getFloat("valorHora");
        
        
        func.setId(id);
        func.setNome(nome);
        func.setDataAdmissao(dataAdmissao);
        func.setCargo(cargo);
        func.setSalarioBase(salarioBase);
        func.setHorasDeTrabalho(horasTrabalhadas);
        func.setValorHora(valorHora);
        
        listaFuncionario.add(func);
    }
     return listaFuncionario;
} catch (SQLException sqle) {
    System.out.println( "Erro efetuando consulta : " + sqle.getMessage() );
    return null;
}
          
    }
    

    public void removerFuncionario(int id) {
        // Código para remover um funcionario pelo ID
    }
    
}
