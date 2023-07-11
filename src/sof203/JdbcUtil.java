/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sof203;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author tiennh
 */
public class JdbcUtil {
    private static Connection conn;
    
    public static Connection getConnection()
    {
        String dbUrl = "jdbc:sqlserver://localhost:1433;databaseName=quan_ly_sinh_vien;encrypt=true;trustServerCertificate=true;",
            dbUser="sa", dbPass = "Aa@123456";
        
        if (JdbcUtil.conn == null) {
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                JdbcUtil.conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
        return conn;
    }
}
