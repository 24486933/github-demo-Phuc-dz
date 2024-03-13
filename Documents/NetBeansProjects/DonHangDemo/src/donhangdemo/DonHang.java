/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package donhangdemo;

/**
 *
 * @author 84329
 */
public class DonHang {
    private String mahoadon;
    private String tenhang;
    private String phanloai;
    private String soluong;
    private String hansudung;
    private String nhacungcap;
    private String dongia;

    public DonHang(String mahoadon, String tenhang, String phanloai, String hansudung, String nhacungcap, String soluong, String dongia) {
        this.mahoadon = mahoadon;
        this.tenhang = tenhang;
        this.phanloai = phanloai;
        this.soluong = soluong;
        this.hansudung = hansudung;
        this.nhacungcap = nhacungcap;
        this.dongia = dongia;
    }


    public void setMahoadon(String mahoadon) {
        this.mahoadon = mahoadon;
    }

    public void setTenhang(String tenhang) {
        this.tenhang = tenhang;
    }

    public void setPhanloai(String phanloai) {
        this.phanloai = phanloai;
    }

    public void setSoluong(String soluong) {
        this.soluong = soluong;
    }

    public void setHansudung(String hansudung) {
        this.hansudung = hansudung;
    }

    public void setNhacungcap(String nhacungcap) {
        this.nhacungcap = nhacungcap;
    }
    
    public void setDongia(String dongia) {
        this.dongia = dongia;
    }

    public String getMahoadon() {
        return mahoadon;
    }

    public String getTenhang() {
        return tenhang;
    }

    public String getPhanloai() {
        return phanloai;
    }

    public String getSoluong() {
        return soluong;
    }

    public String getHansudung() {
        return hansudung;
    }

    public String getNhacungcap() {
        return nhacungcap;
    }
    
    public String getDongia() {
        return dongia;
    }
    
}
