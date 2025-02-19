package chap01_literal_and_varaible.problem4;

import java.util.Scanner;

public class problem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String job = scanner.nextLine();

        System.out.println("이름 : " + name + "직업 : " + job);

    }
}
