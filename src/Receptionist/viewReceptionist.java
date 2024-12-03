package Receptionist;

import Admin.ReceptionistManagement;
import Main.Connector;
import Main.Hospital;
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
public class viewReceptionist extends javax.swing.JFrame {

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

    public viewReceptionist() {
        initComponents();
        ImageIcon ic = new ImageIcon(getClass().getResource("/Image/hospital.png"));
        this.setIconImage(ic.getImage());

        Object columns[] = {"Recep_ID", "Date", "FName", "MName", "LName", "BMonth", "BDay", "BYear", "Gender","Blood", "Email", "Security_Answer", "Phone" ,"Street_Addrs","City_Addrs","Province_Addrs","Status","Username"};
        defaultTableModel.setColumnIdentifiers(columns);
        rTable.setModel(defaultTableModel);
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

        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        backbutton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        rTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        rSearchField = new javax.swing.JTextField();
        SearchBtn = new javax.swing.JButton();
        ViewAllBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("View Receptionist !");

        jPanel1.setPreferredSize(new java.awt.Dimension(1260, 575));

        jPanel7.setBackground(new java.awt.Color(0, 51, 51));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("View Receptionist");

        backbutton.setBackground(new java.awt.Color(0, 51, 51));
        backbutton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
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
                .addGap(497, 497, 497)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        jLabel2.setText("ID of Receptionist");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1260, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(358, 358, 358)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(rSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ViewAllBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ViewAllBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
        ReceptionistManagement RM = new ReceptionistManagement();
        RM.setVisible(true);
        dispose();
    }//GEN-LAST:event_backbuttonActionPerformed

    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtnActionPerformed
        connection = Connector.ConnectDb();
        defaultTableModel.getDataVector().removeAllElements();
        defaultTableModel.fireTableDataChanged();
        String searchKey = rSearchField.getText();
        String sql = "select Recep_ID,Date,FName,MName,LName,BMonth,BDay,BYear,gender,blood,email,Security_Answer,phone,St_Address,C_Address,Pr_Address,status,username from receptionist where Recep_ID = '"+searchKey+"'";
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

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new viewReceptionist().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SearchBtn;
    private javax.swing.JButton ViewAllBtn;
    private javax.swing.JButton backbutton;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField rSearchField;
    private javax.swing.JTable rTable;
    // End of variables declaration//GEN-END:variables
}
