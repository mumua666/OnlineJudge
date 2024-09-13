import java.util.Scanner;

public class P039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String line = sc.nextLine();
        int col = line.length() / n;
        int diff = line.length() % n;
        if (diff != 0) {
            col++;
            while (diff-- > 0) {
                line += " ";
            }
        }
        char[][] chMap = new char[n][col];
        int index = 0;
        for (int j = col - 1; j >= 0; j--) {
            for (int i = 0; i < n; i++) {
                chMap[i][j] = line.charAt(index++);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(chMap[i][j]);
            }
            System.out.println();
        }
        sc.close();
    }
}