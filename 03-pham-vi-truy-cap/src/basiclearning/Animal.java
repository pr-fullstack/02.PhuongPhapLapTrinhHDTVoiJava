package basiclearning;

public class Animal {
     private String name;
     String color;
     protected double weight;
     public int age;

     void output() {
          System.out.println("Name: " + name);
          System.out.println("Color: " + color);
          System.out.println("Weight: " + weight);
          System.out.println("Age: " + age);
     }
}
