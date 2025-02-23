package JAVA.chap01_literal_and_varaible.problem3;

import java.util.Scanner;

public class problem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNum = scanner.nextDouble();
        double secondNum = scanner.nextDouble();

        System.out.println("덧셈: " + (firstNum + secondNum));
        System.out.println("뺄셈: " + (firstNum - secondNum));
        System.out.println("곱셈: " + (firstNum * secondNum));
        System.out.printf("나눗셈: %.2f", firstNum / secondNum);
    }
}
