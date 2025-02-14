/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;
import Control.ConexaoBancoDeDados;
import Model.FolhaDePagamento;
import Model.Funcionario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FolhaDePagamentoDAO {
    ConexaoBancoDeDados CBD = new ConexaoBancoDeDados();
    PreparedStatement st;
    ResultSet rs;
    
    public boolean AbrirFolhaDePagamento(FolhaDePagamento FolhaAtiva){
     CBD.conectar();
        try {
            st = CBD.conn.prepareStatement("INSERT INTO folhapagamento(id, funcionarioId,totalSalarioPago) VALUES(?,?,?)");
            st.setInt(1,FolhaAtiva.getId());
            st.setInt(2,FolhaAtiva.getId_funcionario());
            st.setFloat(3,FolhaAtiva.getValorPago());
            return true;
        } catch (SQLException ex) {
            System.out.println("Erro ao abrir Folha: " + ex.getMessage());
            return false;
        }   
    }
}
