/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ADMIN
 */
public class DungChung {
    public static Connection cn;
    public void KetNoi() throws Exception{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url="jdbc:sqlserver://DESKTOP-058C0LH\\SQLEXPRESS:1433;databaseName=QlTaiKhoan;user=sa; password=123";
        cn=DriverManager.getConnection(url);
        System.out.println("Nghỉ ");
    }
 public static void main(String[] args) {
        try {
            DungChung dc= new DungChung();
        dc.KetNoi();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
