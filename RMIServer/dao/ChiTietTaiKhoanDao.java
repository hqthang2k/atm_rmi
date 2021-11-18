/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.ChiTietTaiKhoan;
import bean.TaiKhoan;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class ChiTietTaiKhoanDao {
    
    public ArrayList<ChiTietTaiKhoan> getChiTietTaiKhoan(String SoTaiKhoan) throws Exception{
        ArrayList<ChiTietTaiKhoan> list = new ArrayList<>();
        DungChung dc = new DungChung();
        dc.KetNoi();
        String query = "SELECT * FROM dbo.ChiTietTaiKhoan WHERE SoTaiKhoan = ?";
        PreparedStatement stm = dc.cn.prepareStatement(query);
        stm.setString(1, SoTaiKhoan);
        ResultSet rs = stm.executeQuery();
        
        while(rs.next()){
            ChiTietTaiKhoan ct = new ChiTietTaiKhoan();
            ct.setId(rs.getLong("Id"));
            ct.setNgayRutTien(rs.getString("NgayRutTien"));
            ct.setSoTienRutRa(rs.getLong("SoTienRutRa"));
            ct.setSoTaiKhoan(rs.getString("SoTaiKhoan"));
            ct.setGhiChu(rs.getString("GhiChu"));
            list.add(ct);
        }
        rs.close();
        stm.close();
        dc.cn.close();
        return list;
    }
    public void InsertChiTiet(TaiKhoan tk, long biendong,String ghichu) throws Exception{
        DungChung dc = new DungChung();
        dc.KetNoi();
        String query = "INSERT INTO dbo.ChiTietTaiKhoan( NgayRutTien ,SoTienRutRa ,SoTaiKhoan ,GhiChu)VALUES(GETDATE(),?,?,?)";
        PreparedStatement stm = dc.cn.prepareStatement(query);
        stm.setLong(1, biendong);
        stm.setString(2, tk.getSoTaiKhoan());
        stm.setString(3, ghichu);
        stm.executeUpdate();
        stm.close();
        dc.cn.close();
    }
}
