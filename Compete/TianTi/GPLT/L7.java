import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class L7 {

    static class MyComp implements Comparator<Integer> {

        @Override
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }

    }

    public static int getNums(int num) {
        int res = 1;
        while (num > 0) {
            res *= num % 10;
            num /= 10;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Map<Integer, List<Integer>> cntMap = new HashMap<>();
        int max = Integer.MIN_VALUE;
        for (int i = a; i <= b; i++) {
            int num = i;
            int cnt = 0;
            while (num >= 10) {
                cnt++;
                num = getNums(num);
            }
            max = Math.max(max, cnt);
            if (cntMap.containsKey(cnt)) {
                cntMap.get(cnt).add(i);
            } else {
                cntMap.put(cnt, new ArrayList<>());
                cntMap.get(cnt).add(i);
            }
        }
        System.out.println(max);
        List<Integer> resList = cntMap.get(max);
        for (int i = 0; i < resList.size(); i++) {
            System.out.print(resList.get(i));
            if (i != resList.size() - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
        sc.close();
    }
}