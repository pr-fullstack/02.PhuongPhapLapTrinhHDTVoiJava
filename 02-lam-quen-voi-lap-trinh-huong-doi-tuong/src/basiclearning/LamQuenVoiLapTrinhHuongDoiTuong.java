package basiclearning;

public class LamQuenVoiLapTrinhHuongDoiTuong {
    public static void main(String[] args) {
        Student john = new Student();
        Student sophia = new Student();
        Student lily = new Student();

        // Nhập thông tin cho Join
        john.name = "John";
        john.age = 12;
        john.color = "Fair";
        john.sex = "Male";

        // ===== Nhập thông tin cho Sophia =====
        sophia.name = "Sophia";
        sophia.age = 10;
        sophia.color = "Fair";
        sophia.sex = "Female";

        // ===== Nhập thông tin cho Lily =====
        lily.name = "Lily";
        lily.age = 11;
        lily.color = "Dark";
        lily.sex = "Female";

        // ===== Xuất thông tin của John =====
        System.out.println("====== Thông tin của John ======");
        john.xuatThongTin();

        // ===== Xuất thông tin của Sophia =====
        System.out.println("\n====== Thông tin của Sophia ======");
        sophia.xuatThongTin();

        // ===== Xuất thông tin của Lily =====
        System.out.println("\n====== Thông tin của Lily ======");
        lily.xuatThongTin();
    }
}
