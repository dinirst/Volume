
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Smktelkom
 */
public class Bola extends javax.swing.JFrame {

    /**
     * Creates new form Bola
     */
    public Bola() {
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
        tp = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tfTBalok = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfPBalok = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfLBalok = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        bHitung = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        tfSisi = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        bVolK = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        bVolB = new javax.swing.JButton();
        tfJari = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Volume Bangun Ruang");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 20, 220, 40);

        jPanel1.setLayout(null);

        jLabel2.setText("cm");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(250, 140, 100, 30);
        jPanel1.add(tfTBalok);
        tfTBalok.setBounds(170, 140, 70, 30);

        jLabel3.setText("Masukkan Tinggi     :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 140, 190, 30);

        jLabel4.setText("Masukkan Panjang :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 40, 180, 30);
        jPanel1.add(tfPBalok);
        tfPBalok.setBounds(170, 40, 70, 30);

        jLabel5.setText("cm");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(250, 40, 100, 30);

        jLabel6.setText("Masukkan Lebar     :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(40, 90, 190, 30);

        tfLBalok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfLBalokActionPerformed(evt);
            }
        });
        jPanel1.add(tfLBalok);
        tfLBalok.setBounds(170, 90, 70, 30);

        jLabel7.setText("cm");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(250, 90, 100, 30);

        bHitung.setText("Hitung");
        bHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHitungActionPerformed(evt);
            }
        });
        jPanel1.add(bHitung);
        bHitung.setBounds(300, 140, 90, 30);

        tp.addTab("Balok", jPanel1);

        jPanel2.setLayout(null);

        jLabel8.setText("Masukkan Panjang Sisi :");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(40, 40, 160, 30);
        jPanel2.add(tfSisi);
        tfSisi.setBounds(40, 80, 90, 30);

        jLabel9.setText("cm");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(140, 80, 100, 30);

        bVolK.setText("Volume");
        bVolK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVolKActionPerformed(evt);
            }
        });
        jPanel2.add(bVolK);
        bVolK.setBounds(40, 120, 90, 30);

        tp.addTab("Kubus", jPanel2);

        jPanel3.setLayout(null);

        bVolB.setText("Volume");
        bVolB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVolBActionPerformed(evt);
            }
        });
        jPanel3.add(bVolB);
        bVolB.setBounds(40, 120, 90, 30);
        jPanel3.add(tfJari);
        tfJari.setBounds(40, 80, 90, 30);

        jLabel10.setText("cm");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(140, 80, 100, 30);

        jLabel11.setText("Masukkan Panjang Jari-jari :");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(40, 40, 200, 30);

        tp.addTab("Bola", jPanel3);

        getContentPane().add(tp);
        tp.setBounds(0, 70, 470, 310);

        setBounds(0, 0, 479, 396);
    }// </editor-fold>//GEN-END:initComponents

    private void tfLBalokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfLBalokActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfLBalokActionPerformed

    private void bHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHitungActionPerformed
        int panjang, lebar, tinggi;
        panjang = Integer.parseInt(tfPBalok.getText());
        lebar = Integer.parseInt(tfLBalok.getText());
        tinggi = Integer.parseInt(tfTBalok.getText());
        int hasil = panjang*lebar*tinggi;
        try {
            JOptionPane.showMessageDialog(null, "Volume Balok adalah : "+hasil,"luas",
                JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error:"+e,"Gagal",
                JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_bHitungActionPerformed

    private void bVolKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVolKActionPerformed
        int sisi;
        sisi=Integer.parseInt(tfSisi.getText());
        int hasil = sisi*sisi*sisi;

        try {
            JOptionPane.showMessageDialog(null, "Luas Permukaan Kubus adalah = "
                +hasil,"luas",JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error:"+e,"Gagal",
                JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_bVolKActionPerformed

    private void bVolBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVolBActionPerformed
        float jari;
        jari = Integer.parseInt(tfJari.getText());
        float hasil1 =(float) (4/3*3.14*jari*jari*jari);
        try {
            JOptionPane.showMessageDialog(null, "Luas Permukaan Bola adalah = "
                +hasil1,"luas", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error:"+e,"Gagal",
                JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_bVolBActionPerformed

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
            java.util.logging.Logger.getLogger(Bola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bola().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bHitung;
    private javax.swing.JButton bVolB;
    private javax.swing.JButton bVolK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField tfJari;
    private javax.swing.JTextField tfLBalok;
    private javax.swing.JTextField tfPBalok;
    private javax.swing.JTextField tfSisi;
    private javax.swing.JTextField tfTBalok;
    private javax.swing.JTabbedPane tp;
    // End of variables declaration//GEN-END:variables
}
