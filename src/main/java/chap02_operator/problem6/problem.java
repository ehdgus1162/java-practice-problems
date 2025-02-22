package chap02_operator.problem6;

public class problem {
    public static void main(String[] args) {

        // 첫 번째 조건문
        // 조건: (7 > 5 && 3 < 2) || !(4 == 4 && 9 > 6)
        // 1) (7 > 5 && 3 < 2) → true && false → false
        // 2) (4 == 4 && 9 > 6) → true && true → true
        // 3) !(true) → false
        // 전체 조건: false || false → false
        // 따라서, 출력되지 않음
        if ((7 > 5 && 3 < 2) || !(4 == 4 && 9 > 6)) {
            System.out.println("false"); // 이 줄은 실행되지 않음
        }

        // 두 번째 조건문
        // 조건: !(true || false) && (10 >= 10 && 5 != 3)
        // 1) (true || false) → true
        // 2) !(true) → false
        // 3) (10 >= 10 && 5 != 3) → true && true → true
        // 전체 조건: false && true → false
        // 따라서, 출력되지 않음
        if (!(true || false) && (10 >= 10 && 5 != 3)) {
            System.out.println(false); // 이 줄도 실행되지 않음
        }
    }
}
