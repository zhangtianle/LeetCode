package huawei;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Kyle on 2017/7/4.
 */
public class MergeTable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int line = scanner.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < line; i++) {
            int key = scanner.nextInt();
            int value = scanner.nextInt();
            if (map.containsKey(key)) {
                int v = map.get(key);
                int newInt = v + value;
                map.put(key, newInt);
            } else {
                map.put(key, value);
            }
        }
        Object[] keyArray = map.keySet().toArray();
        Arrays.sort(keyArray);
        for (Object o : keyArray) {
            System.out.println(o + " " + map.get(o));
        }
    }

}
