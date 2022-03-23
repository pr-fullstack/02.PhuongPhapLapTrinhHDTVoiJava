package baitap;

public class NVCongNhat extends NhanVien{
    private double soNgayCong;

    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.println("Số ngày công: " + soNgayCong);
    }

    public double getSoNgayCong() {
        return soNgayCong;
    }

    public void setSoNgayCong(double soNgayCong) {
        this.soNgayCong = soNgayCong;
    }
}
