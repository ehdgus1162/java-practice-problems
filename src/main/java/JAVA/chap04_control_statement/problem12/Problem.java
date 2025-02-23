package JAVA.chap04_control_statement.problem12;

public class Problem {
    public static void main(String[] args) {


        numberPy(10);

    }
    public static void numberPy (int n) {

        for(int i = 0; i < n; i++){

            for(int j = 0; j < (n - i - 1); j++) {
                System.out.print(" ");
            }
            for(int k = 0; k < (i + 1); k++) {
                System.out.print(k + 1);
            }
            for(int l = 0; l < (i); l++) {
                System.out.print(i - l);
            }
            System.out.println();
        }
    }
}
