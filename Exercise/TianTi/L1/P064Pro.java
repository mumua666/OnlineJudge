import java.util.Scanner;

public class P064Pro {

    public static boolean isDots(String str) {
        String[] dots = { "!", "?", ",", ".", ":", ";", "'" };
        for (String dot : dots) {
            if (str.startsWith(dot)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        while (n-- > 0) {
            String line = sc.nextLine();
            System.out.println(line);
            line = line.trim();
            line = line.replaceAll(" I,", " you,");
            line = line.replaceAll(" me ", " you ");
            line = line.replaceAll("\\?", "!");
            String[] strs = line.split("\\ +");
            String res = "";
            for (String str : strs) {
                if (!str.equals("")) {
                    if (!str.contains("I")) {
                        str = str.toLowerCase();
                    }
                    if (!isDots(str)) {
                        str = " " + str;
                    }
                    res += str;
                }
            }
            res = res.trim();
            res = res.replaceAll("can you", "I can");
            res = res.replaceAll("could you", "I could");
            res = "AI: " + res;
            System.out.println(res);
        }
        sc.close();
    }
}