package basiclearning;

public class Student {
    String name;
    int age;
    String color;
    String sex;

    void xuatThongTin() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Color: " + color);
        System.out.println("Sex: " + sex);
        eating();
        drinking();
        running();
    }

    void eating() {
        System.out.println(name + " can eat more");
    }

    void drinking() {
        System.out.println(name + " can drink more");
    }

    void running() {
        System.out.println(name + " can run fast");
    }
}
