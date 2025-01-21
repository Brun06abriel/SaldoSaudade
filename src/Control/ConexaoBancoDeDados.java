/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import java.sql.DriverManager;
import java.sql.SQLException;
import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author bruno
 */
public class ConexaoBancoDeDados {
    
       java.sql.Connection conn;
    
    public boolean conectar(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            // inserir informações para conexao com banco de dados externo
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_saldoSaudade","root","Bruno123");
            System.out.println( "Conexao com o banco de dados estabelecida." );
            return true;
        } catch (ClassNotFoundException | java.sql.SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return false;
        }
        
}
    
     public void desconectar(){
        try {
            conn.close();
        } catch (SQLException ex) {
        }
    }
}
