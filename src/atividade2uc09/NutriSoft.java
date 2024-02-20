
package atividade2uc09;


public class NutriSoft extends javax.swing.JFrame {

    public NutriSoft() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AreaDeBoasVindas = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        AreaDeNav = new javax.swing.JPanel();
        jButtonIMC = new javax.swing.JButton();
        jButtonGastoCalorico = new javax.swing.JButton();
        jButtonRecomendacoes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AreaDeBoasVindas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Seja bem vindo ao Nutri Soft");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Escolha uma das opções abaixo:");

        javax.swing.GroupLayout AreaDeBoasVindasLayout = new javax.swing.GroupLayout(AreaDeBoasVindas);
        AreaDeBoasVindas.setLayout(AreaDeBoasVindasLayout);
        AreaDeBoasVindasLayout.setHorizontalGroup(
            AreaDeBoasVindasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AreaDeBoasVindasLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(AreaDeBoasVindasLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        AreaDeBoasVindasLayout.setVerticalGroup(
            AreaDeBoasVindasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AreaDeBoasVindasLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        AreaDeNav.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jButtonIMC.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonIMC.setText("Calcular IMC");
        jButtonIMC.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jButtonIMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIMCActionPerformed(evt);
            }
        });

        jButtonGastoCalorico.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonGastoCalorico.setText("Gasto Calórico");
        jButtonGastoCalorico.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonGastoCalorico.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonGastoCalorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGastoCaloricoActionPerformed(evt);
            }
        });

        jButtonRecomendacoes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonRecomendacoes.setText("Recomendações");
        jButtonRecomendacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRecomendacoesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AreaDeNavLayout = new javax.swing.GroupLayout(AreaDeNav);
        AreaDeNav.setLayout(AreaDeNavLayout);
        AreaDeNavLayout.setHorizontalGroup(
            AreaDeNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AreaDeNavLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(AreaDeNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonRecomendacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonGastoCalorico, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonIMC, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 28, Short.MAX_VALUE))
        );
        AreaDeNavLayout.setVerticalGroup(
            AreaDeNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AreaDeNavLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jButtonIMC, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButtonGastoCalorico, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jButtonRecomendacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AreaDeBoasVindas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(AreaDeNav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AreaDeBoasVindas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AreaDeNav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonIMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIMCActionPerformed
        // TODO add your handling code here:
        IMC tela = new IMC();
        tela.setVisible(true);
    }//GEN-LAST:event_jButtonIMCActionPerformed

    private void jButtonRecomendacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRecomendacoesActionPerformed
        // TODO add your handling code here:
        Recomendacoes tela = new Recomendacoes();
        tela.setVisible(true);
    }//GEN-LAST:event_jButtonRecomendacoesActionPerformed

    private void jButtonGastoCaloricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGastoCaloricoActionPerformed
        // TODO add your handling code here:
        GastoCalorico tela = new GastoCalorico();
        tela.setVisible(true);
    }//GEN-LAST:event_jButtonGastoCaloricoActionPerformed

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
            java.util.logging.Logger.getLogger(NutriSoft.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NutriSoft.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NutriSoft.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NutriSoft.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NutriSoft().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AreaDeBoasVindas;
    private javax.swing.JPanel AreaDeNav;
    private javax.swing.JButton jButtonGastoCalorico;
    private javax.swing.JButton jButtonIMC;
    private javax.swing.JButton jButtonRecomendacoes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
