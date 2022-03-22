package toado;

import java.util.Scanner;

public class ToaDo {
    double x;
    double y;

    void nhap() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào tọa độ x: ");
        x = scanner.nextDouble();

        System.out.print("Nhập vào tọa độ y: ");
        y = scanner.nextDouble();
    }

    void xuat() {
        System.out.printf("(%f, %f)\n", x, y);
    }

    double tinhKhoangCach(ToaDo toaDo) {
        return Math.sqrt(
                Math.pow(this.x - toaDo.x, 2)
                + Math.pow(this.y - toaDo.y, 2)
        );
    }
}
