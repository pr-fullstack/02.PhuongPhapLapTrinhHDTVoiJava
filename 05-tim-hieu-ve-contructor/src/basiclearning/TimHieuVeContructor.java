package basiclearning;

public class TimHieuVeContructor {
    public static void main(String[] args) {
        Person person = new Person();
        person.display();

        Person person2 = new Person(1, "Nguyễn Ngọc Quang");
        person2.display();

        Person person3 = new Person(2);
        person3.display();

        Person person4 = new Person("Nguyễn Ngọc Quang");
        person4.display();
    }
}
