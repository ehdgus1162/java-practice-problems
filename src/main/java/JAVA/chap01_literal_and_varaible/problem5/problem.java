package JAVA.chap01_literal_and_varaible.problem5;

import java.util.Scanner;

public class problem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int mass = scanner.nextInt();
        int acceleration = scanner.nextInt();

        System.out.println("힘 : " + (mass * acceleration) + "N");
    }
}
