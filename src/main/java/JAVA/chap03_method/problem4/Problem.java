package JAVA.chap03_method.problem4;

public class Problem {
    public static void main(String[] args) {
        calcCircleWidthAndRound(5);

    }
    static void calcCircleWidthAndRound(int r) {
        double n = Math.PI;
        double round = ((2 * n) * r);
        double width = n * (r * r);

        double roundValue = Math.round(round * 100) / 100.0;
        double roundWidth = Math.round(width * 100) / 100.0;

        System.out.println("원의 둘레: " + roundValue);
        System.out.println("원의 넓이: " + roundWidth);
        System.out.println("원래 숫자: " + width);
        System.out.println("1. 100 * 숫자: " + width * 100);
        System.out.println("2. 반올림한 숫자: " + Math.round(width * 100));
        System.out.println("3. 복원시킨 숫자: " + Math.round(width * 100) / 100.0);

        /**
         * 🎯 과정 요약
         * 1️⃣ 원래 숫자: 123.456789
         * 2️⃣ 100 곱하기: 12345.6789
         * 👉 소숫점 두 자리를 오른쪽으로 이동
         * 3️⃣ 반올림 (Math.round): 12346
         * 👉 Math.round()는 정수형으로 반환
         * 4️⃣ 다시 100.0으로 나누기: 123.46
         * 👉 소숫점 두 자리를 복원하여 최종 결과 도출
         */

    }
}
