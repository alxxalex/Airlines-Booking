package airlines.site;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import messageDialogs.ErrorDialog;
import messageDialogs.checkDialog;

/* @author radoi alexandru*/
//Only direct TO DO
public class airlinesGUI extends javax.swing.JFrame {

    private Setter setter = new Setter();
    DefaultListModel model = new DefaultListModel();
    private File director = new File("Images/Background");
    private File[] backgroundArr = director.listFiles();
    private List<File> backgroundList = Arrays.asList(backgroundArr);
    private String flightType, dateBack, dateOff;
    private boolean onlyDirect = false;

    private boolean logIn;

    public airlinesGUI() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/images/logo.png")).getImage());
        background.setInitialDelay(0);
        background.start();
        lbReturn.setForeground(Color.blue);
        setter.setLocations();
        setter.setAccounts();
        jScrollPane1.setVisible(false);
        jScrollPane2.setVisible(false);
        jScrollPane3.setVisible(false);

        model = setter.getModel();
        jlLocations.setModel(model);
        jLocations1.setModel(model);
        jlLocations3.setModel(model);
    }

    ActionListener task2 = new ActionListener() {
        int idxPicture = 0;

        @Override
        public void actionPerformed(ActionEvent e) {
            File bgPicture = backgroundList.get(idxPicture);
            ImageIcon image = new ImageIcon(bgPicture.getAbsolutePath());
            lbBackground.setIcon(image);
            if (idxPicture == backgroundList.size() - 1) {
                idxPicture = 0;
            } else {
                idxPicture++;
            }
        }
    };
    javax.swing.Timer background = new javax.swing.Timer(4000, task2);

    public void setLogIn(boolean logInState) {
        logIn = logInState;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TopPanel = new javax.swing.JPanel();
        lbAccount = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        FLightsPane = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlLocations = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jLocations1 = new javax.swing.JList<>();
        tfWhereTo = new javax.swing.JTextField();
        lbChange = new javax.swing.JLabel();
        lbHowMany = new javax.swing.JLabel();
        tfHowMany = new javax.swing.JTextField();
        btSearch = new javax.swing.JButton();
        lbReturn = new javax.swing.JLabel();
        lbOneWay = new javax.swing.JLabel();
        tfWhereFrom = new javax.swing.JTextField();
        cbOnlyDirect = new javax.swing.JCheckBox();
        dcWhenOff = new com.toedter.calendar.JDateChooser();
        lbWhenOff = new javax.swing.JLabel();
        lbWhenBack = new javax.swing.JLabel();
        dcWhenBack = new com.toedter.calendar.JDateChooser();
        hotelsPane = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jlLocations3 = new javax.swing.JList<>();
        tfFindHotel = new javax.swing.JTextField();
        lbCheckIn = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        Rooms = new javax.swing.JLabel();
        Adults = new javax.swing.JLabel();
        Children = new javax.swing.JLabel();
        btApartments = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        dcCheckIn = new com.toedter.calendar.JDateChooser();
        dcCheckOut = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        MotivationPane = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        DealsPane = new javax.swing.JPanel();
        Deal1City2 = new javax.swing.JLabel();
        Deal1City = new javax.swing.JLabel();
        Deal1Picture = new javax.swing.JLabel();
        Deal1Arrow = new javax.swing.JLabel();
        Deal1Price = new javax.swing.JLabel();
        lbDeal1 = new javax.swing.JLabel();
        lbBestDeals = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Deal2Arrow = new javax.swing.JLabel();
        lbDeal2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        TopPanel.setBackground(new java.awt.Color(0, 51, 204,80));

        lbAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/account1.png"))); // NOI18N
        lbAccount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbAccountMouseClicked(evt);
            }
        });

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N

        javax.swing.GroupLayout TopPanelLayout = new javax.swing.GroupLayout(TopPanel);
        TopPanel.setLayout(TopPanelLayout);
        TopPanelLayout.setHorizontalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TopPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 878, Short.MAX_VALUE)
                .addComponent(lbAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        TopPanelLayout.setVerticalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        getContentPane().add(TopPanel);
        TopPanel.setBounds(0, 0, 1050, 55);

        FLightsPane.setBackground(new java.awt.Color(255, 255, 255));
        FLightsPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlLocations.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlLocationsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jlLocations);

        FLightsPane.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 200, 40));

        jLocations1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLocations1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jLocations1);

        FLightsPane.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 200, 40));

        tfWhereTo.setText("Where to?");
        tfWhereTo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        FLightsPane.add(tfWhereTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 199, 30));

        lbChange.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/change.png"))); // NOI18N
        lbChange.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbChange.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbChangeMouseClicked(evt);
            }
        });
        FLightsPane.add(lbChange, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 30, 28));

        lbHowMany.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/down.png"))); // NOI18N
        lbHowMany.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbHowMany.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbHowManyMouseClicked(evt);
            }
        });
        FLightsPane.add(lbHowMany, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 166, 30, 30));

        tfHowMany.setEditable(false);
        tfHowMany.setBackground(new java.awt.Color(255, 255, 255));
        tfHowMany.setText("How many?");
        tfHowMany.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tfHowMany.setOpaque(true);
        tfHowMany.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfHowManyMouseClicked(evt);
            }
        });
        FLightsPane.add(tfHowMany, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 166, 171, 30));

        btSearch.setBackground(new java.awt.Color(0, 51, 204));
        btSearch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btSearch.setText("Search flights");
        btSearch.setBorder(null);
        btSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btSearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btSearchMouseExited(evt);
            }
        });
        btSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSearchActionPerformed(evt);
            }
        });
        FLightsPane.add(btSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 148, 31));

        lbReturn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbReturn.setText("Return");
        lbReturn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbReturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbReturnMouseClicked(evt);
            }
        });
        FLightsPane.add(lbReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 26, 55, 21));

        lbOneWay.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbOneWay.setText("One way");
        lbOneWay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbOneWay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbOneWayMouseClicked(evt);
            }
        });
        FLightsPane.add(lbOneWay, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 26, 57, 21));

        tfWhereFrom.setText("Where from?");
        tfWhereFrom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        FLightsPane.add(tfWhereFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 200, 30));

        cbOnlyDirect.setBackground(new java.awt.Color(255, 255, 255));
        cbOnlyDirect.setText("Only direct");
        FLightsPane.add(cbOnlyDirect, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 100, 30));

        dcWhenOff.setDateFormatString("dd-MM-yyyy");
        FLightsPane.add(dcWhenOff, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 120, 140, 28));

        lbWhenOff.setBackground(new java.awt.Color(255, 255, 255));
        lbWhenOff.setText("When off:");
        lbWhenOff.setOpaque(true);
        FLightsPane.add(lbWhenOff, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 60, 28));

        lbWhenBack.setBackground(new java.awt.Color(255, 255, 255));
        lbWhenBack.setText("When back: ");
        lbWhenBack.setOpaque(true);
        FLightsPane.add(lbWhenBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, -1, 28));

        dcWhenBack.setDateFormatString("dd-MM-yyyy");
        FLightsPane.add(dcWhenBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 120, 136, 30));

        jTabbedPane1.addTab("Flights", new javax.swing.ImageIcon(getClass().getResource("/images/airplane.png")), FLightsPane); // NOI18N

        hotelsPane.setBackground(new java.awt.Color(255, 255, 255));
        hotelsPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlLocations3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlLocations3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jlLocations3);

        hotelsPane.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 450, 40));

        tfFindHotel.setForeground(new java.awt.Color(102, 102, 102));
        tfFindHotel.setText("Ex: Country, city , region");
        tfFindHotel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tfFindHotel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfFindHotelMouseClicked(evt);
            }
        });
        tfFindHotel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfFindHotelKeyReleased(evt);
            }
        });
        hotelsPane.add(tfFindHotel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 450, 40));

        lbCheckIn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbCheckIn.setText("Check-In");
        hotelsPane.add(lbCheckIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 80, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Check-Out");
        hotelsPane.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 90, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hotelsPane.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 50, 30));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jComboBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hotelsPane.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 50, 30));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jComboBox3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hotelsPane.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 50, 30));

        Rooms.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Rooms.setText("Rooms");
        hotelsPane.add(Rooms, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 50, 20));

        Adults.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Adults.setText("Adults");
        hotelsPane.add(Adults, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 40, 20));

        Children.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Children.setText("Children");
        hotelsPane.add(Children, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 50, 20));

        btApartments.setBackground(new java.awt.Color(0, 0, 153));
        btApartments.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btApartments.setText("Search hotels");
        btApartments.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btApartments.setOpaque(true);
        btApartments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btApartmentsActionPerformed(evt);
            }
        });
        hotelsPane.add(btApartments, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 150, 30));
        hotelsPane.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 290));

        dcCheckIn.setDateFormatString("dd-MM-yyyy");
        hotelsPane.add(dcCheckIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 190, 30));

        dcCheckOut.setDateFormatString("dd-MM-yyyy");
        hotelsPane.add(dcCheckOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 200, 30));

        jTabbedPane1.addTab("Hotels", new javax.swing.ImageIcon(getClass().getResource("/images/hotel.png")), hotelsPane); // NOI18N

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(50, 150, 510, 320);

        jLabel4.setFont(new java.awt.Font("Sitka Small", 0, 28)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(" Purchase cheap flights!");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 100, 490, 50);

        MotivationPane.setBackground(new java.awt.Color(0, 0, 0,80));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/green check.png"))); // NOI18N
        jLabel16.setToolTipText("");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/green check.png"))); // NOI18N

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/green check.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Sitka Small", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Best deals and discounts");

        jLabel5.setFont(new java.awt.Font("Sitka Small", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Smart combination of flights");

        jLabel6.setFont(new java.awt.Font("Sitka Small", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Secure flight booking");

        javax.swing.GroupLayout MotivationPaneLayout = new javax.swing.GroupLayout(MotivationPane);
        MotivationPane.setLayout(MotivationPaneLayout);
        MotivationPaneLayout.setHorizontalGroup(
            MotivationPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MotivationPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MotivationPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(MotivationPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MotivationPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        MotivationPaneLayout.setVerticalGroup(
            MotivationPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MotivationPaneLayout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(MotivationPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(MotivationPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(MotivationPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );

        getContentPane().add(MotivationPane);
        MotivationPane.setBounds(638, 180, 310, 290);

        DealsPane.setBackground(new java.awt.Color(0, 0, 0,80));
        DealsPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Deal1City2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        Deal1City2.setForeground(new java.awt.Color(0, 0, 153));
        Deal1City2.setText("- Manchester");
        DealsPane.add(Deal1City2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 130, 40));

        Deal1City.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        Deal1City.setForeground(new java.awt.Color(0, 0, 153));
        Deal1City.setText("Dublin ");
        DealsPane.add(Deal1City, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 100, 20));

        Deal1Picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Dublin.jpg"))); // NOI18N
        DealsPane.add(Deal1Picture, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        Deal1Arrow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrowButton1.png"))); // NOI18N
        Deal1Arrow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Deal1Arrow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Deal1ArrowMouseClicked(evt);
            }
        });
        DealsPane.add(Deal1Arrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 30, 30));

        Deal1Price.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Deal1Price.setForeground(new java.awt.Color(51, 51, 51));
        Deal1Price.setText("17 $");
        DealsPane.add(Deal1Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 60, -1));

        lbDeal1.setBackground(new java.awt.Color(255, 255, 255));
        lbDeal1.setToolTipText("");
        lbDeal1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lbDeal1.setOpaque(true);
        DealsPane.add(lbDeal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 270, 90));

        lbBestDeals.setFont(new java.awt.Font("Sitka Small", 0, 28)); // NOI18N
        lbBestDeals.setForeground(new java.awt.Color(255, 255, 255));
        lbBestDeals.setText("Best deals right now!");
        DealsPane.add(lbBestDeals, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 340, 50));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pexels-taryn-elliott-4684392.jpg"))); // NOI18N
        DealsPane.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, 100, 90));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 153));
        jLabel10.setText("Tel Aviv");
        DealsPane.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 73, 60, 20));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 153));
        jLabel11.setText("- Budapest");
        DealsPane.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 100, 70, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("85$");
        DealsPane.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 110, 60, 30));

        Deal2Arrow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrowButton1.png"))); // NOI18N
        Deal2Arrow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Deal2Arrow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Deal2ArrowMouseClicked(evt);
            }
        });
        DealsPane.add(Deal2Arrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 110, 50, 30));

        lbDeal2.setBackground(new java.awt.Color(255, 255, 255));
        lbDeal2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lbDeal2.setOpaque(true);
        DealsPane.add(lbDeal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 60, 270, 90));

        getContentPane().add(DealsPane);
        DealsPane.setBounds(0, 540, 1050, 270);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(420, 170, 510, 290);
        getContentPane().add(lbBackground);
        lbBackground.setBounds(-20, -10, 1080, 830);

        setSize(new java.awt.Dimension(1060, 815));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAccountMouseClicked
        LogIn dlgLogIn = new LogIn(this, true);
        dlgLogIn.setVisible(true);
        logIn = dlgLogIn.isLogin();
        if (dlgLogIn.isLogin() == true) {
            checkDialog checkDialog = new checkDialog(this, true, "Login successful");
            checkDialog.setVisible(true);
        } else {
            ErrorDialog errorDialog = new ErrorDialog(this, true, "Login unsuccessful");
            errorDialog.setVisible(true);
        }
    }//GEN-LAST:event_lbAccountMouseClicked

    private void lbChangeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbChangeMouseClicked
        if (!tfWhereFrom.getText().equals("Where from?") && !tfWhereTo.getText().equals("Where to?")) {
            String aux = tfWhereFrom.getText();
            tfWhereFrom.setText(tfWhereTo.getText());
            tfWhereTo.setText(aux);
        }
    }//GEN-LAST:event_lbChangeMouseClicked

    private void tfWhereToMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfWhereToMouseClicked
        tfWhereTo.setText("");
        tfWhereTo.setForeground(Color.black);
    }//GEN-LAST:event_tfWhereToMouseClicked

    private void lbHowManyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbHowManyMouseClicked
        HowManyPersons dlgHowMany = new HowManyPersons(this, true);
        dlgHowMany.setVisible(true);
        String adults = String.valueOf(dlgHowMany.getAdults());
        String children = String.valueOf(dlgHowMany.getChildren());
        String infants = String.valueOf(dlgHowMany.getInfants());

        if (Integer.parseInt(adults + children + infants) != 0) {
            tfHowMany.setText(adults + " adults , " + children + " children , " + infants + " infants");
        }

    }//GEN-LAST:event_lbHowManyMouseClicked

    private void btSearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSearchMouseEntered
        btSearch.setBackground(new Color(80, 100, 240));
    }//GEN-LAST:event_btSearchMouseEntered

    private void btSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSearchMouseExited
        btSearch.setBackground(new Color(0, 51, 204));
    }//GEN-LAST:event_btSearchMouseExited

    private void lbReturnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbReturnMouseClicked
        lbReturn.setForeground(Color.blue);
        lbOneWay.setForeground(Color.black);
        lbWhenBack.setVisible(true);
        dcWhenBack.setVisible(true);
    }//GEN-LAST:event_lbReturnMouseClicked

    private void lbOneWayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbOneWayMouseClicked
        lbReturn.setForeground(Color.black);
        lbOneWay.setForeground(Color.blue);
        lbWhenBack.setVisible(false);
        dcWhenBack.setVisible(false);
    }//GEN-LAST:event_lbOneWayMouseClicked

    private void tfWhereFromMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfWhereFromMouseClicked
        tfWhereFrom.setText("");
        tfWhereFrom.setForeground(Color.black);

    }//GEN-LAST:event_tfWhereFromMouseClicked

    private void btSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSearchActionPerformed
        try {
            if (logIn == true) {

                if (areEmptyFields()) {
                    tfWhereFrom.setForeground(Color.red);
                    tfWhereTo.setForeground(Color.red);
                    lbWhenOff.setForeground(Color.red);
                    lbWhenBack.setForeground(Color.red);
                    tfHowMany.setForeground(Color.red);
                } else if (jScrollPane1.isVisible() || jScrollPane2.isVisible()) {
                    ErrorDialog errorDialog = new ErrorDialog(this, true, "You didn't select a city");
                    errorDialog.setVisible(true);
                } else if (tfWhereFrom.getText().equals(tfWhereTo.getText())) {
                    ErrorDialog errorDialog = new ErrorDialog(this, true, "The departure and arrival locations can't be the same");
                    errorDialog.setVisible(true);
                } else {
                    SimpleDateFormat dateformatter = new SimpleDateFormat("dd-MM-yyyy");
                    dateOff = dateformatter.format(dcWhenOff.getDate());
                    if (lbReturn.getForeground().equals(Color.blue)) {
                        dateBack = dateformatter.format(dcWhenBack.getDate());
                    }
                    if (!areDatesValid(dateOff, dateBack)) {
                        ErrorDialog errorDIalog = new ErrorDialog(this, true, "The dates are not valid");
                        errorDIalog.setVisible(true);
                    } else {
                        if (lbReturn.getForeground().equals(Color.blue)) {
                            flightType = "Return";
                        } else {
                            flightType = "One way";
                        }
                        if (cbOnlyDirect.isSelected()) {
                            onlyDirect = true;
                        }
                        Flight dlgFlight = new Flight(tfWhereFrom.getText(), tfWhereTo.getText(), dateOff, dateBack, flightType, onlyDirect);
                        dlgFlight.setVisible(true);
                    }
                }
            } else {
                ErrorDialog errorDialog = new ErrorDialog(this, true, "You are not logged in");
                errorDialog.setVisible(true);
            }
        } catch (NullPointerException e) {
            ErrorDialog errorDIalog = new ErrorDialog(this, true, "Date fields can not be empty");
            errorDIalog.setVisible(true);
        }
    }//GEN-LAST:event_btSearchActionPerformed

    private boolean areEmptyFields() {
        if (lbWhenBack.isVisible()) {
            if (tfHowMany.getText().equals("How many?") || tfWhereFrom.getText().equals("Where from?") || tfWhereTo.getText().equals("Where to?") || dcWhenOff.getDate().toString().isBlank() || dcWhenBack.getDate().toString().isBlank()) {
                return true;
            }
            return false;
        } else {
            if (tfHowMany.getText().equals("How many?") || tfWhereFrom.getText().equals("Where from?") || tfWhereTo.getText().equals("Where to?") || dcWhenOff.getDate().toString().isBlank()) {
                return true;
            }
            return false;
        }
    }

    private boolean areDatesValid(String date1, String date2) {
        if (lbWhenBack.isVisible()) {
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

    private void tfFindHotelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfFindHotelMouseClicked
        tfFindHotel.setText("");
        tfFindHotel.setForeground(Color.black);
    }//GEN-LAST:event_tfFindHotelMouseClicked

    private void btApartmentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btApartmentsActionPerformed
        try {
            if (logIn == true) {
                SimpleDateFormat dateFormatter = new SimpleDateFormat("dd-MM-yyyy");
                String date1 = dateFormatter.format(dcCheckIn.getDate());
                String date2 = dateFormatter.format(dcCheckOut.getDate());
                if (jScrollPane3.isVisible() || tfFindHotel.getText().isBlank() || tfFindHotel.getText().equals("Ex: Country, city , region")) {
                    ErrorDialog errorDialog = new ErrorDialog(this, true, "You didn't select a city");
                    errorDialog.setVisible(true);
                } else if (!areDatesValid(date1, date2)) {
                    ErrorDialog errorDIalog = new ErrorDialog(this, true, "The dates are not valid");
                    errorDIalog.setVisible(true);
                } else {
                    Apartments apartments = new Apartments(tfFindHotel.getText(), date1, date2);
                    apartments.setVisible(true);
                }
            } else {
                ErrorDialog errorDialog = new ErrorDialog(this, true, "You are not logged in");
                errorDialog.setVisible(true);
            }
        } catch (NullPointerException e) {
            ErrorDialog errorDIalog = new ErrorDialog(this, true, "Date field can not be empty");
            errorDIalog.setVisible(true);
        }
    }//GEN-LAST:event_btApartmentsActionPerformed

    private void tfWhereFromKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfWhereFromKeyReleased
        if (tfWhereFrom.getText().isEmpty()) {
            jScrollPane1.setVisible(false);
        } else {
            jScrollPane1.setVisible(true);
            String text = tfWhereFrom.getText();
            setter.filterList(text);
        }

    }//GEN-LAST:event_tfWhereFromKeyReleased

    private void jlLocationsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlLocationsMouseClicked
        tfWhereFrom.setText(jlLocations.getSelectedValue());
        jScrollPane1.setVisible(false);
    }//GEN-LAST:event_jlLocationsMouseClicked

    private void tfWhereToKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfWhereToKeyReleased
        if (tfWhereTo.getText().isEmpty()) {
            jScrollPane2.setVisible(false);
        } else {
            jScrollPane2.setVisible(true);
            String text = tfWhereTo.getText();
            setter.filterList(text);
        }
    }//GEN-LAST:event_tfWhereToKeyReleased

    private void jLocations1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLocations1MouseClicked
        tfWhereTo.setText(jLocations1.getSelectedValue());
        jScrollPane2.setVisible(false);
    }//GEN-LAST:event_jLocations1MouseClicked

    private void tfHowManyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfHowManyMouseClicked
        tfHowMany.setText("");
        lbHowManyMouseClicked(evt);
    }//GEN-LAST:event_tfHowManyMouseClicked

    private void tfFindHotelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfFindHotelKeyReleased
        if (tfFindHotel.getText().isEmpty()) {
            jScrollPane3.setVisible(false);
        } else {
            jScrollPane3.setVisible(true);
            String text = tfFindHotel.getText();
            setter.filterList(text);
        }
    }//GEN-LAST:event_tfFindHotelKeyReleased

    private void jlLocations3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlLocations3MouseClicked
        tfFindHotel.setText(jlLocations3.getSelectedValue());
        jScrollPane3.setVisible(false);
    }//GEN-LAST:event_jlLocations3MouseClicked

    private void Deal1ArrowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Deal1ArrowMouseClicked
        if (logIn == true) {
            FlightInfo deal1 = new FlightInfo(this, true, "Dublin", "Manchester");
            deal1.SetTime("12 : 30", "14 : 00", "16 : 00", "19 : 30");
            deal1.setVisible(true);
        } else {
            ErrorDialog errorDialog = new ErrorDialog(this, true, "You are not logged in!");
            errorDialog.setVisible(true);
        }
    }//GEN-LAST:event_Deal1ArrowMouseClicked

    private void Deal2ArrowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Deal2ArrowMouseClicked
        if (logIn == true) {
            FlightInfo deal2 = new FlightInfo(this, true, "Tel Aviv", "Budapest");
            deal2.SetTime("6 : 45", "8 : 30", "15 : 00", "16 : 45");
            deal2.setVisible(true);
        } else {
            ErrorDialog errorDialog = new ErrorDialog(this, true, "You are not logged in!");
            errorDialog.setVisible(true);
        }
    }//GEN-LAST:event_Deal2ArrowMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(airlinesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(airlinesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(airlinesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(airlinesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new airlinesGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Adults;
    private javax.swing.JLabel Children;
    private javax.swing.JLabel Deal1Arrow;
    private javax.swing.JLabel Deal1City;
    private javax.swing.JLabel Deal1City2;
    private javax.swing.JLabel Deal1Picture;
    private javax.swing.JLabel Deal1Price;
    private javax.swing.JLabel Deal2Arrow;
    private javax.swing.JPanel DealsPane;
    private javax.swing.JPanel FLightsPane;
    private javax.swing.JPanel MotivationPane;
    private javax.swing.JLabel Rooms;
    private javax.swing.JPanel TopPanel;
    private javax.swing.JButton btApartments;
    private javax.swing.JButton btSearch;
    private javax.swing.JCheckBox cbOnlyDirect;
    private com.toedter.calendar.JDateChooser dcCheckIn;
    private com.toedter.calendar.JDateChooser dcCheckOut;
    private com.toedter.calendar.JDateChooser dcWhenBack;
    private com.toedter.calendar.JDateChooser dcWhenOff;
    private javax.swing.JPanel hotelsPane;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jLocations1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JList<String> jlLocations;
    private javax.swing.JList<String> jlLocations3;
    private javax.swing.JLabel lbAccount;
    private javax.swing.JLabel lbBackground;
    private javax.swing.JLabel lbBestDeals;
    private javax.swing.JLabel lbChange;
    private javax.swing.JLabel lbCheckIn;
    private javax.swing.JLabel lbDeal1;
    private javax.swing.JLabel lbDeal2;
    private javax.swing.JLabel lbHowMany;
    private javax.swing.JLabel lbOneWay;
    private javax.swing.JLabel lbReturn;
    private javax.swing.JLabel lbWhenBack;
    private javax.swing.JLabel lbWhenOff;
    private javax.swing.JTextField tfFindHotel;
    private javax.swing.JTextField tfHowMany;
    private javax.swing.JTextField tfWhereFrom;
    private javax.swing.JTextField tfWhereTo;
    // End of variables declaration//GEN-END:variables
}
