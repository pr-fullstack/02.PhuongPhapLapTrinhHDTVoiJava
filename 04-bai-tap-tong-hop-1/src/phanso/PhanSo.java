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
}
