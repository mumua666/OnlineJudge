import java.util.Scanner;

public class Code2017_03_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int cur = 0, cnt = 0;
        for (int i = 0; i < n; i++) {
            cur += arr[i];
            if (cur >= k) {
                cnt++;
                cur = 0;
            }
        }
        if (cur > 0) {
            cnt++;
        }
        System.out.println(cnt);
        sc.close();
    }
}
