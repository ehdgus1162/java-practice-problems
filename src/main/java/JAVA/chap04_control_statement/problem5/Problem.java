package JAVA.chap04_control_statement.problem5;

public class Problem {
    public static void main(String[] args) {

        for(int i = 0; i <= 20; i++) {
            if (i % 2 == 0){

                System.out.println(i + "의 제곱: " + (i * i));
            }
        }
    }
}
