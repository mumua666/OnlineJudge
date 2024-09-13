import java.util.Scanner;

public class Code2022_12_02 {
    static int n, m;
    static int[] dependent;
    static int[] during;
    static int[] start;
    static int[] end;
    static boolean canDO;

    static void reanData() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        dependent = new int[m];
        during = new int[m];
        start = new int[m];
        end = new int[m];

        for (int i = 0; i < m; i++) {
            dependent[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            during[i] = sc.nextInt();
        }

        sc.close();
    }

    static boolean isFinished() {
        for (int i = 0; i < m; i++) {
            if (start[i] == 0) {
                return false;
            }
        }
        return true;
    }

    static void updateStart() {
        for (int i = 0; i < m; i++) {
            if (start[i] == 0) {
                int index = dependent[i];
                if (index == 0) {
                    start[i] = 1;
                    end[i] = start[i] + during[i];
                } else if (index > 0 && end[index - 1] != 0) {
                    start[i] = end[index - 1];
                    end[i] = start[i] + during[i];
                }
            }
        }
    }

    static void setEndDay() {
        for (int i = m - 1; i >= 0; i--) {
            end[i] = n - during[i] + 1;
            for (int j = m - 1; j > i; j--) {
                if (dependent[j] - 1 == i) {
                    end[i] = Math.min(end[i], end[j] - during[i]);
                }
            }
        }
    }

    static void checkCanDo() {
        canDO = true;
        for (int i = 0; i < m; i++) {
            if (end[i] < start[i]) {
                canDO = false;
            }
        }
    }

    static void print() {
        for (int i = 0; i < m; i++) {
            System.out.print(start[i] + " ");
        }
        System.out.println();
        if (canDO) {
            for (int i = 0; i < m; i++) {
                System.out.print(end[i] + " ");
            }
            System.out.println();
        }
        // for (int i = 0; i < m; i++) {
        // System.out.print(end[i] + " ");
        // }
        // System.out.println();
    }

    static void solve() {
        reanData();
        while (!isFinished()) {
            updateStart();
        }
        setEndDay();
        checkCanDo();
        print();
    }

    public static void main(String[] args) {
        solve();
    }
}