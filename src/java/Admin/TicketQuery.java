/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Ravindu
 */
public class TicketQuery {
    
    Statement st;
    
     private void connectToDB() {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/phoenixdb";
        try {
            Class.forName(driver);
            java.sql.Connection con = DriverManager.getConnection(url, "root", "");
            st = (Statement) con.createStatement();
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    void searchTickets() {
       
    
    
    
    }
    
}
