import java.util.Scanner;

public class Code2014_12_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int MAX_CNT = 10001;
        int[] arr = new int[MAX_CNT];
        int cur;

        for (int i = 0; i < n; i++) {
            cur = sc.nextInt();
            arr[cur]++;
            System.out.print(arr[cur] + " ");
        }
        System.out.println();

        sc.close();
    }
}
