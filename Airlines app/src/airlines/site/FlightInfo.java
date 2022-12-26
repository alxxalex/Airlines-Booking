
package airlines.site;

import java.awt.Color;
import javax.swing.ImageIcon;
import messageDialogs.checkDialog;

/* @author radoi alexandru*/
public class FlightInfo extends javax.swing.JDialog {

    public FlightInfo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/images/logo.png")).getImage());
    }
    
    public FlightInfo(java.awt.Frame parent, boolean modal,String location1,String location2) {
        super(parent, modal);
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/images/logo.png")).getImage());
        
        this.getContentPane().setBackground(Color.white);
        lbWhereFrom.setText(location1);
        lbWhereTo.setText(location2);
        lbWhereTo2.setText(location2);
        lbWhereFrom2.setText(location1);
    }

    public void SetTime(String time1, String time2, String time3, String time4){
    lbTime1.setText(time1);
    lbTime2.setText(time2);
    lbTime3.setText(time3);
    lbTime4.setText(time4);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTime1 = new javax.swing.JLabel();
        lbTime2 = new javax.swing.JLabel();
        lbTime3 = new javax.swing.JLabel();
        lbTime4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbWhereFrom = new javax.swing.JLabel();
        lbWhereTo = new javax.swing.JLabel();
        lbWhereTo2 = new javax.swing.JLabel();
        lbWhereFrom2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbSelect = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbTime1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(lbTime1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 70, 20));

        lbTime2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbTime2.setToolTipText("");
        getContentPane().add(lbTime2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 60, 20));

        lbTime3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbTime3.setToolTipText("");
        getContentPane().add(lbTime3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 70, 30));

        lbTime4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(lbTime4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 70, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel1.setText("Flight Informations");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 29, 198, 45));

        lbWhereFrom.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(lbWhereFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 83, 70, 47));

        lbWhereTo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(lbWhereTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 90, 47));

        lbWhereTo2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(lbWhereTo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 70, 48));

        lbWhereFrom2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(lbWhereFrom2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 73, 48));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flightInfo.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 97, 259, 24));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flightInfo.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 144, 259, 22));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("If you want to purchase this ticket please press this ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 204, 358, 31));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("button:");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 241, 171, -1));

        lbSelect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btSelect.png"))); // NOI18N
        lbSelect.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbSelect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbSelectMouseClicked(evt);
            }
        });
        getContentPane().add(lbSelect, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 281, -1, 44));

        setSize(new java.awt.Dimension(439, 389));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbSelectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSelectMouseClicked
        checkDialog checkDialog = new checkDialog(null, true, "Thank you for you purchase!");
        checkDialog.setVisible(true);
    }//GEN-LAST:event_lbSelectMouseClicked

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
            java.util.logging.Logger.getLogger(FlightInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FlightInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FlightInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FlightInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FlightInfo dialog = new FlightInfo(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lbSelect;
    private javax.swing.JLabel lbTime1;
    private javax.swing.JLabel lbTime2;
    private javax.swing.JLabel lbTime3;
    private javax.swing.JLabel lbTime4;
    private javax.swing.JLabel lbWhereFrom;
    private javax.swing.JLabel lbWhereFrom2;
    private javax.swing.JLabel lbWhereTo;
    private javax.swing.JLabel lbWhereTo2;
    // End of variables declaration//GEN-END:variables
}
