
package Students;

import Connections.ConnectionToDB;
import Forms.Login;
import java.awt.List;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
public class VoteForm extends javax.swing.JFrame {
Connection conn = null;
PreparedStatement pst = null;
ResultSet rs = null;
ArrayList<String> senList = new ArrayList<String>();
int updateSenList[] = new int[5];
int index;
String itemSelected;
String selected;
DefaultListModel dlm = new DefaultListModel();
int  presidentVote , vPresidentVote,secretaryVote,assistantSecretaryVote;
int courseVote;
public String VoteUsername="";
    public VoteForm() {
        initComponents();
        conn = ConnectionToDB.ConnectToDB();
       
        populatePresident();
        populateVPresident();
        populateSecretary();
    
    }
    public void close(){
       System.exit(0);
    }
    public void populatePresident(){
        try{
            String sql = "SELECT lastname,firstname FROM candidates_info WHERE position='President'";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                presidentCombo.addItem(rs.getString("firstname")+" "+rs.getString("lastname"));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void populateVPresident(){
        try{
            String sql = "SELECT lastname,firstname FROM candidates_info WHERE position='V-President'";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                vPresidentCombo.addItem(rs.getString("firstname")+" "+rs.getString("lastname"));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void populateSecretary(){
        try{
            String sql = "SELECT lastname,firstname FROM candidates_info WHERE position='Secretary'";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                secretaryCombo.addItem(rs.getString("firstname")+" "+rs.getString("lastname"));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
   
    public void selectVoteCountForPresident(){
        try{
            String sql = "SELECT vote_count FROM candidates_info WHERE fullname='"+presidentCombo.getSelectedItem()+"' AND position='President'";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next()){
               presidentVote =Integer.parseInt(rs.getString("vote_count"))+ 1;
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
     public void selectVoteCountForVPresident(){
         try{
            String sql = "SELECT vote_count FROM candidates_info WHERE fullname='"+vPresidentCombo.getSelectedItem()+"' AND position='V-President'";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next()){
               vPresidentVote = Integer.parseInt(rs.getString("vote_count"))+ 1;
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
     public void selectVoteCountForSecretary(){
        try{
            String sql = "SELECT vote_count FROM candidates_info WHERE fullname='"+secretaryCombo.getSelectedItem()+"' AND position='Secretary'";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next()){
                secretaryVote =Integer.parseInt(rs.getString("vote_count"))+ 1;
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void updateForPresident(){
        try{
            String sql = "UPDATE candidates_info SET vote_count='"+ presidentVote +"' WHERE fullname='"+presidentCombo.getSelectedItem()+"' AND position='President'";
            pst = conn.prepareStatement(sql);
            pst.execute();
  
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void updateForVPresident(){
    try{
            String sql = "UPDATE candidates_info SET vote_count='"+ vPresidentVote +"' WHERE fullname='"+vPresidentCombo.getSelectedItem()+"' AND position='V-President'";
            pst = conn.prepareStatement(sql);
            pst.execute();
     
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void updateForSecretary(){
        try{
            String sql = "UPDATE candidates_info SET vote_count='"+ secretaryVote +"' WHERE fullname='"+secretaryCombo.getSelectedItem()+"' AND position='Secretary'";
            pst = conn.prepareStatement(sql);
            pst.execute();
   
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
  
    
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        voteCombo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        exitBtn = new javax.swing.JButton();
        vPresidentCombo = new javax.swing.JComboBox();
        presidentCombo = new javax.swing.JComboBox();
        secretaryCombo = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        nameLbl = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ageLbl = new javax.swing.JLabel();
        statusLbl = new javax.swing.JLabel();
        genderLbl = new javax.swing.JLabel();
        yearLbl = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Please select your candidates", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 3, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        voteCombo.setText("Vote");
        voteCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voteComboActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setText("V - President");

        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        vPresidentCombo.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        vPresidentCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-" }));

        presidentCombo.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        presidentCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-" }));

        secretaryCombo.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        secretaryCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-" }));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel1.setText("President");

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel3.setText("Secretary");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(79, 79, 79)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(voteCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(secretaryCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(vPresidentCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(presidentCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(presidentCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(vPresidentCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(secretaryCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(voteCombo)
                    .addComponent(exitBtn))
                .addContainerGap(105, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 0, 0));
        jLabel8.setText("Please Vote Wisely!");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Students Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 3, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel14.setText("Year:");

        jLabel11.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel11.setText("Age:");

        nameLbl.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        nameLbl.setForeground(new java.awt.Color(102, 0, 0));
        nameLbl.setText("Name");

        jLabel15.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel15.setText("Status:");

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel10.setText("Name:");

        ageLbl.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        ageLbl.setForeground(new java.awt.Color(102, 0, 0));
        ageLbl.setText("Age");

        statusLbl.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        statusLbl.setForeground(new java.awt.Color(102, 0, 0));
        statusLbl.setText("Status");

        genderLbl.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        genderLbl.setForeground(new java.awt.Color(102, 0, 0));
        genderLbl.setText("Gender");

        yearLbl.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        yearLbl.setForeground(new java.awt.Color(102, 0, 0));
        yearLbl.setText("Year");

        jLabel12.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel12.setText("Gender:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(genderLbl)
                    .addComponent(ageLbl)
                    .addComponent(nameLbl))
                .addGap(240, 240, 240)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(yearLbl)
                    .addComponent(statusLbl))
                .addContainerGap(681, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(nameLbl)
                    .addComponent(jLabel14)
                    .addComponent(yearLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(ageLbl)
                    .addComponent(jLabel15)
                    .addComponent(statusLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(genderLbl))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {                                        
        Login l = new Login();
        close();
        l.setVisible(true);
    }
    public void updateVoteStatus() throws SQLException {
    	
    	
    	String sql = "UPDATE students SET status='voted'  WHERE id_number ='" + VoteUsername+" AND status='NO_VOTE'";
        pst = conn.prepareStatement(sql);
        pst.execute();
    }
    private void voteComboActionPerformed(java.awt.event.ActionEvent evt) {                                          
      
        if(presidentCombo.getSelectedIndex()==0 || vPresidentCombo.getSelectedIndex()==0 || secretaryCombo.getSelectedIndex()==0 ){
               JOptionPane.showMessageDialog(null, "Please fill up all the required fields");
           }else{
                int des = JOptionPane.showConfirmDialog(null, "Finish Voting?","Confirmation",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                if(des==0){
               selectVoteCountForPresident();
               selectVoteCountForVPresident();
               selectVoteCountForSecretary();
               
               //selectCourse();
               
                updateForPresident();
                updateForVPresident();
                updateForSecretary();
                try {
					updateVoteStatus();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
             
               // updateCourseVote();
                JOptionPane.showMessageDialog(null, "Voted Successfully!");
                }
               
           }
    }
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VoteForm().setVisible(true);
            }
        });
    }

 
    public javax.swing.JLabel ageLbl;
    private javax.swing.JButton exitBtn;
    public javax.swing.JLabel genderLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JLabel nameLbl;
    private javax.swing.JComboBox presidentCombo;
    private javax.swing.JComboBox secretaryCombo;
    public javax.swing.JLabel statusLbl;
    private javax.swing.JComboBox vPresidentCombo;
    private javax.swing.JButton voteCombo;
    public javax.swing.JLabel yearLbl;
 
}
