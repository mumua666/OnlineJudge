import java.util.Scanner;

public class Code2019_09_02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        boolean[] isDrop = new boolean[n];
        int total = 0, dropNum = 0, dropGroupNum = 0;
        int m, cur, opNum;

        for (int i = 0; i < n; i++) {
            m = sc.nextInt();
            cur = sc.nextInt();
            for (int j = 0; j < m - 1; j++) {
                opNum = sc.nextInt();
                if (opNum <= 0) {
                    cur += opNum;
                } else if (opNum > 0) {
                    if (cur != opNum && !isDrop[i]) {
                        isDrop[i] = true;
                        dropNum++;
                    }
                    cur = opNum;
                }
            }
            total += cur;

        }

        /**
         * 应在所有苹果树都统计完是否会落果后再计算连续三颗树都落果的组数
         */

        for (int i = 0; i < n; i++) {
            if (i > 0 && i < n - 1) {
                if (isDrop[i - 1] && isDrop[i] && isDrop[i + 1]) {
                    dropGroupNum++;
                }
            } else if (i == n - 1) {
                /**
                 * n ==3 时 1 2 3 和 3 1 2 组合视为两组不一样的组合
                 */
                if (isDrop[i - 1] && isDrop[i] && isDrop[0]) {
                    dropGroupNum++;
                }
                if (isDrop[i] && isDrop[0] && isDrop[1]) {
                    dropGroupNum++;
                }
            }
        }

        System.out.printf("%d %d %d\n", total, dropNum, dropGroupNum);

        sc.close();
    }
}