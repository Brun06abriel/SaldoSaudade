/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Control.ConexaoBancoDeDados;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bruno & Domênica
 */

public class CargoDAO {
    
    
ConexaoBancoDeDados CBD = new ConexaoBancoDeDados();
    
      public List<String> ListarNomesUsuarios() {
        CBD.conectar();
        String sql = "SELECT NomeCargo FROM Cargo";
        try {
            PreparedStatement stmt = CBD.conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            List<String> listaCargo = new ArrayList<>();
            while (rs.next()) {
                listaCargo.add(rs.getString("nomeCargo"));
            }
            return listaCargo;
        } catch (SQLException sqle) {
            System.out.println("Erro ao listar cargos: " + sqle.getMessage());
            return null;
        }
    }
    
        
    
    
}
