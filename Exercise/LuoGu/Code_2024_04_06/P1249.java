import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;

public class P1249 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 3) {
            System.out.println(1 + " " + 2);
            System.out.println(2);
        } else {
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            Set<Integer> numSet = new HashSet<>();
            while (n > 4) {
                n -= 3;
                pq.add(3);
            }
            while (n > 3) {
                n -= 2;
                pq.add(2);
            }
            pq.add(n);
            while (!pq.isEmpty()) {
                if (!numSet.contains(pq.peek())) {
                    numSet.add(pq.poll());
                } else {
                    int top1 = pq.poll();
                    while (numSet.contains(pq.peek())) {
                        int top2 = pq.poll();
                        pq.add(top1 + top2);
                    }
                }
            }
            List<Integer> numList = new ArrayList<>(numSet);
            Collections.sort(numList);
            long sum = 1;
            for (Integer num : numList) {
                sum *= num;
                System.out.print(num + " ");
            }
            System.out.println();
            System.out.println(sum);

        }
        sc.close();
    }
}