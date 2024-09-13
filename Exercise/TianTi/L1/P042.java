import java.util.Scanner;

public class P042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] dates = line.split("-");
        System.out.println(dates[2] + "-" + dates[0] + "-" + dates[1]);
        sc.close();
    }
}