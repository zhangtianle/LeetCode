package OnlineTest;

import java.util.Scanner;

public class PDD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            str = str.substring(1, str.length()-1);
            String[] strings = str.split(",");
            int[] arr = new int[strings.length];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(strings[i]);
            }
            int max = 0;
            for (int i = 1; i < arr.length - 1; i++) {
                int left = i - 1;
                int right = i + 1;
                if (arr[left] <= arr[i] || arr[right] <= arr[i]) {
                    continue;
                }
                left = i;
                while (left > 0 && arr[left] < arr[left - 1]) {
                    left--;
                }
                right = i;
                while (right < args.length && arr[right] < arr[right + 1]) {
                    right++;
                }
                if (right - left + 1 > max) {
                    max = right - left + 1;
                }
            }
            System.out.println(max);
        }

    }
}
