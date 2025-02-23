package JAVA.chap02_operator.problem8;

import java.util.Scanner;

public class problem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);

        /**
         첫 번째 조건식: a > b ?
         - True : 두 번째 조건식 평가
         - a > c ?
         - True  => max = a
         - False => max = c
         - False : 세 번째 조건식 평가
         - b > c ?
         - True  => max = b
         - False => max = c

         */


    }
}
