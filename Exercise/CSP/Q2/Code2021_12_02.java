import java.util.Scanner;

public class Code2021_12_02 {

    public static int getIndex(int[] arr, int value) {
        int left = 0, right = arr.length - 1;
        int mid = left + (right - left >> 1);
        while (left < right) {
            if (arr[mid] < value) {
                left = mid;
            } else if (arr[mid] > value) {
                right = mid - 1;
            } else {
                right = mid;
            }
            mid = left + (right - left >> 1);
            if (left == mid) {
                if (arr[right] <= value) {
                    left = right;
                }
                break;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int N = sc.nextInt();
        int[] arr = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        int f, g, diff, r = N / (n + 1);
        long error = 0;
        for (int i = 0; i < N; i++) {
            f = getIndex(arr, i);
            // System.out.printf("%d ", f);
            g = i / r;
            // System.out.printf("%d ", g);
            diff = f - g;
            diff = diff > 0 ? diff : -diff;
            error += diff;
        }
        // System.out.println();
        System.out.println(error);

        sc.close();
    }
}