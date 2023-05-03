
package Connections;


import java.sql.*;
import javax.swing.JOptionPane;
public class ConnectionToDB {
    Connection conn = null;
    public static Connection ConnectToDB(){
        try{
            Connection conn  = DriverManager.getConnection("jdbc:mysql://localhost/voting_system","root","");
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
 