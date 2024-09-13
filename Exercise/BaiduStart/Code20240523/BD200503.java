package Code20240523;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BD200503 {

    public static void processLine(String line, Map<String, String> replaceMap) {
        for (Map.Entry<String, String> entry : replaceMap.entrySet()) {
            line = line.replace(entry.getKey(), entry.getValue());
        }
        System.out.println(line);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> replaceMap = new HashMap<>();
        int n = sc.nextInt();
        while (n-- > 0) {
            String oldStr = sc.next();
            String newStr = sc.next();
            replaceMap.put(oldStr, newStr);
        }
        int m = sc.nextInt();
        sc.nextLine();
        while (m-- > 0) {
            String line = sc.nextLine();
            processLine(line, replaceMap);
        }
        sc.close();
    }
}
