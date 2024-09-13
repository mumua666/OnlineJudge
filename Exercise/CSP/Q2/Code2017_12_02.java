import java.util.Scanner;
import java.util.LinkedList;

public class Code2017_12_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        LinkedList<Integer> circle = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            circle.add(i);
        }
        int count = 0;
        while (circle.size() > 1) {
            for (int i = 0; i < circle.size(); i++) {
                count++;
                if (count % k == 0 || count % 10 == k) {
                    circle.remove(i);
                    i--; // 删除一个结点时循环指针需要保持原位，不能向后移动
                    if (circle.size() == 1) { // 在循环途中结束游戏,不加这步90分
                        break;
                    }
                }
            }
        }
        System.out.println(circle.pop());

        sc.close();
    }
}