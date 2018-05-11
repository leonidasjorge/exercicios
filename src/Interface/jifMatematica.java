
package Interface;

/**
 *
 * @author leoni
 */
public class jifMatematica extends javax.swing.JInternalFrame {

    public jifMatematica() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jtfNum = new javax.swing.JTextField();
        jbRes = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaRes = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jbVoltar = new javax.swing.JButton();

        setTitle("Desafio de Matemática");
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
        jLabel1.setText("Informe um Número");

        jtfNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNumActionPerformed(evt);
            }
        });
        jtfNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfNumKeyTyped(evt);
            }
        });

        jbRes.setText("Resultado");
        jbRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbResActionPerformed(evt);
            }
        });

        jtaRes.setColumns(20);
        jtaRes.setRows(5);
        jScrollPane1.setViewportView(jtaRes);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Este Número");

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
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbVoltar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtfNum, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbRes)))
                        .addGap(0, 82, Short.MAX_VALUE)))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbRes))
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfNumKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNumKeyTyped
        
        String caracter = "0123456789";
        if(!caracter.contains(evt.getKeyChar() + "")){
            evt.consume();
        }
    }//GEN-LAST:event_jtfNumKeyTyped

    private void jbResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbResActionPerformed
        
        int valor = Integer.parseInt(jtfNum.getText());
        int nDivisores = 0;
        
        gravaResultados dados = new gravaResultados();
        
        if(valor %2 == 0){
            dados.setImpar("- Não é Ímpar, ou seja, é um número Par.");
        }else{
            dados.setImpar("- É Ímpar, ou seja, não é um número Par.");
        }

        if (valor > 10) {
            dados.setComp("- É maior que 10.");
        }else{
            dados.setComp("- Não é maior que 10.");
        }

        dados.setDobro(valor * 2);

        if(valor == 2 || valor == 5){
            dados.setTipo_num("- É um número Primo.");
        }else{
            if (valor == 0 || valor == 1) {
                dados.setTipo_num("- Não é um número Primo.");
            }else{
                for(int i = 1; i <= valor; i++){
                    if (valor %i == 0) {
                        nDivisores++;
                    }
                }
            }
        }
        
        jtaRes.setText(dados.getImpar() + "\n" + dados.getComp() + "\n" + "- O Dobro de " + valor + " é " + dados.getDobro() + ". \n" + dados.getTipo_num());
      
    }//GEN-LAST:event_jbResActionPerformed

    private void jbVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVoltarActionPerformed
        
        this.dispose();
    }//GEN-LAST:event_jbVoltarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        
        jtaRes.setEditable(false);
    }//GEN-LAST:event_formInternalFrameOpened

    private void jtfNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNumActionPerformed

    }//GEN-LAST:event_jtfNumActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbRes;
    private javax.swing.JButton jbVoltar;
    private javax.swing.JTextArea jtaRes;
    private javax.swing.JTextField jtfNum;
    // End of variables declaration//GEN-END:variables
}

class gravaResultados{
    private String impar = "0";
    private String comp = "0";           // (Comparação) maoir ou menor que 10
    private int dobro;
    private String tipo_num = "0";      // Este número é Primo ou Não é Primo.
    
    public void setImpar(String n){
        impar = n;
    }
    public String getImpar(){
        return impar;
    }
    
    public void setComp(String n){
        comp = n;
    }
    public String getComp(){
        return comp;
    }
    
    public void setDobro(int n){
        dobro = n;
    }
    public int getDobro(){
        return dobro;
    }
    
    public void setTipo_num(String n){
        tipo_num = n;
    }
    public String getTipo_num(){
        return tipo_num;
    }
}