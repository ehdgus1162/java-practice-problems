package JAVA.chap04_control_statement.problem8;

public class Problem {
    public static void main(String[] args) {

        /**
         * 현재 반복에서 continue 아래의 코드는 실행되지 않음.
         * 반복문의 증감식(for의 경우) 또는 조건식 검사 단계(while, do-while의 경우)로 즉시 넘어감.
         */
        int indexCount = 5;

        for (int i = 1; i <= indexCount; i++) {
            for (int j = 1; j <= 5; j++) {

                if (i * j > 12) {
                    System.out.println(i + " x " + j + " = " + (i * j) + " (내부 반복 종료)");
                    break;
                }

                if ((i * j) % 2 == 0) {
                    System.out.println(i + " x " + j + " = " + (i * j) + " (건너뜀)");
                    continue;
                }

                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }
    }
}
