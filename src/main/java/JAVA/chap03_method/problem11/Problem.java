package JAVA.chap03_method.problem11;

import java.util.Scanner;


public class Problem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        do {
            System.out.print("양수를 입력하세요: ");
            num = scanner.nextInt();
            if (num < 0) {
                System.out.println("음수입니다. 다시 입력하세요.");
            }
        } while (num < 0);

        System.out.println("올바른 양수를 입력했습니다: " + num);
        scanner.close();
    }
}
