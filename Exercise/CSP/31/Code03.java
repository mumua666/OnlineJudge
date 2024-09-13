import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Code03 {

    static class Var {
        int link, top;

        public Var() {
            this.link = 1;
            this.top = 1;
        }

    }

    public static int cal(int num1, int num2, String op) {
        switch (op) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                return num1 / num2;
            default:
                return 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();

        String func = sc.nextLine();
        Map<String, Var> varMap = new HashMap<>();
        Stack<String> varStack = new Stack<>();

        for (String str : func.split(" ")) {
            if (str.contains("x") && !varMap.keySet().contains(str)) {
                varMap.put(str, new Var());
            }

            boolean isOp = str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/");
            if (isOp) {
                String op1 = varStack.pop();
                String op2 = varStack.pop();
                int num1 = -Integer.MAX_VALUE, num2 = Integer.MAX_VALUE;
                if (op1.contains("x") && op2.contains("x")) {
                    if (op1.equals(op2)) {
                        if (str.equals("*"))
                            varMap.get(op1).top++;
                        else
                            varMap.get(op1).top--;
                        varStack.push(op1);
                    } else {
                        // TODO
                    }
                } else {
                    try {
                        if (!op1.contains("x") && !op2.contains("x")) {
                            num1 = Integer.valueOf(op1);
                            num2 = Integer.valueOf(op2);
                            int result = cal(num1, num2, str);
                            varStack.push(Integer.valueOf(result).toString());
                        } else {
                            if (!op1.contains("x")) {
                                num1 = Integer.valueOf(op1);
                                num2 = varMap.get(op2).link;
                                if (str.equals("*") || str.equals("/")) {
                                    int result = cal(num1, num2, str);
                                    varMap.get(op2).link = result;
                                } else
                                    varStack.push(str);
                            } else {
                                num1 = Integer.valueOf(op2);
                                num2 = varMap.get(op2).link;
                                if (str.equals("*") || str.equals("/")) {
                                    int result = cal(num1, num2, str);
                                    varMap.get(op1).link = result;
                                } else
                                    varStack.push(str);
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            } else {
                varStack.push(str);
            }
        }

        int[] links = new int[n + 1];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <= n; j++) {
                links[j] = sc.nextInt();
            }
            String key = "x" + links[0];
            Var var = varMap.get(key);
            int link = var.link * var.top;
            int top = var.top - 1;
            System.out.println((int) (link * Math.pow(links[1], top)));
        }

        sc.close();
    }
}
