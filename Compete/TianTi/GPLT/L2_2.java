import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class L2_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Map<String, TreeSet<String>> strMap = new HashMap<>();
        while (n-- > 0) {
            String line = sc.nextLine();
            String[] words = line.split(" ");
            String key = "";
            for (String word : words) {
                if (word.length() > 0) {
                    key += word.charAt(0);
                }
            }
            if (strMap.containsKey(key)) {
                strMap.get(key).add(line);
                continue;
            }
            TreeSet<String> set = new TreeSet<>();
            set.add(line);
            strMap.put(key, set);
            // System.out.println(Arrays.toString(words));
            // System.out.println(key);
        }

        int q = sc.nextInt();
        sc.nextLine();
        while (q-- > 0) {
            String line = sc.nextLine();
            String[] words = line.split(" ");
            String key = "";
            for (String word : words) {
                key += word.charAt(0);
            }
            if (!strMap.containsKey(key)) {
                System.out.println(line);
            } else {
                TreeSet<String> set = strMap.get(key);
                int cnt = 0;
                for (String str : set) {
                    cnt++;
                    System.out.print(str);
                    if (cnt != set.size()) {
                        System.out.print("|");
                    }
                }
                System.out.println();
            }
        }
        sc.close();
    }
}