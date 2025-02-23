package JAVA.chap03_method.problem13;

import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputString = scanner.nextLine();
        scanner.close(); // Scanner 닫기

        String[] words = inputString.split("\\s+"); // 연속된 공백도 하나의 구분자로 처리
        String longestWord = "";
        String targetWord = "apple";
        boolean containsTarget = false;
        int wordsCount = 0;

        for (String word : words) {
            wordsCount++;
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
            if (word.equals(targetWord)) {
                containsTarget = true;
            }
        }

        System.out.println("단어 수: " + wordsCount + " | 가장 긴 단어: " + longestWord + " | 단어 포함 여부: " + containsTarget);
    }
}
