package OnlineTest;

import java.util.Scanner;

public class Lagrange {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            int i = s.nextInt();
            if (i > 1000) i = 1000;
            if (i < -400) i = -400;
            System.out.println(lagrange(i));
        }

    }

    private static int lagrange(int x) {
        int[][] data = new int[][]{{-170, -1000}, {0, 700}, {40, 940}, {300, 2500}, {550, 7500}};
        int i = 0;
        while (i < 5 && x > data[i][0]) {
            i ++;
        }
        i--;
        if (i == 4) i = 3;
        int s = (data[i+1][1] - data[i][1]) * (x - data[i][0]);
        int t = (data[i+1][0] - data[i][0]);
        return  s / t + data[i][1];
    }
}
