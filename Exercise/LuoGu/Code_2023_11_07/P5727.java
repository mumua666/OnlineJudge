import java.util.Scanner;

public class P5727 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[200];
        int index = 0;
        while (n != 1) {
            arr[index++] = n;
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = n * 3 + 1;
            }
        }
        arr[index] = 1;

        while (index >= 0) {
            System.out.printf("%d ", arr[index]);
            index--;
        }

        sc.close();
    }
}
