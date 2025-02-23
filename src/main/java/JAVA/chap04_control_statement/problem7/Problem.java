package JAVA.chap04_control_statement.problem7;

import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE; // ✅ 가장 작은 정수로 초기화
        int index = 0;
        int num;

        do {
            num = scanner.nextInt(); // 사용자 입력 받기

            if (num == 0) { // ✅ 0 입력 시 반복 종료
                if (index == 0) {
                    System.out.println("입력된 숫자가 없습니다.");
                } else {
                    System.out.println("입력된 숫자 중 최대값: " + max);
                }
                break;
            }

            // ✅ 최대값 업데이트 및 입력 개수 증가
            if (num > max) {
                max = num;
            }
            index++;

        } while (true);

        scanner.close(); // ✅ Scanner 자원 해제
    }
}