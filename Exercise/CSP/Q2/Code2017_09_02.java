import java.util.Scanner;
import java.util.Arrays;

public class Code2017_09_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] key = new int[n];
        for (int i = 0; i < n; i++) {
            key[i] = i + 1;
        }
        int k = sc.nextInt();
        int[][] action = new int[k][4];
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < 3; j++) {
                action[i][j] = sc.nextInt();
            }
            action[i][3] = action[i][1] + action[i][2]; // 第四位存储上完课后的时间点
        }
        int minTime = 10001; // 起始时间
        int maxTime = 0; // 终止时间
        for (int i = 0; i < k; i++) {
            minTime = action[i][1] < minTime ? action[i][1] : minTime;
            maxTime = action[i][3] > maxTime ? action[i][3] : maxTime;
        }
        for (int time = minTime; time <= maxTime; time++) { // 以时间点为循环，每一个时间点判断一次是否有还钥匙和取钥匙
            // 还钥匙
            int many = 0; // 存储有几个人还钥匙
            for (int i = 0; i < k; i++) {
                if (action[i][3] == time) {
                    many++;
                }
            }
            if (many != 0) {
                int[] returnKeys = new int[many];
                for (int i = 0; i < k; i++) {
                    if (action[i][3] == time && many != 0) {
                        returnKeys[many - 1] = action[i][0];
                        many--;
                    }
                }
                Arrays.sort(returnKeys);
                for (int i = 0; i < returnKeys.length; i++) {
                    for (int j = 0; j < n; j++) {
                        if (key[j] == 0) {
                            key[j] = returnKeys[i];
                            break;
                        }
                    }
                }
            }
            // 取钥匙
            for (int i = 0; i < k; i++) {
                if (action[i][1] == time) {
                    for (int j = 0; j < n; j++) {
                        if (key[j] == action[i][0]) {
                            key[j] = 0;
                            break;
                        }
                    }
                }
            }
        }
        // 输出最终钥匙盒
        for (int i = 0; i < n; i++) {
            System.out.print(key[i] + " ");
        }

        sc.close();
    }
}