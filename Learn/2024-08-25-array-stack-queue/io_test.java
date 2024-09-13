import java.util.Scanner;

public class io_test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = sc.next();
        System.out.printf("Hello %s!\n", name);
        sc.close();
    }
}