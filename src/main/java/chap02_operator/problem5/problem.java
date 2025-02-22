package chap02_operator.problem5;

import java.util.Scanner;

/**
 * 🎯 1. 현재 코드 방식 (논리 연산자 + 단순 출력)
 * ✅ 특징:
 * 논리 연산자를 사용하여 결과를 불리언 값으로 직접 출력합니다.
 * 조건에 대한 단순 결과를 출력할 때 적합합니다.
 *
 *  2. if문만 사용하는 방식
 * 💡 특징:
 * 조건별 맞춤형 출력이 가능하여, 출력 결과를 더 설명적으로 만들 수 있습니다.
 * 참/거짓 결과에 따른 세부적인 동작 처리가 필요할 때 적합합니다.
 */

public class problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 📝 사용자로부터 세 개의 불리언 값 입력받기
        System.out.print("세 개의 불리언 값을 입력하세요 (예: true false true): ");
        boolean a = sc.nextBoolean();
        boolean b = sc.nextBoolean();
        boolean c = sc.nextBoolean();

        // ✅ 1. 세 값이 모두 참인지 여부 확인 (AND 연산자)
        boolean allTrue = a && b && c;
        System.out.println("모두 참인가? " + allTrue);

        // ✅ 2. 적어도 하나의 값이 참인지 여부 확인 (OR 연산자)
        boolean atLeastOneTrue = a || b || c;
        System.out.println("하나라도 참인가? " + atLeastOneTrue);

        // ✅ 3. 첫 번째 값이 거짓인지 확인 (NOT 연산자)
        if (!a) {
            System.out.println("첫 번째 값이 거짓입니다");
        }

        sc.close();
    }
}
