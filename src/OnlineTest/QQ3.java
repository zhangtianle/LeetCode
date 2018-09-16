package OnlineTest;

import java.util.Arrays;
import java.util.Scanner;

public class QQ3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            int[] e = new int[3];
            e[0] = a;
            e[1] = b;
            e[2] = c;

            Arrays.sort(e);

            int count = 0;

            for (int i = 1; i <= e[0]; i++) {
                for (int j = 1; j <= e[1]; j++) {


                    for (int k = 1; k <= e[2]; k++) {
                        if (sanjiao(i, j, k)) {
                            count++;
                        } else break;
                    }
                }
            }
            System.out.println(count);
        }
    }

    private static boolean sanjiao(int a, int b, int c) {
        int[] e = new int[3];
        e[0] = a;
        e[1] = b;
        e[2] = c;

        Arrays.sort(e);
        if (e[0] + e[1] > e[2]) {
            return true;
        } else {
            return false;
        }
    }
}
