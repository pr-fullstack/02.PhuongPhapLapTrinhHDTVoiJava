package basiclearning;

public class Person {
    private int id;
    private String name;

    public Person() {
        System.out.println("Contructor mặc định");
        this.name = "";
    }

    public Person(int id) {
        this.id = id;
    }

    public Person(String name) {
        this.name = name;
    }


    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " - " + name);
    }
}
