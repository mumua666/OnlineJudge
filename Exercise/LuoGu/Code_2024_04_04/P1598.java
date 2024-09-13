import java.util.Scanner;

public class P1598 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] cntStar = new int[26];
        int times = 4;
        int maxStar = Integer.MIN_VALUE;
        while (times-- > 0) {
            String line = sc.nextLine();
            for (int i = 0; i < line.length(); i++) {
                char ch = line.charAt(i);
                if (ch >= 'A' && ch <= 'Z') {
                    int index = line.charAt(i) - 'A';
                    cntStar[index]++;
                    maxStar = Math.max(maxStar, cntStar[index]);
                }
            }
        }

        for (int i = maxStar; i >= 1; i--) {
            for (int j = 0; j < 26; j++) {
                char ch = cntStar[j] >= i ? '*' : ' ';
                System.out.print(ch);
                if (j != 25) {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }

        for (int i = 'A'; i <= 'Z'; i++) {
            System.out.print((char) i);
            if (i != 25) {
                System.out.print(' ');
            }
        }
        System.out.println();

        sc.close();
    }
}
