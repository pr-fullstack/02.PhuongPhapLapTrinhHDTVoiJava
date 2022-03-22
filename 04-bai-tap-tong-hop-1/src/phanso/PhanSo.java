package phanso;

import java.util.Scanner;

public class PhanSo {
    int tu;
    int mau;

    void nhap() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào tử: ");
        tu = scanner.nextInt();

        do {
            System.out.print("Nhập vào mẫu: ");
            mau = scanner.nextInt();

            if (mau == 0) {
                System.out.println("Mẫu phải khác 0, xin kiểm tra lại!!");
            }
        } while (mau == 0);
    }

    void xuat() {
        int ucln = timUCLN(tu, mau);

        tu /= ucln;
        mau /= ucln;

        if (mau < 0) {
            mau = -mau;
            tu = -tu;
        }

        if (mau == 1) {
            System.out.println(tu);
        } else {
            System.out.printf("%s/%s\n", tu, mau);
        }
    }

    int timUCLN(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        int min = a < b ? a : b;
        int max = a > b ? a : b;

        if (max % min == 0) {
            return min;
        } else {
            for(int i = min / 2; ; i--) {
                if (a % i == 0 && b % i == 0) {
                    return i;
                }
            }
        }
    }

    /**
     *  a / b + c / d = (a * d + b * c) / (b * d)
     */
    PhanSo tinhTong(PhanSo ps) {
        PhanSo tong = new PhanSo();

        tong.tu = this.tu * ps.mau + this.mau * ps.tu;
        tong.mau = this.mau * ps.mau;

        return tong;
    }

    PhanSo tinhHieu(PhanSo ps) {
        PhanSo hieu = new PhanSo();

        hieu.tu = this.tu * ps.mau - this.mau * ps.tu;
        hieu.mau = this.mau * ps.mau;

        return hieu;
    }

    PhanSo tinhTich(PhanSo ps) {
        PhanSo tich = new PhanSo();

        tich.tu = this.tu * ps.tu;
        tich.mau = this.mau * ps.mau;

        return tich;
    }

    PhanSo tinhThuong(PhanSo ps) {
        PhanSo thuong = new PhanSo();

        thuong.tu = this.tu * ps.mau;
        thuong.mau = this.mau * ps.tu;

        return thuong;
    }
}
