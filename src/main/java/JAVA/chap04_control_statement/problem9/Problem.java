package JAVA.chap04_control_statement.problem9;

import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        System.out.println(n + " 번째 피보나치 수 :" + fibonacci(n));

    }
    static int fibonacci (int n) {

        int fn1 = 1;
        int fn2 = 1;
        int fib = 0;

        if (n == 1 || n == 2){
            return 1;
        }

        for (int i = 2; i < n; i++) {
            fib = (fn1 + fn2);
            fn1 = fn2;
            fn2 = fib;
        }
        return fib;
    }
}

