import java.util.PriorityQueue;
import java.util.Scanner;

// TLE
public class P1923 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        while (n-- > 0) {
            pq.add(sc.nextInt());
        }
        while (k-- > 0) {
            pq.poll();
        }
        System.out.println(pq.peek());

        sc.close();
    }
}