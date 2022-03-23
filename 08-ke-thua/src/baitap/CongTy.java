package baitap;

import java.io.IOException;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class CongTy {
    static ArrayList<NVQuanLy> dsNVQuanLy = new ArrayList<>();
    static ArrayList<NVCongNhat> dsNVCongNhat = new ArrayList<>();
    static ArrayList<NVSanXuat> dsNVSanXuat = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(Paths.get("08-ke-thua/src/resources/input.txt"));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        while (scanner.hasNextLine()) {
            String str = scanner.nextLine();
            String[] info = str.split(",");
            if ("1".equals(info[0])) { //Nhân viên quản lý
//                NVQuanLy nvQuanLy = new NVQuanLy(
//                        info[1], LocalDate.parse(info[2]), info[3],
//                        Double.parseDouble(info[4]), Double.parseDouble(info[5])
//                );

                NVQuanLy nvQuanLy = new NVQuanLy();
                nvQuanLy.setHoTen(info[1]);
                nvQuanLy.setNgaySinh(LocalDate.parse(info[2], formatter));
                nvQuanLy.setDiaChi(info[3]);
                nvQuanLy.setLuongCoBan(Double.parseDouble(info[4]));
                nvQuanLy.setHeSoLuong(Double.parseDouble(info[5]));

                dsNVQuanLy.add(nvQuanLy);
            } else if ("2".equals(info[0])) { //Nhân viên công nhật
                NVCongNhat nvCongNhat = new NVCongNhat();
                nvCongNhat.setHoTen(info[1]);
                nvCongNhat.setNgaySinh(LocalDate.parse(info[2], formatter));
                nvCongNhat.setDiaChi(info[3]);
                nvCongNhat.setSoNgayCong(Double.parseDouble(info[4]));

                dsNVCongNhat.add(nvCongNhat);
            } else { // Nhân viên sản xuất
                NVSanXuat nvSanXuat = new NVSanXuat();
                nvSanXuat.setHoTen(info[1]);
                nvSanXuat.setNgaySinh(LocalDate.parse(info[2], formatter));
                nvSanXuat.setDiaChi(info[3]);
                nvSanXuat.setSoSanPham(Double.parseDouble(info[4]));

                dsNVSanXuat.add(nvSanXuat);
            }
//            nhapThongTinNhanVien(info);
        }
        scanner.close();

        System.out.println("\n====== Danh sánh nhân viên quản lý ======");
        for (int i = 0; i < dsNVQuanLy.size(); i++) {
            System.out.printf("Thông tin nhân viên thứ %d\n", i + 1);
            dsNVQuanLy.get(i).xuatThongTin();
        }

        System.out.println("\n====== Danh sánh nhân viên công nhật ======");
        for (int i = 0; i < dsNVCongNhat.size(); i++) {
            System.out.printf("Thông tin nhân viên thứ %d\n", i + 1);
            dsNVCongNhat.get(i).xuatThongTin();
        }

        System.out.println("\n====== Danh sánh nhân viên sản xuất ======");
        for (int i = 0; i < dsNVSanXuat.size(); i++) {
            System.out.printf("Thông tin nhân viên thứ %d\n", i + 1);
            dsNVSanXuat.get(i).xuatThongTin();
        }
    }
}
