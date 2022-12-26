package airlines.site;

import java.awt.Color;
import javax.swing.ImageIcon;

/* @author radoi alexandru*/
public class HowManyPersons extends javax.swing.JDialog {
    
    private int adults = 1, children = 0, infants = 0;
    
    public HowManyPersons(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/images/logo.png")).getImage());
        this.setLocation(285,405);
        this.getContentPane().setBackground(Color.white);
        lbAdults.setText(String.valueOf(adults));
        lbChildren.setText(String.valueOf(children));
        lbInfants.setText(String.valueOf(infants));
        this.setTitle("How many persons?");
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jbPlusAdults = new javax.swing.JButton();
        jbMinusAdults = new javax.swing.JButton();
        lbAdults = new javax.swing.JLabel();
        lbChildren = new javax.swing.JLabel();
        btMinusChildren = new javax.swing.JButton();
        btPlusChildren = new javax.swing.JButton();
        lbInfants = new javax.swing.JLabel();
        btMinusInfants = new javax.swing.JButton();
        btPlusInfants = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Adults(12+) :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 120, 36));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Children(2-11) :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 65, 110, 35));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Infants(<2) :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 140, 43));

        jbPlusAdults.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus1.png"))); // NOI18N
        jbPlusAdults.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbPlusAdultsMouseClicked(evt);
            }
        });
        getContentPane().add(jbPlusAdults, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 30, 30));

        jbMinusAdults.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/minus1.png"))); // NOI18N
        jbMinusAdults.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbMinusAdultsMouseClicked(evt);
            }
        });
        getContentPane().add(jbMinusAdults, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 31, 30));
        getContentPane().add(lbAdults, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 22, 27));
        getContentPane().add(lbChildren, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 22, 35));

        btMinusChildren.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/minus1.png"))); // NOI18N
        btMinusChildren.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMinusChildrenActionPerformed(evt);
            }
        });
        getContentPane().add(btMinusChildren, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 30, 30));

        btPlusChildren.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus1.png"))); // NOI18N
        btPlusChildren.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPlusChildrenActionPerformed(evt);
            }
        });
        getContentPane().add(btPlusChildren, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 30, 30));
        getContentPane().add(lbInfants, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 22, 31));

        btMinusInfants.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/minus1.png"))); // NOI18N
        btMinusInfants.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMinusInfantsActionPerformed(evt);
            }
        });
        getContentPane().add(btMinusInfants, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 30, 30));

        btPlusInfants.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plus1.png"))); // NOI18N
        btPlusInfants.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPlusInfantsActionPerformed(evt);
            }
        });
        getContentPane().add(btPlusInfants, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 28, 30));

        jButton1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 120, 30));

        setSize(new java.awt.Dimension(266, 255));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbPlusAdultsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbPlusAdultsMouseClicked
        adults++;
        lbAdults.setText(String.valueOf(adults));
    }//GEN-LAST:event_jbPlusAdultsMouseClicked

    private void btMinusChildrenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMinusChildrenActionPerformed
        if (children != 0) {
            children--;
            lbChildren.setText(String.valueOf(children));
        }
    }//GEN-LAST:event_btMinusChildrenActionPerformed

    private void jbMinusAdultsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbMinusAdultsMouseClicked
        if (adults != 1) {
            adults--;
            lbAdults.setText(String.valueOf(adults));
        }
    }//GEN-LAST:event_jbMinusAdultsMouseClicked

    private void btPlusChildrenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPlusChildrenActionPerformed
        children++;
        lbChildren.setText(String.valueOf(children));
    }//GEN-LAST:event_btPlusChildrenActionPerformed

    private void btMinusInfantsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMinusInfantsActionPerformed
        if (infants != 0) {
            infants--;
            lbInfants.setText(String.valueOf(infants));
        }
    }//GEN-LAST:event_btMinusInfantsActionPerformed

    private void btPlusInfantsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPlusInfantsActionPerformed
        infants++;
        lbInfants.setText(String.valueOf(infants));
    }//GEN-LAST:event_btPlusInfantsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    public int getAdults() {
        return adults;
    }
    
    public int getChildren() {
        return children;
    }
    
    public int getInfants() {
        return infants;
    }

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
            java.util.logging.Logger.getLogger(HowManyPersons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HowManyPersons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HowManyPersons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HowManyPersons.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                HowManyPersons dialog = new HowManyPersons(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btMinusChildren;
    private javax.swing.JButton btMinusInfants;
    private javax.swing.JButton btPlusChildren;
    private javax.swing.JButton btPlusInfants;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jbMinusAdults;
    private javax.swing.JButton jbPlusAdults;
    private javax.swing.JLabel lbAdults;
    private javax.swing.JLabel lbChildren;
    private javax.swing.JLabel lbInfants;
    // End of variables declaration//GEN-END:variables
}
