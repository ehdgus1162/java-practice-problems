package chap01_literal_and_varaible.problem12;

import java.util.Scanner;

public class problem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        int f = scanner.nextInt();

        int result = (a + b) * c / d - e % f;

        System.out.println("결과 : " + result);
    }
}
