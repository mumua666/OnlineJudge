import java.util.Scanner;

public class P064GPT4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine()); // 读取行数

        for (int i = 0; i < N; i++) {
            String input = scanner.nextLine();
            System.out.println(input); // 原样输出用户的对话

            String response = processInput(input);
            System.out.println("AI: " + response); // 输出AI的回答
        }
        scanner.close();
    }

    private static String processInput(String input) {
        // 步骤1: 消除多余的空格
        input = input.trim().replaceAll("\\s+", " "); // 压缩空格并去除首尾空格
        input = input.replaceAll(" +([.,?!;:])", "$1"); // 删除标点前的空格

        // 步骤2: 大写字母转小写，除了'I'
        input = input.replaceAll("\\bI\\b", "i"); // 先将单独的I变成小写的i以避免后续全部小写化
        input = input.toLowerCase(); // 转换为小写

        // 步骤3: 替换单词
        input = input.replaceAll("\\bcan you\\b", "I can");
        input = input.replaceAll("\\bcould you\\b", "I could");
        input = input.replaceAll("\\bi\\b", "you");
        input = input.replaceAll("\\bme\\b", "you");

        // 步骤4: 问号转惊叹号
        input = input.replaceAll("\\?", "!");

        // 处理完毕，返回结果
        return input;
    }
}
