import java.util.Scanner;

public class Code2013_12_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String isbn = sc.nextLine();

        int sum = 0, cnt = 1;
        for (int i = 0; i < isbn.length() - 1; i++) {
            char ch = isbn.charAt(i);
            if (ch != '-') {
                sum += (ch - '0') * cnt++;
            }
        }

        int tailNum = sum % 11;
        char tailChar = isbn.charAt(isbn.length() - 1);
        if (tailNum == tailChar - '0' || tailNum == 10 && tailChar == 'X') {
            System.out.println("Right");
        } else {
            if (tailNum == 10) {
                tailChar = 'X';
            } else {
                tailChar = (char) (tailNum + '0');
            }
            isbn = isbn.substring(0, isbn.length() - 1) + tailChar;
            System.out.println(isbn);
        }

        sc.close();
    }
}
