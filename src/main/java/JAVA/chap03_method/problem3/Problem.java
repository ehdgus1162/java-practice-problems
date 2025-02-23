package JAVA.chap03_method.problem3;

import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String inputName = scanner.nextLine();

        if (inputName.length() < 2) {
            System.out.println("올바른 이름을 입력하세요");
        } else {
            System.out.println("안녕하세요 " + inputName + "님!");
            System.out.println("이름의 길이: " + inputName.length());
            for (int i = 0; i < inputName.length(); i++) {
                System.out.println(inputName.charAt(i));
            }
        }
        scanner.close();
    }
}