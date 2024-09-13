import java.math.BigInteger;
import java.util.Scanner;

public class P046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String numStr = "1";
        BigInteger bigX = BigInteger.valueOf(x);
        BigInteger bigS = new BigInteger(numStr);
        BigInteger mod = bigS.mod(bigX);
        while (!mod.equals(BigInteger.ZERO)) {
            numStr += "1";
            bigS = new BigInteger(numStr);
            mod = bigS.mod(bigX);
        }
        BigInteger bigN = bigS.divide(bigX);
        System.out.println(bigN + " " + numStr.length());
        sc.close();
    }
}