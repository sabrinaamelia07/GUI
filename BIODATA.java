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
public class BIODATA extends javax.swing.JFrame {

    /**
     * Creates new form BIODATA
     */
    public BIODATA() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        NAMA = new javax.swing.JTextField();
        ABSEN = new javax.swing.JTextField();
        JURUSAN = new javax.swing.JTextField();
        hmm = new javax.swing.JRadioButton();
        nama = new javax.swing.JTextField();
        absen = new javax.swing.JTextField();
        tkj = new javax.swing.JRadioButton();
        HOBI = new javax.swing.JTextField();
        program = new javax.swing.JCheckBox();
        anim = new javax.swing.JCheckBox();
        teknis = new javax.swing.JCheckBox();
        desain = new javax.swing.JCheckBox();
        Submit = new javax.swing.JButton();
        Hapus = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        HASIL = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        hasil = new javax.swing.JTextArea();

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(null);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 0, 0);

        jLabel1.setText("BIODATA SISWA");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(171, 30, 100, 16);

        NAMA.setText("NAMA ");
        getContentPane().add(NAMA);
        NAMA.setBounds(30, 70, 60, 22);

        ABSEN.setText("ABSEN");
        getContentPane().add(ABSEN);
        ABSEN.setBounds(30, 110, 60, 22);

        JURUSAN.setText("JURUSAN");
        getContentPane().add(JURUSAN);
        JURUSAN.setBounds(30, 150, 60, 22);

        buttonGroup1.add(hmm);
        hmm.setText("RPL");
        hmm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hmmActionPerformed(evt);
            }
        });
        getContentPane().add(hmm);
        hmm.setBounds(140, 150, 60, 25);
        getContentPane().add(nama);
        nama.setBounds(120, 70, 240, 22);
        getContentPane().add(absen);
        absen.setBounds(120, 110, 240, 22);

        buttonGroup1.add(tkj);
        tkj.setText("TKJ");
        getContentPane().add(tkj);
        tkj.setBounds(230, 150, 70, 25);

        HOBI.setText("HOBI");
        getContentPane().add(HOBI);
        HOBI.setBounds(30, 190, 60, 22);

        buttonGroup2.add(program);
        program.setText("PROGAMING");
        getContentPane().add(program);
        program.setBounds(120, 190, 99, 25);

        buttonGroup2.add(anim);
        anim.setText("ANIMATOR");
        getContentPane().add(anim);
        anim.setBounds(120, 220, 91, 25);

        buttonGroup2.add(teknis);
        teknis.setText("TEKNISI");
        getContentPane().add(teknis);
        teknis.setBounds(250, 190, 110, 25);

        buttonGroup2.add(desain);
        desain.setText("DESIGNER");
        getContentPane().add(desain);
        desain.setBounds(250, 220, 100, 25);

        Submit.setText("SUBMIT");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });
        getContentPane().add(Submit);
        Submit.setBounds(40, 250, 77, 25);

        Hapus.setText("HAPUS");
        Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusActionPerformed(evt);
            }
        });
        getContentPane().add(Hapus);
        Hapus.setBounds(160, 250, 90, 25);

        Exit.setText("EXIT");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        getContentPane().add(Exit);
        Exit.setBounds(290, 250, 80, 25);

        HASIL.setText("HASIL");
        getContentPane().add(HASIL);
        HASIL.setBounds(60, 290, 80, 16);

        hasil.setColumns(20);
        hasil.setRows(5);
        jScrollPane2.setViewportView(hasil);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(30, 320, 340, 96);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        // TODO add your handling code here:
        String Nama = nama.getText();
        String Absen = absen.getText();
        String Jurusan;
        String Hobi = "";
        
        if(hmm.isSelected())
            Jurusan = "RPL";
        else if(tkj.isSelected())
            Jurusan = "TKJ";
        else 
            Jurusan = " ";
        
        //check box
        if(program.isSelected())
           Hobi+=program.getText()+" , ";
        if(anim.isSelected())
            Hobi+=anim.getText()+" , ";
        if(teknis.isSelected())
            Hobi+=teknis.getText()+" , ";
        if(desain.isSelected())
            Hobi+=desain.getText()+" , ";
       hasil.setText("Nama Siswa   : "+Nama+"\nAbsen Siswa: "+Absen+"\nJurusan Anda: "+Jurusan+"\nHobi Siswa: "+Hobi);
        
    }//GEN-LAST:event_SubmitActionPerformed

    private void HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusActionPerformed
        hasil.setText("");
        nama.setText("");
        absen.setText("");
       buttonGroup1.clearSelection();
       program.setSelected(false);
       anim.setSelected(false);
       teknis.setSelected(false);
       desain.setSelected(false);
        
    }//GEN-LAST:event_HapusActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_ExitActionPerformed

    private void hmmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hmmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hmmActionPerformed

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
            java.util.logging.Logger.getLogger(BIODATA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BIODATA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BIODATA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BIODATA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BIODATA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ABSEN;
    private javax.swing.JButton Exit;
    private javax.swing.JLabel HASIL;
    private javax.swing.JTextField HOBI;
    private javax.swing.JButton Hapus;
    private javax.swing.JTextField JURUSAN;
    private javax.swing.JTextField NAMA;
    private javax.swing.JButton Submit;
    private javax.swing.JTextField absen;
    private javax.swing.JCheckBox anim;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JCheckBox desain;
    private javax.swing.JTextArea hasil;
    private javax.swing.JRadioButton hmm;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField nama;
    private javax.swing.JCheckBox program;
    private javax.swing.JCheckBox teknis;
    private javax.swing.JRadioButton tkj;
    // End of variables declaration//GEN-END:variables
}
