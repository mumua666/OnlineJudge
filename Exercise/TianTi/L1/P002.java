import java.util.Scanner;
import java.util.Stack;

public class P002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ch = sc.next();
        int step = (int) Math.sqrt((n + 1) / 2.0);

        Stack<String> stack = new Stack<>();
        for (int i = 2 * step - 1, j = 0; j < step && i >= 3; i -= 2, j++) {
            String line = "";
            int spaceNum = j;
            int charNum = i;
            while (spaceNum-- > 0) {
                line += " ";
            }
            while (charNum-- > 0) {
                line += ch;
            }
            System.out.println(line);
            stack.add(line);
        }
        String line = "";
        int cnt = step;
        while (--cnt > 0) {
            line += " ";
        }
        line += ch;
        System.out.println(line);
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        int cost = 2 * step * step - 1;
        System.out.println(n - cost);
        sc.close();
    }
}