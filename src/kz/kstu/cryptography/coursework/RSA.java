/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package kz.kstu.cryptography.coursework;

/**
 *
 * @author 1234
 */
public class RSA extends javax.swing.JFrame {
int P=0, Q=0,Na=0,Nb=0,Cb=3,Db=0,e=0,m=0,m1=0, ф =0; 
    /**
     * Creates new form RSA
     */
    public RSA() {
        initComponents();
        setLocation(550,250);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        eTF = new javax.swing.JTextField();
        CbTF = new javax.swing.JTextField();
        m1TF = new javax.swing.JTextField();
        MesTF = new javax.swing.JButton();
        PQF = new javax.swing.JButton();
        ErLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        mTF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        NTF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        DbTF = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        fTF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        eTF.setEnabled(false);

        m1TF.setEnabled(false);

        MesTF.setText("Отправить Сообщение");
        MesTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MesTFActionPerformed(evt);
            }
        });

        PQF.setText("Найти P и Q");
        PQF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PQFActionPerformed(evt);
            }
        });

        ErLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ErLabel.setForeground(new java.awt.Color(255, 0, 0));
        ErLabel.setText("       ");

        jLabel1.setText("Введите Сb(нечетное)");

        jLabel2.setText("Введите m(m<N)");

        jLabel3.setText("e =");

        jLabel4.setText("m' =");

        jLabel5.setText("N =");

        NTF.setEnabled(false);

        jLabel6.setText("И не кончающееся на 1");

        jLabel7.setText("Db =");

        DbTF.setEnabled(false);

        jLabel8.setText("Ф =");

        fTF.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(eTF, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                                    .addComponent(NTF)
                                    .addComponent(m1TF, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(DbTF, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(fTF, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(55, 55, 55)
                                .addComponent(ErLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(mTF, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                                            .addComponent(CbTF))))
                                .addGap(152, 152, 152))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(PQF)
                        .addGap(97, 97, 97)
                        .addComponent(MesTF)))
                .addContainerGap(198, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CbTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ErLabel)
                    .addComponent(eTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m1TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DbTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MesTF)
                    .addComponent(PQF))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
    private void PQFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PQFActionPerformed
      try{Cb=Integer.parseInt(CbTF.getText());
      }catch(NumberFormatException e){
      ErLabel.setText("Введите Cb!");
      }
        P=OTT.P(200);
      Q=OTT.P(200);
      Nb=Q*P;
      ф=(Q-1)*(P-1);
      Db=OTT.getD(Cb, ф);
     while(Db>2000000){
      P=OTT.P(200);
      Q=OTT.P(200);
      Nb=Q*P;
      ф=(Q-1)*(P-1);
      Db=OTT.getD(Cb, ф);
      }
      NTF.setText(Integer.toString(Nb));
      DbTF.setText(Integer.toString(Db));
      fTF.setText(Integer.toString(ф));
    }//GEN-LAST:event_PQFActionPerformed

    private void MesTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MesTFActionPerformed
       try{m=Integer.parseInt(mTF.getText());
      }catch(NumberFormatException e){
      ErLabel.setText("Введите m!");
      }
       if(Nb==0)ErLabel.setText("Найдите P");
       e=OTT.kkk(m, Db, Nb);
       m1 = OTT.kkk(e, Cb, Nb);
       try{m1TF.setText(Integer.toString(m1));
       eTF.setText(Integer.toString(e));
      }catch(NumberFormatException e){
      ErLabel.setText("Введите m!");
      }
       
    }//GEN-LAST:event_MesTFActionPerformed

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
            java.util.logging.Logger.getLogger(RSA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RSA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RSA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RSA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new RSA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CbTF;
    private javax.swing.JTextField DbTF;
    private javax.swing.JLabel ErLabel;
    private javax.swing.JButton MesTF;
    private javax.swing.JTextField NTF;
    private javax.swing.JButton PQF;
    private javax.swing.JTextField eTF;
    private javax.swing.JTextField fTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField m1TF;
    private javax.swing.JTextField mTF;
    // End of variables declaration//GEN-END:variables
}