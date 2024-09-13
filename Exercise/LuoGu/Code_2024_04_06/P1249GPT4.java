import java.math.BigInteger;
import java.util.Scanner;

public class P1249GPT4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        maxProductSum(n);
        sc.close();
    }

    private static void maxProductSum(int n) {
        // 找到最大的k，使得1+2+...+k <= n
        int k = 2;
        while ((k * (k + 1)) / 2 - 1 <= n) {
            k++;
        }
        k--;

        // 计算剩余的n以及如何分配这个差值
        int remainder = n - (k * (k + 1)) / 2 + 1;

        // 输出结果
        StringBuilder sb = new StringBuilder();
        BigInteger res = BigInteger.ONE;
        for (int i = 2; i <= k; i++) {
            int addValue = i;
            if (i == k && remainder > 0) {
                addValue += remainder;
            }
            sb.append(addValue).append(" ");
            res = res.multiply(BigInteger.valueOf(addValue));
        }

        System.out.println(sb.toString().trim());
        System.out.println(res);
    }
}
