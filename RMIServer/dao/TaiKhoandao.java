/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.TaiKhoan;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class TaiKhoandao {
    public TaiKhoan getTaiKhoan(String SoTaiKhoan, String MatKhau) throws Exception{
        DungChung dc = new DungChung();
        dc.KetNoi();
        String query = "SELECT * FROM dbo.TaiKhoan WHERE SoTaiKhoan =? AND MatKhau =?";
        PreparedStatement stm = dc.cn.prepareStatement(query);
        stm.setString(1,SoTaiKhoan);
        stm.setString(2,MatKhau);
        ResultSet rs = stm.executeQuery();
        if(rs.next()==true){
            TaiKhoan tk = new TaiKhoan();
            tk.setSoTaiKhoan(rs.getString("SoTaiKhoan"));
            tk.setHoTen(rs.getString("HoTen"));
            tk.setSoTien(rs.getLong("SoTien"));
            tk.setMatKhau(rs.getString("MatKhau"));
            System.out.println(tk.toString());
            rs.close();
            stm.close();
            dc.cn.close();
            return tk;
        }
        else return null;
    }
    public TaiKhoan checktk(String soTaiKhoan) throws Exception{
        DungChung dc = new DungChung();
        dc.KetNoi();
        String query = "SELECT * FROM dbo.TaiKhoan WHERE SoTaiKhoan =?";
        PreparedStatement stm = dc.cn.prepareStatement(query);
        stm.setString(1,soTaiKhoan);
        ResultSet rs = stm.executeQuery();
        if(rs.next()==true){
            TaiKhoan tk = new TaiKhoan();
            tk.setSoTaiKhoan(rs.getString("SoTaiKhoan"));
            tk.setHoTen(rs.getString("HoTen"));
            tk.setSoTien(rs.getLong("SoTien"));
            tk.setMatKhau(rs.getString("MatKhau"));
            System.out.println(tk.toString());
            rs.close();
            stm.close();
            dc.cn.close();
            return tk;
        }
        return null;
    }
    public void Update(TaiKhoan tk) throws Exception{
        DungChung dc = new DungChung();
        dc.KetNoi();
        String sql = "UPDATE dbo.TaiKhoan SET SoTien = ? WHERE SoTaiKhoan = ?";
        PreparedStatement stm = dc.cn.prepareStatement(sql);
        stm.setLong(1, tk.getSoTien());
        stm.setString(2, tk.getSoTaiKhoan());
        stm.executeUpdate();
        stm.close();
        dc.cn.close();

    }
}
