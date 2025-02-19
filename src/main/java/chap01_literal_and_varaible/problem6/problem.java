package chap01_literal_and_varaible.problem6;

public class problem {
    public static void main(String[] args) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        System.out.println("int의 최대값 : " + min);
        System.out.println("int의 최소값 : " + max);

        System.out.println("int의 최대값 + 1 : " + min + 1); // 오버플로우 발생
        System.out.println("int의 최소값 - 1 : " + (max - 1)); // 언더플로우 발생





    }
}
