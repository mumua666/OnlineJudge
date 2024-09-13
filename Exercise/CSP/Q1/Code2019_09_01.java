import java.util.Scanner;

public class Code2019_09_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int max = 0, maxIndex = 1, sum = 0, cur;

        for (int i = 0; i < N; i++) {
            sum += sc.nextInt();
            cur = 0;
            for (int j = 0; j < M; j++) {
                cur += -sc.nextInt();
            }
            sum -= cur;
            if (max < cur) {
                max = cur;
                maxIndex = i + 1;
            }
        }
        System.out.printf("%d %d %d\n", sum, maxIndex, max);

        sc.close();
    }
}