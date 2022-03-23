package answer;

public class ThoiGianTest {
    public static void main(String[] args) {
        ThoiGian a = new ThoiGian();
        a.xuat(); // 00/00/00

        ThoiGian b = new ThoiGian(7);
        b.xuat(); // 07/00/00

        ThoiGian c = new ThoiGian(7, 30);
        c.xuat(); // 07/30/00

        ThoiGian d = new ThoiGian(8, 12, 56);
        d.xuat(); // 08/12/56

        ThoiGian e = new ThoiGian(d);
        e.xuat(); // 08/12/56
    }
}
