import java.util.Scanner;

public class P064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        while (n-- > 0) {
            String line = sc.nextLine();
            System.out.println(line);
            line = line.trim();
            line = line.replaceAll("\\s{2,}", " ");
            line = line.replaceAll("\\s,", ",");
            line = line.replaceAll("\\s[.]", ".");
            line = line.replaceAll("\\s\\?", "?");
            line = line.replaceAll("\\s!", "!");
            line = line.replaceAll("\\s:", ":");
            line = line.replaceAll("\\s;", ";");
            line = line.replaceAll("\\s'", "'");
            line = line.toLowerCase();
            line = line.replaceAll("i ", "I ");
            line = line.replaceAll("i'", "I'");
            line = line.replaceAll("i,", "I,");
            line = line.replaceAll("I", "you");
            line = line.replaceAll("me ", "you ");
            line = line.replaceAll("can you", "I can");
            line = line.replaceAll("could you", "I could");
            line = line.replaceAll("\\?", "!");
            line = line.replaceAll("is", "Is");
            line = line.replaceAll("thIs", "this");
            System.out.println("AI: " + line);
        }
        sc.close();
    }
}