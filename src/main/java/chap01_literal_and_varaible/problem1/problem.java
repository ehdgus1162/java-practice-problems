package chap01_literal_and_varaible.problem1;

import java.util.Scanner;

public class problem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int result = (a + b) * c - (a % b);
        System.out.println("결과: " + result);

    }
}
