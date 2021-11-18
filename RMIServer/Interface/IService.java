/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import bean.ChiTietTaiKhoan;
import bean.TaiKhoan;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public interface IService extends Remote{
    public TaiKhoan ktdn(String SoTaiKhoan, String MatKhau) throws Exception;
    public ArrayList<ChiTietTaiKhoan> getChiTietTaiKhoan(String SoTaiKhoan)throws Exception;
    public int RutTien(TaiKhoan tk, long Sotien)throws Exception;
    public int ChuyenTien(TaiKhoan tk1, String soTaiKhoan, long sotien)throws Exception;
    public TaiKhoan TimTK(String sotaikhoan) throws  Exception;
}
