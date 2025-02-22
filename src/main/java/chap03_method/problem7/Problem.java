package chap03_method.problem7;

public class Problem {
    public static void main(String[] args) {
        try {
            System.out.println("덧셈 결과 : " + Calculator.add(5, 6));
            System.out.println("뺼셈 결과 : " + Calculator.subtract(5, 6));
            System.out.println("곱셈 결과 : " + Calculator.multiply(5, 6));
            System.out.println("나눗셈 결과 : " + Calculator.divide(12, 6));
            System.out.println("나눗셈 결과 : " + Calculator.divide(0, 6));
            System.out.println("나눗셈 결과 : " + Calculator.divide(5, 0)); // 분모 0 예외 처리
        } catch (ArithmeticException e) {
            System.out.println("오류 발생: " + e.getMessage());
        }
    }

    static class Calculator {

        private static int add (int a, int b) {
            return a + b;
        }
        private static int subtract (int a, int b) {
            return a - b;
        }
        private static int multiply (int a, int b) {
            return a * b;
        }
        private static int divide (int a, int b) {
            if (b == 0){
                System.out.println("0으로 나눌 수 없습니다");
                throw new ArithmeticException();

            } else {
                return a / b;
            }
        }
     }
}