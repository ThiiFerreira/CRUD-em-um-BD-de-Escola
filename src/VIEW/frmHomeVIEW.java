/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

/**
 *
 * @author thiago
 */
public class frmHomeVIEW extends javax.swing.JFrame {

    /**
     * Creates new form frmHomeVIEW
     */
    public frmHomeVIEW() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblAlterarDeletar = new javax.swing.JLabel();
        lblCadastrar = new javax.swing.JLabel();
        lblMedia = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Painel de controle");

        lblAlterarDeletar.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        lblAlterarDeletar.setForeground(new java.awt.Color(0, 0, 255));
        lblAlterarDeletar.setText("Alterar/Deletar aluno");
        lblAlterarDeletar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblAlterarDeletar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAlterarDeletar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAlterarDeletarMouseClicked(evt);
            }
        });

        lblCadastrar.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        lblCadastrar.setForeground(new java.awt.Color(0, 0, 255));
        lblCadastrar.setText("Cadastrar aluno");
        lblCadastrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCadastrarMouseClicked(evt);
            }
        });

        lblMedia.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        lblMedia.setForeground(new java.awt.Color(0, 0, 255));
        lblMedia.setText("Ver media aluno");
        lblMedia.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblMedia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMedia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMediaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCadastrar)
                .addGap(34, 34, 34)
                .addComponent(lblAlterarDeletar)
                .addGap(34, 34, 34)
                .addComponent(lblMedia)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCadastrar)
                    .addComponent(lblMedia)
                    .addComponent(lblAlterarDeletar))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCadastrarMouseClicked
        frmCadastrarAlunoVIEW objfrmcadastraraluno = new frmCadastrarAlunoVIEW();        
        objfrmcadastraraluno.setVisible(true);
        dispose();
    }//GEN-LAST:event_lblCadastrarMouseClicked

    private void lblAlterarDeletarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAlterarDeletarMouseClicked
        frmDelAltAlunoVIEW objfrmDelAlt = new frmDelAltAlunoVIEW();        
        objfrmDelAlt.setVisible(true);
        dispose();
    }//GEN-LAST:event_lblAlterarDeletarMouseClicked

    private void lblMediaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMediaMouseClicked
        frmMediaVIEW objfrmMedia = new frmMediaVIEW();        
        objfrmMedia.setVisible(true);
        dispose();
    }//GEN-LAST:event_lblMediaMouseClicked

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
            java.util.logging.Logger.getLogger(frmHomeVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmHomeVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmHomeVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmHomeVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmHomeVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAlterarDeletar;
    private javax.swing.JLabel lblCadastrar;
    private javax.swing.JLabel lblMedia;
    // End of variables declaration//GEN-END:variables
}
