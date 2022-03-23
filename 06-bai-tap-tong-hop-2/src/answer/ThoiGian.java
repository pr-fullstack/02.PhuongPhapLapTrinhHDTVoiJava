package answer;

public class ThoiGian {
    int gio;
    int phut;
    int giay;

    public ThoiGian (){
        this.gio = 0;
        this.phut = 0;
        this.giay = 0;
    }

    public ThoiGian (int gio){
        this.gio = gio;
        this.phut = 0;
        this.giay = 0;
    }

    public ThoiGian (int gio, int phut){
        this.gio = gio;
        this.phut = phut;
        this.giay = 0;
    }

    public ThoiGian (int gio, int phut, int giay){
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }

    public ThoiGian (ThoiGian  thoiGian){
        this.gio = thoiGian.gio;
        this.phut = thoiGian.phut;
        this.giay = thoiGian.giay;
    }

    void xuat() {
        System.out.println(String.format("%2d/%2d/%2d", gio, phut, giay).replaceAll(" ", "0"));
    }
}
