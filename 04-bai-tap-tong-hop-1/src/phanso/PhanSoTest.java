package phanso;

public class PhanSoTest {
    public static void main(String[] args) {
        PhanSo ps1 = new PhanSo();
        PhanSo ps2 = new PhanSo();

        System.out.println("Nhập vào thông tin phân số 1: ");
        ps1.nhap();

        System.out.println("Nhập vào thông tin phân số 2: ");
        ps2.nhap();

        System.out.print("ps1 = ");
        ps1.xuat();

        System.out.print("ps2 = ");
        ps2.xuat();

        PhanSo tong = ps1.tinhTong(ps2);
        System.out.print("ps1 + ps2 = ");
        tong.xuat();

        System.out.print("ps1 - ps2 = ");
        ps1.tinhHieu(ps2).xuat();

        System.out.print("ps1 * ps2 = ");
        ps1.tinhTich(ps2).xuat();

        System.out.print("ps1 / ps2 = ");
        ps1.tinhThuong(ps2).xuat();

        switch (ps1.kiemTraPS()) {
            case 1:
                System.out.println("ps1 là dương");
                break;
            case 0:
                System.out.println("ps1 = 0");
                break;
            default:
                System.out.println("ps1 là âm");
        }
    }
}
