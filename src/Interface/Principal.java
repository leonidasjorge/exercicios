
package Interface;

/**
 *
 * @author leoni
 */
public class Principal extends javax.swing.JFrame {
    
    int x, y;
    
    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpPrincipal = new javax.swing.JDesktopPane();
        jbport = new javax.swing.JButton();
        jbmat = new javax.swing.JButton();
        jbgeog = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Desafios");
        setResizable(false);
        getContentPane().setLayout(null);

        jdpPrincipal.setBackground(new java.awt.Color(102, 255, 102));

        jbport.setText("Português");
        jbport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbportActionPerformed(evt);
            }
        });

        jbmat.setText("Matemática");
        jbmat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbmatActionPerformed(evt);
            }
        });

        jbgeog.setText("Geografia");
        jbgeog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbgeogActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EXERCÍCIO");
        jLabel1.setToolTipText("");
        jLabel1.setFocusable(false);

        jdpPrincipal.setLayer(jbport, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpPrincipal.setLayer(jbmat, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpPrincipal.setLayer(jbgeog, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpPrincipal.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jdpPrincipalLayout = new javax.swing.GroupLayout(jdpPrincipal);
        jdpPrincipal.setLayout(jdpPrincipalLayout);
        jdpPrincipalLayout.setHorizontalGroup(
            jdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpPrincipalLayout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addGroup(jdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbmat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbgeog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(148, Short.MAX_VALUE))
        );
        jdpPrincipalLayout.setVerticalGroup(
            jdpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpPrincipalLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbgeog, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbmat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbport, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        getContentPane().add(jdpPrincipal);
        jdpPrincipal.setBounds(0, 0, 410, 310);

        setSize(new java.awt.Dimension(416, 338));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbgeogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbgeogActionPerformed
        
        x = jdpPrincipal.getWidth();
        y = jdpPrincipal.getHeight();
        
        jifGeografia obj = new jifGeografia();
        jdpPrincipal.add(obj);
        obj.setSize(x, y);
        obj.setResizable(false);
        obj.enable(false);
        obj.setVisible(true);
    }//GEN-LAST:event_jbgeogActionPerformed

    private void jbmatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbmatActionPerformed
        
        x = jdpPrincipal.getWidth();
        y = jdpPrincipal.getHeight();
        
        jifMatematica obj = new jifMatematica();
        jdpPrincipal.add(obj);
        obj.setSize(x, y);
        obj.setResizable(false);
        obj.enable(false);
        obj.setVisible(true);
    }//GEN-LAST:event_jbmatActionPerformed

    private void jbportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbportActionPerformed
        
        x = jdpPrincipal.getWidth();
        y = jdpPrincipal.getHeight();
        
        jifPortugues obj = new jifPortugues();
        jdpPrincipal.add(obj);
        obj.setSize(x, y);
        obj.setResizable(false);
        obj.enable(false);
        obj.setVisible(true);
    }//GEN-LAST:event_jbportActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbgeog;
    private javax.swing.JButton jbmat;
    private javax.swing.JButton jbport;
    private javax.swing.JDesktopPane jdpPrincipal;
    // End of variables declaration//GEN-END:variables
}