package JAVA.chap04_control_statement.problem4;

import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int inputMonth = scanner.nextInt();

        switch (inputMonth) {
            case 3, 4, 5 -> System.out.println("봄입니다");
            case 6, 7, 8 -> System.out.println("여름입니다");
            case 9, 10, 11 -> System.out.println("가을입니다.");
            case 12, 1, 2 -> System.out.println("겨울입니다.");
            default -> System.out.println("잘못된 입력입니다.");
        }
    }
}
