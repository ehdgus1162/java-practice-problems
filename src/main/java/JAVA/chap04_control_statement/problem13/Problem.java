package JAVA.chap04_control_statement.problem13;

import java.util.ArrayList;
import java.util.List;

public class Problem {
    public static void main(String[] args) {
        List<Integer> primes = getPrimaryNumber(10, 50);
        System.out.println("소수 목록: " + primes);
    }

    public static List<Integer> getPrimaryNumber(int a, int b) {
        List<Integer> arr = new ArrayList<>();

        for (int j = a; j <= b; j++) {
            if (j < 2) continue;  // 2 미만은 소수 아님

            boolean isPrime = true;  // ✅ 소수 여부 플래그
            for (int i = 2; i <= Math.sqrt(j); i++) {
                if (j % i == 0) {
                    System.out.println(j + " is not a prime number.");
                    isPrime = false;
                    break;  // ✅ 약수 발견 시 반복 종료
                }
            }
            if (isPrime) {
                arr.add(j);  // ✅ 소수인 경우만 추가
            }
        }
        return arr;
    }
}
