package chap02_operator.problem1;

import java.util.Scanner;

public class problem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        double average = (double) (num1 + num2 + num3) / 3; // 부동소수점 생각하여 double로 casting
        int divided = (num2 != 0 && num3 != 0) ? (num1 % num2) / num3 : 0; // 0으로 나누는 경우 방지

        System.out.printf("평균 : %.2f, 연산 결과 : %d\n", average, divided);
    }
}
