package nowcoder;

import java.util.Scanner;

/**
 * 解救小易
 */
public class Netease {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(s.hasNext()) {
            int n = s.nextInt();
            int[][] num = new int[2][n];
            for (int i = 0; i < n; i++) {
                num[0][i] = s.nextInt();
            }
            for (int i = 0; i < n; i++) {
                num[1][i] = s.nextInt();
            }
            int min = Integer.MAX_VALUE;
            for(int i = 0; i < n; i++) {
                int len = num[0][i] - 1 + num[1][i] - 1;
                if (len < min) {
                    min = len;
                }
            }
            System.out.print(min);
        }
    }

}
