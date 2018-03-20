package nowcoder;

import java.util.Scanner;

/**
 * 不要二
 */
public class NOTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int w = sc.nextInt();
            int h = sc.nextInt();

            int num = 0;
            if (w % 4 == 0 || h % 4 == 0) {
                num = w * h / 2;
            } else {
                num = w * h / 2 + 1;
            }
            System.out.print(num);
        }
    }
}
