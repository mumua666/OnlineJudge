import java.util.Scanner;

public class Code2023_12_01 {

    public static void main(String[] args) {

        // 读数
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int nums[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                nums[i][j] = sc.nextInt();
            }
        }

        // 循环判断是否找到上级仓库
        for (int i = 0; i < n; i++) {
            boolean isFindAll = false;
            for (int j = 0; j < n; j++) {
                boolean isFindSingle = true;
                for (int k = 0; k < m; k++) {
                    if (nums[j][k] <= nums[i][k]) {
                        isFindSingle = false;
                        break;
                    }
                }
                if (isFindSingle) {
                    isFindAll = true;
                    System.out.println(j + 1);
                    break;
                }
            }
            if (!isFindAll) {
                System.out.println(0);
            }
        }

        sc.close();
    }
}