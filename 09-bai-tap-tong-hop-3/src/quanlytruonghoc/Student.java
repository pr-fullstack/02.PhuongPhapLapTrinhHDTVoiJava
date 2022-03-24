package quanlytruonghoc;

import java.time.LocalDate;

public class Student extends Person {
    private String maSV;
    private double diemTB;

    public Student() {
    }

    public Student(String ten, String gioiTinh, LocalDate ngaySinh, String diaChi, String maSV, double diemTB) {
        super(ten, gioiTinh, ngaySinh, diaChi);
        this.maSV = maSV;
        this.diemTB = diemTB;
    }

    void xuatThongTin() {
        super.xuatThongTin();
        System.out.println("Mã sinh viên: " + this.maSV);
        System.out.println("Điểm trung bình: " + this.diemTB);
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }
}
