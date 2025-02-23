package JAVA.chap06_Object_Array.problem;

public class Graduate extends Student{

    private final String advisor;



    public Graduate(String name, int id, String major, String advisor) {
        super(name, id, major);
        this.advisor = advisor;
    }


    public String getAdvisor() {
        return advisor;
    }
}
