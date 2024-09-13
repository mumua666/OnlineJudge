import java.util.Scanner;

public class P003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numStr = sc.next();
        int[] numCnts = new int[10];
        for (int i = 0; i < numStr.length(); i++) {
            int index = numStr.charAt(i) - '0';
            numCnts[index]++;
        }
        for (int i = 0; i < 10; i++) {
            if (numCnts[i] != 0) {
                System.out.println(i + ":" + numCnts[i]);
            }
        }
        sc.close();
    }
}