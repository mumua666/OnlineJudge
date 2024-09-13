import java.util.Scanner;

public class P1125 {

    public static boolean isPrime(int num) {
        if (num == 1 || num == 0) {
            return false;
        }
        for (int i = 2; i <= (int) Math.sqrt(num); i++) {
            if (num / i * i == num) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int[] cnt = new int[26];
        int maxCnt = Integer.MIN_VALUE;
        int minCnt = Integer.MAX_VALUE;

        for (int i = 0; i < str.length(); i++) {
            int index = str.charAt(i) - 'a';
            cnt[index]++;
        }

        for (int i = 0; i < cnt.length; i++) {
            int value = cnt[i];
            if (value != 0) {
                maxCnt = Math.max(maxCnt, value);
                minCnt = Math.min(minCnt, value);
            }
        }

        int diff = maxCnt - minCnt;
        if (isPrime(diff)) {
            System.out.println("Lucky Word");
            System.out.println(diff);
        } else {
            System.out.println("No Answer");
            System.out.println(0);
        }

        sc.close();
    }
}