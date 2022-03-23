package baitap;

import java.time.LocalDate;

public class NVQuanLy extends NhanVien {
    private double luongCoBan;
    private double heSoLuong;

    public NVQuanLy() {
    }

    public NVQuanLy(String hoTen, LocalDate ngaySinh, String diaChi, double luongCoBan, double heSoLuong) {
        super(hoTen, ngaySinh, diaChi);
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
    }

    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.println("Lương cơ bản: " + luongCoBan);
        System.out.println("Hệ số lương: " + heSoLuong);
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }
}
