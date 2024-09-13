import java.util.Scanner;

public class P056Pro {

    static int avrageNum;
    static String[] names;
    static int[] nums;

    public static boolean compareTo(int i, int j) {
        return Math.abs(nums[i] - avrageNum) < Math.abs(nums[j] - avrageNum);
    }

    public static void swap(int i, int j) {
        String tempName = names[i];
        names[i] = names[j];
        names[j] = tempName;

        int tempNum = nums[i];
        nums[i] = nums[j];
        nums[j] = tempNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        names = new String[n];
        nums = new int[n];
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int num = sc.nextInt();
            sum += num;
            names[i] = name;
            nums[i] = num;
        }
        avrageNum = sum / (2 * n);
        for (int i = 0; i < n; i++) {
            for (int j = i; j > 0 && compareTo(j, j - 1); j--) {
                swap(j, j - 1);
            }
        }
        System.out.println(avrageNum + " " + names[0]);
        sc.close();
    }
}