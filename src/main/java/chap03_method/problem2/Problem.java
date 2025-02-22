package chap03_method.problem2;

public class Problem {
    public static void main(String[] args) {
        System.out.println(sumtoN(5));

    }

    /**
     *
     sumtoN(5)는 5 + sumtoN(4)를 반환합니다.
     sumtoN(4)는 4 + sumtoN(3)를 반환합니다.
     sumtoN(3)는 3 + sumtoN(2)를 반환합니다.
     sumtoN(2)는 2 + sumtoN(1)를 반환합니다.
     sumtoN(1)는 1을 반환합니다.
     최종적으로 sumtoN(5)는 5 + 4 + 3 + 2 + 1 = 15를 반환하게 됩니다.

     */
    public static int sumtoN(int num) {

        if (num == 1) {
            System.out.println(1);
            System.out.println("end");
            return 1;
        } else {
            System.out.println(num);
            return num + sumtoN(num - 1);
        }
    }
}