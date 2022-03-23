package answer;

public class SoPhuc {
    int a;
    int b;

    public SoPhuc() {
        this.a = 0;
        this.b = 0;
    }

    public SoPhuc(int a) {
        this.a = a;
        this.b = 0;
    }

    public SoPhuc(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public SoPhuc(SoPhuc sp) {
        this.a = sp.a;
        this.b = sp.b;
    }

    void xuat() {
        System.out.printf("%d+%di\n", a, b);
    }
}
