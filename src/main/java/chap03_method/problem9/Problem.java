package chap03_method.problem9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("밑수를 입력하세요: ");
            double base = scanner.nextDouble();
            System.out.print("지수를 입력하세요: ");
            double exponent = scanner.nextDouble();

            System.out.println("거듭제곱 결과: " + calculatePower(base, exponent));
            System.out.println("제곱근 결과: " + sqrt(base));
            System.out.println("거듭제곱의 절대값: " + calculateAbsolutePower(base, exponent));

        } catch (InputMismatchException e) {
            System.out.println("⚠️ 유효한 숫자를 입력하세요.");
        } catch (IllegalArgumentException e) {
            System.out.println("⚠️ " + e.getMessage());
        }
    }

    static double calculatePower(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    static double calculateAbsolutePower(double base, double exponent) {
        return Math.abs(Math.pow(base, exponent));
    }

    static double sqrt(double num) {
        if (num < 0) {
            throw new IllegalArgumentException("음수의 제곱근은 실수 범위에서 정의되지 않습니다.");
        }
        return Math.sqrt(num);
    }
}
