package JAVA.chap03_method.problem10;

import java.util.Arrays;

public class Problem {
    public static void main(String[] args) {

        int[] arr = new int[10];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 45) + 1;
            for(int j = 0; j < i; j++){
                if(arr[i] == arr[j]) {
                    System.out.println("중복 감지: " + arr[i]);
                    i--;
                    break;
                }
            }
            System.out.println(Arrays.toString(arr));
        }

        for(int i = 0; i < arr.length; i++){

            for(int j = 0; j < i; j++){
                int temp = 0;
                if(arr[i] < arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println("생성한 로또 번호 :" + Arrays.toString(arr));
        }
    }
}