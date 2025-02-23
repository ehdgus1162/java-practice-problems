package JAVA.chap01_literal_and_varaible.problem7;

import java.util.Scanner;

public class problem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        double num2 = scanner.nextDouble();

        System.out.println("정수형 연산 결과 : " + ((int) (num1 + num2)));
        System.out.printf("실수형 나눗셈 결과 :  %.2f\n", num1 / num2);

    }
}
