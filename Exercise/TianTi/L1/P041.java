import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P041 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numList = new ArrayList<>();
        while (sc.hasNextInt()) {
            numList.add(sc.nextInt());
        }
        System.out.println(numList.indexOf(250) + 1);
        sc.close();
    }
}