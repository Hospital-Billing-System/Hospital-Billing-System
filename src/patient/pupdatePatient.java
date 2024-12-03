package patient;


import Main.Connector;
import Main.Hospital;
import Receptionist.PatientManagement;
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
public class pupdatePatient extends javax.swing.JFrame {

    Connection connection = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    DefaultTableModel defaultTableModel = new DefaultTableModel(){

            boolean[] canEdit = new boolean[]
            {
                    false,false, false, true, true,true, true, true, 
                    true,true, true, true, true,true, true, 
                    true, true,true
            };

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
};
    String Counting;
    String Patient_ID;
    String date;
    String FName;
    String LName;
    String BMonth;
    int BDay;
    int BYear;
    String Patient_Type;
    String blood;
    String gender;
    String St_Address;
    String C_Address;
    String Pr_Address;
    String phone;
    String Patient_Case;
    String room;
    String Room_Type;

    public pupdatePatient() {
        initComponents();
        ImageIcon ic = new ImageIcon(getClass().getResource("/Image/hospital.png"));
        this.setIconImage(ic.getImage());

        Object columns[] = {"Count","Patient_ID","Date", "FName","LName","BMonth","BDay","BYear","Patient Type","Blood Type","Gender", "St_Address","C_Address","Pr_Address", "Phone Number","Patient Case",  "Room", "Room Type"};
        defaultTableModel.setColumnIdentifiers(columns);
        pUTable.setModel(defaultTableModel);
        loadData();
    }

    public void loadData() {
        connection = Connector.ConnectDb();
        String sql = "select Count,Patient_ID,date,FName,LName,BMonth,BDay,BYear,Patient_Type,blood,gender,St_Address,C_Address,Pr_Address,phone,Patient_Case,room,Room_Type from patient";
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            
            Object columnData[] = new Object[18];
            while (rs.next()) {
                columnData[0] = rs.getString("Count");
                columnData[1] = rs.getString("Patient_ID");
                columnData[2] = rs.getString("date");
                columnData[3] = rs.getString("FName");
                columnData[4] = rs.getString("LName");
                columnData[5] = rs.getString("BMonth");
                columnData[6] = rs.getInt("BDay");
                columnData[7] = rs.getInt("BYear");
                columnData[8] = rs.getString("Patient_Type");
                columnData[9] = rs.getString("blood");
                columnData[10] = rs.getString("gender");
                columnData[11] = rs.getString("St_Address");
                columnData[12] = rs.getString("C_Address");
                columnData[13] = rs.getString("Pr_Address");     
                columnData[14] = rs.getString("phone");
                columnData[15] = rs.getString("Patient_Case");
                columnData[16] = rs.getString("room");
                columnData[17] = rs.getString("Room_Type");
           
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
        pUTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        rSearchField = new javax.swing.JTextField();
        SearchBtn = new javax.swing.JButton();
        ViewAllBtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Update Patient !");

        jPanel7.setBackground(new java.awt.Color(0, 51, 51));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Update Patient");

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
                .addGap(498, 498, 498)
                .addComponent(backbutton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backbutton1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pUTable.setModel(new javax.swing.table.DefaultTableModel(
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
        pUTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pUTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(pUTable);

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setText("ID of Patient");

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

        jButton2.setBackground(new java.awt.Color(0, 51, 51));
        jButton2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Update");
        jButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(447, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(rSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ViewAllBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(315, 315, 315))
            .addGroup(layout.createSequentialGroup()
                .addGap(568, 568, 568)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pUTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pUTableMouseClicked
        int row              = pUTable.getSelectedRow();
        String count         = (pUTable.getValueAt(row, 0).toString());
        String pID           = (pUTable.getValueAt(row, 1).toString());
        String pdate         = (pUTable.getValueAt(row, 2).toString());
        String pFName        = (pUTable.getValueAt(row, 3).toString());
        String pLName        = (pUTable.getValueAt(row, 4).toString());
        String pBMonth       = (pUTable.getValueAt(row, 5).toString());
        int pBDay            = Integer.parseInt((pUTable.getValueAt(row, 6).toString()));
        int pBYear           = Integer.parseInt((pUTable.getValueAt(row, 7).toString()));
        String pPatient_Type = (pUTable.getValueAt(row, 8).toString());
        String pblood        = (pUTable.getValueAt(row, 9).toString());
        String pgender       = (pUTable.getValueAt(row, 10).toString());
        String pSt_Address   = (pUTable.getValueAt(row, 11).toString());
        String pC_Address     = (pUTable.getValueAt(row, 12).toString());
        String pPr_Address    = (pUTable.getValueAt(row, 13).toString());
        String pphone        = (pUTable.getValueAt(row, 14).toString());
        String pPatient_Case = (pUTable.getValueAt(row, 15).toString());
        String proom         = (pUTable.getValueAt(row, 16).toString());
        String pRoom_Type    = (pUTable.getValueAt(row, 17).toString());
        
        
        Counting = count;
        Patient_ID = pID;
        date = pdate;
        FName = pFName;
        LName = pLName;
        BMonth = pBMonth;
        BDay =  pBDay;
        BYear = pBYear;
        Patient_Type = pPatient_Type;
        blood = pblood;
        gender = pgender;
        St_Address = pSt_Address;
        C_Address = pC_Address;
        Pr_Address = pPr_Address;
        phone = pphone;
        Patient_Case = pPatient_Case;
        room = proom;
        Room_Type = pRoom_Type;
        
    }//GEN-LAST:event_pUTableMouseClicked

    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtnActionPerformed
        connection = Connector.ConnectDb();
        defaultTableModel.getDataVector().removeAllElements();
        defaultTableModel.fireTableDataChanged();
        String searchKey = rSearchField.getText();
        String sql = "select Count,Patient_ID,date,FName,LName,BMonth,BDay,BYear,Patient_Type,blood,gender,St_Address,C_Address,Pr_Address,phone,Patient_Case,room,Room_Type from patient where Patient_ID = '" + searchKey + "'";
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            Object columnData[] = new Object[18];
            while (rs.next()) {
                columnData[0] = rs.getString("Count");
                columnData[1] = rs.getString("Patient_ID");
                columnData[2] = rs.getString("date");
                columnData[3] = rs.getString("FName");
                columnData[4] = rs.getString("LName");
                columnData[5] = rs.getString("BMonth");
                columnData[6] = rs.getInt("BDay");
                columnData[7] = rs.getInt("BYear");
                columnData[8] = rs.getString("Patient_Type");
                columnData[9] = rs.getString("blood");
                columnData[10] = rs.getString("gender");
                columnData[11] = rs.getString("St_Address");
                columnData[12] = rs.getString("C_Address");
                columnData[13] = rs.getString("Pr_Address");
                columnData[14] = rs.getString("phone");
                columnData[15] = rs.getString("Patient_Case");
                columnData[16] = rs.getString("room");
                columnData[17] = rs.getString("Room_Type");

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
        
        String sql = "select Count,Patient_ID,date,FName,LName,BMonth,BDay,BYear,Patient_Type,blood,gender,St_Address,C_Address,Pr_Address,phone,Patient_Case,room,Room_Type from patient";
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            Object columnData[] = new Object[18];
            while (rs.next()) {
                columnData[0] = rs.getString("Count");
                columnData[1] = rs.getString("Patient_ID");
                columnData[2] = rs.getString("date");
                columnData[3] = rs.getString("FName");
                columnData[4] = rs.getString("LName");
                columnData[5] = rs.getString("BMonth");
                columnData[6] = rs.getInt("BDay");
                columnData[7] = rs.getInt("BYear");
                columnData[8] = rs.getString("Patient_Type");
                columnData[9] = rs.getString("blood");
                columnData[10] = rs.getString("gender");
                columnData[11] = rs.getString("St_Address");
                columnData[12] = rs.getString("C_Address");
                columnData[13] = rs.getString("Pr_Address");
                columnData[14] = rs.getString("phone");
                columnData[15] = rs.getString("Patient_Case");
                columnData[16] = rs.getString("room");
                columnData[17] = rs.getString("Room_Type");

                defaultTableModel.addRow(columnData);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_ViewAllBtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        connection = Connector.ConnectDb();
        String sql = "Update patient set Count = '" + Counting + "',FName = '" + FName + "', LName = '" + LName + "', BMonth = '" + BMonth + "', BDay = '" + BDay + "' , BYear = '" + BYear + "',Patient_Type = '" + Patient_Type + "', blood = '" + blood + "',gender = '" + gender + "', St_Address = '" + St_Address + "', C_Address = '" + C_Address + "', Pr_Address = '" + Pr_Address + "', phone = '" + phone + "', Patient_Case = '" + Patient_Case + "', room = '" + room + "', Room_Type = '" + Room_Type + "' where Count = '" + Counting + "'";
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
    }//GEN-LAST:event_jButton2ActionPerformed

    private void backbutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbutton1ActionPerformed
        PatientManagement PM = new PatientManagement();
        PM.setVisible(true);
        dispose();
    }//GEN-LAST:event_backbutton1ActionPerformed

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
            java.util.logging.Logger.getLogger(pupdatePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pupdatePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pupdatePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pupdatePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new pupdatePatient().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SearchBtn;
    private javax.swing.JButton ViewAllBtn;
    private javax.swing.JButton backbutton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable pUTable;
    private javax.swing.JTextField rSearchField;
    // End of variables declaration//GEN-END:variables
}
