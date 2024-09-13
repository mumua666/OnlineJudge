import java.util.Scanner;

public class L1_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        while (k-- > 0) {
            boolean isAllright = true;
            int cntZero = 0;
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                if (a == 0) {
                    cntZero++;
                    continue;
                }
                if (a != arr[i]) {
                    isAllright = false;
                }
            }
            if (isAllright && cntZero != n) {
                System.out.println("Da Jiang!!!");
            } else {
                System.out.println("Ai Ya");
            }
        }
        sc.close();
    }
}
