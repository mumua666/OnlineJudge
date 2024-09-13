package Code_2023_7_23;

import java.util.Scanner;

public class P1200 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String starName = sc.nextLine();
        String groupName = sc.nextLine();

        long starNum = 1, groupNum = 1;

        for (int i = 0; i < starName.length(); i++) {
            starNum *= (starName.charAt(i) - 'A' + 1);
        }

        for (int i = 0; i < groupName.length(); i++) {
            groupNum *= (groupName.charAt(i) - 'A' + 1);
        }

        if (starNum % 47 == groupNum % 47) {
            System.out.println("GO");
        } else {
            System.out.println("STAY");
        }

        sc.close();
    }
}
