import java.util.Scanner;

public class P043 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] books = new int[1001];
        while (n-- > 0) {
            int times = 0, totalTime = 0;
            while (sc.hasNext()) {
                int bookNo = sc.nextInt();
                String state = sc.next();
                String time = sc.next();
                String[] timeSts = time.split(":");
                int hour = Integer.parseInt(timeSts[0]);
                int minute = Integer.parseInt(timeSts[1]);
                minute += hour * 60;
                if (bookNo == 0) {
                    break;
                }
                if ("S".equals(state)) {
                    books[bookNo] = minute;
                } else if ("E".equals(state) && books[bookNo] != 0) {
                    times++;
                    totalTime += minute - books[bookNo];
                    books[bookNo] = 0;
                }
            }
            if (times == 0) {
                System.out.println("0 0");
            } else {
                int averageTime = totalTime / times;
                if (totalTime % times != 0) {
                    averageTime++;
                }
                System.out.println(times + " " + averageTime);
            }
        }
        sc.close();
    }
}