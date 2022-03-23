package answer;

public class NgayTest {
    public static void main(String[] args) {
        Ngay a = new Ngay();
        a.xuat(); // 1/1/1

        Ngay b = new Ngay(2022);
        b.xuat(); // 1/1/2022

        Ngay c = new Ngay(2022, 10);
        c.xuat(); // 1/10/2022

        Ngay d = new Ngay(2022, 10, 20);
        d.xuat(); // 20/10/2022

        Ngay e = new Ngay(d);
        e.xuat(); // 20/10/2022
    }
}
