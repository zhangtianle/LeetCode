package OnlineTest;

import java.util.Scanner;

public class Huawei {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            float p = scanner.nextFloat();

            double p1;
            double p2;
            if (n >= 3) {
                p1 = p * n * 0.7;
            } else {
                p1 = p * n;
            }
            if (p1 < 50) {
                p1 = p1 + 10;
            }

            p2 = n * p;
            int time = (int) (p2 / 10);
            p2 = p2 - time * 2;
            if (p2 < 99) {
                p2 = p2 + 6;
            }

            p1 = Math.round(p1);
            p2 = Math.round(p2);

            if (p1 < p2) {
                System.out.println(1);
            } else if (p1 > p2) {
                System.out.println(2);
            } else {
                System.out.println(0);
            }
        }
    }

}
