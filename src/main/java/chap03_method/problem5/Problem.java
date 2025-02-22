package chap03_method.problem5;

public class Problem {
    public static void main(String[] args) {

        int[] arr = {5, 12, 3, 9, 20};
        int[] result = findMaxMin(arr);


            System.out.println("최솟값: " + result[0]);
            System.out.println("최댓값: " + result[1]);
            System.out.println("차이: " + result[2]);

    }
    static int[] findMaxMin(int[] num) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < num.length; i++){
            if (max < num[i]) {
                max = num[i];
            }
            if (min > num[i]) {
                min = num[i];
            }
        }
        int value = max - min;
        return new int[] {max, min, value};
    }
}