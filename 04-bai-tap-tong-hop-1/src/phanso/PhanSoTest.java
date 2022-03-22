package phanso;

public class PhanSoTest {
    public static void main(String[] args) {
        PhanSo ps1 = new PhanSo();

        System.out.println("Nhập vào thông tin phân số 1: ");
        ps1.nhap();

        System.out.print("ps1 = ");
        ps1.xuat();
    }
}
