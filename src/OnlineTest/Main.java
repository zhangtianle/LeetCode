package OnlineTest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int count = 0;

            for (int j = a; j <= b; j++) {
                int sum = 0;
//                int sum = (1 + j) * j / 2;

                if (j % 2 == 0) {
                    int temp = j / 2;
                    sum = temp * (j-1) + j;
                } else {
                    int temp = (j-1) / 2;
                    sum = temp * j + j;
                }

//                for (int i = 1; i <= j; i++) {
//                    sum += i;
//                }
                if (sum % 3 == 0) {
                    count++;
                }
            }
            System.out.println(count);
        }

    }
}
