package toado;

public class ToaDoTest {
    public static void main(String[] args) {
        ToaDo a = new ToaDo();
        ToaDo b = new ToaDo();

        System.out.println("Nhập vào tọa độ a: ");
        a.nhap();

        System.out.println("Nhập vào tọa độ b: ");
        b.nhap();

        System.out.print("Tọa độ a: ");
        a.xuat();

        System.out.print("Tọa độ b: ");
        b.xuat();

        System.out.print("Khoảng cách giữa a và b: " + a.tinhKhoangCach(b));
    }
}
