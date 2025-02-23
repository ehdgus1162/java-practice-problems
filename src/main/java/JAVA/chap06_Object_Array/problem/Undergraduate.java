package JAVA.chap06_Object_Array.problem;

public class Undergraduate extends Student{
    private final int year;

    public Undergraduate(String name, int id, String major, int year) {
        super(name, id, major);
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String displayInfo() {
        return super.displayInfo() + ", grade: " + year;

    }
}
