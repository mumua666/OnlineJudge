import java.util.Scanner;

public class Code2016_09_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        arr[0] = sc.nextInt();
        int maxGap = 0, gap;
        for (int i = 1; i < n; i++) {
            arr[i] = sc.nextInt();
            gap = arr[i] - arr[i - 1];
            gap = gap > 0 ? gap : -gap;
            maxGap = maxGap > gap ? maxGap : gap;
        }
        System.out.println(maxGap);
        sc.close();
    }
}
