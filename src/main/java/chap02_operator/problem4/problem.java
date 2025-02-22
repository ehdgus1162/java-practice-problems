package chap02_operator.problem4;

import java.util.Scanner;

public class problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 📝 사용자로부터 두 개의 정수 입력받기
        System.out.print("두 개의 정수를 입력하세요 (예: 12 9): ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        // ✅ 1. 두 수가 모두 양수인지 여부 확인
        boolean bothPositive = (num1 > 0) && (num2 > 0);
        System.out.println("두 수가 양수인가? " + bothPositive);

        // ✅ 2. 첫 번째 수가 두 번째 수보다 크면서 두 번째 수가 10 이하인지 여부 확인
        boolean firstGreaterAndSecondLessEqual10 = (num1 > num2) && (num2 <= 10);
        System.out.println("첫 번째 수가 더 크면서 두 번째 수가 10 이하인가? " + firstGreaterAndSecondLessEqual10);

        // ✅ 3. 두 수가 같지 않다면 "다름" 출력
        if (num1 != num2) {
            System.out.println("다름");
        }

        sc.close();
    }
}
