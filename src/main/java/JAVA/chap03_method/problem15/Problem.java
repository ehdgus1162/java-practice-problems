package JAVA.chap03_method.problem15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> resultList = getInputString(scanner, "종료");
        System.out.println("최종 입력 목록 :" + resultList);
        scanner.close();
    }

    /**
     * 🎈 Scanner와 종료 키워드를 전달받아 문자열 리스트를 반환하는 메서드
     * @param scanner Scanner 객체 (입력 스트림)
     * @param exitKeyword 입력 종료를 위한 키워드
     * @return 입력된 문자열 리스트
     *
     * 자바에서는 모든 객체가 참조로 전달됩니다.
     * Scanner를 메서드에 전달하면 메서드가 동일한 Scanner 인스턴스를 참조하게 됩니다.
     * 즉, 메서드 내에서 Scanner를 사용하더라도 main 메서드에서 생성한 Scanner와 동일한 입력 스트림을 사용합니다.
     */

    public static List<String> getInputString(Scanner scanner, String exitKeyword) {
        List<String> stringList = new ArrayList<>();

        while (true) {
            System.out.print("문자열을 입력하세요 (" + exitKeyword + " 입력 시 끝남): ");
            String inputStr = scanner.nextLine();

            if (exitKeyword.equals(inputStr)) {
                break;
            } else {
                stringList.add(inputStr);
                System.out.println("현재 리스트: " + stringList);
            }
        }
        return stringList;
    }
}