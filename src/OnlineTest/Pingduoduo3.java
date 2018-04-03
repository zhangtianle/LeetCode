package OnlineTest;

import java.util.*;

public class Pingduoduo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            while (scanner.hasNext()) {
                List<Integer> list = new ArrayList<>();
                String s = scanner.nextLine();
                String[] ss = s.split(" ");
                int[] c = new int[ss.length];
                for (int i = 0; i < ss.length; i++) {
                    c[i] = Integer.parseInt(ss[i]);
                }
                for (int i = 0; i < ss.length; i++) {
                    list.add(c[i]);
                }

                Map<Integer, Integer> map = new HashMap<>();
                for (int i = 0; i < ss.length; i++) {
                    if (map.containsKey(c[i])) {
                        map.put(c[i], map.get(c[i]) + 1);
                    } else {
                        map.put(c[i], 1);
                    }
                }
                sortMapByKey(map);
                int l = ss.length;
                for (Map.Entry<Integer, Integer> m : map.entrySet()) {
                    System.out.println(l);
                    int value = m.getValue();
                    l -= value;
                }

            }
        }

    }

    public static Map<Integer, Integer> sortMapByKey(Map<Integer, Integer> map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        Map<Integer, Integer> sortMap = new TreeMap<Integer, Integer>(
                new MyMapKeyComparator());
        sortMap.putAll(map);
        return sortMap;
    }

    static class MyMapKeyComparator implements Comparator<Integer>{
        @Override
        public int compare(Integer one, Integer two) {
            return one.compareTo(two);
        }
    }
}
