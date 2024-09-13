import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Code2023_12_02 {

    static class FactorCnt {
        public int factor;
        public int cnt;
        public int multiply;

        public FactorCnt(int factor, int cnt) {
            this.factor = factor;
            this.cnt = cnt;
        }
    }

    public static FactorCnt getFactorCnt(long num, int factor) {
        int cnt = 0;
        int multiply = 1;
        while (num / factor * factor == num) {
            num /= factor;
            multiply *= factor;
            cnt++;
        }
        FactorCnt factorCnt = new FactorCnt(factor, cnt);
        factorCnt.multiply = multiply;
        return factorCnt;
    }

    public static boolean isPrime(int num) {

        if (num == 2) {
            return true;
        }
        for (int i = 2; i <= (int) Math.sqrt(num) + 1; i++) {
            if (num / i * i == num) {
                return false;
            }
        }

        return true;
    }

    public static long calcNum(long n, int k, List<FactorCnt> factorCntList) {
        for (FactorCnt factorCnt : factorCntList) {
            if (factorCnt.cnt < k) {
                n /= factorCnt.multiply;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();

        long n;
        int k;
        List<FactorCnt> factorCntList = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            n = sc.nextLong();
            k = sc.nextInt();
            long num = n;
            for (int j = 2; num != 1; j++) {
                boolean canCalc = num / j * j == num && isPrime(j);
                if (canCalc) {
                    FactorCnt factorCnt = getFactorCnt(num, j);
                    factorCntList.add(factorCnt);
                    num /= factorCnt.multiply;
                }
            }
            System.out.println(calcNum(n, k, factorCntList));
            factorCntList.clear();
        }
        sc.close();
    }
}
