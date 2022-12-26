package airlines.site;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.io.File;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import messageDialogs.ErrorDialog;

/* @author radoi alexandru*/
public class Apartments extends javax.swing.JFrame {

    private File dirApartments = new File("Images/Apartments");
    private File[] apartments = dirApartments.listFiles();
    private int nr = (int) (Math.random() * apartments.length);
    private int price;
    private Setter setter = new Setter();
    private Calendar calendar = new Calendar(this, true);

    public Apartments() {
        initComponents();
    }

    public Apartments(String Location1, String Date1, String Date2) {
        initComponents();
        this.getContentPane().setBackground(Color.white);
        this.setIconImage(new ImageIcon(getClass().getResource("/images/logo.png")).getImage());

        resize("/images/left.png", lbBack);
        resize("/images/right.png", lbNext);
        tfLocation1.setText(Location1);
        tfDate1.setText(Date1);
        tfDate2.setText(Date2);
        String name = apartments[nr].getName();
        lbApartmentName.setText(tfLocation1.getText() + " - " + name.substring(0, name.length() - 4));
        lbApartment.setIcon(new ImageIcon(apartments[nr].getAbsolutePath()));
        price = 150 + (int) (Math.random() * 150);
        lbApartmentPrice.setText("$" + price);

        setter.setLocations();
        jlLocation1.setModel(setter.getModel());
        jScrollPane1.setVisible(false);
        calendar.setLocation(600, 180);
    }

    private void resize(String picturePath, JLabel label) {
        ImageIcon imgIcon = new ImageIcon(getClass().getResource(picturePath));
        Image image = imgIcon.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        imgIcon = new ImageIcon(image);
        label.setIcon(imgIcon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jlLocation1 = new javax.swing.JList<>();
        topPanel = new javax.swing.JPanel();
        lbLogo = new javax.swing.JLabel();
        lbChangeAccount = new javax.swing.JLabel();
        changePanel = new javax.swing.JPanel();
        tfLocation1 = new javax.swing.JTextField();
        tfDate1 = new javax.swing.JTextField();
        tfDate2 = new javax.swing.JTextField();
        lbChange = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbChangeSearch = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbInfoEmoji = new javax.swing.JLabel();
        lbInfoText = new javax.swing.JLabel();
        lbText2 = new javax.swing.JLabel();
        lbText3 = new javax.swing.JLabel();
        lbText4 = new javax.swing.JLabel();
        lbInfo = new javax.swing.JLabel();
        ApartmentPanel = new javax.swing.JPanel();
        lbApartmentName = new javax.swing.JLabel();
        lbApartmentPrice = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbApartment = new javax.swing.JLabel();
        lbNext = new javax.swing.JLabel();
        lbBack = new javax.swing.JLabel();
        lbBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlLocation1.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jlLocation1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlLocation1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jlLocation1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 160, 50));

        topPanel.setBackground(new java.awt.Color(255, 255, 255));

        lbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        lbLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbLogoMouseClicked(evt);
            }
        });

        lbChangeAccount.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbChangeAccount.setForeground(new java.awt.Color(0, 0, 153));
        lbChangeAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/account1.png"))); // NOI18N
        lbChangeAccount.setText("Change Account");
        lbChangeAccount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbChangeAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbChangeAccountMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbChangeAccountMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbChangeAccountMouseExited(evt);
            }
        });

        changePanel.setBackground(new java.awt.Color(0, 0, 153));
        changePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfLocation1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfLocation1.setOpaque(true);
        tfLocation1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfLocation1MouseClicked(evt);
            }
        });
        tfLocation1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfLocation1KeyReleased(evt);
            }
        });
        changePanel.add(tfLocation1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 35, 160, 35));

        tfDate1.setEditable(false);
        tfDate1.setBackground(new java.awt.Color(255, 255, 255));
        tfDate1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfDate1.setOpaque(true);
        tfDate1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfDate1MouseClicked(evt);
            }
        });
        changePanel.add(tfDate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 35, 170, 35));

        tfDate2.setEditable(false);
        tfDate2.setBackground(new java.awt.Color(255, 255, 255));
        tfDate2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tfDate2.setOpaque(true);
        tfDate2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfDate2MouseClicked(evt);
            }
        });
        changePanel.add(tfDate2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 35, 150, 35));

        lbChange.setBackground(new java.awt.Color(255, 255, 255));
        lbChange.setOpaque(true);
        changePanel.add(lbChange, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 596, 48));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/whiteCircle1.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        changePanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 50, 48));

        lbChangeSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tbSearch.png"))); // NOI18N
        lbChangeSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbChangeSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbChangeSearchMouseClicked(evt);
            }
        });
        changePanel.add(lbChangeSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 30, 230, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/whiteCircle1.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        changePanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 30, 70, 48));

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbChangeAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addComponent(changePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1050, Short.MAX_VALUE)
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(topPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbChangeAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(3, 3, 3))
                    .addGroup(topPanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lbLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)))
                .addComponent(changePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(topPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, -1));

        lbInfoEmoji.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/waveEmoji1.png"))); // NOI18N
        getContentPane().add(lbInfoEmoji, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 90, 60));

        lbInfoText.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lbInfoText.setForeground(new java.awt.Color(255, 255, 255));
        lbInfoText.setText("You should hurry up! ");
        getContentPane().add(lbInfoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 200, 30));

        lbText2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbText2.setForeground(new java.awt.Color(255, 255, 255));
        lbText2.setText("Many people searched this ");
        getContentPane().add(lbText2, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 380, 230, -1));

        lbText3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbText3.setForeground(new java.awt.Color(255, 255, 255));
        lbText3.setText("location and the prices will ");
        getContentPane().add(lbText3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));

        lbText4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbText4.setForeground(new java.awt.Color(255, 255, 255));
        lbText4.setText("change soon.");
        lbText4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lbText4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, 120, 40));

        lbInfo.setBackground(new java.awt.Color(0,0,0,80)
        );
        lbInfo.setOpaque(true);
        getContentPane().add(lbInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 236, 303));

        ApartmentPanel.setBackground(new java.awt.Color(255, 255, 255));
        ApartmentPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbApartmentName.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbApartmentName.setForeground(new java.awt.Color(255, 255, 255));
        ApartmentPanel.add(lbApartmentName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 260, 30));

        lbApartmentPrice.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        ApartmentPanel.add(lbApartmentPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, 130, 30));

        jLabel3.setBackground(new java.awt.Color(0, 0, 153));
        jLabel3.setOpaque(true);
        ApartmentPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 44));
        ApartmentPanel.add(lbApartment, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 541, 236));

        lbNext.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbNext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbNextMouseClicked(evt);
            }
        });
        ApartmentPanel.add(lbNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 133, 49, 47));

        lbBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbBackMouseClicked(evt);
            }
        });
        ApartmentPanel.add(lbBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 131, 54, 47));

        getContentPane().add(ApartmentPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 670, 310));

        lbBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/skybg.jpg"))); // NOI18N
        getContentPane().add(lbBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 760));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbChangeAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbChangeAccountMouseClicked
        LogIn dlgLogIn = new LogIn(this, true);
        dlgLogIn.setVisible(true);
    }//GEN-LAST:event_lbChangeAccountMouseClicked

    private void lbChangeAccountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbChangeAccountMouseEntered
        lbChangeAccount.setFont(new Font("Stika Small", Font.PLAIN, 15));
    }//GEN-LAST:event_lbChangeAccountMouseEntered

    private void lbChangeAccountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbChangeAccountMouseExited
        lbChangeAccount.setFont(new Font("Stika Small", Font.PLAIN, 14));
        lbChangeAccount.setForeground(new Color(0, 0, 153));
    }//GEN-LAST:event_lbChangeAccountMouseExited

    private void lbLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbLogoMouseClicked
        airlinesGUI airlines = new airlinesGUI();
        airlines.setLogIn(true);
        airlines.setVisible(true);
    }//GEN-LAST:event_lbLogoMouseClicked

    private void lbNextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbNextMouseClicked
        nextApartment();
    }//GEN-LAST:event_lbNextMouseClicked

    private void lbBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbBackMouseClicked
        nr--;
        if (nr < 0) {
            nr = apartments.length - 1;
        }
        String name = apartments[nr].getName();
        lbApartmentName.setText(tfLocation1.getText() + " - " + name.substring(0, name.length() - 4));
        lbApartment.setIcon(new ImageIcon(apartments[nr].getAbsolutePath()));
        price = 150 + (int) (Math.random() * 150);
        lbApartmentPrice.setText("$" + price);
    }//GEN-LAST:event_lbBackMouseClicked


    private void lbChangeSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbChangeSearchMouseClicked
        if (jScrollPane1.isVisible()) {
            ErrorDialog errorDialog = new ErrorDialog(this, true, "You didn't select a city");
            errorDialog.setVisible(true);
        } else if (tfDate1.getText().isBlank() || tfDate2.getText().isBlank() || !areDatesValid(tfDate1.getText(), tfDate2.getText())) {
            ErrorDialog errorDIalog = new ErrorDialog(this, true, "The dates are not valid");
            errorDIalog.setVisible(true);
        } else if (tfLocation1.getText().isBlank() || tfDate1.getText().isBlank() || tfDate2.getText().isBlank()) {
            ErrorDialog error = new ErrorDialog(this, true, "Some fields are empty");
            error.setVisible(true);
        } else {
//            Loading
            Thread loading = new Thread(loadingTask);
            loading.start();

            String name = apartments[nr].getName();
            lbApartmentName.setText(tfLocation1.getText() + "-" + name.substring(0, name.length() - 4));
        }
    }//GEN-LAST:event_lbChangeSearchMouseClicked

    private void tfLocation1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfLocation1MouseClicked
        tfLocation1.setText("");
        jScrollPane1.setVisible(true);
    }//GEN-LAST:event_tfLocation1MouseClicked

    private void tfLocation1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfLocation1KeyReleased
        setter.filterList(tfLocation1.getText());
        jlLocation1.setModel(setter.getModel());
    }//GEN-LAST:event_tfLocation1KeyReleased

    private void jlLocation1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlLocation1MouseClicked
        tfLocation1.setText(jlLocation1.getSelectedValue());
        jScrollPane1.setVisible(false);
    }//GEN-LAST:event_jlLocation1MouseClicked

    private void tfDate1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfDate1MouseClicked
        calendar.setVisible(true);
        tfDate1.setText(calendar.getDate());
    }//GEN-LAST:event_tfDate1MouseClicked

    private void tfDate2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfDate2MouseClicked
        calendar.setVisible(true);
        tfDate2.setText(calendar.getDate());
    }//GEN-LAST:event_tfDate2MouseClicked

    private void nextApartment() {
        nr++;
        if (nr == apartments.length) {
            nr = 0;
        }
        String name = apartments[nr].getName();
        lbApartmentName.setText(tfLocation1.getText() + " - " + name.substring(0, name.length() - 4));
        lbApartment.setIcon(new ImageIcon(apartments[nr].getAbsolutePath()));
        price = 150 + (int) (Math.random() * 150);
        lbApartmentPrice.setText("$" + price);

    }

//    Loading
    Runnable loadingTask = new Runnable() {
        @Override
        public void run() {
            lbApartment.setIcon(new ImageIcon(getClass().getResource("/images/loading-sign.gif")));
            lbApartmentPrice.setVisible(false);
            lbApartmentName.setVisible(false);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Flight.class.getName()).log(Level.SEVERE, null, ex);
            }
            lbApartmentPrice.setVisible(true);
            lbApartmentName.setVisible(true);
            nextApartment();
        }
    };

    private boolean areDatesValid(String date1, String date2) {
        String[] elem1 = date1.split("-");
        String[] elem2 = date2.split("-");
        if (elem1.length == 0 || elem2.length == 0) {
            return false;
        }
        LocalDate GUIDate1 = LocalDate.of(Integer.parseInt(elem1[2]), Integer.parseInt(elem1[1]), Integer.parseInt(elem1[0]));
        LocalDate GUIDate2 = LocalDate.of(Integer.parseInt(elem2[2]), Integer.parseInt(elem2[1]), Integer.parseInt(elem2[0]));
        LocalDate currentDate = LocalDate.now();
        if (GUIDate1.isBefore(GUIDate2)) {
            if (GUIDate1.isAfter(currentDate) || GUIDate1.isEqual(currentDate)) {
                return true;
            }
        } else if (GUIDate1.isEqual(GUIDate2)) {
            if (GUIDate1.isAfter(currentDate) || GUIDate1.isEqual(currentDate)) {
                return true;
            }
        }
        return false;
    }

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
            java.util.logging.Logger.getLogger(Apartments.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Apartments.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Apartments.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Apartments.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Apartments().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ApartmentPanel;
    private javax.swing.JPanel changePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> jlLocation1;
    private javax.swing.JLabel lbApartment;
    private javax.swing.JLabel lbApartmentName;
    private javax.swing.JLabel lbApartmentPrice;
    private javax.swing.JLabel lbBack;
    private javax.swing.JLabel lbBackground;
    private javax.swing.JLabel lbChange;
    private javax.swing.JLabel lbChangeAccount;
    private javax.swing.JLabel lbChangeSearch;
    private javax.swing.JLabel lbInfo;
    private javax.swing.JLabel lbInfoEmoji;
    private javax.swing.JLabel lbInfoText;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JLabel lbNext;
    private javax.swing.JLabel lbText2;
    private javax.swing.JLabel lbText3;
    private javax.swing.JLabel lbText4;
    private javax.swing.JTextField tfDate1;
    private javax.swing.JTextField tfDate2;
    private javax.swing.JTextField tfLocation1;
    private javax.swing.JPanel topPanel;
    // End of variables declaration//GEN-END:variables
}
