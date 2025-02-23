package JAVA.chap03_method.problem8;

import java.util.Arrays;
import java.util.Random;

public class Problem {
    public static void main(String[] args) {
        Random random = new Random();

        int[] arr = new int[10];
        double total = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(100) + 1;
            total += arr[i];
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }
        System.out.println("생성된 난수" + Arrays.toString(arr));
        System.out.println("평균 " + total / arr.length);
        System.out.println("최대값 " + max);
        System.out.println("최소값 " + min);

        /**
         * System.out.println이 출력할 때 double 값을 기본적으로
         * toString() 메서드를 호출하는데, 이 메서드는 소숫점 이하의 불필요한 0을 생략하여 출력
         */
    }
}