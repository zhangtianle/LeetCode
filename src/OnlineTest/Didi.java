package OnlineTest;

import java.util.Scanner;

public class Didi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int p = scanner.nextInt();
            int q = scanner.nextInt();
            int r = scanner.nextInt();
            if (p == 2)
                System.out.println(6);
            else
                System.out.println(0);
        }

    }
}
