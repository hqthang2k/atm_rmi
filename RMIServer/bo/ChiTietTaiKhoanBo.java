/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import bean.ChiTietTaiKhoan;
import bean.TaiKhoan;
import dao.ChiTietTaiKhoanDao;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class ChiTietTaiKhoanBo {
    
    ChiTietTaiKhoanDao ct = new ChiTietTaiKhoanDao();
    public ArrayList<ChiTietTaiKhoan> getChiTietTaiKhoan(String SoTaiKhoan) throws Exception{
        return ct.getChiTietTaiKhoan(SoTaiKhoan);
    }
    public void InsertChiTiet(TaiKhoan tk, long biendong, String ghichu) throws Exception{
        ct.InsertChiTiet(tk, biendong,ghichu);
    }
}
