/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program.toko;

import java.awt.Graphics;
import java.awt.Image;
import java.beans.PropertyVetoException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;

/**
 *
 * @author acer
 */
public class mainframekasir extends javax.swing.JFrame {

    /**
     * Creates new form mainframe
     */
    public mainframekasir() {
        initComponents();
        this.setExtendedState(this.MAXIMIZED_BOTH); 
    }
public JDesktopPane intializeDesktop(JDesktopPane mydesktop,String imagePath,int scalx,int scaly) {

        // A specialized layered pane to be used with JInternalFrames
        mydesktop = new JDesktopPane() {
            ImageIcon icon = new ImageIcon(imagePath);
            Image image = icon.getImage();

            Image newimage = image.getScaledInstance(scalx, scaly, Image.SCALE_SMOOTH);

            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(newimage, 0, 0, this);
            }
        };
        return mydesktop;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        transaksi = new javax.swing.JButton();
        pembelian = new javax.swing.JButton();
        laporan = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dekstop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menutransaksi = new javax.swing.JMenu();
        menupembelian = new javax.swing.JMenu();
        menulaporan = new javax.swing.JMenu();
        menuexit = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        transaksi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tr1.png"))); // NOI18N
        transaksi.setMnemonic('n');
        transaksi.setToolTipText("");
        transaksi.setBorderPainted(false);
        transaksi.setContentAreaFilled(false);
        transaksi.setFocusPainted(false);
        transaksi.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tr2.png"))); // NOI18N
        transaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transaksiActionPerformed(evt);
            }
        });
        jPanel1.add(transaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 140, 70));

        pembelian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/pm1.png"))); // NOI18N
        pembelian.setMnemonic('m');
        pembelian.setBorderPainted(false);
        pembelian.setContentAreaFilled(false);
        pembelian.setFocusPainted(false);
        pembelian.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/pm2.png"))); // NOI18N
        pembelian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pembelianActionPerformed(evt);
            }
        });
        jPanel1.add(pembelian, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 130, 70));

        laporan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/lp1.png"))); // NOI18N
        laporan.setMnemonic('l');
        laporan.setBorderPainted(false);
        laporan.setContentAreaFilled(false);
        laporan.setFocusPainted(false);
        laporan.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/lp2.png"))); // NOI18N
        laporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laporanActionPerformed(evt);
            }
        });
        jPanel1.add(laporan, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 138, 70));

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/exit1.png"))); // NOI18N
        exit.setMnemonic('e');
        exit.setBorderPainted(false);
        exit.setContentAreaFilled(false);
        exit.setFocusPainted(false);
        exit.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/exit2.png"))); // NOI18N
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 150, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/back1.png"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(1024, 600));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/back1.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1020, 510));

        dekstop.setBackground(new java.awt.Color(153, 153, 153));
        dekstop.setLayout(new java.awt.CardLayout());
        getContentPane().add(dekstop, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1030, 510));

        menutransaksi.setText("transaksi");
        menutransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menutransaksiMouseClicked(evt);
            }
        });
        jMenuBar1.add(menutransaksi);

        menupembelian.setText("pembelian");
        menupembelian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menupembelianMouseClicked(evt);
            }
        });
        jMenuBar1.add(menupembelian);

        menulaporan.setText("laporan");
        menulaporan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menulaporanMouseClicked(evt);
            }
        });
        jMenuBar1.add(menulaporan);

        menuexit.setText("exit");
        menuexit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuexitMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuexit);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void transaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transaksiActionPerformed
penjualan av = new penjualan();
        dekstop.removeAll();
        dekstop.add(av);try {
            av.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(mainframekasir.class.getName()).log(Level.SEVERE, null, ex);
        }
        av.setVisible(true);    
    }//GEN-LAST:event_transaksiActionPerformed

    private void pembelianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pembelianActionPerformed
        try {
            tambahbarang av = new tambahbarang();
            dekstop.removeAll();
            dekstop.add(av);av.setMaximum(true);
            av.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(mainframekasir.class.getName()).log(Level.SEVERE, null, ex);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(mainframekasir.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_pembelianActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        login a = new login();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void laporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laporanActionPerformed
          try {
            rekap_penjualan av = new rekap_penjualan();
            dekstop.removeAll();
            dekstop.add(av);av.setMaximum(true);
            av.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(mainframekasir.class.getName()).log(Level.SEVERE, null, ex);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(mainframekasir.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_laporanActionPerformed

    private void menutransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menutransaksiMouseClicked
        penjualan av = new penjualan();
        dekstop.removeAll();
        dekstop.add(av);try {
            av.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(mainframekasir.class.getName()).log(Level.SEVERE, null, ex);
        }
        av.setVisible(true); 
    }//GEN-LAST:event_menutransaksiMouseClicked

    private void menupembelianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menupembelianMouseClicked
               try {
            tambahbarang av = new tambahbarang();
            dekstop.removeAll();
            dekstop.add(av);av.setMaximum(true);
            av.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(mainframekasir.class.getName()).log(Level.SEVERE, null, ex);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(mainframekasir.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menupembelianMouseClicked

    private void menulaporanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menulaporanMouseClicked
                  try {
            rekap_penjualan av = new rekap_penjualan();
            dekstop.removeAll();
            dekstop.add(av);av.setMaximum(true);
            av.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(mainframekasir.class.getName()).log(Level.SEVERE, null, ex);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(mainframekasir.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menulaporanMouseClicked

    private void menuexitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuexitMouseClicked
               login a = new login();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuexitMouseClicked

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
            java.util.logging.Logger.getLogger(mainframekasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainframekasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainframekasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainframekasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainframekasir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dekstop;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton laporan;
    private javax.swing.JMenu menuexit;
    private javax.swing.JMenu menulaporan;
    private javax.swing.JMenu menupembelian;
    private javax.swing.JMenu menutransaksi;
    private javax.swing.JButton pembelian;
    private javax.swing.JButton transaksi;
    // End of variables declaration//GEN-END:variables
}
