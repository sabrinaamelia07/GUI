/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbogui;

/**
 *
 * @author PC
 */
public class FORMapaYA extends javax.swing.JFrame {

    /**
     * Creates new form FORMapaYA
     */
    public FORMapaYA() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        HMM = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        okHasil = new javax.swing.JTextArea();
        nama = new javax.swing.JTextField();
        kelas = new javax.swing.JTextField();
        absen = new javax.swing.JTextField();
        alamat = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 102, 153));
        jPanel1.setLayout(null);

        jLabel1.setText("FORMULIR");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(211, 30, 70, 16);

        jLabel2.setText("NAMA");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(70, 70, 60, 20);

        jLabel3.setText("KELAS");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(70, 106, 70, 20);

        jLabel4.setText("ABSEN");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(70, 150, 50, 16);

        jLabel5.setText("ALAMAT");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(70, 190, 70, 16);

        HMM.setText("HMM");
        HMM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HMMActionPerformed(evt);
            }
        });
        jPanel1.add(HMM);
        HMM.setBounds(220, 220, 80, 30);

        okHasil.setBackground(new java.awt.Color(255, 153, 153));
        okHasil.setColumns(20);
        okHasil.setRows(5);
        jScrollPane1.setViewportView(okHasil);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(66, 270, 390, 140);

        nama.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.add(nama);
        nama.setBounds(170, 62, 280, 30);

        kelas.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.add(kelas);
        kelas.setBounds(170, 102, 280, 30);

        absen.setBackground(new java.awt.Color(255, 153, 153));
        absen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                absenActionPerformed(evt);
            }
        });
        jPanel1.add(absen);
        absen.setBounds(170, 142, 280, 30);

        alamat.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.add(alamat);
        alamat.setBounds(170, 182, 280, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void absenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_absenActionPerformed
   
        
        
    }//GEN-LAST:event_absenActionPerformed

    private void HMMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HMMActionPerformed
        String NAMA = nama.getText();
        String KELAS= kelas.getText();
        String ABSEN = absen.getText();
        String ALAMAT = alamat.getText();
        
        okHasil.setText("NAMA SISWA \t:"+NAMA+"\n"+
                "ABSEN  \t:"+ABSEN+"\n"+
                "KELAS  \t:"+KELAS+"\n"+
                "ALAMAT SISWA  \t:"+ALAMAT);
    }//GEN-LAST:event_HMMActionPerformed

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
            java.util.logging.Logger.getLogger(FORMapaYA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FORMapaYA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FORMapaYA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FORMapaYA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FORMapaYA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HMM;
    private javax.swing.JTextField absen;
    private javax.swing.JTextField alamat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kelas;
    private javax.swing.JTextField nama;
    private javax.swing.JTextArea okHasil;
    // End of variables declaration//GEN-END:variables
}
