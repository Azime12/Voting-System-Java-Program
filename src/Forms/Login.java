
package Forms;

import Admin.AdminPanel;
import Connections.ConnectionToDB;
import Students.VoteForm;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
public class Login extends javax.swing.JFrame {
	
Connection conn = null;
PreparedStatement pst = null;
ResultSet rs = null;


    public Login() {
        initComponents();
        conn = ConnectionToDB.ConnectToDB();
    }
    public void close(){
        System.exit(1);    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        passTxt = new javax.swing.JPasswordField();
        userTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        userLevelCombo = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sign In here", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel1.setText("Username");

        loginBtn.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        loginBtn.setText("Login");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setText("Password");

        passTxt.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        userTxt.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel4.setText("Level of User");

        userLevelCombo.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        userLevelCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Student", "Admin" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(userTxt)
                    .addComponent(passTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                    .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userLevelCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(userLevelCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(userTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(passTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loginBtn)
                .addGap(29, 29, 29))
        );

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel3.setText("AASTU VOTING MANAGEMENT SYSTEM");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("AASTU_LOGO.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
       if (userLevelCombo.getSelectedIndex()==0){
            try{
                String sql = "SELECT id_number,lastname,firstname,age,gender,year,status FROM students WHERE id_number=? AND lastname=?";
                pst = conn.prepareStatement(sql);
                pst.setString(1, userTxt.getText());
                pst.setString(2, passTxt.getText());
                rs = pst.executeQuery();
                if(rs.next()){
                    
                    JOptionPane.showMessageDialog(null, "Welcome");
                    
                   VoteForm vf = new VoteForm();
                   vf.nameLbl.setText(rs.getString("lastname")+" "+rs.getString("firstname"));
                   vf.ageLbl.setText(rs.getString("age"));
                   vf.VoteUsername=rs.getString("id_number");
                   vf.genderLbl.setText(rs.getString("gender"));
                   vf.yearLbl.setText(rs.getString("year"));
                   vf.statusLbl.setText(rs.getString("status"));
                   vf.setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null, "Please check your ID Number and Password and try again!");
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }else if(userLevelCombo.getSelectedIndex()==1){
             try{
            String sql = "SELECT username,password FROM admin WHERE username = ? AND password = ?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, userTxt.getText());
            pst.setString(2, passTxt.getText());
            rs = pst.executeQuery();
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "Welcone "+userTxt.getText());
                AdminPanel ap = new AdminPanel();
                ap.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "Please check you username and password");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
             
        }
       
    }
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }


    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPasswordField passTxt;
    private javax.swing.JComboBox userLevelCombo;
    private javax.swing.JTextField userTxt;
   
}
