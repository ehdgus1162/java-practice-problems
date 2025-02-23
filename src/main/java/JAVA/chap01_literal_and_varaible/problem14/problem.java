package JAVA.chap01_literal_and_varaible.problem14;

import java.util.Scanner;

public class problem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();
        String result = (inputNum < 0) ? "음수" : "양수";
        System.out.println("결과 : " + result);

        // 수학적으로 0은 양수이다!

    }
}
