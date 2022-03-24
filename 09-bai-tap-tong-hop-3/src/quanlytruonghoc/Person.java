package quanlytruonghoc;

import java.time.LocalDate;

public class Person {
    protected String ten;
    protected String gioiTinh;
    protected LocalDate ngaySinh;
    protected String diaChi;

    public Person() {
    }

    public Person(String ten, String gioiTinh, LocalDate ngaySinh, String diaChi) {
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    void xuatThongTin() {
        System.out.println("Tên: " + this.ten);
        System.out.println("Giới tính: " + this.gioiTinh);
        System.out.println("Ngày sinh: " + this.ngaySinh);
        System.out.println("Địa chỉ: " + this.diaChi);
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
}
