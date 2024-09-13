import java.util.Scanner;

public class P009 {

    static class Fenshu {
        long fenmu;
        long fenzi;

        public Fenshu(int fenzi, int fenmu) {
            this.fenzi = fenzi;
            this.fenmu = fenmu;
        }

        public void add(Fenshu fenshu) {
            fenzi = fenzi * fenshu.fenmu + fenmu * fenshu.fenzi;
            fenmu = fenmu * fenshu.fenmu;
            long mod = gcd(fenzi, fenmu);
            fenzi /= mod;
            fenmu /= mod;
        }

        @Override
        public String toString() {
            int zhengshu = (int) (fenzi / fenmu);
            fenzi %= fenmu;
            if (fenzi == 0) {
                return String.valueOf(zhengshu);
            } else if (zhengshu == 0) {
                return fenzi + "/" + fenmu;
            } else {
                return zhengshu + " " + fenzi + "/" + fenmu;
            }
        }
    }

    public static long gcd(long n, long m) {
        long max = Math.max(n, m);
        long min = Math.min(n, m);

        while (min != 0) {
            long temp = max % min;
            max = min;
            min = temp;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Fenshu fenshu = new Fenshu(0, 1);
        int fenzi, fenmu;
        for (int i = 0; i < n; i++) {
            String[] strs = sc.next().split("/");
            fenzi = Integer.parseInt(strs[0]);
            fenmu = Integer.parseInt(strs[1]);
            fenshu.add(new Fenshu(fenzi, fenmu));
        }
        System.out.println(fenshu);
        sc.close();
    }
}