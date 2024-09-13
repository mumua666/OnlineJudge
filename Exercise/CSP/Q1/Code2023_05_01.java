import java.util.Scanner;

public class Code2023_05_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();// read an empty line
        final int LINE = 8;
        String[][] boards = new String[n][LINE];
        int[] strHashCode = new int[n];

        // 读取每个棋盘局面
        for (int i = 0; i < n; i++) {
            StringBuilder combinedStr = new StringBuilder();
            for (int j = 0; j < LINE; j++) {
                boards[i][j] = sc.nextLine();
                combinedStr.append(boards[i][j]);
            }
            strHashCode[i] = combinedStr.toString().hashCode();
        }

        // 检查每个局面是否在前面出现过
        for (int i = 0; i < n; i++) {
            int cnt = 1;
            for (int j = 0; j < i; j++) {
                if (strHashCode[j] == strHashCode[i] && isSameBoard(boards[j], boards[i])) {
                    cnt++;
                }
            }
            System.out.println(cnt);
        }

        sc.close();
    }

    // 比较两个棋盘局面是否相同
    public static boolean isSameBoard(String[] board1, String[] board2) {
        for (int i = 0; i < board1.length; i++) {
            if (!board1[i].equals(board2[i])) {
                return false;
            }
        }
        return true;
    }
}
