package hocsinh;

import java.util.Scanner;

public class HocSinh {
    String tenHocSinh;
    double diemToan;
    double diemVan;

    void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên học sinh: ");
        tenHocSinh = scanner.nextLine();

        diemToan = nhapDiem(scanner, "toán");
        diemVan = nhapDiem(scanner, "văn");
    }

    private double nhapDiem(Scanner scanner, String monHoc) {
        double diem;
        do {
            System.out.printf("Nhập vào điểm %s: ", monHoc);
            diem = scanner.nextDouble();

            if (diem < 0 || diem > 10) {
                System.out.println("Điểm chỉ từ 0 đến 10, xin kiểm tra lại!");
            }
        } while (diem < 0 || diem > 10);

        return diem;
    }

    void xuatThongTin() {
        System.out.println("Tên: " + tenHocSinh);
        System.out.println("Điểm toán: " + diemToan);
        System.out.println("Điểm văn: " + diemVan);
        System.out.println("Điểm trung bình: " + tinhDiemTrungBinh());
    }

    double tinhDiemTrungBinh() {
        return (diemToan + diemVan) / 2;
    }
}
