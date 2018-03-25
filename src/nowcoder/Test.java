package nowcoder;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            char[] c = s.toCharArray();
            int[] ci = new int[c.length];

            Set<Integer> set = new HashSet<>();

            for (int i = 0; i < c.length; i++) {
                ci[i] = c[i] - '0';
                set.add(ci[i]);
            }

            Arrays.sort(ci);
            if (set.size() < 10) {
                for (int i = 1; i <= 10; i++) {
                    if (!set.contains(i)) {
                        System.out.println(i);
                        break;
                    }
                }
            } else {
                System.out.println(ci[1] * 10 + 1);
            }


        }
    }
}
