
import java.io.*;
import java.util.*;

public class Code2020_12_02ProPro {
    public static void main(String[] args) throws IOException {
        read in = new read();
        int m = in.nextInt();
        Set<Integer> set = new TreeSet<>();// 顺序去重存储数据点
        int[] arr = new int[100000005];
        int count = 0;
        while (m-- > 0) {
            int y = in.nextInt();
            int s = in.nextInt();
            set.add(y);
            if (s == 1) {
                arr[y]--;// 正例就减
                count++;
            } else {
                arr[y]++;// 负例就加
            }
        }
        int max = 0;// 记录正确个数
        int re = 0;// 记录最大正确个数的阈值
        for (int a : set) {
            if (max <= count) {
                max = count;
                re = a;
            }
            count += arr[a];
        }
        System.out.println(re);
        // 时间复杂度 O(nlogn)，不用Treeset直接遍历arr时间复杂度可到O(n)

    }

}

class read {

    StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int nextInt() throws IOException {
        st.nextToken();
        return (int) st.nval;
    }

    long nextLong() throws IOException {
        st.nextToken();
        return (long) st.nval;
    }

}
