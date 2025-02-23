package JAVA.chap03_method.problem12;

import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();
        String name = scanner.nextLine();

        System.out.println(name + age);

    }
}