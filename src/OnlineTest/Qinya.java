package OnlineTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Qinya {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            List<Integer> list = new ArrayList<>();
            double res = 1;
            for (int i = 2; i <= n; i++) {
                while (n != i) {
                    if (n % i != 0) {
                        break;
                    }
                    list.add(i);
                    n = n / i;
                }
            }
            list.add(n);

            int i = 2;
            int l = 0;
            while (l < list.size()) {
                for (int k = 2; k <= i; k++) {
                    if (i % k == 0 && i != k) {
                        break;
                    }
                    if (i % k == 0 && i == k) {
                        int kk = list.get((list.size() - (l++) - 1));
                        res =  res * Math.pow(i, (kk - 1));
                    }
                }
                i++;
            }

            System.out.println((int)res);

        }

    }


}
