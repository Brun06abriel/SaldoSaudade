/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bruno & Domênica
 */
public class HorariosDAO {
    
    ConexaoBancoDeDados CBD = new ConexaoBancoDeDados();
    
    public List<String> ListarHorarios() {
        CBD.conectar();
        String sql = "SELECT Turno FROM Horario";
        try {
            PreparedStatement stmt = CBD.conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            List<String> listaCargo = new ArrayList<>();
            while (rs.next()) {
                listaCargo.add(rs.getString("Turno"));
            }
            return listaCargo;
        } catch (SQLException sqle) {
            System.out.println("Erro ao listar turnos: " + sqle.getMessage());
            return null;
        }
    }
    
}
