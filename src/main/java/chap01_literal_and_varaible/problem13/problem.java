package chap01_literal_and_varaible.problem13;

public class problem {
    public static void main(String[] args) {

        int a = 5;  // 10진수 5 = 2진수 0101
        int b = 3;  // 10진수 3 = 2진수 0011

        // 1) 비트 AND 연산 (&)
        // 각 자리의 비트가 모두 1일 때만 1 반환
        // 0101 (5)
        // &0011 (3)
        // --------
        // 0001 -> 10진수 1
        System.out.println("a & b (AND 연산 결과): " + (a & b)); // 출력: 1


        // 2) 비트 OR 연산 (|)
        // 각 자리의 비트 중 하나라도 1이면 1 반환
        // 0101 (5)
        // |0011 (3)
        // --------
        // 0111 -> 10진수 7
        System.out.println("a | b (OR 연산 결과): " + (a | b)); // 출력: 7


        // 3) 비트 XOR 연산 (^)
        // 각 자리의 비트가 서로 다르면 1 반환
        // 0101 (5)
        // ^0011 (3)
        // --------
        // 0110 -> 10진수 6
        System.out.println("a ^ b (XOR 연산 결과): " + (a ^ b)); // 출력: 6
    }
}
