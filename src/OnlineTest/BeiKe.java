package OnlineTest;

import java.util.Scanner;

public class BeiKe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {

            int n = scanner.nextInt();
            int[] num = new int[n];

            for (int i = 0; i < n; i++) {
                num[i] = scanner.nextInt();
            }

            int sum = 0;

            for (int i = 0; i < n - 1; i++) {

                for (int j = i + 1; j < n; j++) {
                    int min = num[i];
                    int maxDis = 0;
                    for (int k = i; k < j; k++) {
                        if (maxDis < num[k] - min) {
                            maxDis = num[k] - min;
                        }
                        if (min > num[k]) {
                            min = num[k];
                        }
                        sum += maxDis;
                    }

                }
            }
            System.out.println(sum);
        }

    }
}
