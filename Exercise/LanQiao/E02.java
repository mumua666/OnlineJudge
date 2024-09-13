import java.util.Scanner;

public class E02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            min = min < arr[i] ? min : arr[i];
        }
        int num = 0;
        int sum = min;
        while (true) {
            num /= sum;
            for (int i = 0; i < n; i++) {
                if (arr[i] == sum) {
                    num++;
                }
            }
            if (num % (sum + 1) == 0 && num != 0) {
                sum++;
            } else {
                break;
            }
        }
        System.out.println(sum);

        sc.close();
    }

}