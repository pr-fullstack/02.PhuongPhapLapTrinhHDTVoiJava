package baitap;

import java.math.BigDecimal;

public class NVCongNhat extends NhanVien{
    private double soNgayCong;

    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.println("Số ngày công: " + soNgayCong);
        System.out.println("Lương: " + new BigDecimal(tinhLuong()));
    }

    public double tinhLuong() {
        return this.soNgayCong * 120000;
    }

    public double getSoNgayCong() {
        return soNgayCong;
    }

    public void setSoNgayCong(double soNgayCong) {
        this.soNgayCong = soNgayCong;
    }
}
