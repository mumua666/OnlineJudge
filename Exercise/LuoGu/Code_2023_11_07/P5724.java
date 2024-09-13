import java.util.Scanner;

public class P5724 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int minNum = Integer.MAX_VALUE;
        int maxNum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            minNum = minNum < arr[i] ? minNum : arr[i];
            maxNum = maxNum > arr[i] ? maxNum : arr[i];
        }

        int maxDiff = maxNum - minNum;
        System.out.println(maxDiff);

        sc.close();
    }
}
