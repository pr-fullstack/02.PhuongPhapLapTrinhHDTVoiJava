package quanlytruonghoc;

import java.time.LocalDate;

public class Teacher extends Person {
    private String lopDay;
    private double luongMotGioDay;
    private double soGioDayTrongMotThang;

    public Teacher() {
    }

    public Teacher(String ten, String gioiTinh, LocalDate ngaySinh, String diaChi, String lopDay, double luongMotGioDay, double soGioDayTrongMotThang) {
        super(ten, gioiTinh, ngaySinh, diaChi);
        this.lopDay = lopDay;
        this.luongMotGioDay = luongMotGioDay;
        this.soGioDayTrongMotThang = soGioDayTrongMotThang;
    }

    void xuatThongTin() {
        super.xuatThongTin();
        System.out.println("Lớp dạy: " + this.lopDay);
        System.out.println("Lương một giờ dạy: " + this.luongMotGioDay);
        System.out.println("Số giờ dạy trong một tháng: " + this.soGioDayTrongMotThang);
    }

    public String getLopDay() {
        return lopDay;
    }

    public void setLopDay(String lopDay) {
        this.lopDay = lopDay;
    }

    public double getLuongMotGioDay() {
        return luongMotGioDay;
    }

    public void setLuongMotGioDay(double luongMotGioDay) {
        this.luongMotGioDay = luongMotGioDay;
    }

    public double getSoGioDayTrongMotThang() {
        return soGioDayTrongMotThang;
    }

    public void setSoGioDayTrongMotThang(double soGioDayTrongMotThang) {
        this.soGioDayTrongMotThang = soGioDayTrongMotThang;
    }
}
