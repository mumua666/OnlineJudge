import java.util.Scanner;

public class Code2013_12_01 {

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // int[] arr = new int[n];

    // for (int i = 0; i < n; i++) {
    // arr[i] = sc.nextInt();
    // }

    // for (int i = 0; i < n; i++) {
    // for (int j = i + 1; j < n; j++) {
    // if (arr[i] > arr[j]) {
    // arr[i] ^= arr[j];
    // arr[j] ^= arr[i];
    // arr[i] ^= arr[j];
    // }
    // }
    // }

    // int cur = arr[0], curCnt = 1, maxCnt = 1, maxValue = arr[0];
    // for (int i = 1; i < n; i++) {
    // if (arr[i] == cur) {
    // curCnt++;
    // } else {
    // if (curCnt > maxCnt) {
    // maxValue = arr[i - 1];
    // maxCnt = curCnt;
    // }
    // cur = arr[i];
    // curCnt = 1;
    // }
    // }
    // System.out.println(maxValue);

    // sc.close();

    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cur, max = -1;
        int MAX_CNT = 10001;
        int[] arr = new int[MAX_CNT];
        for (int i = 0; i < n; i++) {
            cur = sc.nextInt();
            arr[cur]++;
            max = max > arr[cur] ? max : arr[cur];
        }
        for (int i = 0; i < MAX_CNT; i++) {
            if (arr[i] == max) {
                System.out.println(i);
                break;
            }
        }
        sc.close();
    }
}