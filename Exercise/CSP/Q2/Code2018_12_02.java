import java.util.Scanner;

public class Code2018_12_02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int y = sc.nextInt();
        int g = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        long time = 0; // n 最大取值 10^5, 红绿灯时间最大取值 10^6，所以最后结果最大可能取值 10^11，超出了 int 的范围，只能使用 long 才能满分，使用
                       // int 只能得60分。
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
            long second = 0;
            /*
             * 红绿灯会一直循环交替变换，所以将红绿灯用一个区间表示，判断每次遇到灯时是什么灯则只需要判断当前落在哪一个区间即可
             * 当时间太长时，红绿灯可能已经过了好几轮了，所以我们求走到红绿灯时候的状况要 %(r+g+y)
             */
            if (arr[i][0] == 0) { // 遇到路时直接加上该路段所花费时间
                time += arr[i][1];
                continue;
            } else if (arr[i][0] == 1) {
                second = (time + (r - arr[i][1])) % (r + g + y);
            } else if (arr[i][0] == 2) {
                second = (time + ((r + g + y) - arr[i][1])) % (r + g + y);
            } else if (arr[i][0] == 3) {
                second = (time + ((r + g) - arr[i][1])) % (r + g + y);
            }
            if (second < r) { // 遇到红灯时停，需加上还剩多少秒红灯
                time += r - second;
            } else if (second > (r + g)) { // 遇到黄灯时需加上还剩多少秒黄灯并且加上一段完整的红灯时间。
                time += (r + g + y) - second + r;
            }
        }
        System.out.println(time);

        sc.close();
    }
}