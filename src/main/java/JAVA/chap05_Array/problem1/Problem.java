package JAVA.chap05_Array.problem1;

public class Problem {
    public static void main(String[] args) {
        int[] arr = new int[]{90, 85, 78, 92, 88};

        studentPrint(arr);


    }
    public static void studentPrint (int[] arr) {
        int total = 0;
        double average = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){
            total += arr[i];
            if (max < arr[i]) max = arr[i];
            if (min > arr[i]) min = arr[i];
        }
        average = Math.round((double) total / arr.length * 10) / 10.0;

        System.out.println("합계: " + total);
        System.out.println("평균: " + average);
        System.out.println("최고 점수 " + max);
        System.out.println("최저 " + min);

    }
}
