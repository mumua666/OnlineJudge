import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class L2_3 {
    public static boolean isMeet = true;
    public static String resStr = "";

    public static int cntDegree(Map<Integer, List<Integer>> tree, int node) {
        List<Integer> list = tree.get(node);
        int maxDegree = list.size();
        for (Integer subNode : list) {
            if (tree.containsKey(subNode)) {
                maxDegree = Math.max(maxDegree, cntDegree(tree, subNode));
            }
        }
        return maxDegree;
    }

    public static boolean isMeet(Map<Integer, List<Integer>> tree, int node, int maxDegree) {
        List<Integer> list = tree.get(node);
        int degree = list.size();
        for (Integer subNode : list) {
            if (tree.containsKey(subNode)) {
                degree = Math.max(degree, cntDegree(tree, subNode));
                isMeet(tree, subNode, maxDegree);
            }
        }
        if (degree != maxDegree) {
            isMeet = false;
        }
        return isMeet;
    }

    public static void show(Map<Integer, List<Integer>> tree, int node) {
        List<Integer> list = tree.get(node);
        for (Integer subNode : list) {
            // System.out.print(subNode + " ");
            resStr += subNode + " ";
            if (tree.containsKey(subNode)) {
                show(tree, subNode);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, List<Integer>> tree = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            int father = sc.nextInt();
            if (tree.containsKey(father)) {
                tree.get(father).add(i);
                continue;
            }
            List<Integer> list = new ArrayList<>();
            list.add(i);
            tree.put(father, list);
        }
        int maxDegree = cntDegree(tree, 0);
        String res = isMeet(tree, tree.get(0).get(0), maxDegree) ? "yes" : "no";
        System.out.println(maxDegree + " " + res);
        show(tree, 0);
        System.out.println(resStr.trim());
        sc.close();
    }
}