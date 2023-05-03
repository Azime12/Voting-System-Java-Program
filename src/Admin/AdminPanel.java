
package Admin;

import Connections.ConnectionToDB;
import Forms.Login;
import Students.AddStudents;
import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.UIManager;


public class AdminPanel extends javax.swing.JFrame {
Connection conn = null;
PreparedStatement pst = null;
ResultSet rs = null;

    public AdminPanel() {
        initComponents();
        conn = ConnectionToDB.ConnectToDB();


    }
    public void close(){
        System.exit(1);
    }

    public void displayBarChart(){
    try{
            JFrame frame = new JFrame("Admin Page");
            frame.setExtendedState(frame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
            frame.setSize(1300, 697);
            frame.setResizable(true);
            frame.setVisible(true); 
           
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        addCourseItem = new javax.swing.JMenu();
        addCandidatesItem = new javax.swing.JMenuItem();
        addPositionItem = new javax.swing.JMenuItem();
        addStudentItem = new javax.swing.JMenuItem();
        addUserItem = new javax.swing.JMenuItem();
        exitItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        viewVotesItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(true);

        addCourseItem.setText("File");

        addCandidatesItem.setText("Add Candidates");
        addCandidatesItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCandidatesItemActionPerformed(evt);
            }
        });
        addCourseItem.add(addCandidatesItem);

        addPositionItem.setText("Add Position");
        addPositionItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPositionItemActionPerformed(evt);
            }
        });
        addCourseItem.add(addPositionItem);

        addStudentItem.setText("Add Student");
        addStudentItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentItemActionPerformed(evt);
            }
        });
        addCourseItem.add(addStudentItem);

        addUserItem.setText("Add Admin");
        addUserItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserItemActionPerformed(evt);
            }
        });
        addCourseItem.add(addUserItem);

        exitItem.setText("Exit");
        exitItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitItemActionPerformed(evt);
            }
        });
        addCourseItem.add(exitItem);

        jMenuBar1.add(addCourseItem);

        jMenu2.setText("Report");

        viewVotesItem.setText("View Votes");
        viewVotesItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewVotesItemActionPerformed(evt);
            }
        });
        jMenu2.add(viewVotesItem);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(776, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(282, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void addCandidatesItemActionPerformed(java.awt.event.ActionEvent evt) {
         AddCandidatesPanel acp = new AddCandidatesPanel();
         acp.setVisible(true);
    }

    private void addPositionItemActionPerformed(java.awt.event.ActionEvent evt) {
        AddPositions ap = new AddPositions();
        ap.setVisible(true);
    }

    private void addUserItemActionPerformed(java.awt.event.ActionEvent evt) {
        AddUser au = new AddUser();
        au.setVisible(true);
    }

    private void exitItemActionPerformed(java.awt.event.ActionEvent evt) {
        Login l = new Login();
        close();
        l.setVisible(true);
    }

    private void addStudentItemActionPerformed(java.awt.event.ActionEvent evt) {
        AddStudents ad = new AddStudents();
        ad.setVisible(true);
    }
    private void viewVotesItemActionPerformed(java.awt.event.ActionEvent evt) {
       
    }
    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPanel().setVisible(true);
            }
        });
    }

 
    private javax.swing.JMenuItem addCandidatesItem;
    private javax.swing.JMenu addCourseItem;
    private javax.swing.JMenuItem addPositionItem;
    private javax.swing.JMenuItem addStudentItem;
    private javax.swing.JMenuItem addUserItem;
    private javax.swing.JMenuItem exitItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem viewVotesItem;
    // End of variables declaration//GEN-END:variables
}
