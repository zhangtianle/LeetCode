package huawei;

import java.util.*;


public class CurPeople {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        while (scanner.hasNext()) {
            String s = scanner.next();

            if (!s.equals("-1,-1")) {
                list.add(s);
            } else {

                int[] result = new int[8];
                for (int i = 0; i < result.length; i++) {
                    result[i] = 0;
                }

                for (String s1 : list) {
                    String[] time = s1.split(",");
                    int start = Integer.parseInt(time[0]);
                    int end = Integer.parseInt(time[1]);

                    int left = start - 12;
                    int right = end - 12;

                    for (int i = left; i < right; i++) {
                        result[i] = result[i] + 1;
                    }

                }

                for (int i = 0; i < result.length; i++) {
                    int l = i + 12;
                    int r = i + 13;
                    System.out.println("[" + l + "," + r + "):" + result[i]);
                }

                list.clear();
            }

        }
    }
}
