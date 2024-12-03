package Receptionist;

import Admin.ReceptionistManagement;
import Main.Hospital;
import Main.Connector;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Ditalo
 */
public class addReceptionist extends javax.swing.JFrame {
  
    Connection connection = null;
    PreparedStatement prp = null;
    ResultSet rs = null;
    
    public addReceptionist() {
        initComponents();
        ImageIcon ic = new ImageIcon(getClass().getResource("/Image/hospital.png"));
        this.setIconImage(ic.getImage());
   
        date ();
        rDateField.setEditable(false);
    }
     private void date(){
        java.sql.Date date = java.sql.Date.valueOf(LocalDate.now());
        rDateField.setText(date.toString());
     }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        backbutton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        rDateField = new javax.swing.JTextField();
        MNameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        blood = new javax.swing.JLabel();
        rPhoneField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        St_Address = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        rEmailField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        rGenderField = new javax.swing.JComboBox<>();
        rStatusField = new javax.swing.JComboBox<>();
        rUserField = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        rPassField = new javax.swing.JPasswordField();
        LNameField = new javax.swing.JTextField();
        FNameField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Bdate_Month = new javax.swing.JComboBox<>();
        Bdate_Day = new javax.swing.JComboBox<>();
        Bdate_Year = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        rBloodField = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        C_Address = new javax.swing.JTextField();
        Pr_Address = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        SecurityAnswer = new javax.swing.JPasswordField();
        SecurityQuestion = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        ClearButtn = new javax.swing.JButton();
        AddButtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add Receptionist !");

        jPanel5.setBackground(new java.awt.Color(0, 51, 51));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Add Receptionist");

        backbutton.setBackground(new java.awt.Color(0, 51, 51));
        backbutton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        backbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/backs.png"))); // NOI18N
        backbutton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(121, 121, 121)
                .addComponent(backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        jLabel1.setText("Date");

        rDateField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rDateFieldActionPerformed(evt);
            }
        });

        MNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MNameFieldActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        jLabel3.setText("Receptionist Name");

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        jLabel5.setText("Gender");

        blood.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        blood.setText("Blood Type");

        rPhoneField.setText("+63");
        rPhoneField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rPhoneFieldActionPerformed(evt);
            }
        });
        rPhoneField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                rPhoneFieldKeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        jLabel7.setText("Phone Number");

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        jLabel8.setText("Maritial Status");

        St_Address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                St_AddressActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        jLabel9.setText("Address");

        rEmailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rEmailFieldActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        jLabel13.setText("Email Address");

        rGenderField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rGenderField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        rGenderField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rGenderFieldActionPerformed(evt);
            }
        });

        rStatusField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rStatusField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Married", "Divorced", "Separated", "Widowed" }));
        rStatusField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rStatusFieldActionPerformed(evt);
            }
        });

        rUserField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rUserFieldActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        jLabel17.setText("Password");

        jLabel20.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        jLabel20.setText("Username");

        rPassField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rPassFieldActionPerformed(evt);
            }
        });

        LNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LNameFieldActionPerformed(evt);
            }
        });

        FNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FNameFieldActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        jLabel10.setText("First Name");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        jLabel11.setText("Middle Name");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        jLabel14.setText("Last Name");

        jLabel15.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        jLabel15.setText("Date of Birth");

        Bdate_Month.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Bdate_Month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        Bdate_Day.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Bdate_Day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        Bdate_Day.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bdate_DayActionPerformed(evt);
            }
        });

        Bdate_Year.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Bdate_Year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1905", "1906", "1907", "1908", "1909", "1910", "1911", "1912", "1913", "1914", "1915", "1916", "1917", "1918", "1919", "1920", "1921", "1922", "1923", "1924", "1925", "1926", "1927", "1928", "1929", "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", " " }));

        jLabel16.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel16.setText("Month");

        jLabel21.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel21.setText("Day");

        jLabel22.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel22.setText("Year");

        rBloodField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rBloodField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "AB", "O" }));
        rBloodField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBloodFieldActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        jLabel25.setText("Street Address ");

        C_Address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_AddressActionPerformed(evt);
            }
        });

        Pr_Address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pr_AddressActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        jLabel23.setText("City");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        jLabel24.setText("State / Province");

        jLabel26.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        jLabel26.setText("Security Answer");

        SecurityAnswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SecurityAnswerActionPerformed(evt);
            }
        });

        SecurityQuestion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        SecurityQuestion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What high school did you attend?", "What's your favorite color?", "What's your father's middle name?", "In what city were you born?", "What's your favorite movie?", "What's the name of your favorite pet?" }));

        jLabel27.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        jLabel27.setText("Security Question");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(jLabel14)))
                .addGap(90, 90, 90))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(91, 91, 91)
                        .addComponent(jLabel24)
                        .addGap(139, 139, 139))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel15)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(rPhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel16)
                                                    .addGap(51, 51, 51))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(Bdate_Month, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(Bdate_Day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGap(12, 12, 12)
                                                    .addComponent(jLabel21))))
                                        .addComponent(FNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(rUserField, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Bdate_Year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel22)
                                            .addComponent(rBloodField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(43, 43, 43)
                                .addComponent(blood))
                            .addComponent(MNameField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(rStatusField, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(rGenderField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(LNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(65, 65, 65))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(rPassField, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGap(114, 114, 114))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(jLabel25))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(jLabel13))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(jLabel9))
                            .addComponent(St_Address)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(C_Address, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Pr_Address, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(rEmailField)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(SecurityQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SecurityAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26))))
                .addGap(0, 67, Short.MAX_VALUE))
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(4, 4, 4)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bdate_Month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bdate_Day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bdate_Year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rGenderField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel22)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(blood, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rBloodField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rStatusField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rPhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rPassField, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                    .addComponent(rUserField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SecurityQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(SecurityAnswer)
                        .addGap(2, 2, 2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(8, 8, 8)
                .addComponent(rEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(St_Address, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(C_Address, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pr_Address, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24)))
        );

        ClearButtn.setBackground(new java.awt.Color(0, 51, 51));
        ClearButtn.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ClearButtn.setForeground(new java.awt.Color(255, 255, 255));
        ClearButtn.setText("Clear");
        ClearButtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ClearButtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtnActionPerformed(evt);
            }
        });

        AddButtn.setBackground(new java.awt.Color(0, 51, 51));
        AddButtn.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        AddButtn.setForeground(new java.awt.Color(255, 255, 255));
        AddButtn.setText("Save");
        AddButtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        AddButtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(ClearButtn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(AddButtn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AddButtn, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(ClearButtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AddButtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtnActionPerformed
        connection = Connector.ConnectDb();
        try {

            if (connection != null) {
                String date = rDateField.getText();
                String FName = FNameField.getText();
                String MName = MNameField.getText();
                String LName = LNameField.getText();
                String Month = (String) Bdate_Month.getSelectedItem();
                int Day =  Integer.parseInt ((String) Bdate_Day.getSelectedItem());
                int Year = Integer.parseInt ((String) Bdate_Year.getSelectedItem());
                String St_add = St_Address.getText();
                String C_add = C_Address.getText();
                String Pr_add = Pr_Address.getText();
                String gender = (String) rGenderField.getSelectedItem();
                String rblood = (String) rBloodField.getSelectedItem();
                String email = rEmailField.getText();
                String question = (String) SecurityQuestion.getSelectedItem();
                String security = SecurityAnswer.getText();
                String phone = rPhoneField.getText();
                String status = (String) rStatusField.getSelectedItem();
                String user = rUserField.getText();
                String pass = String.valueOf(rPassField.getPassword());
                String sql = "insert into receptionist(Date,FName,MName,LName,BMonth,BDay,BYear,St_Address,C_Address,Pr_Address,gender,blood,email,Security_Quest,Security_Answer,phone,status,username,password) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                try {
                    prp = connection.prepareStatement(sql);
                    prp.setString(1, date);
                    prp.setString(2, FName);
                    prp.setString(3, MName);
                    prp.setString(4, LName);
                    prp.setString(5, Month);
                    prp.setInt(6, Day);
                    prp.setInt(7, Year);
                    prp.setString(8, St_add);
                    prp.setString(9, C_add);
                    prp.setString(10, Pr_add);                   
                    prp.setString(11, gender);
                    prp.setString(12, rblood);
                    prp.setString(13, email);
                    prp.setString(14, question);                  
                    prp.setString(15, security);
                    prp.setString(16, phone);
                    prp.setString(17, status);
                    prp.setString(18, user);
                    prp.setString(19, pass);
                    prp.execute();
                    JOptionPane.showMessageDialog(null, "Data Saved");
                      ReceptionistManagement RM = new ReceptionistManagement();
                      RM.setVisible(true);
                      dispose();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Wrong Input");
        }
    }//GEN-LAST:event_AddButtnActionPerformed

    private void ClearButtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtnActionPerformed

        FNameField.setText("");
        MNameField.setText("");
        LNameField.setText("");
        Pr_Address.setText("");
        C_Address.setText("");
        St_Address.setText("");
        rGenderField.setSelectedIndex(0);
        Bdate_Month.setSelectedIndex(0);
        Bdate_Day.setSelectedIndex(0);
        Bdate_Year.setSelectedIndex(0);
        rBloodField.setSelectedIndex(0);
        SecurityQuestion.setSelectedIndex(0);
        rPhoneField.setText("+63");
        rEmailField.setText("");
        St_Address.setText("");
        rStatusField.setSelectedIndex(0);
        rUserField.setText("");
        rPassField.setText("");
        SecurityAnswer.setText("");
    }//GEN-LAST:event_ClearButtnActionPerformed

    private void Pr_AddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pr_AddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pr_AddressActionPerformed

    private void C_AddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_AddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_C_AddressActionPerformed

    private void rBloodFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBloodFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rBloodFieldActionPerformed

    private void Bdate_DayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bdate_DayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Bdate_DayActionPerformed

    private void FNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FNameFieldActionPerformed

    private void LNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LNameFieldActionPerformed

    private void rPassFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rPassFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rPassFieldActionPerformed

    private void rUserFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rUserFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rUserFieldActionPerformed

    private void rStatusFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rStatusFieldActionPerformed

    }//GEN-LAST:event_rStatusFieldActionPerformed

    private void rGenderFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rGenderFieldActionPerformed

    }//GEN-LAST:event_rGenderFieldActionPerformed

    private void rEmailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rEmailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rEmailFieldActionPerformed

    private void St_AddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_St_AddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_St_AddressActionPerformed

    private void rPhoneFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rPhoneFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rPhoneFieldActionPerformed

    private void MNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MNameFieldActionPerformed

    private void rDateFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rDateFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rDateFieldActionPerformed

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
        ReceptionistManagement RM = new ReceptionistManagement();
        RM.setVisible(true);
        dispose();
    }//GEN-LAST:event_backbuttonActionPerformed

    private void SecurityAnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SecurityAnswerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SecurityAnswerActionPerformed

    private void rPhoneFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rPhoneFieldKeyReleased
       char c = evt.getKeyChar();
      if (! ((Character.isDigit(c) ||
              (c == KeyEvent.VK_BACK_SPACE) ||
              (c == KeyEvent.VK_DELETE)
              ||
              (c == KeyEvent.VK_ENTER))
              ))
      {
          evt.consume();
          JOptionPane.showMessageDialog(null,"Invalid Input");
          rPhoneField.setText("+63");
      }
    }//GEN-LAST:event_rPhoneFieldKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new addReceptionist().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButtn;
    private javax.swing.JComboBox<String> Bdate_Day;
    private javax.swing.JComboBox<String> Bdate_Month;
    private javax.swing.JComboBox<String> Bdate_Year;
    private javax.swing.JTextField C_Address;
    private javax.swing.JButton ClearButtn;
    private javax.swing.JTextField FNameField;
    private javax.swing.JTextField LNameField;
    private javax.swing.JTextField MNameField;
    private javax.swing.JTextField Pr_Address;
    private javax.swing.JPasswordField SecurityAnswer;
    private javax.swing.JComboBox<String> SecurityQuestion;
    private javax.swing.JTextField St_Address;
    private javax.swing.JButton backbutton;
    private javax.swing.JLabel blood;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JComboBox<String> rBloodField;
    private javax.swing.JTextField rDateField;
    private javax.swing.JTextField rEmailField;
    private javax.swing.JComboBox<String> rGenderField;
    private javax.swing.JPasswordField rPassField;
    private javax.swing.JTextField rPhoneField;
    private javax.swing.JComboBox<String> rStatusField;
    private javax.swing.JTextField rUserField;
    // End of variables declaration//GEN-END:variables
}
