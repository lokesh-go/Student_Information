
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentinformation;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author hp
 */
public class MySQLConnection {
    
        private static final String username = "lokesh";
        private static final String password = "lokesh525";
        private static final String CONN_STRING="jdbc:mysql://localhost:3306/studentinformation";    //Loading JDBC driver for SQL
        static Connection conn = null;
        MySQLConnection()
        {
        try
        {   
            conn = DriverManager.getConnection(CONN_STRING,username,password);//Connection Established between netbeans and SQL
            System.out.println("Connected Database");                          //Database connection Successful message
        }
        catch(SQLException e)
        {
            System.out.println(conn);
            JOptionPane.showMessageDialog(null, "Database Connection Not Found !!!Please check you LAN connection..!!");
            System.out.println(e);
        }
    }
    public static void main(String args[])
    {
        MySQLConnection my = new MySQLConnection();
    }
}