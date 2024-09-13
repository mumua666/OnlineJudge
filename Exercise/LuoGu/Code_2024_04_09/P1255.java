import java.util.Scanner;

public class P1255 {

    /**
     * recursive
     * TLE
     * 
     */

    public static long getStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return getStairs(n - 2) + getStairs(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(getStairs(n));
        sc.close();
    }
}