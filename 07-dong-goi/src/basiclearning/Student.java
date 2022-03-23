package basiclearning;

public class Student {
    private int id;
    private String name;
    private double score;

    public Student() {
        this.name = "";
    }

//    public void setId(int id) {
//        this.id = id;
//    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        if (score >= 0 && score <= 10) {
            this.score = score;
        }
    }
}
