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
public class FORMULIR extends javax.swing.JFrame {

    /**
     * Creates new form FORMULIR
     */
    public FORMULIR() {
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
        Nama = new javax.swing.JTextField();
        Kelas = new javax.swing.JTextField();
        Alamat = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        alamat1 = new javax.swing.JTextField();
        kelas1 = new javax.swing.JTextField();
        nama1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(240, 58, 135));
        jPanel1.setLayout(null);

        jLabel1.setText("BIODATA SISWA");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(153, 40, 100, 16);

        jLabel2.setText("NAMA");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(60, 80, 34, 16);

        jLabel3.setText("KELAS");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(60, 110, 50, 16);

        jLabel4.setText("ALAMAT");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(60, 140, 60, 16);
        jPanel1.add(Nama);
        Nama.setBounds(150, 80, 180, 22);
        jPanel1.add(Kelas);
        Kelas.setBounds(150, 110, 180, 22);
        jPanel1.add(Alamat);
        Alamat.setBounds(150, 140, 180, 22);

        jButton1.setText("PROSES");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(159, 170, 90, 25);

        jLabel5.setText("NAMA");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(60, 200, 34, 16);

        jLabel6.setText("KELAS");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(60, 230, 50, 16);

        jLabel7.setText("ALAMAT");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(60, 260, 60, 16);
        jPanel1.add(alamat1);
        alamat1.setBounds(150, 260, 180, 22);

        kelas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kelas1ActionPerformed(evt);
            }
        });
        jPanel1.add(kelas1);
        kelas1.setBounds(150, 230, 180, 22);
        jPanel1.add(nama1);
        nama1.setBounds(150, 200, 180, 22);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String nama = Nama.getText();
        nama1.setText(nama);
        String kelas = Kelas.getText();
        kelas1.setText(kelas);
        String alamat = Alamat.getText();
        alamat1.setText(alamat);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void kelas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kelas1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kelas1ActionPerformed

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
            java.util.logging.Logger.getLogger(FORMULIR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FORMULIR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FORMULIR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FORMULIR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FORMULIR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Alamat;
    private javax.swing.JTextField Kelas;
    private javax.swing.JTextField Nama;
    private javax.swing.JTextField alamat1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField kelas1;
    private javax.swing.JTextField nama1;
    // End of variables declaration//GEN-END:variables
}
