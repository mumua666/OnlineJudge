import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class P011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String str = sc.next();
        char[] lineChs = line.toCharArray();
        char[] strChs = str.toCharArray();
        Set<Character> strChSet = new HashSet<>();
        for (int j = 0; j < strChs.length; j++) {
            strChSet.add(strChs[j]);
        }
        for (int i = 0; i < lineChs.length; i++) {
            if (strChSet.contains(lineChs[i])) {
                lineChs[i] = '\n';
            }
        }
        for (int i = 0; i < lineChs.length; i++) {
            if (lineChs[i] != '\n') {
                System.out.print(lineChs[i]);
            }
        }
        System.out.println();
        sc.close();
    }
}