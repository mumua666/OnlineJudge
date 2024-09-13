import java.util.Scanner;
import java.util.Stack;

public class Code2019_03_02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
            stack.push(str[i].charAt(0) - '0'); // 栈里存入第一个数
            for (int j = 1; j < 7; j++) {
                if (str[i].charAt(j) == '+') { // 遇到'+'号：将'+'号后面的数字存入栈
                    stack.push(str[i].charAt(++j) - '0');
                } else if (str[i].charAt(j) == '-') { // 遇到'-'号：将'-'号后面的数字变为负数后存入栈
                    int temp = -1 * (str[i].charAt(++j) - '0');
                    stack.push(temp);
                } else if (str[i].charAt(j) == 'x') { // 遇到'x'号：将栈顶元素弹出并和'x'号后面的数字相乘，将结果存入栈
                    int temp = stack.pop() * (str[i].charAt(++j) - '0');
                    stack.push(temp);
                } else if (str[i].charAt(j) == '/') { // 遇到'/'号：将栈顶元素弹出并和'x'号后面的数字相除，将结果存入栈
                    int temp = stack.pop() / (str[i].charAt(++j) - '0');
                    stack.push(temp);
                }
            }
            // 将栈中的所有元素相加
            int sum = 0;
            while (!stack.isEmpty()) {
                sum += stack.pop();
            }
            if (sum == 24) {
                str[i] = "Yes";
            } else {
                str[i] = "No";
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(str[i]);
        }

        sc.close();
    }
}