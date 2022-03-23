package baitap;

public class NVSanXuat extends NhanVien {
    private double soSanPham;

    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.println("Số sản phẩm: " + soSanPham);
    }

    public double getSoSanPham() {
        return soSanPham;
    }

    public void setSoSanPham(double soSanPham) {
        this.soSanPham = soSanPham;
    }
}
