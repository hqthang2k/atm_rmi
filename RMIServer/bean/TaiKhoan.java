/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;

/**
 *
 * @author ADMIN
 */
public class TaiKhoan implements Serializable{
    private String SoTaiKhoan;
    private String HoTen;
    private long SoTien;
    private String MatKhau;

    public TaiKhoan(String SoTaiKhoan, String HoTen, long SoTien, String MatKhau) {
        this.SoTaiKhoan = SoTaiKhoan;
        this.HoTen = HoTen;
        this.SoTien = SoTien;
        this.MatKhau = MatKhau;
    }

    public TaiKhoan() {
    }

    public String getSoTaiKhoan() {
        return SoTaiKhoan;
    }

    public void setSoTaiKhoan(String SoTaiKhoan) {
        this.SoTaiKhoan = SoTaiKhoan;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public long getSoTien() {
        return SoTien;
    }

    public void setSoTien(long SoTien) {
        this.SoTien = SoTien;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    @Override
    public String toString() {
        return "TaiKhoan{" + "SoTaiKhoan=" + SoTaiKhoan + ", HoTen=" + HoTen + ", SoTien=" + SoTien + ", MatKhau=" + MatKhau + '}';
    }
    
    
    
}
