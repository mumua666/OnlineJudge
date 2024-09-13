import java.util.Scanner;

public class Code2018_09_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[1000001];
        for (int i = 0; i < 2 * n; i++) {
            int left = sc.nextInt();
            int right = sc.nextInt();
            for (int j = left; j < right; j++) {
                arr[j]++;
            }
        }
        int sum = 0;
        for (int i = 0; i < 1000001; i++) {
            if (arr[i] == 2) {
                sum++;
            }
        }
        System.out.println(sum);

        sc.close();
    }
}