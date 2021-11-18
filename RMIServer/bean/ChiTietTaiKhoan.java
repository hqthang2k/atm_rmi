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
public class ChiTietTaiKhoan implements Serializable {
    private long Id;
    private String NgayRutTien;
    private long SoTienRutRa;
    private String SoTaiKhoan;
    private String GhiChu;

    public ChiTietTaiKhoan(long Id, String NgayRutTien, long SoTienRutRa, String SoTaiKhoan, String GhiChu) {
        this.Id = Id;
        this.NgayRutTien = NgayRutTien;
        this.SoTienRutRa = SoTienRutRa;
        this.SoTaiKhoan = SoTaiKhoan;
        this.GhiChu = GhiChu;
    }

    public ChiTietTaiKhoan() {
    }

    public long getId() {
        return Id;
    }

    public void setId(long Id) {
        this.Id = Id;
    }

    public String getNgayRutTien() {
        return NgayRutTien;
    }

    public void setNgayRutTien(String NgayRutTien) {
        this.NgayRutTien = NgayRutTien;
    }

    public long getSoTienRutRa() {
        return SoTienRutRa;
    }

    public void setSoTienRutRa(long SoTienRutRa) {
        this.SoTienRutRa = SoTienRutRa;
    }

    public String getSoTaiKhoan() {
        return SoTaiKhoan;
    }

    public void setSoTaiKhoan(String SoTaiKhoan) {
        this.SoTaiKhoan = SoTaiKhoan;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }
    
    
    
    
}
