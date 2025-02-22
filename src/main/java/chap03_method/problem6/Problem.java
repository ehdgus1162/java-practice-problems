package chap03_method.problem6;

public class Problem {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println("배열의 곱: " + sum(numbers, 0));
    }

    /**
     multiplyElements(arr, 0)
     │
     ├─ arr[0] = 2 * multiplyElements(arr, 1)
     │    ├─ arr[1] = 3 * multiplyElements(arr, 2)
     │    │    ├─ arr[2] = 4 * multiplyElements(arr, 3)
     │    │    │    └─ Base Case → 1 반환
     │    │    └─ 반환: 4
     │    └─ 반환: 12
     └─ 반환: 24

     유적 설명:
     마치 여러 사람이 줄을 서서 문제를 해결하는 것과 같습니다.

     각 사람은 "내가 계산할 숫자"를 알고 있지만, 내 뒤에 있는 사람의 답을 받아야 최종 답을 계산할 수 있습니다.
     **마지막 사람(Base Case)**이 자신의 값을 반환하면, 이전 사람들이 순차적으로 자신의 계산을 진행하여 최종 결과를 얻게 됩니다.
     *
     * 이유?
     * 스택 구조
     * 재귀 함수 호출은 함수 호출 스택에 저장된다.
     * 마지막에 호출된 함수가 먼저 실행을 마쳐야 이전 함수가 실행을 마칠 수 있다. (LIFO 구조)로 동작한다
     * 1을 리턴해주는 이유는 곱셈의 항등원 때문인데 곱해도 결과가 달라지지 않는다.
     */

    static int sum (int[] arr, int index){

        if(index == arr.length) {
            return 1;
        } else {
            return arr[index] * sum(arr, index + 1);
        }
    }
}