package OnlineTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Huawei {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            List<Integer> list = new ArrayList<>();
            while (scanner.hasNext()) {
                int i = scanner.nextInt();
                if (i != 0) {
                    list.add(i);
                } else {
                    break;
                }
            }
            for (int ii : list) {
                List<Integer> prime = findPrime(ii);
                int hi = prime.size();
                int count = 0;
                for (int i = 0; i < hi - 1; i++) {
                    for (int j = i + 1; j < hi; j++) {
                        int small = prime.get(i);
                        int big = prime.get(j);
                        int sum = small + big;
                        if (sum == ii) {
                            count++;
                        }
                    }
                }
                System.out.println(count);
            }
            System.out.println("end");
        }
    }

    public static List<Integer> findPrime(int n) {
        List<Integer> primes = new ArrayList<Integer>();
        primes.add(2);
        for (int i = 3; i <= n; i++) {
            int tmp = (int) Math.sqrt(i) + 1;
            for (int j = 2; j <= tmp; j++) {
                if (i % j == 0) break;
                if (j == tmp) primes.add(i);
            }
        }
        return primes;
    }
}
