/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

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
import java.util.Date;

/**
 *
 * @author bruno
 */
public class FuncionarioDAO {
    Connection conn;
    PreparedStatement st;
    
    PreparedStatement st3;
    PreparedStatement st2;
    ResultSet rs;
    
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
    }
    
    public int SalvarFuncionario(Funcionario Funcionario) {
       conectar();
       
        int status;
        try {
            st = conn.prepareStatement("INSERT INTO livro(titulo,autor,editora,isbn,estoque,disponivel_emprestimo, preco_venda) VALUES(?,?,?,?,?,?,?)");
            st.setString(1,Funcionario.getNome());
            st.setString(2,Funcionario.getCPF());
            st.setDate(3, (java.sql.Date) Funcionario.getDataAdmissao());
            st.setDouble(4,Funcionario.getSalarioBase());
            st.setDouble(5,Funcionario.getHorasTrabalhadas());
            st.setDouble(6,Funcionario.getValorHora());
           
            status = st.executeUpdate();
            return status; //retornar 1
        } catch (SQLException ex) {
            System.out.println("Erro ao cadastrar Funcionario: " + ex.getMessage());
            return ex.getErrorCode();
        }
    }
        
        public java.util.List<Funcionario> ListarFuncionarios(){
       
        conectar();
    String sql = "SELECT * FROM Funcionario" ;
          try {

    /* Executando o comando select */
     PreparedStatement stmt = this.conn.prepareStatement(sql);
                    rs = stmt.executeQuery();            
                    
    java.util.List<Funcionario> listaFuncionario = new ArrayList<>();
    /* Exibindo os resultados */
    while (rs.next()) {
        Funcionario func = new Funcionario();
     
        // aguardando banco de dados
        int id = rs.getInt("id");
        String titulo = rs.getString("nome");
        String autor = rs.getString("CPF");
        String editora = rs.getString("Da");
        String isbn = rs.getString("isbn");
        Boolean disponibilidade = rs.getBoolean("disponivel_emprestimo");
   
        
        func.setId(id);
        func.setNome(titulo);
        func.setCPF(autor);/*
        func.setDataAdmissao();
        func.setSalariobase();
        func.setHorasTrabalho();
        func.setValorHora();*/
        
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
