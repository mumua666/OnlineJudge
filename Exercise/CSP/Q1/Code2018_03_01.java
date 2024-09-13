import java.util.Scanner;

public class Code2018_03_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cur, pre = -1, mark = -1, total = 0;
        while ((cur = sc.nextInt()) != 0) {
            if (cur == 1) {
                mark = 1;
            } else if (cur == 2) {
                if (pre == 1 || pre == -1) {
                    mark = 2;
                } else {
                    mark += 2;
                }
            }
            total += mark;
            pre = cur;
        }
        System.out.println(total);
        sc.close();
    }
}
