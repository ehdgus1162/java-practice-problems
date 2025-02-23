package JAVA.chap04_control_statement.problem1;

import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        if(num > 0){
            System.out.println("양수입니다 1");
            if(num % 2 == 0) {
                System.out.println("짝수입니다 2");
            } else {
                System.out.println("홀수입니다 3");
            }
        } else {
            System.out.println("음수입니다 4");
        }
    }
}
