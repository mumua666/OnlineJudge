import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class P1012 {

    static class MyComp implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {

            return o2.compareTo(o1);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String strs[] = new String[n];
        for (int i = 0; i < n; i++) {
            strs[i] = sc.next();
        }
        Arrays.sort(strs, new MyComp());
        for (int i = 0; i < n; i++) {
            System.out.print(strs[i]);
        }
        System.out.println();
        sc.close();
    }
}