import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;

public class E06 {

    static class MyComp implements Comparator<Integer> {

        @Override
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }

    }

    public static int getMaxMeet(PriorityQueue<Integer> pq, int m) {
        Stack<Integer> stack = new Stack<>();
        int money = 0;
        while (!pq.isEmpty()) {
            if (pq.peek() <= m) {
                money = pq.poll();
                break;
            } else {
                stack.push(pq.poll());
            }
        }
        while (!stack.isEmpty()) {
            pq.add(stack.pop());
        }
        return money;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>(new MyComp());
        for (int i = 0; i < n; i++) {
            pq.add(sc.nextInt());
        }

        int money = 0;
        while (!pq.isEmpty()) {
            int top1 = pq.poll();
            if (pq.isEmpty()) {
                money += top1;
                break;
            }
            int top2 = pq.poll();
            int minMoney = Math.min(top1, top2);
            getMaxMeet(pq, minMoney / 2);
            money += top1 + top2;
        }
        System.out.println(money);
        sc.close();
    }
}