import java.util.Scanner;

public class Code2017_12_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        int gap, minGap = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            gap = arr[i] - arr[i - 1];
            gap = gap > 0 ? gap : -gap;
            minGap = minGap < gap ? minGap : gap;
        }
        System.out.println(minGap);
        sc.close();
    }
}
