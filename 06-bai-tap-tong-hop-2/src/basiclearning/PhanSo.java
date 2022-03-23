package basiclearning;

public class PhanSo {
    int tu;
    int mau;

    public PhanSo() {
        this.tu = 0;
        this.mau = 1;
    }

    public PhanSo(int tu) {
        this.tu = tu;
    }

    public PhanSo(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public PhanSo(PhanSo ps) {
        this.tu = ps.tu;
        this.mau = ps.mau;
    }

    void xuat() {
        System.out.printf("%d/%d\n", tu, mau);
    }
}
