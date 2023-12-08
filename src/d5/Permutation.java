package d5;

public class Permutation {

    // 0 ~ n-1의 숫자로 만들 수 있는 숫자 나열 전부 출력하는 메서드
    public static void permSimple(int n) {
        int first;
        int second;
        int third;

        // 0에서 2사이의 숫자를 차례데로 골라본다.
        for (int i = 0; i < n; i++) {
            // 첫번째 숫자를 골랐음
            first = i;
            // 0에서 2사이의 숫자 중, 아직 고르지 않은 숫자를 골라본다.
            for (int j = 0; j < n; j++) {
                // 이미 고른 숫자라면 나머지는 실행하지 않는다.
                if (j == first) {
                    continue;
                }
                second = j;
                // 0에서 2사이의 숫자 중, 아직 고르지 않은 숫자를 골라본다.
                for (int k = 0; k < n; k++) {
                    if (k == first || k == second) {
                        continue;
                    }
                    third = k;
                    System.out.println(first + " " + second + " " + third);
                }
            }
        }
    }

    public static void main(String[] args) {
        permSimple(2);
    }
}