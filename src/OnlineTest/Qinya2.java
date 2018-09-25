package OnlineTest;

import java.util.Scanner;

public class Qinya2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int t = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 1; i <= n; i++) {
                arr[i - 1] = i;
            }
            int time = t;
            int last = n - 1;
            int first = n - 2;
            boolean b = true;
            while (time > 0) {
                swap(arr, first, last);
                time--;
                if (b && first > 0) {
                    first--;
                    b = false;
                } else if (!b && last > 0) {
                    last--;
                    b = true;
                }
            }
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < arr.length; i++) {
                if (i < arr.length - 1)
                    sb.append(arr[i] + " ");
                else
                    sb.append(arr[i]);
            }
            System.out.println(sb.toString());

        }

    }

    private static void swap(int[] arr, int i, int j) {
        int t = arr[j];
        arr[j] = arr[i];
        arr[i] = t;
    }


}
