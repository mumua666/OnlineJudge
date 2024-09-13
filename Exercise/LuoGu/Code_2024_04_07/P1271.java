import java.util.Scanner;

// OOM
public class P1271 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] votes = new int[n];
        while (m-- > 0) {
            int voteIndex = sc.nextInt();
            votes[voteIndex - 1]++;
        }
        for (int i = 0; i < n; i++) {
            while (votes[i]-- > 0) {
                System.out.print((i + 1) + " ");
            }
        }
        System.out.println();
        sc.close();
    }
}