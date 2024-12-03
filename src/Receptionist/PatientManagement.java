package Receptionist;



import patient.pupdatePatient;
import patient.pviewPatient;
import patient.Billing;
import patient.paddPatient;
import Main.Hospital;
import javax.swing.ImageIcon;
import patient.Oldpatient;

/**
 *
 * @author Ditalo
 */
public class PatientManagement extends javax.swing.JFrame {

    public static String username;

    public PatientManagement() {
        initComponents();
        ImageIcon ic = new ImageIcon(getClass().getResource("/Image/hospital.png"));
        this.setIconImage(ic.getImage());
    }
//public void User(String username){
//    
//}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        addpatientbtn = new javax.swing.JButton();
        patientbillingbtn = new javax.swing.JButton();
        updatepatientbtn = new javax.swing.JButton();
        viewpatientbtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        oldpatient = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Patient Management");

        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1MouseMoved(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Patient Management");

        jButton1.setBackground(new java.awt.Color(201, 0, 0));
        jButton1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Log Out");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(64, 64, 64)
                .addComponent(jButton1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(jButton1)))
        );

        addpatientbtn.setBackground(new java.awt.Color(204, 204, 204));
        addpatientbtn.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        addpatientbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/addpatient.png"))); // NOI18N
        addpatientbtn.setText("Add Patient");
        addpatientbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addpatientbtnActionPerformed(evt);
            }
        });

        patientbillingbtn.setBackground(new java.awt.Color(204, 204, 204));
        patientbillingbtn.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        patientbillingbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/IconBilling.png"))); // NOI18N
        patientbillingbtn.setText("Billing");
        patientbillingbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientbillingbtnActionPerformed(evt);
            }
        });

        updatepatientbtn.setBackground(new java.awt.Color(204, 204, 204));
        updatepatientbtn.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        updatepatientbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/updatepatient.png"))); // NOI18N
        updatepatientbtn.setText("Update Patient");
        updatepatientbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatepatientbtnActionPerformed(evt);
            }
        });

        viewpatientbtn.setBackground(new java.awt.Color(204, 204, 204));
        viewpatientbtn.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        viewpatientbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/searchpatient.png"))); // NOI18N
        viewpatientbtn.setText("View Patient");
        viewpatientbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewpatientbtnActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 51, 55));
        jButton2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Change password");
        jButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        oldpatient.setBackground(new java.awt.Color(204, 204, 204));
        oldpatient.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        oldpatient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/addpatient.png"))); // NOI18N
        oldpatient.setText("Old Patient");
        oldpatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oldpatientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(viewpatientbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(updatepatientbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(addpatientbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(oldpatient, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(patientbillingbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addpatientbtn)
                    .addComponent(oldpatient))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(updatepatientbtn)
                    .addComponent(viewpatientbtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(patientbillingbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseMoved
     
    }//GEN-LAST:event_jPanel1MouseMoved

    private void addpatientbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addpatientbtnActionPerformed
      paddPatient np = new paddPatient();
      np.setVisible(true);
      dispose();
    }//GEN-LAST:event_addpatientbtnActionPerformed

    private void viewpatientbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewpatientbtnActionPerformed
        pviewPatient viewPatient = new pviewPatient();
        viewPatient.setVisible(true);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_viewpatientbtnActionPerformed

    private void updatepatientbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatepatientbtnActionPerformed
        pupdatePatient pUpdate = new pupdatePatient();
        pUpdate.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_updatepatientbtnActionPerformed

    private void patientbillingbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientbillingbtnActionPerformed
        Billing billing = new Billing();
        billing.setVisible(true);
        dispose();
    }//GEN-LAST:event_patientbillingbtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       Hospital hospital = new Hospital();
       hospital.setVisible(true);
       dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       ChangePassword CP = new ChangePassword();
       CP.setVisible(true);
       dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void oldpatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oldpatientActionPerformed
        Oldpatient OP = new Oldpatient();
        OP.setVisible(true);
        dispose();
    }//GEN-LAST:event_oldpatientActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new PatientManagement().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addpatientbtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton oldpatient;
    private javax.swing.JButton patientbillingbtn;
    private javax.swing.JButton updatepatientbtn;
    private javax.swing.JButton viewpatientbtn;
    // End of variables declaration//GEN-END:variables
}
