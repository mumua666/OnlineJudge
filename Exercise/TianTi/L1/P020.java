import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class P020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Set<Integer> idSet = new HashSet<>();
        while (n-- > 0) {
            int k = sc.nextInt();
            if (k == 1) {
                sc.nextInt();
            } else {
                while (k-- > 0) {
                    idSet.add(sc.nextInt());
                }
            }
        }
        int m = sc.nextInt();
        List<Integer> handsomeList = new ArrayList<>();
        while (m-- > 0) {
            int id = sc.nextInt();
            if (!idSet.contains(id) && !handsomeList.contains(id)) {
                handsomeList.add(id);
            }
        }
        if (handsomeList.isEmpty()) {
            System.out.println("No one is handsome");
        } else {
            for (int i = 0; i < handsomeList.size(); i++) {
                System.out.print(handsomeList.get(i));
                if (i != handsomeList.size() - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}