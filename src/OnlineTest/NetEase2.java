package OnlineTest;

import java.util.*;

public class NetEase2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] score = new int[n];
            int[] wake = new int[n];
            for (int i = 0; i < n; i++) {
                score[i] = scanner.nextInt();
            }
            int zCount = 0;
            for (int i = 0; i < n; i++) {
                wake[i] = scanner.nextInt();
                if (wake[i] == 0) {
                    zCount++;
                }
            }

            int max = Integer.MIN_VALUE;
            int sum = 0;
            Map<Integer,Integer> sleepMap = new TreeMap<>();
            for (int i = 0; i < n; i++) {
                if (wake[i] == 1) {
                    sum += score[i];
                } else {
                    sleepMap.put(i, score[i]);
                }
            }
            System.out.println(sum + 2);
        }

    }
}
