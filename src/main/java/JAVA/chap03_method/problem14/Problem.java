package JAVA.chap03_method.problem14;

import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {

        /**
         * 제곱근은 제곱(거듭제곱)의 반대 연산
         *
         * 제곱근이란? → 자기 자신을 두 번 곱했을 때 주어진 값이 되는 수
         * 수학적 원리? → 거듭제곱의 역연산, 이진 탐색을 활용하여 구할 수 있음
         * 코딩에서 활용? → Math.sqrt(n)을 사용하면 빠르게 계산 가능
         * 소수 판별에 사용? →
         * 𝑛
         * n의 약수를 검사할 때 제곱근까지만 검사하면 됨!
         * 시간 복잡도 줄이기? → O(n) → O(√n) 으로 획기적으로 줄어듦
         */
        Scanner scanner = new Scanner(System.in);
        int primeNumber = scanner.nextInt();

        System.out.println(isPrime(primeNumber));

    }
    public static boolean isPrime(int number) {

        if (number <= 1) return false;
        if (number == 2 || number == 3 || number == 5) return true; // 2, 3, 5는 소수
        if (number % 2 == 0 || number % 3 == 0 || number % 5 == 0) return false; // 짝수 및 3, 5 배수 제외

        for (int i = 7; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) return false;
        }

        /**
         * I = 약수 후보
         * 2,3,5 의 배수를 걸러내서 7부터 시작
         * Math.sqrt(25) = 5
         * i = 7이므로 반복문 실행되지 않음 → 25는 통과.
         * 하지만 앞에서 number % 5 == 0에서 걸러짐 → 25는 소수 아님!
         */
        return true;
    }
}