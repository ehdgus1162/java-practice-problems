package JAVA.chap02_operator.problem7;

import java.util.Scanner;

public class problem {
    public static void main(String[] args) {
        // 🔍 1. 논리 연산자 진리표 출력
        boolean[] values = {true, false};
        System.out.println("진리표:\nA\tB\tA&&B\tA||B\t!A");

        for (boolean A : values) {
            for (boolean B : values) {
                System.out.println(A + "\t" + B + "\t" + (A && B) + "\t" + (A || B) + "\t" + (!A));
            }
        }

        // 🔐 2. 비밀번호 검증 프로그램
        Scanner sc = new Scanner(System.in);
        System.out.print("\n비밀번호 입력: ");
        String password = sc.nextLine();

        // ✅ 조건 1: 길이가 8자 이상인지 확인
        boolean lengthCheck = password.length() >= 8;

        // ✅ 조건 2: 숫자가 포함되어 있는지 확인 (정규 표현식 사용)
        boolean numberCheck = password.matches(".*\\d.*");

        // 💡 최종 조건 충족 여부 확인 (AND 연산자 사용)
        boolean isValid = lengthCheck && numberCheck;

        System.out.println("\n비밀번호 조건 충족: " + isValid);
        sc.close();
    }
}
