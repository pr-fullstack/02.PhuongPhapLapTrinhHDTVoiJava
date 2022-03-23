package answer;

public class Ngay {
    int ngay;
    int thang;
    int nam;

    public Ngay() {
        this.nam = 1;
        this.thang = 1;
        this.ngay = 1;
    }

    public Ngay(int nam) {
        this.nam = nam;
        this.thang = 1;
        this.ngay = 1;
    }

    public Ngay(int nam, int thang) {
        this.nam = nam;
        this.thang = thang;
        this.ngay = 1;
    }

    public Ngay(int nam, int thang, int ngay) {
        this.nam = nam;
        this.thang = thang;
        this.ngay = ngay;
    }

    public Ngay(Ngay ngay) {
        this.nam = ngay.nam;
        this.thang = ngay.thang;
        this.ngay = ngay.ngay;
    }

    void xuat() {
        System.out.printf("%d/%d/%d\n", this.ngay, this.thang, this.nam);
    }
}
