import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class L2_1Pro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Map<Integer, HashSet<Integer>> numMap = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            int k = sc.nextInt();
            while (k-- > 0) {
                int num = sc.nextInt();
                if (numMap.containsKey(num)) {
                    numMap.get(num).add(i);
                    continue;
                }
                HashSet<Integer> set = new HashSet<>();
                set.add(i);
                numMap.put(num, set);
            }
        }
        int q = sc.nextInt();
        while (q-- > 0) {
            int one = sc.nextInt();
            int two = sc.nextInt();
            HashSet<Integer> set1 = numMap.get(one);
            HashSet<Integer> set2 = numMap.get(two);
            int allNum = set1.size() + set2.size();
            set1.addAll(set2);
            System.out.println(allNum - set1.size());
        }
        sc.close();
    }
}