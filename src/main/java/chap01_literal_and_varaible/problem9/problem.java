package chap01_literal_and_varaible.problem9;

import java.util.Scanner;

public class problem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean isTrue = false;
        boolean isOdd = false;
        int num = scanner.nextInt();

        if (num >= 10 && num <= 50) {
            isTrue = true;
            if(num % 2 == 0) {
                isOdd = true;
            }
        }
        System.out.println("10 이상 50 아하인가? " + isTrue + " 쩍수인가?" + isOdd);
    }
}
