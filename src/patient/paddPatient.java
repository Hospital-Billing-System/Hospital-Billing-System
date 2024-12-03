package patient;


import Main.Hospital;
import Main.Connector;
import Receptionist.PatientManagement;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Ditalo
 */
public final class paddPatient extends javax.swing.JFrame {
  
    Connection connection = null;
    PreparedStatement prp = null;
    ResultSet rs = null;
    int getValue;
    public paddPatient() {
        initComponents();
        ImageIcon ic = new ImageIcon(getClass().getResource("/Image/hospital.png"));
        this.setIconImage(ic.getImage());
        date ();
        rDateField.setEditable(false);
        
    }
      public void generatePatientID(String passQuery){
         connection=Connector.ConnectDb();
          try {           
               Statement st= connection.createStatement();
               rs = st.executeQuery(passQuery);
               if(rs.next()){
                  getValue=Integer.parseInt(rs.getString(1));
                   
               }
          } catch (Exception e) {
              
          }
   
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
        backbutton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        rDateField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        blood = new javax.swing.JLabel();
        rPhoneField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        St_Address = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        CaseField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        rGenderField = new javax.swing.JComboBox<>();
        LNameField = new javax.swing.JTextField();
        FNameField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
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
        pTypeField = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        WardRoom_No = new javax.swing.JComboBox<>();
        blood1 = new javax.swing.JLabel();
        RoomType = new javax.swing.JComboBox<>();
        blood2 = new javax.swing.JLabel();
        AgeField = new javax.swing.JTextField();
        ClearButtn = new javax.swing.JButton();
        AddButtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add Receptionist !");

        jPanel5.setBackground(new java.awt.Color(0, 51, 51));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Add Patient");

        backbutton1.setBackground(new java.awt.Color(0, 51, 51));
        backbutton1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        backbutton1.setForeground(new java.awt.Color(0, 51, 51));
        backbutton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/backs.png"))); // NOI18N
        backbutton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        backbutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbutton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(114, 114, 114)
                .addComponent(backbutton1)
                .addGap(23, 23, 23))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(backbutton1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        jLabel1.setText("Date");

        rDateField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rDateFieldActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        jLabel3.setText("Patient Name");

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

        St_Address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                St_AddressActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        jLabel9.setText("Address");

        CaseField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CaseFieldActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        jLabel13.setText("Case of Patient");

        rGenderField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rGenderField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        rGenderField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rGenderFieldActionPerformed(evt);
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

        pTypeField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        pTypeField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "In Patient", "Out Patient" }));

        jLabel17.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        jLabel17.setText("Patient Type");

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        jLabel11.setText("Ward/Room No.");

        WardRoom_No.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        WardRoom_No.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));

        blood1.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        blood1.setText("Room Type");

        RoomType.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        RoomType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Single Deluxe Room", "Two-Bedded Room", "Four-Bedded Room", "Intensive Care Unit (ICU)", "Isolation Room", "VIP Suite", "Labour & Delivery Suite" }));

        blood2.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        blood2.setText("Age");

        AgeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgeFieldActionPerformed(evt);
            }
        });
        AgeField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                AgeFieldKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rPhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addComponent(jLabel13)))
                                        .addGap(47, 47, 47)
                                        .addComponent(blood1))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(CaseField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(RoomType, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(167, 167, 167)
                                        .addComponent(jLabel14))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(FNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(LNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(C_Address, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(Pr_Address, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(St_Address, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(54, 54, 54)
                                        .addComponent(jLabel23)
                                        .addGap(87, 87, 87)
                                        .addComponent(jLabel24))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabel10))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel15)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(Bdate_Month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(12, 12, 12)
                                                        .addComponent(jLabel21))
                                                    .addComponent(Bdate_Day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Bdate_Year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addComponent(jLabel22))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(blood2))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(23, 23, 23)
                                                        .addComponent(jLabel16))
                                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(pTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(31, 31, 31)
                                                        .addComponent(jLabel5))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(18, 18, 18)
                                                        .addComponent(rGenderField, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addGap(16, 16, 16)
                                        .addComponent(jLabel11))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(148, 148, 148)
                                        .addComponent(AgeField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(blood)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(rBloodField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(WardRoom_No, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(0, 34, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(186, 186, 186))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(175, 175, 175))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bdate_Month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bdate_Day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bdate_Year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel22)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel17)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rGenderField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WardRoom_No, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(blood, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(blood2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rPhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rBloodField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(AgeField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(blood1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CaseField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RoomType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(St_Address, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(C_Address, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pr_Address, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24))
                .addContainerGap())
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
                .addGap(140, 140, 140)
                .addComponent(AddButtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(ClearButtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddButtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ClearButtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AddButtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtnActionPerformed
        connection = Connector.ConnectDb();
          generatePatientID("select count(Patient_ID)+1 from patient");    
        try {
           
           if (connection != null) {
                String PatientID="PID"+new SimpleDateFormat("ddMMyy").format(new Date())+getValue;
                String date = rDateField.getText();
                String FName = FNameField.getText();
                String room = ((String) WardRoom_No.getSelectedItem());
                String LName = LNameField.getText();
                String Patient_Type = (String) pTypeField.getSelectedItem();
                String Month = (String) Bdate_Month.getSelectedItem();
                int Day =  Integer.parseInt ((String) Bdate_Day.getSelectedItem());
                int Year = Integer.parseInt ((String) Bdate_Year.getSelectedItem());
                int age = Integer.parseInt ((String) AgeField.getText());
                String St_add = St_Address.getText();
                String C_add = C_Address.getText();
                String Pr_add = Pr_Address.getText();
                String gender = (String) rGenderField.getSelectedItem();
                String rblood = (String) rBloodField.getSelectedItem();
                String Patient_Case = CaseField.getText();
                String phone = rPhoneField.getText();
                String Room_Type = (String) RoomType.getSelectedItem();
                String sql = "insert into patient(Patient_ID,date,FName,LName,BMonth,BDay,BYear,age,St_Address,C_Address,Pr_Address,gender,blood,phone,Patient_Type,Patient_Case,room,Room_Type) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";        
                try {   
                    prp = connection.prepareStatement(sql);
                    prp.setString(1, PatientID);
                    prp.setString(2, date);
                    prp.setString(3, FName);
                    prp.setString(4, LName);
                    prp.setString(5, Month);
                    prp.setInt(6, Day);
                    prp.setInt(7, Year);
                    prp.setInt(8, age);
                    prp.setString(9, St_add);
                    prp.setString(10, C_add);
                    prp.setString(11, Pr_add);                   
                    prp.setString(12, gender);
                    prp.setString(13, rblood);
                    prp.setString(14, phone);
                    prp.setString(15, Patient_Type);
                    prp.setString(16, Patient_Case);
                    prp.setString(17, room);
                    prp.setString(18, Room_Type);
                    
                    prp.execute();
                    JOptionPane.showMessageDialog(null, "Data Saved");
                            PatientManagement PM = new PatientManagement();
                            PM.setVisible(true);
                           dispose();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Wrong Input");
                }
                finally{
                     try {
                          connection.close();
                         }
                     catch (Exception e) {
                         }           
                }                                
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Wrong Input");
        }
    }//GEN-LAST:event_AddButtnActionPerformed

    private void ClearButtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtnActionPerformed

        FNameField.setText("");
        LNameField.setText("");
        Pr_Address.setText("");
        C_Address.setText("");
        St_Address.setText("");
        rGenderField.setSelectedIndex(0);
        Bdate_Month.setSelectedIndex(0);
        Bdate_Day.setSelectedIndex(0);
        Bdate_Year.setSelectedIndex(0);
        rBloodField.setSelectedIndex(0);
        rPhoneField.setText("+63");
        AgeField.setText("");
        CaseField.setText("");
        pTypeField.setSelectedItem(0);
        WardRoom_No.setSelectedItem(0);
        RoomType.setSelectedItem(0);
        
        
        
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

    private void rGenderFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rGenderFieldActionPerformed

    }//GEN-LAST:event_rGenderFieldActionPerformed

    private void CaseFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CaseFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CaseFieldActionPerformed

    private void St_AddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_St_AddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_St_AddressActionPerformed

    private void rPhoneFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rPhoneFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rPhoneFieldActionPerformed

    private void rDateFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rDateFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rDateFieldActionPerformed

    private void backbutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbutton1ActionPerformed
        PatientManagement PM = new PatientManagement();
        PM.setVisible(true);
        dispose();
    }//GEN-LAST:event_backbutton1ActionPerformed

    private void AgeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgeFieldActionPerformed

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

    private void AgeFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AgeFieldKeyReleased
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
          AgeField.setText("+63");
      }
 
    }//GEN-LAST:event_AgeFieldKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new paddPatient().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButtn;
    private javax.swing.JTextField AgeField;
    private javax.swing.JComboBox<String> Bdate_Day;
    private javax.swing.JComboBox<String> Bdate_Month;
    private javax.swing.JComboBox<String> Bdate_Year;
    private javax.swing.JTextField C_Address;
    private javax.swing.JTextField CaseField;
    private javax.swing.JButton ClearButtn;
    private javax.swing.JTextField FNameField;
    private javax.swing.JTextField LNameField;
    private javax.swing.JTextField Pr_Address;
    private javax.swing.JComboBox<String> RoomType;
    private javax.swing.JTextField St_Address;
    private javax.swing.JComboBox<String> WardRoom_No;
    private javax.swing.JButton backbutton1;
    private javax.swing.JLabel blood;
    private javax.swing.JLabel blood1;
    private javax.swing.JLabel blood2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JComboBox<String> pTypeField;
    private javax.swing.JComboBox<String> rBloodField;
    private javax.swing.JTextField rDateField;
    private javax.swing.JComboBox<String> rGenderField;
    private javax.swing.JTextField rPhoneField;
    // End of variables declaration//GEN-END:variables
}
