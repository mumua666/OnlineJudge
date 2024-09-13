import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class P027 {

    static class MyComp implements Comparator<Integer> {

        @Override
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }

    }

    public static String getStr(int[] arr) {
        String arrStr = Arrays.toString(arr);
        arrStr = arrStr.replace(" ", "");
        arrStr = arrStr.replace("[", "{");
        arrStr = arrStr.replace("]", "}");
        return arrStr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Set<Integer> numSet = new TreeSet<>(new MyComp());
        for (int i = 0; i < str.length(); i++) {
            int num = str.charAt(i) - '0';
            numSet.add(num);
        }
        int[] arr = new int[numSet.size()];
        int[] index = new int[11];
        int k = 0;
        List<Integer> arrList = new ArrayList<>();
        for (Integer num : numSet) {
            arr[k++] = num;
            arrList.add(num);
        }
        for (int i = 0; i < 11; i++) {
            index[i] = arrList.indexOf(str.charAt(i) - '0');
        }
        String arrPrefix = "int[] arr = new int[]";
        String indexPrefix = "int[] index = new int[]";
        System.out.println(arrPrefix + getStr(arr) + ";");
        System.out.println(indexPrefix + getStr(index) + ";");
        sc.close();
    }
}