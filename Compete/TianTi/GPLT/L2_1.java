import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class L2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<HashSet<Integer>> numList = new ArrayList<>();
        while (n-- > 0) {
            int k = sc.nextInt();
            HashSet<Integer> set = new HashSet<>();
            while (k-- > 0) {
                set.add(sc.nextInt());
            }
            numList.add(set);
        }
        int q = sc.nextInt();
        while (q-- > 0) {
            int one = sc.nextInt();
            int two = sc.nextInt();
            int cnt = 0;
            for (HashSet<Integer> set : numList) {
                if (set.contains(one) && set.contains(two)) {
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
        sc.close();
    }
}