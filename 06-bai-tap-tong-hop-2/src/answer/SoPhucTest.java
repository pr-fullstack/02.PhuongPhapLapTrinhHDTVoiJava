package answer;

public class SoPhucTest {
    public static void main(String[] args) {
        SoPhuc a = new SoPhuc();
        a.xuat(); // 0+0i

        SoPhuc b = new SoPhuc(2);
        b.xuat(); // 2+0i

        SoPhuc c = new SoPhuc(3, 4);
        c.xuat(); // 3+4i

        SoPhuc d = new SoPhuc(-5, 6);
        d.xuat(); // -5+6i

        SoPhuc e = new SoPhuc(-7);
        e.xuat(); // -7+0i

        SoPhuc f = new SoPhuc(e);
        f.xuat(); // -7+0i
    }
}
