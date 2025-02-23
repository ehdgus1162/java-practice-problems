package JAVA.chap04_control_statement.problem10;

public class Problem {
    public static void main(String[] args) {

        printStarPy(5);




    }
    static void printStarPy(int n) {

        for (int i = 0; i < n; i ++){

            for (int j = 0; j < n - (i + 1); j++){
                System.out.print(" ");
            }
            for (int k = 0; k < (i * 2) + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
