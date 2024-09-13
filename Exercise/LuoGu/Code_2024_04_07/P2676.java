import java.util.Scanner;

public class P2676 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int height = sc.nextInt();
        int[] cows = new int[n];
        for (int i = 0; i < n; i++) {
            cows[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i; j >= 1 && cows[j - 1] < cows[j]; j--) {
                cows[j - 1] ^= cows[j];
                cows[j] ^= cows[j - 1];
                cows[j - 1] ^= cows[j];
            }
        }

        int cnt = 0, sumHeight = 0;
        for (int i = 0; i < n; i++) {
            sumHeight += cows[i];
            cnt++;
            if (sumHeight >= height) {
                break;
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}