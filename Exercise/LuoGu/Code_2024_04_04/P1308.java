import java.util.Scanner;

public class P1308 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        sc.nextLine();
        String sentence = sc.nextLine();

        int cnt = 0, index = 0, firstIndex = -1;
        String[] words = sentence.split(" ");
        for (String w : words) {
            if (w.equalsIgnoreCase(word)) {
                cnt++;
                firstIndex = firstIndex == -1 ? index : firstIndex;
            }
            index += w.length() + 1;
        }

        if (cnt == 0) {
            System.out.println(-1);
        } else {
            System.out.printf("%d %d\n", cnt, firstIndex);
        }

        sc.close();
    }
}
