
package Interface;

import javax.swing.JOptionPane;

/**
 *
 * @author leoni
 */
public class jifGeografia extends javax.swing.JInternalFrame {
    
    public jifGeografia() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jtfCidade = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaRes3 = new javax.swing.JTextArea();
        jbVerif = new javax.swing.JButton();
        jbVoltar = new javax.swing.JButton();

        setTitle("Desafio de Geografia");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Informe uma Cidade");

        jtfCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCidadeActionPerformed(evt);
            }
        });

        jtaRes3.setColumns(20);
        jtaRes3.setRows(5);
        jScrollPane1.setViewportView(jtaRes3);

        jbVerif.setText("Verificar");
        jbVerif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVerifActionPerformed(evt);
            }
        });

        jbVoltar.setText("Voltar");
        jbVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 198, Short.MAX_VALUE)
                        .addComponent(jbVoltar))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbVerif)
                            .addComponent(jtfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jbVoltar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jbVerif)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbVerifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVerifActionPerformed

        cidadeRecebe cid = new cidadeRecebe();
        String digito = jtfCidade.getText().toUpperCase();
        if(cid.getCidade1().equals(digito) || cid.getCidade2().equals(digito) ||
            cid.getCidade3().equals(digito) || cid.getCidade4().equals(digito) ||
            cid.getCidade5().equals(digito) || cid.getCidade6().equals(digito) ||
            cid.getCidade7().equals(digito) || cid.getCidade8().equals(digito) ||
            cid.getCidade9().equals(digito) || cid.getCidade10().equals(digito)){
                
                if(cid.getCidade1().equals(digito)){
                    jtaRes3.setText("- Blumenau é um município do estado Santa Catarina (SC)." + "\n" + "- Não é Capital.");
                }
                if(cid.getCidade2().equals(digito)){
                    jtaRes3.setText("- Chapecó é um município do estado Santa Catarina (SC)." + "\n" + "- Não é Capital.");
                }
                if(cid.getCidade3().equals(digito)){
                    jtaRes3.setText("- Curitiba é Capital do estado do Paraná (PR).");
                }
                if(cid.getCidade4().equals(digito)){
                    jtaRes3.setText("Florianópolis é Capital do estado do Santa Catarina (SC).");
                }
                if(cid.getCidade5().equals(digito)){
                    jtaRes3.setText("- Gramado é um município do estado do Rio Grande do Sul (RS)." + "\n" + "- Não é Capital.");
                }
                if(cid.getCidade6().equals(digito)){
                    jtaRes3.setText("- Joinville é um município do estado Santa Catarina (SC)." + "\n" + "- Não é Capital.");
                }
                if(cid.getCidade7().equals(digito)){
                    jtaRes3.setText("- Maringá é um município do estado do Paraná (PR)." + "\n" + "- Não é Capital.");
                }
                if(cid.getCidade8().equals(digito)){
                    jtaRes3.setText("- Londrina é um município do estado do Paraná (PR)." + "\n" + "- Não é Capital.");
                }
                if(cid.getCidade9().equals(digito)){
                    jtaRes3.setText("- Pinhais é um município do estado do Paraná (PR)." + "\n" + "- Não é Capital.");
                }
                if(cid.getCidade10().equals(digito)){
                    jtaRes3.setText("- Porto Alegre é Capital do estado do Rio Grande do Sul (RS).");
                }
        }else{
            if("".equals(digito)){
                jtaRes3.setText("");
                JOptionPane.showMessageDialog(null, "Você não informou uma cidade.");
            }else{
                jtaRes3.setText("");
                JOptionPane.showMessageDialog(null, "Cidade não encontrada. "
                        + "\n"
                        + "Cidades permitidas: "
                        + "Blumenau, Chapecó, Curitiba, Florianopolis, Gramado, Joinvile, Maringá, "
                        + "Londrina, Pinhais ou Porto Alegre.");
            }
        }
    }//GEN-LAST:event_jbVerifActionPerformed
    
    private void jbVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVoltarActionPerformed
        
        this.dispose();
    }//GEN-LAST:event_jbVoltarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        
        jtaRes3.setEditable(false);
    }//GEN-LAST:event_formInternalFrameOpened

    private void jtfCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCidadeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbVerif;
    private javax.swing.JButton jbVoltar;
    private javax.swing.JTextArea jtaRes3;
    private javax.swing.JTextField jtfCidade;
    // End of variables declaration//GEN-END:variables
}

class cidadeRecebe {
    private String cidade1 = "BLUMENAU";  
    private String cidade2 = "CHAPECÓ";
    private String cidade3 = "CURITIBA";
    private String cidade4 = "FLORIANÓPOLIS";
    private String cidade5 = "GRAMADO";
    private String cidade6 = "JOINVILE";
    private String cidade7 = "MARINGÁ";
    private String cidade8 = "LONDRINA";
    private String cidade9 = "PINHAIS";
    private String cidade10 = "PORTO ALEGRE";
    
    public void setCidade1(String m){
        cidade1 = m;
    }
    public String getCidade1(){
        return cidade1;
    }
    
    public void setCidade2(String m){
        cidade2 = m;
    }
    public String getCidade2(){
        return cidade2;
    }
    
    public void setCidade3(String m){
        cidade3 = m;
    }
    public String getCidade3(){
        return cidade3;
    }
    
    public void setCidade4(String m){
        cidade4 = m;
    }
    public String getCidade4(){
        return cidade4;
    }
    
    public void setCidade5(String m){
        cidade5 = m;
    }
    public String getCidade5(){
        return cidade5;
    }
    
    public void setCidade6(String m){
        cidade6 = m;
    }
    public String getCidade6(){
        return cidade6;
    }
    
    public void setCidade7(String m){
        cidade7 = m;
    }
    public String getCidade7(){
        return cidade7;
    }
    
    public void setCidade8(String m){
        cidade8 = m;
    }
    public String getCidade8(){
        return cidade8;
    }
    
    public void setCidade9(String m){
        cidade9 = m;
    }
    public String getCidade9(){
        return cidade9;
    }
    
    public void setCidade10(String m){
        cidade10 = m;
    }
    public String getCidade10(){
        return cidade10;
    }
}