package OnlineTest;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int[] num = new int[3];
            num[0] = scanner.nextInt();
            num[1] = scanner.nextInt();
            num[2] = scanner.nextInt();

            Arrays.sort(num);

            int count = 0;

            int dif1 = num[2] - num[1];

            count += dif1;
            num[0] += dif1;
            num[1] += dif1;
            int dif = num[1] - num[0];
            if (dif % 2 == 0) {
                count = count + dif /2;
            } else {
                count = count + dif / 2 + 2;
            }

            System.out.println(count);

        }

    }
}
