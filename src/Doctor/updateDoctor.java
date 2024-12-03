package Doctor;

import Admin.doctorManagement;
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
public class updateDoctor extends javax.swing.JFrame {

    Connection connection = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
        DefaultTableModel defaultTableModel = new DefaultTableModel(){

            boolean[] canEdit = new boolean[]
            {
                    false, true, true, true,true, true, true, 
                    true,true, true, true, true,true, true, 
                    true,true,true,true
            };

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
    };

    int Doctor_ID;
    String date;
    String FName;
    String MName;
    String LName;
    String BMonth;
    int BDay;
    int BYear;
    String blood;
    String gender;
    String dept;
    int Prof_Fee;
    String St_Address;
    String C_Address;
    String Pr_Address;
    String phone;
    String email;
    String status;


    public updateDoctor() {
        initComponents();
        ImageIcon ic = new ImageIcon(getClass().getResource("/Image/hospital.png"));
        this.setIconImage(ic.getImage());

        Object columns[] = {"Doctor_ID", "Date", "FName", "MName", "LName", "BMonth", "BDay", "BYear", "Gender","Blood", "Dept", "Phone", "Prof_Fee" ,"St_Address","C_Address","Pr_Address","Email","Status"};
        defaultTableModel.setColumnIdentifiers(columns);
        dUTable.setModel(defaultTableModel);
        loadData();
    }

    public void loadData() {
    connection = Connector.ConnectDb();
      String sql = "select Doctor_ID,Date,FName,MName,LName,BMonth,BDay,BYear,gender,blood,dept,phone,Prof_Fee,St_Address,C_Address,Pr_Address,email,status from doctor";
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            Object columnData[] = new Object[18];
            while (rs.next()) {
                columnData[0] = rs.getInt("Doctor_ID");
                columnData[1] = rs.getString("Date");
                columnData[2] = rs.getString("FName");
                columnData[3] = rs.getString("MName");
                columnData[4] = rs.getString("LName");
                columnData[5] = rs.getString("BMonth");
                columnData[6] = rs.getInt("BDay");
                columnData[7] = rs.getInt("BYear");
                columnData[8] = rs.getString("gender");
                columnData[9] = rs.getString("blood");
                columnData[10] = rs.getString("dept");
                columnData[11] = rs.getString("phone");
                columnData[12] = rs.getString("Prof_Fee");
                columnData[13] = rs.getString("St_Address");           
                columnData[14] = rs.getString("C_Address");
                columnData[15] = rs.getString("Pr_Address");
                columnData[16] = rs.getString("email");
                columnData[17] = rs.getString("status");

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
        backbutton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        dUTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        rSearchField = new javax.swing.JTextField();
        SearchBtn = new javax.swing.JButton();
        ViewAllBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Update Doctor info !");

        jPanel7.setBackground(new java.awt.Color(0, 51, 51));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Update Doctor");

        backbutton1.setBackground(new java.awt.Color(0, 51, 51));
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
                .addGap(523, 523, 523)
                .addComponent(backbutton1)
                .addGap(27, 27, 27))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
            .addComponent(backbutton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        dUTable.setModel(new javax.swing.table.DefaultTableModel(
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
        dUTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dUTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(dUTable);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("ID of Doctor");

        SearchBtn.setBackground(new java.awt.Color(0, 51, 55));
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

        ViewAllBtn.setBackground(new java.awt.Color(0, 51, 55));
        ViewAllBtn.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ViewAllBtn.setForeground(new java.awt.Color(255, 255, 255));
        ViewAllBtn.setText("View All");
        ViewAllBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ViewAllBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewAllBtnActionPerformed(evt);
            }
        });

        updateBtn.setBackground(new java.awt.Color(0, 51, 55));
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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(383, 383, 383)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(rSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ViewAllBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(571, 571, 571)
                        .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(415, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ViewAllBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dUTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dUTableMouseClicked
        int row = dUTable.getSelectedRow();
        int dID = Integer.parseInt((dUTable.getValueAt(row, 0).toString()));
        String rdate = (dUTable.getValueAt(row, 1).toString());
        String fname = (dUTable.getValueAt(row, 2).toString());
        String mname = (dUTable.getValueAt(row, 3).toString());
        String lname = (dUTable.getValueAt(row, 4).toString());
        String bmonth = (dUTable.getValueAt(row, 5).toString());
        int bday = Integer.parseInt(dUTable.getValueAt(row, 6).toString());
        int byear = Integer.parseInt(dUTable.getValueAt(row, 7).toString());
        String rgender = (dUTable.getValueAt(row, 8).toString());
        String rblood = (dUTable.getValueAt(row, 9).toString());
        String rdept = (dUTable.getValueAt(row, 10).toString());
        String rphone = (dUTable.getValueAt(row, 11).toString());
        int Pfee = Integer.parseInt(dUTable.getValueAt(row, 12).toString());
        String Stadd = (dUTable.getValueAt(row, 13).toString());
        String Cadd = (dUTable.getValueAt(row, 14).toString());
        String Pradd = (dUTable.getValueAt(row, 15).toString());
        String remail = (dUTable.getValueAt(row, 16).toString());
        String rstatus = (dUTable.getValueAt(row, 17).toString());

   
        Doctor_ID = dID;
        date = rdate;
        FName = fname;
        MName = mname;
        LName = lname;
        BMonth = bmonth;
        BDay = bday;
        BYear = byear;     
        gender = rgender;
        blood = rblood;
        dept = rdept;
        phone = rphone;
        Prof_Fee = Pfee;
        St_Address = Stadd;
        C_Address = Cadd;
        Pr_Address = Pradd;
        email = remail;
        status = rstatus;

    }//GEN-LAST:event_dUTableMouseClicked


    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtnActionPerformed
        connection = Connector.ConnectDb();
        defaultTableModel.getDataVector().removeAllElements();
        defaultTableModel.fireTableDataChanged();
        String searchKey = rSearchField.getText();
        String sql = "select Doctor_ID,Date,FName,MName,LName,BMonth,BDay,BYear,gender,blood,dept,phone,Prof_Fee,St_Address,C_Address,Pr_Address,email,status from doctor where Doctor_ID = '" + searchKey + "'";
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            Object columnData[] = new Object[18];
            while (rs.next()) {
                columnData[0] = rs.getInt("Doctor_ID");
                columnData[1] = rs.getString("Date");
                columnData[2] = rs.getString("FName");
                columnData[3] = rs.getString("MName");
                columnData[4] = rs.getString("LName");
                columnData[5] = rs.getString("BMonth");
                columnData[6] = rs.getInt("BDay");
                columnData[7] = rs.getInt("BYear");
                columnData[8] = rs.getString("gender");
                columnData[9] = rs.getString("blood");
                columnData[10] = rs.getString("dept");
                columnData[11] = rs.getString("phone");
                columnData[12] = rs.getString("Prof_Fee");
                columnData[13] = rs.getString("St_Address");           
                columnData[14] = rs.getString("C_Address");
                columnData[15] = rs.getString("Pr_Address");
                columnData[16] = rs.getString("email");
                columnData[17] = rs.getString("status");


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

       String sql = "select Doctor_ID,Date,FName,MName,LName,BMonth,BDay,BYear,gender,blood,dept,phone,Prof_Fee,St_Address,C_Address,Pr_Address,email,status from doctor";
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            Object columnData[] = new Object[18];
            while (rs.next()) {
                columnData[0] = rs.getInt("Doctor_ID");
                columnData[1] = rs.getString("Date");
                columnData[2] = rs.getString("FName");
                columnData[3] = rs.getString("MName");
                columnData[4] = rs.getString("LName");
                columnData[5] = rs.getString("BMonth");
                columnData[6] = rs.getInt("BDay");
                columnData[7] = rs.getInt("BYear");
                columnData[8] = rs.getString("gender");
                columnData[9] = rs.getString("blood");
                columnData[10] = rs.getString("dept");
                columnData[11] = rs.getString("phone");
                columnData[12] = rs.getString("Prof_Fee");
                columnData[13] = rs.getString("St_Address");           
                columnData[14] = rs.getString("C_Address");
                columnData[15] = rs.getString("Pr_Address");
                columnData[16] = rs.getString("email");
                columnData[17] = rs.getString("status");

                defaultTableModel.addRow(columnData);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_ViewAllBtnActionPerformed

    private void backbutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbutton1ActionPerformed
        doctorManagement RM = new doctorManagement();
        RM.setVisible(true);
        dispose();
    }//GEN-LAST:event_backbutton1ActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        connection = Connector.ConnectDb();
        String sql = "Update doctor set Doctor_ID = '" + Doctor_ID + "', Date = '" + date + "', FName = '" + FName + "', MName = '" + MName + "', LName = '" + LName + "', BMonth = '" + BMonth + "', BDay = '" + BDay + "', BYear = '" + BYear + "', gender = '" + gender + "', blood = '" + blood + "', dept = '" + dept + "', phone = '" + phone + "', Prof_Fee = '" + Prof_Fee + "', St_Address = '" + St_Address + "', C_Address = '" + C_Address + "', Pr_Address = '" + Pr_Address + "', email = '" + email + "', status = '" + status + "' where Doctor_ID = '" + Doctor_ID + "'";
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

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new updateDoctor().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SearchBtn;
    private javax.swing.JButton ViewAllBtn;
    private javax.swing.JButton backbutton1;
    private javax.swing.JTable dUTable;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField rSearchField;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
