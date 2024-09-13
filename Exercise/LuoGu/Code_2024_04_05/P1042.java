import java.util.Scanner;

public class P1042 {
    public static void comp11(String resLine) {
        int x = 0, y = 0;
        for (int i = 0; i < resLine.length(); i++) {
            if (resLine.charAt(i) == 'E') {
                System.out.println(x + ":" + y);
                break;
            }
            if (resLine.charAt(i) == 'W') {
                x++;
            } else {
                y++;
            }
            if (x >= 11 || y >= 11) {
                System.out.println(x + ":" + y);
                x = 0;
                y = 0;
            }
        }
    }

    public static void comp21(String resLine) {
        int x = 0, y = 0;
        for (int i = 0; i < resLine.length(); i++) {
            if (resLine.charAt(i) == 'E') {
                System.out.println(x + ":" + y);
                break;
            }
            if (resLine.charAt(i) == 'W') {
                x++;
            } else {
                y++;
            }
            if (x >= 21 || y >= 21) {
                System.out.println(x + ":" + y);
                x = 0;
                y = 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String resLine = "";
        while (sc.hasNext()) {
            resLine += sc.nextLine();
        }
        comp11(resLine);
        System.out.println();
        comp21(resLine);

        sc.close();
    }
}
