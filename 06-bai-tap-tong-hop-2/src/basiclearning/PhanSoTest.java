package basiclearning;

public class PhanSoTest {
    public static void main(String[] args) {
        PhanSo a = new PhanSo();
        a.xuat(); // 0/1

        PhanSo b = new PhanSo(3);
        b.xuat(); // 3/1

        PhanSo c = new PhanSo(-5);
        c.xuat(); // -5/1

        PhanSo d = new PhanSo(1, 2);
        d.xuat(); // 1/2

        PhanSo e = new PhanSo(3, 4);
        e.xuat(); // 3/4

        PhanSo f = new PhanSo(e);
        f.xuat(); // 3/4
    }
}
