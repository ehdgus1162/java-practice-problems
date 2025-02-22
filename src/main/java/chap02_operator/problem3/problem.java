package chap02_operator.problem3;

public class problem {
    public static void main(String[] args) {

        int num = 7;

        ++num;
        System.out.println(num);

        System.out.println(num);
        num--;

        --num;
        System.out.println(num);

        boolean isNum = (num < 5)? true : false;
        System.out.println(isNum);

    }
}
