import java.util.Scanner;

public class E01 {
    public static boolean isLuck(int num) {
        int[] numStrSum = getNumStrSum(num);
        for (int i = 0; i < 4; i++) {
            if (num % numStrSum[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static int[] getNumStrSum(int num) {
        int[] radix = { 2, 8, 10, 16 };
        int[] numStrSum = new int[4];
        for (int i = 0; i < 4; i++) {
            String numStr = Integer.toString(num, radix[i]);
            int sum = 0;
            for (int j = 0; j < numStr.length(); j++) {
                sum += (numStr.charAt(j) - '0');
            }
            numStrSum[i] = sum;
        }
        return numStrSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 10;
        for (int i = 127;; i++) {
            if (isLuck(i)) {
                cnt++;
            }
            if (cnt == 2023) {
                System.out.println(i);
                break;
            }
        }
        sc.close();
    }
}