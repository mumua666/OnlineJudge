import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P1603 {

    public static int convertNumStr(String numStr) {
        switch (numStr) {
            case "one":
            case "first":
            case "a":
            case "another":
                return 1 * 1 % 100;
            case "two":
            case "second":
            case "both":
                return 2 * 2 % 100;
            case "three":
            case "third":
                return 3 * 3 % 100;
            case "four":
                return 4 * 4 % 100;
            case "five":
                return 5 * 5 % 100;
            case "six":
                return 6 * 6 % 100;
            case "seven":
                return 7 * 7 % 100;
            case "eight":
                return 8 * 8 % 100;
            case "nine":
                return 9 * 9 % 100;
            case "ten":
                return 10 * 10 % 100;
            case "eleven":
                return 11 * 11 % 100;
            case "twelve":
                return 12 * 12 % 100;
            case "thirteen":
                return 13 * 13 % 100;
            case "fourteen":
                return 14 * 14 % 100;
            case "fifteen":
                return 15 * 15 % 100;
            case "sixteen":
                return 16 * 16 % 100;
            case "seventeen":
                return 17 * 17 % 100;
            case "eighteen":
                return 18 * 18 % 100;
            case "nineteen":
                return 19 * 19 % 100;
            case "twenty":
                return 20 * 20 % 100;
            default:
                return -1;
        }
    }

    public static Map<String, Integer> sortByValue(Map<String, Integer> map) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        list.sort(Map.Entry.comparingByValue());

        Map<String, Integer> result = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        String[] words = line.split(" ");
        Map<String, Integer> numMap = new TreeMap<>();
        boolean isOccur = false;
        for (String word : words) {
            String wordNew = word.toLowerCase();
            int modValue = convertNumStr(wordNew);
            if (modValue != -1) {
                isOccur = true;
                numMap.put(wordNew, modValue);
            }
        }

        // 按照 value 的大小进行排序
        Map<String, Integer> sortedByValue = sortByValue(numMap);

        // 打印结果，以检查排序是否正确
        if (isOccur) {
            sortedByValue.forEach((k, v) -> {
                if (v != 0) {
                    System.out.print(v);
                }
            });
            System.out.println();
        } else {
            System.out.println(0);
        }

        sc.close();
    }

}