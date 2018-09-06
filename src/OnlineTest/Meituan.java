package OnlineTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Meituan {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] arr = new int[n];

            int count = 0;
            List<Integer> zIndex = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int temp = sc.nextInt();
                arr[i] = temp;

                if (temp == 0) {
                    count++;
                    zIndex.add(i);
                }
            }

            if (count <= k) {
                System.out.println(n);
            } else {
                int res = len(zIndex, k, 0);


                int max = Integer.MIN_VALUE;
                int maxIndex = 0;
                for (int i = 0; i < zIndex.size(); i++) {
                    int curLen = 0;
                    if (i == 0) {
                        max = zIndex.get(0);
                        maxIndex = 0;
                    } else {
                        int i1 = zIndex.get(i) - zIndex.get(i - 1);
                        if (i1 > max) {
                            max = i1;
                            maxIndex = i;
                        }
                    }
                }
                System.out.println(max - 1);
            }
        }
    }

    private static int len(List<Integer> list, int k, int c) {
        if (c == k) {
            return 1;
        }
        int max = Integer.MIN_VALUE;
        int maxIndex = 0;
        for (int i = 0; i < list.size(); i++) {
            int curLen = 0;
            if (i == 0) {
                max = list.get(0);
                maxIndex = 0;
            } else {
                int i1 = list.get(i) - list.get(i - 1);
                if (i1 > max) {
                    max = i1;
                    maxIndex = i;
                }
            }
        }
        list.remove(maxIndex);
        len(list, k, c + 1);
        return max;
    }
}
