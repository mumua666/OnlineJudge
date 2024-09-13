import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L5 {

    public static String getStr(String[] strs) {
        String res = "";
        for (int i = 0; i < strs.length; i++) {
            res += strs[i];
            if (i != strs.length - 1) {
                res += " ";
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> strList = new ArrayList<>();
        while (n-- > 0) {
            strList.add(sc.next());
        }
        int k = sc.nextInt();
        int cnt = 0;
        sc.nextLine();
        String line = sc.nextLine();
        String[] lineStrs = line.split(" ");
        for (int i = 0; i < lineStrs.length; i++) {
            if (strList.contains(lineStrs[i])) {
                cnt++;
                lineStrs[i] = "<censored>";
            }
            if (cnt >= k) {
                break;
            }
        }
        if (cnt < k) {
            System.out.println(getStr(lineStrs));
        } else {
            System.out.println(cnt);
            System.out.println("He Xie Ni Quan Jia!");
        }
        sc.close();
    }
}