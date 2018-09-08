package OnlineTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NetEase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int min = Integer.MAX_VALUE;
            int col = scanner.nextInt();
            int num = scanner.nextInt();
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < num; i++) {
                int c = scanner.nextInt();
                if (map.containsKey(c)) {
                    int temp = map.get(c);
                    map.put(c, ++temp);

                } else {
                    map.put(c, 1);
                }
            }
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (min > entry.getValue()) {
                    min = entry.getValue();
                }
            }
            System.out.println(min);
        }

    }
}
