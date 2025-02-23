package JAVA.chap03_method.problem1;

public class Problem {
    public static void main(String[] args) {
        System.out.println(add(5,7));
        System.out.println(add(5.5,7.5));
        System.out.println(add(5,7, 4));


    }
    public static int add (int a, int b) {
        return a + b;
    }
    public static double add (double a, double b) {
        return a + b;
    }
    public static int add(int a, int b, int c) {
        return a + b + c;
    }
}