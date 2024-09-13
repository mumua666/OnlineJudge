import java.util.Scanner;

public class P018 {

    static class Clock {
        int hour;
        int minute;

        public Clock(int hour, int minute) {
            this.hour = hour;
            this.minute = minute;
        }

        public int getTimes() {
            if (hour <= 11 || hour == 12 && minute == 0) {
                return 0;
            } else {
                int times = hour - 12;
                if (minute != 0) {
                    times++;
                }
                return times;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String timeStr = sc.next();
        String[] times = timeStr.split(":");
        int hour = Integer.parseInt(times[0]);
        int minute = Integer.parseInt(times[1]);
        Clock clock = new Clock(hour, minute);
        int dangTimes = clock.getTimes();
        if (dangTimes == 0) {
            System.out.printf("Only %02d:%02d.  Too early to Dang.\n", clock.hour, clock.minute);
        } else {
            for (int i = 0; i < dangTimes; i++) {
                System.out.print("Dang");
            }
            System.out.println();
        }
        sc.close();
    }
}