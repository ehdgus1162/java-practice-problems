package chap02_operator.problem2;

public class problem {
    public static void main(String[] args) {
        int num = 20;  // 초기값 선언
        System.out.println("초기값: " + num);

        num += 10;  // 10을 더함
        System.out.println("+= 10 -> " + num);

        num /= 3;   // 3으로 나눔
        System.out.println("/= 3 -> " + num);

        num *= 5;   // 5를 곱함
        System.out.println("*= 5 -> " + num);

        num -= 8;   // 8을 뺌
        System.out.println("-= 8 -> " + num);

        num %= 2;   // 2로 나눈 나머지를 구함
        System.out.println("%= 2 -> " + num);
    }
}
