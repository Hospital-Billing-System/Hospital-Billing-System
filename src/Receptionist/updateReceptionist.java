package Receptionist;

import Admin.ReceptionistManagement;
import Main.Connector;
import Main.Hospital;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ditalo
 */
public class updateReceptionist extends javax.swing.JFrame {

    Connection connection = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
        DefaultTableModel defaultTableModel = new DefaultTableModel(){

            boolean[] canEdit = new boolean[]
            {
                    false, true, true, true,true, true, true, 
                    true,true, true, true, true,true, true, 
                    true,true,true,true,true
            };

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
    };
    int Recep_ID;
    String date;
    String FName;
    String MName;
    String LName;
    String BMonth;
    int BDay;
    int BYear;
    String blood;
    String gender;
    String email;
    String Security_Answer;
    String phone;
    String St_Address;
    String C_Address;
    String Pr_Address;
    String status;
    String username;
    String password;


    public updateReceptionist() {
        initComponents();
        ImageIcon ic = new ImageIcon(getClass().getResource("/Image/hospital.png"));
        this.setIconImage(ic.getImage());

        Object columns[] = {"Recep_ID", "Date", "FName", "MName", "LName", "BMonth", "BDay", "BYear", "Gender","Blood", "Email","Security_Answer", "Phone" ,"Street_Addrs","City_Addrs","Province_Addrs","Status","Username"};
        defaultTableModel.setColumnIdentifiers(columns);
        rUTable.setModel(defaultTableModel);
        loadData();
    }

    public void loadData() {
    connection = Connector.ConnectDb();
      String sql = "select Recep_ID,Date,FName,MName,LName,BMonth,BDay,BYear,gender,blood,email,Security_Answer,phone,St_Address,C_Address,Pr_Address,status,username from receptionist";
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            Object columnData[] = new Object[18];
            while (rs.next()) {
                columnData[0] = rs.getInt("Recep_ID");
                columnData[1] = rs.getString("Date");
                columnData[2] = rs.getString("FName");
                columnData[3] = rs.getString("MName");
                columnData[4] = rs.getString("LName");
                columnData[5] = rs.getString("BMonth");
                columnData[6] = rs.getInt("BDay");
                columnData[7] = rs.getInt("BYear");
                columnData[8] = rs.getString("gender");
                columnData[9] = rs.getString("blood");
                columnData[10] = rs.getString("email");
                columnData[11] = rs.getString("Security_Answer");
                columnData[12] = rs.getString("phone");
                columnData[13] = rs.getString("St_Address");           
                columnData[14] = rs.getString("C_Address");
                columnData[15] = rs.getString("Pr_Address");
                columnData[16] = rs.getString("status");
                columnData[17] = rs.getString("username");
                defaultTableModel.addRow(columnData);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        backbutton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        rUTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        rSearchField = new javax.swing.JTextField();
        SearchBtn = new javax.swing.JButton();
        ViewAllBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Update Receptionist");

        jPanel7.setBackground(new java.awt.Color(0, 51, 51));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.setForeground(new java.awt.Color(255, 255, 255));

        jLabel14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Update Receptionist");

        backbutton.setBackground(new java.awt.Color(0, 51, 51));
        backbutton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        backbutton.setForeground(new java.awt.Color(255, 255, 255));
        backbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/backs.png"))); // NOI18N
        backbutton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(520, 520, 520)
                .addComponent(backbutton)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        rUTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", "", null},
                {"", "", "", ""},
                {"", "", null, ""},
                {"", null, "", ""}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        rUTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rUTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(rUTable);

        jLabel2.setBackground(new java.awt.Color(0, 51, 51));
        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("ID of Doctor");

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

        updateBtn.setBackground(new java.awt.Color(0, 51, 51));
        updateBtn.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        updateBtn.setForeground(new java.awt.Color(255, 255, 255));
        updateBtn.setText("Update");
        updateBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(463, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(rSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ViewAllBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(352, 352, 352))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(584, 584, 584))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ViewAllBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rUTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rUTableMouseClicked
        int row = rUTable.getSelectedRow();
        int rId = Integer.parseInt((rUTable.getValueAt(row, 0).toString())); 
        String rdate = (rUTable.getValueAt(row, 1).toString());
        String Fname = (rUTable.getValueAt(row, 2).toString());
        String Mname = (rUTable.getValueAt(row, 3).toString());
        String Lname = (rUTable.getValueAt(row, 4).toString());
        String Bmonth = (rUTable.getValueAt(row, 5).toString());
        int Bday = Integer.parseInt((rUTable.getValueAt(row, 6).toString()));
        int Byear = Integer.parseInt((rUTable.getValueAt(row, 7).toString()));         
        String rgender = (rUTable.getValueAt(row, 8).toString());
        String rblood = (rUTable.getValueAt(row, 9).toString());
        String remail = (rUTable.getValueAt(row, 10).toString());
        String scode = (rUTable.getValueAt(row, 11).toString());
        String rphone = (rUTable.getValueAt(row, 12).toString());
        String Staddress = (rUTable.getValueAt(row, 13).toString());
        String Caddress = (rUTable.getValueAt(row, 14).toString());
        String Praddress = (rUTable.getValueAt(row, 15).toString());
        String rstatus = (rUTable.getValueAt(row, 16).toString());
        String username2 = (rUTable.getValueAt(row, 17).toString());


  
        Recep_ID = rId; 
        date = rdate;
        FName = Fname;
        MName = Mname;
        LName = Lname;
        BMonth = Bmonth;
        BDay   = Bday;
        BYear  = Byear;
        Security_Answer = scode;
        gender = rgender;
        blood = rblood;
        email = remail;
        phone = rphone;
        St_Address = Staddress;
        C_Address = Caddress;
        Pr_Address = Praddress;
        status = rstatus;
        username = username2;
    }//GEN-LAST:event_rUTableMouseClicked


    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtnActionPerformed
        connection = Connector.ConnectDb();
        defaultTableModel.getDataVector().removeAllElements();
        defaultTableModel.fireTableDataChanged();
        String searchKey = rSearchField.getText();
        String sql = "select Recep_ID,Date,FName,MName,LName,BMonth,BDay,BYear,gender,blood,email,Security_Answer,phone,St_Address,C_Address,Pr_Address,status,username from receptionist where Recep_ID = '" + searchKey + "'";
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
             Object columnData[] = new Object[18];
            while (rs.next()) {
                columnData[0] = rs.getInt("Recep_ID");
                columnData[1] = rs.getString("Date");
                columnData[2] = rs.getString("FName");
                columnData[3] = rs.getString("MName");
                columnData[4] = rs.getString("LName");
                columnData[5] = rs.getString("BMonth");
                columnData[6] = rs.getInt("BDay");
                columnData[7] = rs.getInt("BYear");
                columnData[8] = rs.getString("gender");
                columnData[9] = rs.getString("blood");
                columnData[10] = rs.getString("email");
                columnData[11] = rs.getString("Security_Answer");
                columnData[12] = rs.getString("phone");
                columnData[13] = rs.getString("St_Address");           
                columnData[14] = rs.getString("C_Address");
                columnData[15] = rs.getString("Pr_Address");
                columnData[16] = rs.getString("status");
                columnData[17] = rs.getString("username");
                defaultTableModel.addRow(columnData);           
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_SearchBtnActionPerformed

    private void ViewAllBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewAllBtnActionPerformed
        connection = Connector.ConnectDb();
        defaultTableModel.getDataVector().removeAllElements();
        defaultTableModel.fireTableDataChanged();

        String sql = "select Recep_ID,Date,FName,MName,LName,BMonth,BDay,BYear,gender,blood,email,Security_Answer,phone,St_Address,C_Address,Pr_Address,status,username from receptionist";
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            Object columnData[] = new Object[18];
            while (rs.next()) {
                columnData[0] = rs.getInt("Recep_ID");
                columnData[1] = rs.getString("Date");
                columnData[2] = rs.getString("FName");
                columnData[3] = rs.getString("MName");
                columnData[4] = rs.getString("LName");
                columnData[5] = rs.getString("BMonth");
                columnData[6] = rs.getInt("BDay");
                columnData[7] = rs.getInt("BYear");
                columnData[8] = rs.getString("gender");
                columnData[9] = rs.getString("blood");
                columnData[10] = rs.getString("email");
                columnData[11] = rs.getString("Security_Answer");
                columnData[12] = rs.getString("phone");
                columnData[13] = rs.getString("St_Address");           
                columnData[14] = rs.getString("C_Address");
                columnData[15] = rs.getString("Pr_Address");
                columnData[16] = rs.getString("status");
                columnData[17] = rs.getString("username");
                defaultTableModel.addRow(columnData);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_ViewAllBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
 connection = Connector.ConnectDb();
        String sql = "Update receptionist set Recep_ID = '" + Recep_ID + "', Date = '" + date + "', FName = '" + FName + "', MName = '" + MName + "', LName = '" + LName + "', BMonth = '" + BMonth + "', BDay = '" + BDay + "', BYear = '" + BYear + "', gender = '" + gender + "', blood = '" + blood + "', email = '" + email + "', Security_Answer = '" + Security_Answer + "', phone = '" + phone + "', St_Address = '" + St_Address + "', C_Address = '" + C_Address + "', Pr_Address = '" + Pr_Address + "', status = '" + status + "', username = '" + username + "' where Recep_ID = '" + Recep_ID + "'";
        try {
            ps = connection.prepareStatement(sql);
            ps.execute();
            defaultTableModel.getDataVector().removeAllElements();
            defaultTableModel.fireTableDataChanged();
            loadData();
            JOptionPane.showMessageDialog(null, "Data Updated");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
        ReceptionistManagement RM = new ReceptionistManagement();
        RM.setVisible(true);
        dispose();
    }//GEN-LAST:event_backbuttonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new updateReceptionist().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SearchBtn;
    private javax.swing.JButton ViewAllBtn;
    private javax.swing.JButton backbutton;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField rSearchField;
    private javax.swing.JTable rUTable;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
