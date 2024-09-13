import java.util.Scanner;

public class Code2015_09_01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cur = sc.nextInt();
        int sameSequence = cur;
        int max = 1;
        while (n-- > 1) {
            cur = sc.nextInt();
            if (cur != sameSequence) {
                max++;
                sameSequence = cur;
            }
        }
        System.out.println(max);
        sc.close();
    }
}