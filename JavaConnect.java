package Coding;

/*
 Program Name: JavaConnect.java
 Programmer's Name: Robert Kieca
 Program Description: Part of FabricApp to connect to the database
 */

import java.sql.*;
import javax.swing.*;

public class JavaConnect extends FabricApp {
    
    private final Connection con = null;
    
    public static Connection ConnectDB() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://Devry.edupe.net:4300", "4053", "studentkieca");
            JOptionPane.showMessageDialog(null, "Connection to database established!", "Success Connection", JOptionPane.INFORMATION_MESSAGE);             
            return con;           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"MySQL JDBC Driver not found !!", "Error Connection", JOptionPane.ERROR);
            return null;
        }
    }
    
}
