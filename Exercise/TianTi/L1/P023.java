import java.util.Scanner;

public class P023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int[] cntArr = new int[4];
        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            switch (ch) {
                case 'G':
                case 'g':
                    cntArr[0]++;
                    break;

                case 'P':
                case 'p':
                    cntArr[1]++;
                    break;
                case 'L':
                case 'l':
                    cntArr[2]++;
                    break;
                case 'T':
                case 't':
                    cntArr[3]++;
                    break;
            }
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 4; i++) {
            min = min < cntArr[i] ? min : cntArr[i];
        }
        for (int i = 0; i < 4; i++) {
            cntArr[i] -= min;
        }
        while (min-- > 0) {
            System.out.print("GPLT");
        }
        while (true) {
            if (cntArr[0] + cntArr[1] + cntArr[2] + cntArr[3] == 0) {
                System.out.println();
                break;
            }
            if (cntArr[0] != 0) {
                System.out.print('G');
                cntArr[0]--;
            }
            if (cntArr[1] != 0) {
                System.out.print('P');
                cntArr[1]--;
            }
            if (cntArr[2] != 0) {
                System.out.print('L');
                cntArr[2]--;
            }
            if (cntArr[3] != 0) {
                System.out.print('T');
                cntArr[3]--;
            }
        }
        sc.close();
    }
}