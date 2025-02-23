package JAVA.chap05_Array.problem2TODO;

import java.util.Random;

public class Problem {
    public static void main(String[] args) {

        final int ROW_VALUE = 5;
        final int COL_VALUE = 6;
        int[][] array = new int[ROW_VALUE][COL_VALUE];
        int[] compared = new int[ROW_VALUE * COL_VALUE];
        int comparedIndex = 0;
        Random random = new Random();

        // 중복값 방지
        for (int i = 0; i < compared.length; i++) {
            compared[i] = random.nextInt(30);
            for (int j = 0; j < i; j++) {
                if(compared[i] == compared[j]) {
                    i--;
                    break;
                }
            }
        }

        // 1차원 배열 값을 2차원 배열 값에 대입함
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                array[i][j] = compared[comparedIndex++];
            }
            System.out.println();
        }

        printArray(array);
        averageArray(array);

        int[][] shallowCopiedTranposed = array;

        System.out.println("Shallow Copy");
        shallowCopiedTranposed[0][0] = 99;

        printArray(shallowCopiedTranposed);

        System.out.println("Changed Original Array"); // 참조 복사는 원본 배열도 같이 복사함 (얕은 복사) -> 단순 참조 전달용
        printArray(array);

        int[][] DeepCopiedTransposed = transposeArr(array);
        System.out.println("Deep Copy + Transposed");
        printArray(DeepCopiedTransposed);
        printArray(array); // 깊은 복사는 새로운 메모리 영역에 할당하여 독립적인 복사


        System.out.println("Bubble Sort After:");
        bubbleSortArr(array); // 행 정렬이라 전체 정렬은 아님
        printArray(array);


        System.out.println("Entire Bubble Sort After:");
        entireBubbleSortArr(array);
        printArray(array);

        System.out.println("Binary Search After");
        binarySearch(array, 16);
    }

    // 배열 출력
    public static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }

    // 배열 평균값 출력
    public static void averageArray(int[][] array) {

        System.out.println("Resources Check...");
        int rowIndex = 0;
        double average = 0;
        int total = 0;

        for (int[] row : array) {
            System.out.print("[" + (rowIndex + 1) + "st row] ");
            for(int value : row){
                total += value;
            }
            average = Math.round((double) total / array[0].length * 10) / 10.0;
            rowIndex++;
            System.out.println("[" + rowIndex + "st Sum] " + total);
            System.out.println("[Average: " + average + "]");
        }
        average = (double) total / array[0].length;
    }

    // 전치 배열 반환 (깊은 복사)
    public static int[][] transposeArr (int[][] array) {
        ///  5 6
        System.out.println("transPose Arr..");
        int row = array.length; //5
        int col = array[0].length; // 6
        int[][] transArr = new int[col][row]; // 5, 6

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                transArr[j][i] = array[i][j];
            }
        }
        return transArr;
    }

    // 이진 탐색 전 배열 정렬
    public static int[][] bubbleSortArr (int[][] array) {

        int row = array.length;
        int col = array[0].length;
        int temps = 0;
        boolean isSwapped = false;

        for(int i = 0; i < row; i++){
            isSwapped = false;
            for(int k = 0; k < col - 1; k++){
                for(int j = 0; j < col - k - 1; j++){
                    if(array[i][j] > array[i][j + 1]) {
                        temps = array[i][j];
                        array[i][j] = array[i][j + 1];
                        array[i][j + 1] = temps;
                        isSwapped = true;
                        }
                    }
                }
            if(!isSwapped){
                break;
            }
        }
        return array;
    }
    // TODO FUCK YOU
    public static int[][] entireBubbleSortArr(int[][] array) {
        int row = array.length;
        int col = array[0].length;
        int total = row * col;
        int temp;
        boolean isSwapped;

        for (int i = 0; i < total - 1; i++) {
            isSwapped = false;
            for (int j = 0; j < total - i - 1; j++) {
                int currentRow = j / col;
                int currentCol = j % col;
                int nextRow = (j + 1) / col;
                int nextCol = (j + 1) % col;

                if (array[currentRow][currentCol] > array[nextRow][nextCol]) {
                    temp = array[currentRow][currentCol];
                    array[currentRow][currentCol] = array[nextRow][nextCol];
                    array[nextRow][nextCol] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped) {
                break; // 더 이상 스왑이 없으면 정렬 완료
            }
        }
        return array;
    }

    public static void binarySearch (int[][] array, int target) {

        //  field reset
        int start = 0, end = array.length * array[0].length - 1;
        int mid;
        int row;
        int col;
        boolean isFind = false;

        while (start <= end) {
            mid = (start + end) / 2;
            row = mid / array[0].length;
            col = mid % array[0]. length;

            if (array[row][col] == target) {
                System.out.println("Find!!");
                isFind = true;
                break;
            } else if (array[row][col] < target) {
                start = mid + 1; // right search
            } else if (array[row][col] > target) {
                end = mid - 1;
            }
        }
        if (!isFind) {
            System.out.println("Cannot Find");
        }
    }
}
