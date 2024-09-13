import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class E07 {

    static class Stone {
        int num;
        int color;

        public Stone(int num, int color) {
            this.num = num;
            this.color = color;
        }

        public Stone merge(Stone stone) {
            return new Stone(num + stone.num, (color + 1) % 3);
        }
    }

    static class MyComp implements Comparator<Stone> {

        @Override
        public int compare(E07.Stone o1, E07.Stone o2) {
            return o1.num - o2.num;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        int[] colors = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            colors[i] = sc.nextInt();
        }
        List<Stone> stones = new ArrayList<>();
        PriorityQueue<Stone> pq = new PriorityQueue<>(new MyComp());
        for (int i = 0; i < n; i++) {
            Stone stone = new Stone(nums[i], colors[i]);
            stones.add(stone);
            pq.add(stone);
        }

        int cost = 0;
        while (!pq.isEmpty()) {
            Stone top1 = pq.poll();
            int index = stones.indexOf(top1);
            if (index == -1) {
                continue;
            }
            if (index == 0) {
                Stone top2 = stones.get(index + 1);
                if (top2.color == top1.color) {
                    Stone newStone = top1.merge(top2);
                    cost += newStone.num;
                    stones.remove(index + 1);
                    stones.remove(index);
                    stones.add(index, newStone);
                    pq.add(newStone);
                }
            } else if (index == stones.size() - 1) {
                Stone top2 = stones.get(index - 1);
                if (top2.color == top1.color) {
                    Stone newStone = top1.merge(top2);
                    cost += newStone.num;
                    stones.remove(index);
                    stones.add(index, newStone);
                    stones.remove(index - 1);
                    pq.add(newStone);
                }
            } else {
                Stone top2 = stones.get(index - 1);
                Stone top3 = stones.get(index + 1);
                if (top1.color == top2.color && top1.color == top2.color) {
                    Stone minTop = top2.num < top3.num ? top2 : top3;
                    Stone newStone = top1.merge(minTop);
                    cost += newStone.num;
                    int minIndex = stones.indexOf(minTop);
                    if (minIndex < index) {
                        stones.remove(index);
                        stones.add(newStone);
                        stones.remove(minIndex);
                    } else {
                        stones.remove(minIndex);
                        stones.remove(index);
                        stones.add(newStone);
                    }
                    pq.add(newStone);
                } else if (top1.color == top2.color) {
                    Stone newStone = top1.merge(top2);
                    cost += newStone.num;
                    stones.remove(index);
                    stones.add(index, newStone);
                    stones.remove(index - 1);
                    pq.add(newStone);
                } else if (top1.color == top3.color) {
                    Stone newStone = top1.merge(top3);
                    cost += newStone.num;
                    stones.remove(index + 1);
                    stones.remove(index);
                    stones.add(index, newStone);
                    pq.add(newStone);
                }
            }
        }
        System.out.printf("%d %d\n", stones.size(), cost);
        sc.close();
    }
}