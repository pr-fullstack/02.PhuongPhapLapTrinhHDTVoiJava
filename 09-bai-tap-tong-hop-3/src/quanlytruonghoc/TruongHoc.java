package quanlytruonghoc;

import java.io.IOException;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class TruongHoc {
    static ArrayList<Student> students = new ArrayList<>();
    static ArrayList<Teacher> teachers = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        docFile();

        xuatThongTin();
    }

    private static void xuatThongTin() {
        System.out.println("\n====== Danh sánh Student ======");
        for (int i = 0; i < students.size(); i++) {
            System.out.printf("\nThông tin student thứ %d\n", i + 1);
            students.get(i).xuatThongTin();
        }

        System.out.println("\n====== Danh sánh teacher ======");
        for (int i = 0; i < teachers.size(); i++) {
            System.out.printf("\nThông tin teacher thứ %d\n", i + 1);
            teachers.get(i).xuatThongTin();
        }
    }

    private static void docFile() throws IOException {
        Scanner scanner = new Scanner(Paths.get("09-bai-tap-tong-hop-3/src/resources/input.txt"));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        while (scanner.hasNextLine()) {
            String str = scanner.nextLine();
            String[] info = str.split(",");
            if ("1".equals(info[0])) { // Student
                Student student = new Student();
                student.setTen(info[1]);
                student.setGioiTinh(info[2]);
                student.setNgaySinh(LocalDate.parse(info[3], formatter));
                student.setDiaChi(info[4]);
                student.setMaSV(info[5]);
                student.setDiemTB(Double.parseDouble(info[6]));

                students.add(student);
            }  else { // Teacher
                Teacher teacher = new Teacher();
                teacher.setTen(info[1]);
                teacher.setGioiTinh(info[2]);
                teacher.setNgaySinh(LocalDate.parse(info[3], formatter));
                teacher.setDiaChi(info[4]);
                teacher.setLopDay(info[5]);
                teacher.setLuongMotGioDay(Double.parseDouble(info[6]));
                teacher.setSoGioDayTrongMotThang(Double.parseDouble(info[7]));

                teachers.add(teacher);
            }
        }
        scanner.close();
    }
}
