package JAVA.chap04_control_statement.problem6;

import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int index = 0;
        int total = 0;

        while (true) {
            int num = scanner.nextInt();

            // ✅ 0 입력 시 반복 종료
            if (num == 0) {
                if (index == 0) {
                    System.out.println("입력된 값이 없습니다.");
                } else {
                    double average = Math.round((total / (double) index) * 10) / 10.0;
                    System.out.println("총합: " + total);
                    System.out.println("평균: " + average);
                }
                break;
            }

            // ✅ 음수 입력 시 처리
            if (num < 0) {
                System.out.println("양수만 입력하세요.");
                continue;
            }

            // ✅ 유효한 양수 입력 시 합산 및 개수 증가
            total += num;
            index++;
        }
        scanner.close(); // ✅ Scanner 자원 해제
    }
}
