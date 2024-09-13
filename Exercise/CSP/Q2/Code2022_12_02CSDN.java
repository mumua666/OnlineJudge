import java.util.Scanner;

public class Code2022_12_02CSDN {
    public static void main(String[] args) {
        int n, m;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        int[] d = new int[m + 1];// 依赖数组
        int[] t = new int[m + 1];// 执行时间数组
        int[] earlyest = new int[m + 1];// 最早开始时间
        int[] latest = new int[m + 1];// 最晚开始时间
        int min_latest;
        for (int i = 1; i <= m; i++) {
            d[i] = scanner.nextInt();
        }
        for (int i = 1; i <= m; i++) {
            t[i] = scanner.nextInt();
        }
        boolean flag = true;// 是否能全部完成

        /*
         * 由于题目条件为： 1、只能有后依赖于前
         * 2、仅能依赖一个
         * 3、同一时间可以同时开始多个任务 无上限
         * 4、当考虑最早开始时间时，不考虑最终是否能完成，
         * 5、考虑最晚开始时间时，需要考虑是否能完成
         */
        /*
         * 计算最早开始时间：
         * 1、可直接从前向后进行计算（题目条件）
         * 2、当某项无依赖，则最早为第一天
         * 3、有依赖，最早取决于依赖任务（最早开始时间+依赖任务执行时间）
         */
        for (int i = 1; i <= m; i++) {
            if (d[i] == 0) {
                earlyest[i] = 1;// 无依赖
            } else {
                earlyest[i] = earlyest[d[i]] + t[d[i]];// 有依赖
            }
            if (earlyest[i] + t[i] - 1 > n) {// 最后一天 是否超过第n天（当天也算第一天 故需-1）
                flag = false;// 最终会超时
            }
            if (i == m) {
                System.out.print(earlyest[i]);
            } else {
                System.out.print(earlyest[i] + " ");
            }
        }
        /*
         * 计算最晚开始时间
         * 1、针对某个任务：如果无依赖 a 则最晚开始可为 （n-该任务执行时间）
         * 如果有依赖 b<-a 则最晚不会被影响
         * 如果有被依赖（可能为多个） a<-b 则由于需要总时间内完成
         * 则取决于 最早的（所有被依赖任务最晚开始时间-该任务执行时间）
         * 2、综上 可从后向前进行遍历计算
         * 3、对每个：遍历后续中依赖为当前任务的任务 计算最晚时间的最小值
         */
        if (flag) {
            for (int i = m; i >= 1; i--) {
                min_latest = n - t[i] + 1;// 题意 需+1 当天也算|或者可以直接求被依赖的最晚开始时间的最早值
                for (int j = m; j > i; j--) {
                    if (d[j] == i) {
                        min_latest = Math.min(min_latest, latest[j] - t[i]);// 无需+1 当天不算
                    }
                }
                latest[i] = min_latest;
            }
            System.out.print("\n");
            for (int i = 1; i <= m; i++) {
                if (i == m) {
                    System.out.print(latest[i]);
                } else {
                    System.out.print(latest[i] + " ");
                }
            }
        }
        scanner.close();
    }
}
