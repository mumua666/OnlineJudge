import java.util.Scanner;

public class Code2014_09_01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] arrMax = new int[n];
        int[] arrMin = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            arrMax[i] = arr[i] + 1;
            arrMin[i] = arr[i] - 1;
        }
        int pair = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (arr[i] - arr[j] == 1 || arr[i] - arr[j] == -1) {
                    pair++;
                }
            }
        }
        System.out.println(pair);
        sc.close();
    }
}
