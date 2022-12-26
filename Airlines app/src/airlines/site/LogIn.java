package airlines.site;

import java.awt.Color;
import javax.swing.ImageIcon;
import messageDialogs.ErrorDialog;

/* @author radoi alexandru*/
public class LogIn extends javax.swing.JDialog {
    
    boolean login = false;
    
    public LogIn(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/images/logo.png")).getImage());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btLogIn = new javax.swing.JButton();
        tfUsername = new javax.swing.JTextField();
        pfPassword = new javax.swing.JPasswordField();
        lbNoAccount = new javax.swing.JLabel();
        lbBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0,80));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Username:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Password:");
        jLabel3.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Registration");

        btLogIn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btLogIn.setText("Log In");
        btLogIn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btLogIn.setBorderPainted(false);
        btLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLogInActionPerformed(evt);
            }
        });

        tfUsername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tfUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                                .addComponent(pfPassword)))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfUsername)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(pfPassword))
                .addGap(18, 18, 18)
                .addComponent(btLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 440, 320));

        lbNoAccount.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbNoAccount.setText("Don't have an account?");
        lbNoAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbNoAccountMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbNoAccountMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbNoAccountMouseExited(evt);
            }
        });
        getContentPane().add(lbNoAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 430, 170, 40));

        lbBackground.setBackground(new java.awt.Color(255, 255, 255));
        lbBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/skybg.jpg"))); // NOI18N
        lbBackground.setOpaque(true);
        getContentPane().add(lbBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 580));

        setSize(new java.awt.Dimension(848, 580));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbNoAccountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbNoAccountMouseEntered
        lbNoAccount.setForeground(Color.red);
    }//GEN-LAST:event_lbNoAccountMouseEntered

    private void lbNoAccountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbNoAccountMouseExited
        lbNoAccount.setForeground(Color.black);
    }//GEN-LAST:event_lbNoAccountMouseExited

    private void lbNoAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbNoAccountMouseClicked
        SignUp dlgSignUp = new SignUp(null, true);
        dlgSignUp.setVisible(true);
    }//GEN-LAST:event_lbNoAccountMouseClicked

    private void btLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLogInActionPerformed
        String username = tfUsername.getText();
        String password = String.valueOf(pfPassword.getPassword());
        SignUp dlgSignUp = new SignUp(null, true);
        if (dlgSignUp.getAccounts().isEmpty()) {
            ErrorDialog error = new ErrorDialog(null, true, "You don't have an account");
            error.setVisible(true);
        } else {
            for (Account a : dlgSignUp.getAccounts()) {
                if (a.username.equals(username) && a.password.equals(password)) {
                    login = true;
                    dispose();
                    break;
                } else if (!a.username.equals(username) && a.password.equals(password)) {
                    ErrorDialog error = new ErrorDialog(null, true, "Incorrect username");
                    error.setVisible(true);
                    break;
                } else if (!a.password.equals(password) && a.username.equals(username)) {
                    ErrorDialog error = new ErrorDialog(null, true, "Incorrect password");
                    error.setVisible(true);
                    break;
                }
            }
            
        }
    }//GEN-LAST:event_btLogInActionPerformed
    
    public boolean isLogin() {
        return login;
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
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LogIn dialog = new LogIn(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btLogIn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbBackground;
    private javax.swing.JLabel lbNoAccount;
    private javax.swing.JPasswordField pfPassword;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables
}
