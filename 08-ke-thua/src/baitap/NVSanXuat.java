package baitap;

import java.math.BigDecimal;

public class NVSanXuat extends NhanVien {
    private double soSanPham;

    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.println("Số sản phẩm: " + soSanPham);
        System.out.println("Lương: " + new BigDecimal(tinhLuong()));
    }

    public double tinhLuong() {
        return this.soSanPham * 50000;
    }

    public double getSoSanPham() {
        return soSanPham;
    }

    public void setSoSanPham(double soSanPham) {
        this.soSanPham = soSanPham;
    }
}
