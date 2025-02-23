package JAVA.chap06_Object_Array.problem;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Student[] students = new Student[6];


        students[0] = new Undergraduate("Alice", 2023001, "CS", 3);
        students[1] = new Undergraduate("Bak", 2023001, "MCH", 2);
        students[2] = new Undergraduate("Jane", 2023001, "ELC", 4);
        students[3] = new Graduate("James", 2023101, "CS", "Mark");
        students[4] = new Graduate("Alice", 2023102, "MCH", "Yno");
        students[5] = new Graduate("Moon", 2023103, "ELC", "Sak");

        System.out.println("[Student Information Print]");
        for (Student id : students) {
            System.out.println(id.displayInfo());

            Scanner scanner = new Scanner(System.in);
            String inputMajor = scanner.nextLine();

            System.out.println("Major Search Result");

            if (id.getMajor().equals(inputMajor)){
                System.out.println(id.displayInfo());
            } else {
                System.out.println("Cannot Find Students");
            }
        }















    }

}
