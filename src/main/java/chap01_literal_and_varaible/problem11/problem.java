package chap01_literal_and_varaible.problem11;

import java.util.Scanner;

public class problem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();
        int randomNum = (int) (Math.random() * 100) + 1;

        while(true){
            if (inputNum > randomNum) {
                System.out.println("더 작은 숫자를 입력하세요.");
            } else if (inputNum < randomNum) {
                System.out.println("더 큰 숫자를 입력하세요");
            } else {
                System.out.println("정답입니다!");
                break;
            }
        }
    }
}
