/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Model.Funcionario;
import Control.FuncionarioDAO;
import Control.ConexaoBancoDeDados;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bruno
 */
public class ListaFuncionarios extends javax.swing.JFrame {
    /**
     * Creates new form pesquisalivro
     */
    
    private void preencherTabela() {
                FuncionarioDAO FUNCDAO = new FuncionarioDAO();
            
                List<Funcionario> listadefuncionarios = FUNCDAO.ListarFuncionarios();
                
                 DefaultTableModel tabelaUsers = (DefaultTableModel) jTableFuncionarios.getModel(); 
            
                 
                for (Funcionario F : listadefuncionarios) { 
                    Object[] obj = new Object[] { 
                        F.getId(),            
                        F.getNome(),   
                        F.getCargo(),
                        F.getDataAdmissao(),
                        F.getSalarioBase(),
                        F.getHorasDeTrabalho(),
                        F.getValorHora(),
                        
                        
                        
                        
                    };
                    tabelaUsers.addRow(obj);
                     
                }    

}
    

    /*
              private void RestultadoPesquisa(String NomePesquisa) {
               FuncionarioDAO FUNCDAO = new FuncionarioDAO();
            
                List<Funcionario> listadefuncionariopesq = FUNCDAO.PesquisarFuncionario(NomePesquisa);
                
                 DefaultTableModel tabelaUsers = (DefaultTableModel) jTableLivros.getModel(); 
            
                 
                for (Livro l : listadelivropesq) { 
                    Object[] obj = new Object[] { 
                        l.getId(),            
                        l.getTitulo(),   
                        l.getAutor(),
                        l.getEditora(),
                        l.getISBN(),
                    };
                    tabelaUsers.addRow(obj);
                }    
            }
    */
    public ListaFuncionarios() {
        initComponents();
        preencherTabela();
                  
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldPesquisaTitulo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldPesquisaAutor = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableFuncionarios = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(226, 114, 91));

        jLabel7.setFont(new java.awt.Font("Rockwell", 1, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(59, 83, 35));
        jLabel7.setText(" Biblioteca Ariano ");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(212, 175, 55)));

        jLabel1.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(59, 83, 35));
        jLabel1.setText("Pesquisa de Livro");

        jLabel8.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel8.setText("Titulo:");

        jTextFieldPesquisaTitulo.setBackground(new java.awt.Color(250, 240, 230));

        jLabel9.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel9.setText("Autor:");

        jTextFieldPesquisaAutor.setBackground(new java.awt.Color(250, 240, 230));

        jTableFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Cargo", "Data  Admissao", "Salario/Mês", "Horas de Trabalho", "Valor Hora"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableFuncionarios);
        if (jTableFuncionarios.getColumnModel().getColumnCount() > 0) {
            jTableFuncionarios.getColumnModel().getColumn(0).setMinWidth(30);
            jTableFuncionarios.getColumnModel().getColumn(0).setMaxWidth(50);
            jTableFuncionarios.getColumnModel().getColumn(1).setMaxWidth(220);
            jTableFuncionarios.getColumnModel().getColumn(2).setMaxWidth(200);
            jTableFuncionarios.getColumnModel().getColumn(3).setMinWidth(70);
            jTableFuncionarios.getColumnModel().getColumn(3).setMaxWidth(150);
            jTableFuncionarios.getColumnModel().getColumn(4).setMinWidth(100);
            jTableFuncionarios.getColumnModel().getColumn(4).setMaxWidth(120);
            jTableFuncionarios.getColumnModel().getColumn(5).setMinWidth(50);
            jTableFuncionarios.getColumnModel().getColumn(5).setMaxWidth(110);
            jTableFuncionarios.getColumnModel().getColumn(6).setMinWidth(70);
            jTableFuncionarios.getColumnModel().getColumn(6).setMaxWidth(90);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(334, 334, 334))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldPesquisaTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldPesquisaAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(384, 384, 384))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 929, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldPesquisaTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldPesquisaAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(128, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListaFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaFuncionarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableFuncionarios;
    private javax.swing.JTextField jTextFieldPesquisaAutor;
    private javax.swing.JTextField jTextFieldPesquisaTitulo;
    // End of variables declaration//GEN-END:variables
}
