package JAVA.chap04_control_statement.problem2;

import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println(numDiff(scanner, num1, num2));
    }
    public static String numDiff (Scanner scanner, int num1, int num2) {

        int diff = Math.abs(num1 - num2);

        if (diff > 10) {
            return "차이가 큽니다 1";
        } else {
            return "차이가 작습니다 2";
        }
    }
}
