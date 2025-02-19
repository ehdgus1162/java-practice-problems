package chap01_literal_and_varaible.problem8;

import java.util.Scanner;

public class problem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputSecond = scanner.nextInt();

        int hour = inputSecond / 3600;
        int minute = (inputSecond % 3600) / 60;
        int second = ((inputSecond % 3600) % 60);

        System.out.println(hour);
        System.out.println(minute);
        System.out.println(second);



    }
}
