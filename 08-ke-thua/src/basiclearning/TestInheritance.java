package basiclearning;

class Animal {
    public void eat(){System.out.println("eating...");}
}

class Dog extends Animal{
    public void bark(){System.out.println("barking...");}
}

public class TestInheritance {
    public static void main(String args[]) {
        Dog d = new Dog();
        d.bark(); // barking...
        d.eat(); // eating...
    }
}