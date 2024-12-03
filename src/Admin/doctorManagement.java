package Admin;

import Doctor.updateDoctor;
import Doctor.addDoctor;
import Doctor.viewDoctor;
import Main.Hospital;
import javax.swing.ImageIcon;

/**
 *
 * @author Ditalo
 */
public class doctorManagement extends javax.swing.JFrame {

    public static String username;
   
    public doctorManagement() {
      
            
        
        initComponents();
        ImageIcon ic = new ImageIcon(getClass().getResource("/Image/hospital.png"));
        this.setIconImage(ic.getImage());
        

    }

    public void User(String Username) {
        username = Username;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        backbutton = new javax.swing.JButton();
        adddoctorbtn = new javax.swing.JButton();
        adddoctorbtn1 = new javax.swing.JButton();
        adddoctorbtn3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Doctor Management");

        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1MouseMoved(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Doctor Panel");

        backbutton.setBackground(new java.awt.Color(0, 51, 51));
        backbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/backs.png"))); // NOI18N
        backbutton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(129, 129, 129)
                .addComponent(backbutton)
                .addGap(13, 13, 13))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        adddoctorbtn.setBackground(new java.awt.Color(204, 204, 204));
        adddoctorbtn.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        adddoctorbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/adddoctor.png"))); // NOI18N
        adddoctorbtn.setText("Add Doctor");
        adddoctorbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adddoctorbtnActionPerformed(evt);
            }
        });

        adddoctorbtn1.setBackground(new java.awt.Color(204, 204, 204));
        adddoctorbtn1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        adddoctorbtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/updatedoctor.png"))); // NOI18N
        adddoctorbtn1.setText("Update Doctor");
        adddoctorbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adddoctorbtn1ActionPerformed(evt);
            }
        });

        adddoctorbtn3.setBackground(new java.awt.Color(204, 204, 204));
        adddoctorbtn3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        adddoctorbtn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/searchdoctor.png"))); // NOI18N
        adddoctorbtn3.setText("View Doctor");
        adddoctorbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adddoctorbtn3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(adddoctorbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(adddoctorbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(adddoctorbtn1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adddoctorbtn3)
                    .addComponent(adddoctorbtn))
                .addGap(27, 27, 27)
                .addComponent(adddoctorbtn1)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseMoved
 
    }//GEN-LAST:event_jPanel1MouseMoved

    private void adddoctorbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adddoctorbtnActionPerformed
        addDoctor aDoctor = new addDoctor();
        aDoctor.setVisible(true);
        dispose();
    }//GEN-LAST:event_adddoctorbtnActionPerformed

    private void adddoctorbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adddoctorbtn1ActionPerformed
        updateDoctor uReceptionist = new updateDoctor();
        uReceptionist.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_adddoctorbtn1ActionPerformed

    private void adddoctorbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adddoctorbtn3ActionPerformed
        viewDoctor vReceptionist = new viewDoctor();
        vReceptionist.setVisible(true);
        dispose();
    }//GEN-LAST:event_adddoctorbtn3ActionPerformed

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
        AdminActivity admin = new AdminActivity();
        admin.setVisible(true);
        dispose();
    }//GEN-LAST:event_backbuttonActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new doctorManagement().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adddoctorbtn;
    private javax.swing.JButton adddoctorbtn1;
    private javax.swing.JButton adddoctorbtn3;
    private javax.swing.JButton backbutton;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
