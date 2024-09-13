import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class P2415 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> numSet = new HashSet<>();
        while (sc.hasNextInt()) {
            int num = sc.nextInt();
            if (!numSet.contains(num)) {
                numSet.add(num);
            }
        }
        long sum = 0;
        int cnt = numSet.size();
        for (Integer num : numSet) {
            sum += num;
        }
        int times = (int) Math.pow(2, cnt - 1);
        long totalSum = sum * times;
        System.out.println(totalSum);
        sc.close();
    }
}
