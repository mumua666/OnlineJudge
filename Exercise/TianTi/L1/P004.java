import java.util.Scanner;

public class P004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        int c = (5 * (f - 32)) / 9;
        System.out.println("Celsius = " + c);
        sc.close();
    }
}
