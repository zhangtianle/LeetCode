package OnlineTest;

import java.util.Arrays;
import java.util.Scanner;

public class NetEase4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int[] arr = new int[3];
            arr[0] = scanner.nextInt();
            arr[1] = scanner.nextInt();
            arr[2] = scanner.nextInt();

            Arrays.sort(arr);

            System.out.println(arr[2] - arr[0]);

        }

    }
}
