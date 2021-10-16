/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import DAO.AlunoDAO;
import DTO.AlunoDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author thiago
 */
public class frmDelAltAlunoVIEW extends javax.swing.JFrame {

    /**
     * Creates new form frmDeletarAlunoVIEW
     */
    public frmDelAltAlunoVIEW() {
        initComponents();
        btnCancelar.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        txtNomeDepartamento = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNomeAluno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnProcurar = new javax.swing.JButton();
        btnApagar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnConfirmarAluno = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblVoltar = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        txtNomeDepartamento.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("ALTERAR/DELETAR ALUNO");

        jLabel1.setText("Digite a matricula do aluno:");

        jLabel2.setText("Nome do aluno:");

        txtNomeAluno.setEnabled(false);

        jLabel3.setText("Nome do departamento:");

        btnProcurar.setText("Procurar");
        btnProcurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcurarActionPerformed(evt);
            }
        });

        btnApagar.setText("Apagar");
        btnApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnConfirmarAluno.setText("Confirmar");
        btnConfirmarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarAlunoActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        lblVoltar.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        lblVoltar.setForeground(new java.awt.Color(0, 0, 255));
        lblVoltar.setText("Voltar");
        lblVoltar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVoltarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel3)
                                            .addComponent(txtNomeDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnProcurar)
                                            .addComponent(jLabel2)
                                            .addComponent(txtNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(btnCancelar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnConfirmarAluno)))
                                .addGap(18, 18, 18)
                                .addComponent(btnAlterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnApagar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(jLabel4)))
                        .addGap(0, 14, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblVoltar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnProcurar)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(txtNomeDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirmarAluno)
                    .addComponent(btnAlterar)
                    .addComponent(btnApagar)
                    .addComponent(btnCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(lblVoltar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarActionPerformed
        retornarAluno();
    }//GEN-LAST:event_btnProcurarActionPerformed

    private void btnApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarActionPerformed
        apagarAluno();
        LimparCampos();
    }//GEN-LAST:event_btnApagarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        alterarAluno();
        LimparCampos();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnConfirmarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarAlunoActionPerformed
        confirmarAluno();
    }//GEN-LAST:event_btnConfirmarAlunoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        fimOperacao();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void lblVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVoltarMouseClicked
        frmHomeVIEW objHome = new frmHomeVIEW();
        objHome.setVisible(true);
        dispose();
    }//GEN-LAST:event_lblVoltarMouseClicked

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
            java.util.logging.Logger.getLogger(frmDelAltAlunoVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmDelAltAlunoVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmDelAltAlunoVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmDelAltAlunoVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmDelAltAlunoVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnApagar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmarAluno;
    private javax.swing.JButton btnProcurar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lblVoltar;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNomeAluno;
    private javax.swing.JTextField txtNomeDepartamento;
    // End of variables declaration//GEN-END:variables

    private void retornarAluno() {
        if (txtMatricula.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor preencher matricula do aluno");
        } else {
            try {
                String matricula = txtMatricula.getText();
                AlunoDTO objalunodto = new AlunoDTO();
                objalunodto.setMatricula(matricula);
                AlunoDAO objalunodao = new AlunoDAO();
                objalunodto = objalunodao.retornaAluno(objalunodto);
                if (objalunodto.getNome() == null) {
                    JOptionPane.showMessageDialog(null, "Aluno não existe");
                } else {
                    txtNomeAluno.setText(objalunodto.getNome());
                    txtNomeDepartamento.setText(objalunodto.getNomeDepartamento());
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "retorna aluno" + e);
            }
        }
    }
    /*private void CarregarCampos() {
        txtNomeAluno.setText(tblAluno.getModel().getValueAt(0, 1).toString());
        txtNomeDepartamento.setText(tblAluno.getModel().getValueAt(0, 2).toString());
    }*/
    private void apagarAluno() {
        if (txtMatricula.getText().isEmpty() || txtNomeAluno.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Verificar se os campos estão preenchidos");
        } else {
            String matricula;
            matricula = txtMatricula.getText();
            AlunoDTO objalunodto = new AlunoDTO();
            objalunodto.setMatricula(matricula);
            AlunoDAO objalunodao = new AlunoDAO();
            objalunodao.deletarAluno(objalunodto);
            
        }
    }

    private void LimparCampos() {
        txtMatricula.setText("");
        txtNomeAluno.setText("");
        txtNomeDepartamento.setText("");
    }

    private void alterarAluno() {
        if (txtMatricula.getText().isEmpty() || txtNomeAluno.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Verificar se os campos estão preenchidos");
        } else {
            try {
                String matricula, nome, departamento;
                matricula = txtMatricula.getText();
                nome = txtNomeAluno.getText();
                departamento = txtNomeDepartamento.getText();
                AlunoDTO objalunodto = new AlunoDTO();
                objalunodto.setMatricula(matricula);
                objalunodto.setNome(nome);
                objalunodto.setNomeDepartamento(departamento);
                AlunoDAO objalunodao = new AlunoDAO();
                objalunodao.alterarAluno(objalunodto);
                fimOperacao();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "alterar aluno" + e);
            }
        }

    }

    private void confirmarAluno() {
        if(txtMatricula.getText().isEmpty() || txtNomeAluno.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Aperte em procurar antes de confirmar o aluno");
        }
        else{
            txtMatricula.setEnabled(false);
            txtNomeAluno.setEnabled(true);
            txtNomeDepartamento.setEnabled(true);
            btnConfirmarAluno.setVisible(false);
            btnCancelar.setVisible(true);
        }
    }
    private void fimOperacao(){
        txtMatricula.setEnabled(true);
        txtNomeAluno.setEnabled(false);
        txtNomeDepartamento.setEnabled(false);
        btnCancelar.setVisible(false);
        btnConfirmarAluno.setVisible(true);
        LimparCampos();
    }

}
