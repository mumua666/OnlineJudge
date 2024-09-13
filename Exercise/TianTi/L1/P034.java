import java.util.Scanner;

public class P034 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] labelArr = new int[1001];
        while (t-- > 0) {
            int k = sc.nextInt();
            while (k-- > 0) {
                int label = sc.nextInt();
                labelArr[label]++;
            }
        }
        int maxLabel = -1, maxCnt = Integer.MIN_VALUE;
        for (int i = 1000; i >= 1; i--) {
            if (labelArr[i] > maxCnt) {
                maxCnt = labelArr[i];
                maxLabel = i;
            }
        }
        System.out.println(maxLabel + " " + maxCnt);
        sc.close();
    }
}