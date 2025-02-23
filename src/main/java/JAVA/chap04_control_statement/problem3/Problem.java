package JAVA.chap04_control_statement.problem3;

import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 입력 받기
        int kor = sc.nextInt();
        int math = sc.nextInt();
        int eng = sc.nextInt();

        // 2. 입력값 검증
        if (kor < 0 || kor > 100 || math < 0 || math > 100 || eng < 0 || eng > 100) {
            System.out.println("잘못된 입력입니다.");
            return;
        }

        // 3. 평균 계산 및 반올림
        double average = Math.round((kor + math + eng) / 3.0 * 10) / 10.0;

        // 4. 학점 판별
        if (average >= 90 && average <= 100) {
            System.out.println("평균 점수: " + average);
            System.out.println("학점: A+");
        } else if (average >= 85) {
            System.out.println("평균 점수: " + average);
            System.out.println("학점: A");
        } else if (average >= 80) {
            System.out.println("평균 점수: " + average);
            System.out.println("학점: B+");
        } else if (average >= 70) {
            System.out.println("평균 점수: " + average);
            System.out.println("학점: B");
        } else if (average >= 60) {
            System.out.println("평균 점수: " + average);
            System.out.println("학점: C");
        } else if (average >= 50) {
            System.out.println("평균 점수: " + average);
            System.out.println("학점: D");
        } else {
            System.out.println("평균 점수: " + average);
            System.out.println("학점: F");
        }
    }
}
