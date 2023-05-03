
package Admin;

import Connections.ConnectionToDB;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.*;
import javax.swing.JOptionPane;
public class AddCandidatesPanel extends javax.swing.JFrame {
Connection conn = null;
PreparedStatement pst = null;
ResultSet rs = null;
String gender = "";
   
    public AddCandidatesPanel() {
        initComponents();
        conn = ConnectionToDB.ConnectToDB();
        
       
        populatePositions();
        
    }
    public void close(){
        System.exit(1);
    }
    
    public void populatePositions(){
         try{
            String sql="SELECT names FROM positions";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                positionCombo.addItem(rs.getString("names"));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
     
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        firstnameTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ageCombo = new javax.swing.JComboBox();
        femaleRadioBtn = new javax.swing.JRadioButton();
        courseCombo = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lastnameTxt = new javax.swing.JTextField();
        positionCombo = new javax.swing.JComboBox();
        maleRadioBtn = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        yearCombo = new javax.swing.JComboBox();
        addBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Candidates Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 14)); 
        jLabel9.setText("COURSE");

        firstnameTxt.setFont(new java.awt.Font("Calibri", 0, 14)); 

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 14));
        jLabel8.setText("POSITION");

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel7.setText("GENDER");

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setText("FIRSTNAME");

        ageCombo.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        ageCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40" }));

        femaleRadioBtn.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        femaleRadioBtn.setText("FEMALE");
        femaleRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleRadioBtnActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel6.setText("AGE");

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel10.setText("YEAR");

        lastnameTxt.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        positionCombo.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        positionCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-" }));

        maleRadioBtn.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        maleRadioBtn.setText("MALE");
        maleRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleRadioBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel1.setText("LASTNAME");

        yearCombo.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        yearCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024" }));

        addBtn.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        addBtn.setText("Add");
        addBtn.setPreferredSize(new java.awt.Dimension(63, 25));
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        cancelBtn.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cancelBtn.setText("Cancel");
        cancelBtn.setPreferredSize(new java.awt.Dimension(63, 25));
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(positionCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel2)
                                                    .addComponent(jLabel1))
                                                .addGap(64, 64, 64)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(lastnameTxt)
                                                    .addComponent(firstnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addGap(109, 109, 109)
                                                .addComponent(ageCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(96, 96, 96)
                                        .addComponent(maleRadioBtn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(femaleRadioBtn)
                                        .addGap(45, 45, 45)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                       
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(yearCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 6, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(firstnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lastnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

                        )
                    .addGroup(jPanel1Layout.createSequentialGroup()
                             .addComponent(jLabel2)
                        
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                       .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(maleRadioBtn)
                    .addComponent(femaleRadioBtn))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(positionCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                   
                    .addComponent(jLabel10)
                    .addComponent(yearCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {
        if(lastnameTxt.getText().equals("") || firstnameTxt.getText().equals("") || ageCombo.getSelectedIndex()==0 || gender.equals("") || positionCombo.getSelectedIndex()==0 || courseCombo.getSelectedIndex()==0 || yearCombo.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(null, "Please fill up all the required fields");
        }else{
             try{
            String sql = "INSERT INTO candidates_info (lastname,firstname,fullname,age,gender,position,year,vote_count) VALUES (?,?,?,?,?,?,?,?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1, lastnameTxt.getText());
            pst.setString(2, firstnameTxt.getText());
            pst.setString(3, lastnameTxt.getText()+" "+firstnameTxt.getText());
            pst.setString(4, ageCombo.getSelectedItem().toString());
            pst.setString(5, gender);
            pst.setString(6, positionCombo.getSelectedItem().toString());
            pst.setString(7, yearCombo.getSelectedItem().toString());
            pst.setString(8, "0");
            pst.execute();
            JOptionPane.showMessageDialog(null, "Candidates has been added!");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        }
       
    }                                      

    private void maleRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleRadioBtnActionPerformed
        gender = "MALE";
    }//GEN-LAST:event_maleRadioBtnActionPerformed

    private void femaleRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleRadioBtnActionPerformed
        gender = "FEMALE";
    }//GEN-LAST:event_femaleRadioBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        close();
    }//GEN-LAST:event_cancelBtnActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddCandidatesPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JComboBox ageCombo;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JComboBox courseCombo;
    private javax.swing.JRadioButton femaleRadioBtn;
    private javax.swing.JTextField firstnameTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lastnameTxt;
    private javax.swing.JRadioButton maleRadioBtn;
    private javax.swing.JComboBox positionCombo;
    private javax.swing.JComboBox yearCombo;
    // End of variables declaration//GEN-END:variables
}
