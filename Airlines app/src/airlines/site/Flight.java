package airlines.site;

import messageDialogs.Help;
import messageDialogs.Notification;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import messageDialogs.ErrorDialog;

/* @author radoi alexandru*/
public class Flight extends javax.swing.JFrame {

    static String whereFrom, whereTo, DateOff, DateBack, type;
    private final File dirBest = new File("Images/bestFlights");
    private final File dirCheap = new File("Images/cheapestFlights");
    private final File dirFast = new File("Images/fastestFlights");
    private File[] bestFlights = dirBest.listFiles();
    private File[] cheapestFlights = dirCheap.listFiles();
    private File[] fastestFlights = dirFast.listFiles();
    private int nr = (int) (Math.random() * 3);
    private Setter setter = new Setter();
    private Calendar calendar = new Calendar(this, true);

    public Flight() {
        initComponents();
    }

    public Flight(String WhereFrom, String WhereTo, String WhenOff, String WhenBack, String type, boolean onlyDirect) {
        initComponents();

        center();
        this.setIconImage(new ImageIcon(getClass().getResource("/images/logo.png")).getImage());
        if (type.equals("One way")) {
            tfWhenBack.setVisible(false);
        }
        whereFrom = WhereFrom;
        whereTo = WhereTo;
        DateOff = WhenOff;
        DateBack = WhenBack;
        this.type = type;
        if(onlyDirect){
            nr = 1;
        }
        setFlightInfo();
        setPrice();

        //Setting locations
        setter.setLocations();
        jlWhereFrom.setModel(setter.getModel());
        jlWhereTo.setModel(setter.getModel());
        jScrollPane1.setVisible(false);
        jScrollPane2.setVisible(false);

        //Setting calendar
        calendar.setLocation(600, 150);
        calendar.setSize(calendar.getWidth() - 20, calendar.getHeight() - 50);

        if (type.equals("Return")) {
            lbFlight.setIcon(new ImageIcon(bestFlights[nr].getAbsolutePath()));
        } else {
            resize("/images/1.jpg", lbFlight);
        }
    }

    private void setPrice() {
        if (type.equals("Return")) {
            if (nr == 0) {
                lbBestPrice.setText("7h53' - $382");
                lbCheapestPrice.setText("16h50' - $267");
                lbFastestPrice.setText("7h53' - $399");
            } else if (nr == 1) {
                lbBestPrice.setText("1h10' - $295");
                lbCheapestPrice.setText("3h00' - $23");
                lbFastestPrice.setText("1h10' - $254");
            } else {
                lbBestPrice.setText("1h10' - $254");
                lbCheapestPrice.setText("5h50' - $245");
                lbFastestPrice.setText("1h10' - $295");
            }
        } else {
            lbBestPrice.setText("4h05' - $180");
            lbCheapestPrice.setText("1h30' - $79");
            lbFastestPrice.setText("1h30' - $115");
        }
    }

    private void setFlightInfo() {
        if (type.equals("Return")) {
            tfWhereFrom.setText(whereFrom);
            tfWhereTo.setText(whereTo);
            tfWhenOff.setText(DateOff);
            tfWhenBack.setText(DateBack);
            lbDeparture1.setText(whereFrom);
            lbDeparture2.setText(whereTo);
            lbReturn1.setText(whereTo);
            lbReturn2.setText(whereFrom);
        } else {
            tfWhereFrom.setText(whereFrom);
            tfWhereTo.setText(whereTo);
            tfWhenOff.setText(DateOff);
            lbReturn1.setFont(new Font("Stika Small", Font.PLAIN, 18));
            lbReturn1.setText(whereFrom);
            lbReturn2.setFont(new Font("Stika Small", Font.PLAIN, 18));
            lbReturn2.setText(whereTo);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jlWhereFrom = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jlWhereTo = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        lbLogo = new javax.swing.JLabel();
        lbHelp = new javax.swing.JLabel();
        lbQuestionMark = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbAccount = new javax.swing.JLabel();
        lbChangeAccount = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        tfWhereFrom = new javax.swing.JTextField();
        tfWhereTo = new javax.swing.JTextField();
        tfWhenOff = new javax.swing.JTextField();
        tfWhenBack = new javax.swing.JTextField();
        lbSearch = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btSearch = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btNotification = new javax.swing.JLabel();
        lnNotification = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lbBest = new javax.swing.JLabel();
        lbBestPrice = new javax.swing.JLabel();
        lb1 = new javax.swing.JLabel();
        lbCheapest = new javax.swing.JLabel();
        lbCheapestPrice = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        lbFastest = new javax.swing.JLabel();
        lbFastestPrice = new javax.swing.JLabel();
        lb3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Flight = new javax.swing.JPanel();
        lbDeparture1 = new javax.swing.JLabel();
        lbDeparture2 = new javax.swing.JLabel();
        lbReturn1 = new javax.swing.JLabel();
        lbReturn2 = new javax.swing.JLabel();
        lbSelect = new javax.swing.JLabel();
        lbFlight = new javax.swing.JLabel();
        lbReclama = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(0, 0, 1050, 703));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlWhereFrom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlWhereFromMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jlWhereFrom);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 180, 50));

        jlWhereTo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlWhereToMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jlWhereTo);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 180, 50));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        lbLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbLogoMouseClicked(evt);
            }
        });
        jPanel1.add(lbLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 90, 30));

        lbHelp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbHelp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbHelpMouseClicked(evt);
            }
        });
        jPanel1.add(lbHelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 10, 100, 40));

        lbQuestionMark.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/questionMark.png"))); // NOI18N
        jPanel1.add(lbQuestionMark, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, 40, 50));

        jLabel1.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Help?");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 20, -1, 23));

        lbAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/account1.png"))); // NOI18N
        lbAccount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbAccountMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbAccountMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbAccountMouseExited(evt);
            }
        });
        jPanel1.add(lbAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, 140, 30));

        lbChangeAccount.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        lbChangeAccount.setForeground(new java.awt.Color(0, 0, 153));
        lbChangeAccount.setText("Change account");
        jPanel1.add(lbChangeAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 20, 110, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 50));

        jPanel2.setBackground(new java.awt.Color(0, 0, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfWhereFrom.setFont(new java.awt.Font("Sitka Small", 0, 16)); // NOI18N
        tfWhereFrom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tfWhereFrom.setOpaque(true);
        tfWhereFrom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfWhereFromMouseClicked(evt);
            }
        });
        tfWhereFrom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfWhereFromKeyReleased(evt);
            }
        });
        jPanel2.add(tfWhereFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 32, 176, 35));

        tfWhereTo.setFont(new java.awt.Font("Sitka Small", 0, 16)); // NOI18N
        tfWhereTo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tfWhereTo.setOpaque(true);
        tfWhereTo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfWhereToMouseClicked(evt);
            }
        });
        tfWhereTo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfWhereToKeyReleased(evt);
            }
        });
        jPanel2.add(tfWhereTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 32, 180, 35));

        tfWhenOff.setEditable(false);
        tfWhenOff.setBackground(new java.awt.Color(255, 255, 255));
        tfWhenOff.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfWhenOff.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tfWhenOff.setOpaque(true);
        tfWhenOff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfWhenOffMouseClicked(evt);
            }
        });
        jPanel2.add(tfWhenOff, new org.netbeans.lib.awtextra.AbsoluteConstraints(473, 31, 110, 36));

        tfWhenBack.setEditable(false);
        tfWhenBack.setBackground(new java.awt.Color(255, 255, 255));
        tfWhenBack.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfWhenBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tfWhenBack.setOpaque(true);
        tfWhenBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfWhenBackMouseClicked(evt);
            }
        });
        jPanel2.add(tfWhenBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(588, 30, 110, 36));

        lbSearch.setBackground(new java.awt.Color(255, 255, 255));
        lbSearch.setOpaque(true);
        jPanel2.add(lbSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 600, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/whiteCircle1.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 40, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/whiteCircle1.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 30, 60, 40));

        btSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tbSearch.png"))); // NOI18N
        btSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btSearchMouseClicked(evt);
            }
        });
        jPanel2.add(btSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 30, 230, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1060, 100));

        jLabel7.setFont(new java.awt.Font("Sitka Small", 0, 18)); // NOI18N
        jLabel7.setText("Don't miss any change");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 250, 50));

        btNotification.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btNotification.png"))); // NOI18N
        btNotification.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btNotification.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btNotificationMouseClicked(evt);
            }
        });
        getContentPane().add(btNotification, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 250, 50));

        lnNotification.setBackground(new java.awt.Color(255, 255, 255));
        lnNotification.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lnNotification.setOpaque(true);
        getContentPane().add(lnNotification, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 260, 140));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbBest.setFont(new java.awt.Font("Sitka Small", 0, 18)); // NOI18N
        lbBest.setForeground(new java.awt.Color(102, 102, 102));
        lbBest.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbBest.setText("Best");
        lbBest.setToolTipText("");
        lbBest.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lbBest.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbBest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbBestMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbBestMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbBestMouseExited(evt);
            }
        });
        jPanel4.add(lbBest, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 230, 80));

        lbBestPrice.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        lbBestPrice.setForeground(new java.awt.Color(102, 102, 102));
        lbBestPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbBestPrice.setToolTipText("");
        jPanel4.add(lbBestPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 39, 180, 30));
        jPanel4.add(lb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 210, 10));

        lbCheapest.setFont(new java.awt.Font("Sitka Small", 0, 18)); // NOI18N
        lbCheapest.setForeground(new java.awt.Color(102, 102, 102));
        lbCheapest.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCheapest.setText("Cheapest");
        lbCheapest.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lbCheapest.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbCheapest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbCheapestMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbCheapestMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbCheapestMouseExited(evt);
            }
        });
        jPanel4.add(lbCheapest, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 250, 80));

        lbCheapestPrice.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        lbCheapestPrice.setForeground(new java.awt.Color(102, 102, 102));
        lbCheapestPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(lbCheapestPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 150, 30));
        jPanel4.add(lb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 220, 10));

        lbFastest.setFont(new java.awt.Font("Sitka Small", 0, 18)); // NOI18N
        lbFastest.setForeground(new java.awt.Color(102, 102, 102));
        lbFastest.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbFastest.setText("Fastest");
        lbFastest.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lbFastest.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbFastest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbFastestMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbFastestMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbFastestMouseExited(evt);
            }
        });
        jPanel4.add(lbFastest, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 220, 80));

        lbFastestPrice.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        lbFastestPrice.setForeground(new java.awt.Color(102, 102, 102));
        lbFastestPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(lbFastestPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, 160, 30));
        jPanel4.add(lb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, 200, 10));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 720, 80));

        jLabel6.setBackground(new java.awt.Color(0, 0, 153));
        jLabel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 720, 30));

        Flight.setBackground(new java.awt.Color(255, 255, 255));
        Flight.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbDeparture1.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        lbDeparture1.setForeground(new java.awt.Color(102, 102, 102));
        Flight.add(lbDeparture1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 110, 30));

        lbDeparture2.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        lbDeparture2.setForeground(new java.awt.Color(102, 102, 102));
        Flight.add(lbDeparture2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 110, 30));

        lbReturn1.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        lbReturn1.setForeground(new java.awt.Color(102, 102, 102));
        Flight.add(lbReturn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 120, 30));

        lbReturn2.setFont(new java.awt.Font("Sitka Small", 0, 11)); // NOI18N
        lbReturn2.setForeground(new java.awt.Color(102, 102, 102));
        Flight.add(lbReturn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 150, 30));

        lbSelect.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbSelect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbSelectMouseClicked(evt);
            }
        });
        Flight.add(lbSelect, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, 170, 40));
        Flight.add(lbFlight, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 320));

        getContentPane().add(Flight, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, 720, 320));

        lbReclama.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reclama.png"))); // NOI18N
        getContentPane().add(lbReclama, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, -1, 410));

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/skybg.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 810));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btNotificationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btNotificationMouseClicked
        Notification dlgNotification = new Notification(this, true);
        dlgNotification.setVisible(true);
    }//GEN-LAST:event_btNotificationMouseClicked

    private void lbSelectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSelectMouseClicked

        FlightInfo flightInfo = new FlightInfo(this, true, whereFrom, whereTo);
        flightInfo.setVisible(true);

    }//GEN-LAST:event_lbSelectMouseClicked

    private void lbBestMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbBestMouseEntered
        lbBest.setForeground(Color.blue);
        lbBestPrice.setForeground(Color.blue);
    }//GEN-LAST:event_lbBestMouseEntered

    private void lbBestMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbBestMouseExited
        lbBest.setForeground(Color.gray);
        lbBestPrice.setForeground(Color.gray);
    }//GEN-LAST:event_lbBestMouseExited

    private void lbBestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbBestMouseClicked
        lb1.setBackground(Color.blue);
        lb1.setOpaque(true);
        lb2.setBackground(new Color(255, 255, 255));
        lb3.setBackground(new Color(255, 255, 255));

        if (type.equals("Return")) {
            lbFlight.setIcon(new ImageIcon(bestFlights[nr].getAbsolutePath()));
        } else {
            resize("/images/1.jpg", lbFlight);
        }
    }//GEN-LAST:event_lbBestMouseClicked

    private void lbCheapestMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCheapestMouseEntered
        lbCheapest.setForeground(Color.blue);
        lbCheapestPrice.setForeground(Color.blue);
    }//GEN-LAST:event_lbCheapestMouseEntered

    private void lbCheapestMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCheapestMouseExited
        lbCheapest.setForeground(Color.gray);
        lbCheapestPrice.setForeground(Color.gray);
    }//GEN-LAST:event_lbCheapestMouseExited

    private void lbCheapestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCheapestMouseClicked
        lb2.setBackground(Color.blue);
        lb2.setOpaque(true);
        lb1.setBackground(new Color(255, 255, 255));
        lb3.setBackground(new Color(255, 255, 255));

        if (type.equals("Return")) {
            lbFlight.setIcon(new ImageIcon(cheapestFlights[nr].getAbsolutePath()));
        } else {
            resize("/images/2.jpg", lbFlight);
        }
    }//GEN-LAST:event_lbCheapestMouseClicked

    private void lbFastestMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbFastestMouseEntered
        lbFastest.setForeground(Color.blue);
        lbFastestPrice.setForeground(Color.blue);
    }//GEN-LAST:event_lbFastestMouseEntered

    private void lbFastestMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbFastestMouseExited
        lbFastest.setForeground(Color.gray);
        lbFastestPrice.setForeground(Color.gray);
    }//GEN-LAST:event_lbFastestMouseExited

    private void lbFastestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbFastestMouseClicked
        lb3.setBackground(Color.blue);
        lb3.setOpaque(true);
        lb1.setBackground(new Color(255, 255, 255));
        lb2.setBackground(new Color(255, 255, 255));

        if (type.equals("Return")) {
            lbFlight.setIcon(new ImageIcon(fastestFlights[nr].getAbsolutePath()));
        } else {
            resize("/images/3.jpg", lbFlight);
        }
    }//GEN-LAST:event_lbFastestMouseClicked

    private void lbHelpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbHelpMouseClicked
        Help dlgHelp = new Help(this, true);
        dlgHelp.setLocation(820, 70);
        dlgHelp.setVisible(true);
    }//GEN-LAST:event_lbHelpMouseClicked

//    Loading Flight
    Runnable loadingTask = new Runnable() {
        @Override
        public void run() {
            lbFlight.setIcon(new ImageIcon(getClass().getResource("/images/loading-sign.gif")));
            lbReturn1.setVisible(false);
            lbReturn2.setVisible(false);
            lbDeparture1.setVisible(false);
            lbDeparture2.setVisible(false);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Flight.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (nr < 2) {
                nr++;
                lbFlight.setIcon(new ImageIcon(bestFlights[nr].getAbsolutePath()));
            } else {
                nr = 0;
                lbFlight.setIcon(new ImageIcon(bestFlights[nr].getAbsolutePath()));
            }
            setPrice();
            lbReturn1.setVisible(true);
            lbReturn2.setVisible(true);
            lbDeparture1.setVisible(true);
            lbDeparture2.setVisible(true);
        }
    };

    private void btSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSearchMouseClicked
        if (jScrollPane1.isVisible() || jScrollPane2.isVisible()) {
            ErrorDialog errorDialog = new ErrorDialog(this, true, "You didn't select a city");
            errorDialog.setVisible(true);
        } else if (tfWhereFrom.getText().equals(tfWhereTo.getText())) {
            ErrorDialog errorDialog = new ErrorDialog(this, true, "The departure and arrival locations can't be the same");
            errorDialog.setVisible(true);
        } else if (tfWhenOff.getText().isBlank() || tfWhenBack.getText().isBlank() || !areDatesValid(tfWhenOff.getText(), tfWhenBack.getText())) {
            ErrorDialog errorDIalog = new ErrorDialog(this, true, "The dates are not valid");
            errorDIalog.setVisible(true);
        } else if (type.equals("Return")) {
            if (tfWhereFrom.getText().isBlank() || tfWhereTo.getText().isBlank()) {
                ErrorDialog error = new ErrorDialog(this, true, "Some fields are empty");
                error.setVisible(true);
            } else {
//                Loading
                Thread loading = new Thread(loadingTask);
                loading.start();

                whereFrom = tfWhereFrom.getText();
                whereTo = tfWhereTo.getText();
                DateOff = tfWhenOff.getText();
                DateBack = tfWhenBack.getText();

                lbDeparture1.setText(whereFrom);
                lbDeparture2.setText(whereTo);
                lbReturn1.setText(whereTo);
                lbReturn2.setText(whereFrom);
            }
        } else {
            if (tfWhereFrom.getText().isEmpty() || tfWhereTo.getText().isEmpty() || tfWhenOff.getText().isEmpty()) {
                ErrorDialog error = new ErrorDialog(this, true, "Some fields are empty");
                error.setVisible(true);
            }
            whereFrom = tfWhereFrom.getText();
            whereTo = tfWhereTo.getText();
            DateOff = tfWhenOff.getText();
            lbReturn1.setText(whereFrom);
            lbReturn2.setText(whereTo);
        }
    }//GEN-LAST:event_btSearchMouseClicked


    private void lbAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAccountMouseClicked
        LogIn dlgLogIn = new LogIn(this, true);
        dlgLogIn.setVisible(true);
    }//GEN-LAST:event_lbAccountMouseClicked

    private void lbAccountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAccountMouseEntered
        lbChangeAccount.setFont(new Font("Stika Small", Font.PLAIN, 15));
    }//GEN-LAST:event_lbAccountMouseEntered

    private void lbAccountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAccountMouseExited
        lbChangeAccount.setFont(new Font("Stika Small", Font.PLAIN, 14));
        lbChangeAccount.setForeground(new Color(0, 0, 153));
    }//GEN-LAST:event_lbAccountMouseExited

    private void lbLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbLogoMouseClicked
        airlinesGUI airlines = new airlinesGUI();
        airlines.setLogIn(true);
        airlines.setVisible(true);
    }//GEN-LAST:event_lbLogoMouseClicked

    private void tfWhereFromMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfWhereFromMouseClicked
        jScrollPane1.setVisible(true);
        tfWhereFrom.setText("");
    }//GEN-LAST:event_tfWhereFromMouseClicked

    private void tfWhereToMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfWhereToMouseClicked
        jScrollPane2.setVisible(true);
        tfWhereTo.setText("");
    }//GEN-LAST:event_tfWhereToMouseClicked

    private void jlWhereFromMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlWhereFromMouseClicked
        tfWhereFrom.setText(jlWhereFrom.getSelectedValue());
        jScrollPane1.setVisible(false);
    }//GEN-LAST:event_jlWhereFromMouseClicked

    private void jlWhereToMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlWhereToMouseClicked
        tfWhereTo.setText(jlWhereTo.getSelectedValue());
        jScrollPane2.setVisible(false);
    }//GEN-LAST:event_jlWhereToMouseClicked

    private void tfWhereFromKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfWhereFromKeyReleased
        setter.filterList(tfWhereFrom.getText());
        jlWhereFrom.setModel(setter.getModel());
    }//GEN-LAST:event_tfWhereFromKeyReleased

    private void tfWhereToKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfWhereToKeyReleased
        setter.filterList(tfWhereTo.getText());
        jlWhereTo.setModel(setter.getModel());
    }//GEN-LAST:event_tfWhereToKeyReleased

    private void tfWhenOffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfWhenOffMouseClicked
        calendar.setVisible(true);
        tfWhenOff.setText(calendar.getDate());
    }//GEN-LAST:event_tfWhenOffMouseClicked

    private void tfWhenBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfWhenBackMouseClicked
        calendar.setVisible(true);
        tfWhenBack.setText(calendar.getDate());
    }//GEN-LAST:event_tfWhenBackMouseClicked

    private void resize(String picturePath, JLabel label) {
        ImageIcon imgIcon = new ImageIcon(getClass().getResource(picturePath));
        Image image = imgIcon.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        imgIcon = new ImageIcon(image);
        label.setIcon(imgIcon);
    }

    private void center() {
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
    }

    private boolean areDatesValid(String date1, String date2) {
        if (tfWhenBack.isVisible()) {
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
        } else {
            String[] elem1 = date1.split("-");
            if (elem1.length == 0) {
                return false;
            }
            LocalDate GUIDate1 = LocalDate.of(Integer.parseInt(elem1[2]), Integer.parseInt(elem1[1]), Integer.parseInt(elem1[0]));
            LocalDate currentDate = LocalDate.now();
            if (GUIDate1.isAfter(currentDate) || GUIDate1.isEqual(currentDate)) {
                return true;
            }
            return false;
        }
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
            java.util.logging.Logger.getLogger(Flight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Flight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Flight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Flight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Flight().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Flight;
    private javax.swing.JLabel background;
    private javax.swing.JLabel btNotification;
    private javax.swing.JLabel btSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> jlWhereFrom;
    private javax.swing.JList<String> jlWhereTo;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lbAccount;
    private javax.swing.JLabel lbBest;
    private javax.swing.JLabel lbBestPrice;
    private javax.swing.JLabel lbChangeAccount;
    private javax.swing.JLabel lbCheapest;
    private javax.swing.JLabel lbCheapestPrice;
    private javax.swing.JLabel lbDeparture1;
    private javax.swing.JLabel lbDeparture2;
    private javax.swing.JLabel lbFastest;
    private javax.swing.JLabel lbFastestPrice;
    private javax.swing.JLabel lbFlight;
    private javax.swing.JLabel lbHelp;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JLabel lbQuestionMark;
    private javax.swing.JLabel lbReclama;
    private javax.swing.JLabel lbReturn1;
    private javax.swing.JLabel lbReturn2;
    private javax.swing.JLabel lbSearch;
    private javax.swing.JLabel lbSelect;
    private javax.swing.JLabel lnNotification;
    private javax.swing.JTextField tfWhenBack;
    private javax.swing.JTextField tfWhenOff;
    private javax.swing.JTextField tfWhereFrom;
    private javax.swing.JTextField tfWhereTo;
    // End of variables declaration//GEN-END:variables
}
