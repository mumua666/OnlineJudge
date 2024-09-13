import java.util.Scanner;

public class Code2021_12_02Pro {

    /**
     * 计算[left,right)范围内 f(x) 与 g(x) 的差距和
     */
    public static long get_diff(int left, int right, int r, int index) {
        int start = left > (left / r) * r ? left : (left / r) * r;
        int end = right < (start / r) * r + r ? right : (start / r) * r + r;
        long sum = 0;
        int diff;
        while (start < end) {
            diff = start / r - index;
            diff = diff > 0 ? diff : -diff;
            sum += (end - start) * diff;
            start = end;
            end = right < (start / r) * r + r ? right : (start / r) * r + r;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int N = sc.nextInt();
        int[] arr = new int[n + 2];

        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        arr[n + 1] = N;

        int r = N / (n + 1);
        long error = 0;

        for (int i = 1; i < n + 2; i++) {
            error += get_diff(arr[i - 1], arr[i], r, i - 1);
        }

        System.out.println(error);

        sc.close();
    }
}