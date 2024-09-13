import java.util.Scanner;

public class P026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "I Love GPLT";
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
        sc.close();
    }
}