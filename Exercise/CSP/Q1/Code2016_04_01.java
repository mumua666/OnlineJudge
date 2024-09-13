import java.util.Scanner;

public class Code2016_04_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int cnt = 0;
        for (int i = 1; i < n - 1; i++) {
            boolean isUp = arr[i] > arr[i - 1] && arr[i] > arr[i + 1];
            boolean isDown = arr[i] < arr[i - 1] && arr[i] < arr[i + 1];
            if (isUp || isDown) {
                cnt++;
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}
