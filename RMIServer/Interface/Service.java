/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import bean.ChiTietTaiKhoan;
import bean.TaiKhoan;
import bo.ChiTietTaiKhoanBo;
import bo.TaiKhoanBo;
import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class Service extends UnicastRemoteObject implements IService{

    public Service()throws RemoteException{
        }

    /**
     *
     * @param SoTaiKhoan
     * @param MatKhau
     * @return
     * @throws Exception
     */
    @Override
    public TaiKhoan ktdn(String SoTaiKhoan, String MatKhau) throws Exception{
        TaiKhoanBo tko = new TaiKhoanBo();
        return tko.ktdn(SoTaiKhoan, MatKhau);//!= null ? true : false;
    }

    @Override
    public ArrayList<ChiTietTaiKhoan> getChiTietTaiKhoan(String SoTaiKhoan) throws Exception{
        ChiTietTaiKhoanBo cttkbo = new ChiTietTaiKhoanBo();
        return cttkbo.getChiTietTaiKhoan(SoTaiKhoan);
    }
    @Override
    public int RutTien(TaiKhoan tk, long Sotien)throws Exception {
        long tien = tk.getSoTien();
        System.out.println(tk.getSoTaiKhoan());
        if(tien < 50000){
            return -1;
        }
        if(tien-Sotien < 0){
            return -2;
        }
        TaiKhoanBo tko = new TaiKhoanBo();
        tk.setSoTien(tien-Sotien);
        tko.ThayDoiSoDu(tk);
        ChiTietTaiKhoanBo ct = new ChiTietTaiKhoanBo();
        Sotien = Sotien* -1;
        ct.InsertChiTiet(tk, Sotien,"Rút Tiền");
        return 1;
    }
    @Override
    public int ChuyenTien(TaiKhoan tk1, String soTaiKhoan, long sotien) throws Exception {
        if(tk1.getSoTien() < 50000){
            return -1;
        }
        if(tk1.getSoTien()-sotien < 50000){
            return -2;
        }
        TaiKhoanBo tko = new TaiKhoanBo();
        ChiTietTaiKhoanBo ct = new ChiTietTaiKhoanBo();
        TaiKhoan tk = tko.checktk(soTaiKhoan);
        if(tk==null){
            return -3;
        }
        tk1.setSoTien(tk1.getSoTien()-sotien);
        tk.setSoTien(tk.getSoTien()+sotien);
        tko.ThayDoiSoDu(tk1);
        ct.InsertChiTiet(tk1, sotien*-1,"Chuyển tiền");
        tko.ThayDoiSoDu(tk);
        ct.InsertChiTiet(tk, sotien,"Nhận tiền từ "+tk1.getSoTaiKhoan());
        return 1;
    }

    @Override
    public TaiKhoan TimTK(String sotaikhoan) throws Exception {
        return new TaiKhoanBo().checktk(sotaikhoan);
    }
}
