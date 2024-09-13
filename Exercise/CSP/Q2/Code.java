import java.util.*;
import java.util.stream.Collectors;

public class Code {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "apple", "cherry", "banana", "cherry", "cherry");

        Map<String, Long> countMap = list.stream()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        System.out.println(countMap); // 输出：{apple=2, banana=2, cherry=3}
    }
}
