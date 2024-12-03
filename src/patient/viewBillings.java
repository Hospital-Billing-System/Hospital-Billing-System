package patient;

import Main.Connector;
import Main.Hospital;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Ditalo
 */
public class viewBillings extends javax.swing.JFrame {
    
    
    Connection connection = null;
    ResultSet rs = null;
    PreparedStatement ps = null;
     DefaultTableModel defaultTableModel = new DefaultTableModel(){

           boolean canEdit;
           
            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                
                return canEdit = false;
            }
        };
    
    public viewBillings() {
        initComponents();
        ImageIcon ic = new ImageIcon(getClass().getResource("/Image/hospital.png"));
        this.setIconImage(ic.getImage());
        Date1.setDateFormatString("yyyy-MM-dd");
        Date2.setDateFormatString("yyyy-MM-dd");

        Object columns[] = {"Bill ID", "Date", "Admission Date", "Discharge Date", "Patient ID", "Name","Room Type","Doctor Name"
                            ,"Discount","Patient Type", "Room Charges", "Doctors Fee","Laboratory Fee", "Miscellanous","Test Fee","PhilHealth ID","PhilHealth Deduction","SubTotal","Total"};
        defaultTableModel.setColumnIdentifiers(columns);
        rTable.setModel(defaultTableModel);

        loadData();
    }

    public void loadData() {
        connection = Connector.ConnectDb();
        String sql = "select * from Billing";
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            Object columnData[] = new Object[19];
            while (rs.next()) {
                columnData[0] = rs.getInt("Bill_No");
                columnData[1] = rs.getString("Date");
                columnData[2] = rs.getString("Admission_Date");
                columnData[3] = rs.getString("Discharge_Date");
                columnData[4] = rs.getString("Patient_ID");
                columnData[5] = rs.getString("Name");
                columnData[6] = rs.getString("P_RoomType");
                columnData[7] = rs.getString("Doctor_Name");
                columnData[8] = rs.getString("Discount");
                columnData[9] = rs.getString("Patient_Type");
                columnData[10] = rs.getString("Room_Charges");
                columnData[11] = rs.getString("Doctors_Fee");
                columnData[12] = rs.getString("Lab_Fee");
                columnData[13] = rs.getString("Miscellanous");
                columnData[14] = rs.getString("Test_Fee");
                columnData[15] = rs.getString("PhilHealth_ID");
                columnData[16] = rs.getInt("PhilHealth_Deduct");
                columnData[17] = rs.getString("subtotal");
                columnData[18] = rs.getString("Total");
                defaultTableModel.addRow(columnData);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        backbutton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        rTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        SearchBtn = new javax.swing.JButton();
        ViewAllBtn = new javax.swing.JButton();
        Date2 = new com.toedter.calendar.JDateChooser();
        Date1 = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        PrintButtn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("View Doctors !");

        jPanel1.setPreferredSize(new java.awt.Dimension(1260, 575));

        jPanel7.setBackground(new java.awt.Color(0, 51, 51));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.setForeground(new java.awt.Color(255, 255, 255));

        jLabel14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("View Billings");

        backbutton1.setBackground(new java.awt.Color(0, 51, 51));
        backbutton1.setForeground(new java.awt.Color(255, 255, 255));
        backbutton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/backs.png"))); // NOI18N
        backbutton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        backbutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbutton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(493, 493, 493)
                .addComponent(backbutton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backbutton1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        rTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(rTable);

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setText("FROM");

        SearchBtn.setBackground(new java.awt.Color(0, 51, 51));
        SearchBtn.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        SearchBtn.setForeground(new java.awt.Color(255, 255, 255));
        SearchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/searchicon.png"))); // NOI18N
        SearchBtn.setText("Search");
        SearchBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        SearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBtnActionPerformed(evt);
            }
        });

        ViewAllBtn.setBackground(new java.awt.Color(0, 51, 51));
        ViewAllBtn.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ViewAllBtn.setForeground(new java.awt.Color(255, 255, 255));
        ViewAllBtn.setText("View All");
        ViewAllBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ViewAllBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewAllBtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setText("TO");

        PrintButtn1.setBackground(new java.awt.Color(0, 51, 51));
        PrintButtn1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        PrintButtn1.setForeground(new java.awt.Color(255, 255, 255));
        PrintButtn1.setText("Print");
        PrintButtn1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PrintButtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintButtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(454, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(1, 1, 1)
                        .addComponent(Date1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel3)
                        .addGap(4, 4, 4)
                        .addComponent(Date2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(SearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ViewAllBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(297, 297, 297))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(PrintButtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(564, 564, 564))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ViewAllBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(Date2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(1, 1, 1))
                        .addComponent(Date1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PrintButtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backbutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbutton1ActionPerformed
        Billing B = new Billing();
        B.setVisible(true);
        dispose();
    }//GEN-LAST:event_backbutton1ActionPerformed

    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtnActionPerformed
        connection = Connector.ConnectDb();
        defaultTableModel.getDataVector().removeAllElements();
        defaultTableModel.fireTableDataChanged();
      
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String date1 = (df.format(Date1.getDate()));
        String date2 = (df.format(Date2.getDate()));
       String sql = "select * from billing WHERE Date BETWEEN '"+date1+"' AND '"+date2+"'";
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            Object columnData[] = new Object[19];
            while (rs.next()) {
                columnData[0] = rs.getInt("Bill_No");
                columnData[1] = rs.getString("Date");
                columnData[2] = rs.getString("Admission_Date");
                columnData[3] = rs.getString("Discharge_Date");
                columnData[4] = rs.getString("Patient_ID");
                columnData[5] = rs.getString("Name");
                columnData[6] = rs.getString("P_RoomType");
                columnData[7] = rs.getString("Doctor_Name");
                columnData[8] = rs.getString("Discount");
                columnData[9] = rs.getString("Patient_Type");
                columnData[10] = rs.getInt("Room_Charges");
                columnData[11] = rs.getInt("Doctors_Fee");
                columnData[12] = rs.getInt("Lab_Fee");
                columnData[13] = rs.getInt("Miscellanous");
                columnData[14] = rs.getInt("Test_Fee");
                columnData[15] = rs.getString("PhilHealth_ID");
                columnData[16] = rs.getInt("PhilHealth_Deduct");
                columnData[17] = rs.getString("subtotal");
                columnData[18] = rs.getString("Total");
                defaultTableModel.addRow(columnData);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchBtnActionPerformed

    private void ViewAllBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewAllBtnActionPerformed
        connection = Connector.ConnectDb();
        defaultTableModel.getDataVector().removeAllElements();
        defaultTableModel.fireTableDataChanged();
        String sql = "select * from Billing";
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            Object columnData[] = new Object[19];
            while (rs.next()) {
                columnData[0] = rs.getInt("Bill_No");
                columnData[1] = rs.getString("Date");
                columnData[2] = rs.getString("Admission_Date");
                columnData[3] = rs.getString("Discharge_Date");
                columnData[4] = rs.getString("Patient_ID");
                columnData[5] = rs.getString("Name");
                columnData[6] = rs.getString("P_RoomType");
                columnData[7] = rs.getString("Doctor_Name");
                columnData[8] = rs.getString("Discount");
                columnData[9] = rs.getString("Patient_Type");
                columnData[10] = rs.getInt("Room_Charges");
                columnData[11] = rs.getInt("Doctors_Fee");
                columnData[12] = rs.getInt("Lab_Fee");
                columnData[13] = rs.getInt("Miscellanous");
                columnData[14] = rs.getInt("Test_Fee");
                columnData[15] = rs.getString("PhilHealth_ID");
                columnData[16] = rs.getInt("PhilHealth_Deduct");
                columnData[17] = rs.getString("subtotal");
                columnData[18] = rs.getString("Total");
                defaultTableModel.addRow(columnData);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_ViewAllBtnActionPerformed

    private void PrintButtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintButtn1ActionPerformed
        connection = Connector.ConnectDb();
        
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String date1 = (df.format(Date1.getDate()));
        String date2 = (df.format(Date2.getDate()));
        try {
            JasperDesign jdesign = JRXmlLoader.load(new File("").getAbsolutePath()+ "/src/patient/report2.jrxml");
            HashMap param=new HashMap();
            param.put("date1", date1);
            param.put("date2", date2);
            String query = "select * from billing WHERE DATE BETWEEN '"+date1+"' AND '"+date2+"'";
            
            JRDesignQuery updateQuery = new JRDesignQuery();
            updateQuery.setText(query);
            
            jdesign.setQuery(updateQuery);
            JasperReport jreport = JasperCompileManager.compileReport(jdesign);
            JasperPrint jprint = JasperFillManager.fillReport(jreport, param, connection);

            JasperViewer jv = new JasperViewer(jprint,false);
            jv.setVisible(true);
            
        } catch (JRException e) {
            e.printStackTrace();
        }
        
        
    }//GEN-LAST:event_PrintButtn1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new viewBillings().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Date1;
    private com.toedter.calendar.JDateChooser Date2;
    private javax.swing.JButton PrintButtn1;
    private javax.swing.JButton SearchBtn;
    private javax.swing.JButton ViewAllBtn;
    private javax.swing.JButton backbutton1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable rTable;
    // End of variables declaration//GEN-END:variables
}
