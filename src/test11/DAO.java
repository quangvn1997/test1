/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Asus
 */
public class DAO {
    public static Connection getConnection() throws SQLException{
        String connectionstring = Glolaconfig.getCONNECTION_STRING_PREFIX() + Glolaconfig.getHOST_WITH_PORT()+Glolaconfig.getDATABASE()+Glolaconfig.getDATABASE_USER() + Glolaconfig.getDATABASE_PASSWORD();
        Connection conn = DriverManager.getConnection(connectionstring);
        return conn;
    }
    public static void main(String[] args) {
        setinsert();
        getlist();
        
    }
    public static void getlist() {
        try {
            Statement statement = DAO.getConnection().createStatement();
            String sqlString = "SELECT * FROM user";
            ResultSet rs = statement.executeQuery(sqlString);

           while (rs.next()) {
                System.out.println("-------------------------");
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Passwords: " + rs.getString("passwords"));
                System.out.println("-------------------------");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Lỗi hiển thị sv!");
        }
    }
    public static void setinsert(){
        try {
        Statement statement = DAO.getConnection().createStatement();
        String name = "hung";
        String pass ="fpt11";
        String sqlString = "Insert into user values('"+name+"','"+pass+"');";
        statement.execute(sqlString);
            
        } catch (Exception e) {
            System.err.println("Lỗi khi insert.");
        }
        
    }
    
    
}
