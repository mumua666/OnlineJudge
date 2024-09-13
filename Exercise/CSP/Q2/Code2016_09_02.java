import java.util.Scanner;

public class Code2016_09_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ROW = 20, COL = 5;
        boolean[][] seats = new boolean[ROW][COL];
        int[] seatNum = new int[ROW];
        for (int i = 0; i < ROW; i++) {
            seatNum[i] = 5;
        }

        int n = sc.nextInt();
        int num;

        // 尝试分配连续座位
        for (int i = 0; i < n; i++) {
            num = sc.nextInt();
            boolean isArrange = false;
            for (int j = 0; j < ROW; j++) {
                if (seatNum[j] >= num) {
                    int size = num;
                    for (int k = 0; k < COL; k++) {
                        if (!seats[j][k]) {
                            isArrange = true;
                        }
                        if (isArrange && size > 0) {
                            seats[j][k] = true;
                            size--;
                            seatNum[j]--;
                            System.out.printf("%d ", j * 5 + k + 1);
                        }
                    }
                }
                if (isArrange) {
                    System.out.println();
                    break;
                }
            }

            // 当不能分配连续的座位时，从可分配的最小编号开始分配不连续的座位
            if (!isArrange) {
                int size = num;
                for (int j = 0; j < ROW; j++) {
                    if (seatNum[j] > 0 && size > 0) {
                        for (int k = 0; k < COL; k++) {
                            if (!seats[j][k] && size > 0) {
                                size--;
                                seats[j][k] = false;
                                seatNum[j]--;
                                System.out.printf("%d ", j * 5 + k + 1);
                            }
                        }
                    }
                    if (size == 0) {
                        System.out.println();
                        break;
                    }
                }
            }
        }

        sc.close();
    }
}
