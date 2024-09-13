import java.util.Scanner;

public class P056ProPro {

    static int averageNum;
    static String[] names;
    static int[] nums;

    public static boolean compareTo(int i, int j) {
        return Math.abs(nums[i] - averageNum) < Math.abs(nums[j] - averageNum);
    }

    public static void swap(int i, int j) {
        String tempName = names[i];
        names[i] = names[j];
        names[j] = tempName;

        int tempNum = nums[i];
        nums[i] = nums[j];
        nums[j] = tempNum;
    }

    public static void quickSort(int left, int right) {
        if (left >= right) {
            return;
        }
        int pivotIndex = partition(left, right);
        quickSort(left, pivotIndex - 1);
        quickSort(pivotIndex + 1, right);
    }

    public static int partition(int left, int right) {
        int pivotIndex = left; // 使用最左边的元素作为基准
        // int pivotValue = nums[pivotIndex];

        swap(pivotIndex, right); // 把基准移到最右边
        int storeIndex = left;

        for (int i = left; i < right; i++) {
            if (compareTo(i, right)) {
                swap(i, storeIndex);
                storeIndex++;
            }
        }

        swap(storeIndex, right); // 把基准交换回正确的位置
        return storeIndex;
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
        averageNum = sum / (2 * n);

        quickSort(0, n - 1); // 使用快速排序

        System.out.println(averageNum + " " + names[0]);
        sc.close();
    }
}
