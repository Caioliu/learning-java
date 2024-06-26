/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votacaoapp;

/**
 *
 * @author caioa
 */
public class TelaVoto extends javax.swing.JFrame {

    /**
     * Creates new form TelaVoto
     */
    public TelaVoto() {
        initComponents();
        lblId.setVisible(false);
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
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnProcessamento = new javax.swing.JButton();
        txtEntrada = new javax.swing.JTextField();
        lblSaida = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblIdade = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Ano de nascimento: ");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("jButton1");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Posso votar?");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Ano de nascimento:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        btnProcessamento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnProcessamento.setText("Posso votar?");
        btnProcessamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessamentoActionPerformed(evt);
            }
        });
        getContentPane().add(btnProcessamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 160, 50));

        txtEntrada.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtEntrada.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 90, -1));

        lblSaida.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblSaida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblSaida, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 260, 30));

        jLabel5.setText("Sistema eleitoral de Valhalla");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        lblIdade.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblIdade.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblIdade, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 90, 30));

        lblId.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblId.setText("Idade:");
        getContentPane().add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcessamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessamentoActionPerformed
        lblId.setVisible(true);
        int anoNascimento = Integer.parseInt(txtEntrada.getText());
        int idade = 2022 - anoNascimento;
        lblIdade.setText(Integer.toString(idade));
        if(((idade >= 16) && (idade < 18)) || (idade > 70)) {
            lblSaida.setText("O voto é opcional.");
        }
        else if (idade < 16) {
            lblSaida.setText("O voto é proibido.");
        }
        else {
            lblSaida.setText("O voto é obrigatório.");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProcessamentoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaVoto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVoto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVoto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVoto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVoto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProcessamento;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblIdade;
    private javax.swing.JLabel lblSaida;
    private javax.swing.JTextField txtEntrada;
    // End of variables declaration//GEN-END:variables
}
