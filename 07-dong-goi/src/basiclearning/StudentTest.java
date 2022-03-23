package basiclearning;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();

//        student.setId(2);
        student.setScore(100);

        System.out.println("Score = " + student.getScore());
    }
}
