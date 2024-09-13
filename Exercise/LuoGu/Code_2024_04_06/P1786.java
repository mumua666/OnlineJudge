import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class P1786 {
    static Map<String, Integer> capitalMap = new HashMap<>();
    static Map<String, Integer> cntMap = new HashMap<>();
    static List<String> ranks = Arrays.asList("BangZhu", "FuBangZhu", "HuFa", "ZhangLao", "TangZhu", "JingYing",
            "BangZhong");
    static List<String> noOP = Arrays.asList("BangZhu", "FuBangZhu");

    static class MyCompA implements Comparator<People> {

        @Override
        public int compare(People o1, People o2) {
            if (noOP.contains(o1.capital) || noOP.contains(o2.capital)) {
                return 0;
            }
            return o2.banggong - o1.banggong;
        }

    }

    static class MyCompB implements Comparator<People> {

        @Override
        public int compare(People o1, People o2) {
            int index1 = ranks.indexOf(o1.capital);
            int index2 = ranks.indexOf(o2.capital);
            if (index1 == index2) {
                return o2.level - o1.level;
            }
            return index1 - index2;
        }

    }

    static class People {
        String name;
        String capital;
        int banggong;
        int level;

        public People(String name, String capital, int banggong, int level) {
            this.name = name;
            this.capital = capital;
            this.banggong = banggong;
            this.level = level;
        }

        public void upgradeLevel() {
            if (noOP.contains(capital)) {
                return;
            }
            for (String capital : ranks) {
                if (!noOP.contains(capital) &&
                        capitalMap.get(capital) < cntMap.get(capital) &&
                        !capital.equals("BangZhong")) {
                    this.capital = capital;
                    capitalMap.put(capital, capitalMap.get(capital) + 1);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        People[] peoples = new People[n];
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String capital = sc.next();
            int banggong = sc.nextInt();
            int level = sc.nextInt();
            peoples[i] = new People(name, capital, banggong, level);
        }

        cntMap.put("BangZhu", 1);
        cntMap.put("FuBangZhu", 2);
        cntMap.put("HuFa", 2);
        cntMap.put("ZhangLao", 4);
        cntMap.put("TangZhu", 7);
        cntMap.put("JingYing", 25);
        cntMap.put("BangZhong", Integer.MAX_VALUE);

        capitalMap.put("BangZhu", 1);
        capitalMap.put("FuBangZhu", 2);
        capitalMap.put("HuFa", 0);
        capitalMap.put("ZhangLao", 0);
        capitalMap.put("TangZhu", 0);
        capitalMap.put("JingYing", 0);
        capitalMap.put("BangZhong", 0);

        People[] copyPeoples = peoples.clone();
        Arrays.sort(copyPeoples, new MyCompA());
        for (People people : copyPeoples) {
            people.upgradeLevel();
        }

        for (int i = 0; i < peoples.length; i++) {
            for (int j = 0; j < peoples.length; j++) {
                if (peoples[i].name.equals(copyPeoples[i].name)) {
                    peoples[i].capital = copyPeoples[i].capital;
                    break;
                }
            }
        }

        Arrays.sort(peoples, new MyCompB());
        for (People people : peoples) {
            System.out.println(people.name + " " + people.capital + " " + people.level);
        }

        sc.close();
    }
}