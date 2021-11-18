/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import bean.TaiKhoan;
import dao.TaiKhoandao;

/**
 *
 * @author ADMIN
 */
public class TaiKhoanBo {
    
    TaiKhoandao tkd = new TaiKhoandao();
    public TaiKhoan ktdn(String SoTaiKhoan, String MatKhau) throws Exception{
        return tkd.getTaiKhoan(SoTaiKhoan, MatKhau);
    }
    public void ThayDoiSoDu(TaiKhoan tk) throws Exception{
        tkd.Update(tk);
    }
    public TaiKhoan checktk(String soTaiKhoan) throws Exception{
        return tkd.checktk(soTaiKhoan);
    }
}
