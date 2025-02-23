package JAVA.chap06_Object_Array.problem;

public abstract class Student {
    private final String name;
    private final int id;
    private final String major;


    public Student(String name, int id, String major) {
        this.name = name;
        this.id = id;
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }



    public String displayInfo() {
        return "name: " + name + ", id: " + id + ", major: " + major;
    }
}


