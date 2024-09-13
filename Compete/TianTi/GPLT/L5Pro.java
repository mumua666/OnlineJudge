import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L5Pro {

    public static int findAllSubStrs(String line, String str) {
        int index = 0;
        int cnt = 0;
        while (index < str.length()) {
            index = line.indexOf(str, index);
            if (index == -1) {
                break;
            } else {
                index += str.length();
                cnt++;
            }
        }
        return cnt;
    }

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
        sc.nextLine();
        String line = sc.nextLine();
        int cnt = 0;
        for (int i = 0; i < strList.size(); i++) {
            String str = strList.get(i);
            cnt += findAllSubStrs(line, str);
            line = line.replaceAll(str, "<censored>");
            if (cnt >= k) {
                break;
            }
        }
        if (cnt < k) {
            System.out.println(line);
        } else {
            System.out.println(cnt);
            System.out.println("He Xie Ni Quan Jia!");
        }
        sc.close();
    }
}