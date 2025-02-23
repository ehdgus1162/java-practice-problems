package JAVA.chap04_control_statement.problem11;

public class Problem {
    public static void main(String[] args) {

        // 1부터 1000까지의 수 중 완전수를 찾습니다.
        for (int n = 1; n <= 1000; n++) {
            if (isPerfectNumber(n)) {
                System.out.println("완전수: " + n);
            }
        }
    }

    /**
     * 주어진 숫자가 완전수인지 판별하는 메서드
     * 완전수란? 자기 자신을 제외한 약수의 합이 자기 자신과 같은 수
     * @param number 판별할 숫자
     * @return 완전수이면 true, 아니면 false
     */
    static boolean isPerfectNumber(int number) {
        int sum = 0;

        // 1부터 number-1까지 반복하며 약수를 찾고 합산
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        // 약수의 합과 자기 자신이 같으면 완전수
        return sum == number;
    }
}
