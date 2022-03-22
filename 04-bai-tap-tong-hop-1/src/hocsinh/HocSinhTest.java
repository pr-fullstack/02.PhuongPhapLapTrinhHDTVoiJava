package hocsinh;

public class HocSinhTest {
    public static void main(String[] args) {
        HocSinh hs1 = new HocSinh();
        HocSinh hs2 = new HocSinh();

        System.out.println("Nhập vào thông tin học sinh thứ 1");
        hs1.nhapThongTin();

        System.out.println("Nhập vào thông tin học sinh thứ 2");
        hs2.nhapThongTin();

        System.out.println("Thông tin học sinh thứ 1");
        hs1.xuatThongTin();

        System.out.println("Thông tin học sinh thứ 2");
        hs2.xuatThongTin();
    }
}
