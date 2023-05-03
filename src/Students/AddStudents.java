
package Students;

import Connections.ConnectionToDB;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.*;
import javax.swing.JOptionPane;
public class AddStudents extends javax.swing.JFrame {
Connection conn = null;
PreparedStatement pst=  null;
ResultSet rs = null;
String gender = "";
 
    public AddStudents() {
        initComponents();
        conn = ConnectionToDB.ConnectToDB();

    }
    public void close(){
    	 System.exit(1);
    }
   
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        femaleRadioBtn = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        maleRadioBtn = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ageCombo = new javax.swing.JComboBox();
        lnameTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        fnameTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        yearCombo = new javax.swing.JComboBox();
        registerBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        idNumberTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Students here", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 14), new java.awt.Color(102, 0, 0))); // NOI18N

        femaleRadioBtn.setText("FEMALE");
        femaleRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleRadioBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14));
        jLabel2.setText("FIRSTNAME");

        maleRadioBtn.setText("MALE");
        maleRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleRadioBtnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 14)); 
        jLabel5.setText("GENDER");

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 14)); 
        jLabel4.setText("AGE");

        ageCombo.setFont(new java.awt.Font("Calibri", 0, 14));
        ageCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"-", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40" }));

        lnameTxt.setFont(new java.awt.Font("Calibri", 0, 14)); 
        lnameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameTxtActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 14)); 
        jLabel8.setText("YEAR");

        fnameTxt.setFont(new java.awt.Font("Calibri", 0, 14)); 

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 14));
        jLabel1.setText("LASTNAME");

        yearCombo.setFont(new java.awt.Font("Calibri", 0, 14)); 
        yearCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-", "2018", "2019", "2020", "2021", "2022" }));

        registerBtn.setText("Register");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 14));
        jLabel9.setText("ID NUMBER");

        idNumberTxt.setFont(new java.awt.Font("Calibri", 0, 14)); 
        idNumberTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idNumberTxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel8)))
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(maleRadioBtn)
                        .addGap(42, 42, 42)
                        .addComponent(femaleRadioBtn))
                    .addComponent(fnameTxt)
                    .addComponent(ageCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lnameTxt)
                    .addComponent(yearCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(idNumberTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(idNumberTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                        .addComponent(fnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                   )
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    
                        .addComponent(jLabel1)
                    .addComponent(lnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE) )
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(maleRadioBtn)
                    .addComponent(femaleRadioBtn))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yearCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelBtn)
                    .addComponent(registerBtn))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void lnameTxtActionPerformed(java.awt.event.ActionEvent evt) {
       
    }

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {
        close();
    }

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {
       try{
           String sql = "INSERT INTO students (lastname,firstname,age,gender,year,status,id_number) VALUES (?,?,?,?,?,?,?)";
           pst = conn.prepareStatement(sql);
           pst.setString(1, lnameTxt.getText());
           pst.setString(2, fnameTxt.getText());
           pst.setString(3, ageCombo.getSelectedItem().toString());
           pst.setString(4, gender);
           pst.setString(5, yearCombo.getSelectedItem().toString());
           pst.setString(6, "NO_VOTE");
           pst.setString(7, idNumberTxt.getText());
           pst.execute();
           JOptionPane.showMessageDialog(null, "Student has been added!");
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
       }
    }

    private void maleRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {
       gender  = "MALE";
    }

    private void femaleRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {
        gender  = "FEMALE";
    }

    private void idNumberTxtActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    
    public static void main(String args[]) {

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddStudents().setVisible(true);
            }
        });
    }

    private javax.swing.JComboBox ageCombo;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JRadioButton femaleRadioBtn;
    private javax.swing.JTextField fnameTxt;
    private javax.swing.JTextField idNumberTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lnameTxt;
    private javax.swing.JRadioButton maleRadioBtn;
    private javax.swing.JButton registerBtn;
    private javax.swing.JComboBox yearCombo;
  
}
