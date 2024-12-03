package patient;


import Main.Connector;
import Main.Hospital;
import Receptionist.PatientManagement;
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
public class pviewPatient extends javax.swing.JFrame {

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

    public pviewPatient() {
        initComponents();
        ImageIcon ic = new ImageIcon(getClass().getResource("/Image/hospital.png"));
        this.setIconImage(ic.getImage());

         Object columns[] = {"Patient_ID","Date", "FName","LName","BMonth","BDay","BYear","Patient Type","Blood Type","Gender", "St_Address","C_Address","Pr_Address", "Phone Number","Patient Case",  "Room", "Room Type"};
        defaultTableModel.setColumnIdentifiers(columns);
        pTable.setModel(defaultTableModel);
        loadData();
    }

   public void loadData() {
        connection = Connector.ConnectDb();
        String sql = "select Patient_ID,date,FName,LName,BMonth,BDay,BYear,Patient_Type,blood,gender,St_Address,C_Address,Pr_Address,phone,Patient_Case,room,Room_Type from patient";
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            Object columnData[] = new Object[17];
            while (rs.next()) {
                columnData[0] = rs.getString("Patient_ID");
                columnData[1] = rs.getString("date");
                columnData[2] = rs.getString("FName");
                columnData[3] = rs.getString("LName");
                columnData[4] = rs.getString("BMonth");
                columnData[5] = rs.getInt("BDay");
                columnData[6] = rs.getInt("BYear");
                columnData[7] = rs.getString("Patient_Type");
                columnData[8] = rs.getString("blood");
                columnData[9] = rs.getString("gender");
                columnData[10] = rs.getString("St_Address");
                columnData[11] = rs.getString("C_Address");
                columnData[12] = rs.getString("Pr_Address");     
                columnData[13] = rs.getString("phone");
                columnData[14] = rs.getString("Patient_Case");
                columnData[15] = rs.getString("room");
                columnData[16] = rs.getString("Room_Type");
           
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
        jScrollPane2 = new javax.swing.JScrollPane();
        pTable = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        backbutton1 = new javax.swing.JButton();
        rSearchField = new javax.swing.JTextField();
        SearchBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ViewAllBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("View Patients !");

        jPanel1.setPreferredSize(new java.awt.Dimension(1260, 575));

        pTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "title 5"
            }
        ));
        jScrollPane2.setViewportView(pTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1248, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel7.setBackground(new java.awt.Color(0, 51, 51));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.setForeground(new java.awt.Color(255, 255, 255));

        jLabel14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Search Patients");

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
                .addGap(513, 513, 513)
                .addComponent(backbutton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(backbutton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

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

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel1.setText("Last Name of Patient");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1268, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(412, 412, 412)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ViewAllBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(325, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ViewAllBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtnActionPerformed
        connection = Connector.ConnectDb();
        defaultTableModel.getDataVector().removeAllElements();
        defaultTableModel.fireTableDataChanged();
        String searchKey = rSearchField.getText();
        String sql = "select Patient_ID,date,FName,LName,BMonth,BDay,BYear,Patient_Type,blood,gender,St_Address,C_Address,Pr_Address,phone,Patient_Case,room,Room_Type from patient where LName = '" + searchKey + "'";
        try {
            ps = connection.prepareStatement(sql);         
            rs = ps.executeQuery();
            Object columnData[] = new Object[17];
            while (rs.next()) {
                columnData[0] = rs.getString("Patient_ID");
                columnData[1] = rs.getString("date");
                columnData[2] = rs.getString("FName");
                columnData[3] = rs.getString("LName");
                columnData[4] = rs.getString("BMonth");
                columnData[5] = rs.getInt("BDay");
                columnData[6] = rs.getInt("BYear");
                columnData[7] = rs.getString("Patient_Type");
                columnData[8] = rs.getString("blood");
                columnData[9] = rs.getString("gender");
                columnData[10] = rs.getString("St_Address");
                columnData[11] = rs.getString("C_Address");
                columnData[12] = rs.getString("Pr_Address");     
                columnData[13] = rs.getString("phone");
                columnData[14] = rs.getString("Patient_Case");
                columnData[15] = rs.getString("room");
                columnData[16] = rs.getString("Room_Type");
           
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
        String sql = "select Patient_ID,date,FName,LName,BMonth,BDay,BYear,Patient_Type,blood,gender,St_Address,C_Address,Pr_Address,phone,Patient_Case,room,Room_Type from patient";
        try {
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            Object columnData[] = new Object[17];
            while (rs.next()) {
                columnData[0] = rs.getString("Patient_ID");
                columnData[1] = rs.getString("date");
                columnData[2] = rs.getString("FName");
                columnData[3] = rs.getString("LName");
                columnData[4] = rs.getString("BMonth");
                columnData[5] = rs.getInt("BDay");
                columnData[6] = rs.getInt("BYear");
                columnData[7] = rs.getString("Patient_Type");
                columnData[8] = rs.getString("blood");
                columnData[9] = rs.getString("gender");
                columnData[10] = rs.getString("St_Address");
                columnData[11] = rs.getString("C_Address");
                columnData[12] = rs.getString("Pr_Address");     
                columnData[13] = rs.getString("phone");
                columnData[14] = rs.getString("Patient_Case");
                columnData[15] = rs.getString("room");
                columnData[16] = rs.getString("Room_Type");
           
                defaultTableModel.addRow(columnData);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    
    }//GEN-LAST:event_ViewAllBtnActionPerformed

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
            java.util.logging.Logger.getLogger(pviewPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pviewPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pviewPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pviewPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new pviewPatient().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SearchBtn;
    private javax.swing.JButton ViewAllBtn;
    private javax.swing.JButton backbutton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable pTable;
    private javax.swing.JTextField rSearchField;
    // End of variables declaration//GEN-END:variables
}
