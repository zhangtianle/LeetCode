package OnlineTest;

import java.util.Scanner;

public class Huawei3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            int sLen = str.length();
            String result = "";
            int first = 0;
            int len = 0;

            int k = 0;
            for (int i = 1; i < sLen; i++) {
                for (int j = 0; j < sLen - i; j++) {
                    char a = str.charAt(j);
                    char b = str.charAt(i + j);
                    if (a != b) {
                        k = 0;
                    } else {
                        k++;
                    }
                    if (k > len) {
                        len = k;
                        first = j - k + 1;
                    }
                }
            }
            if (len > 0 && first > 0) {
                result = str.substring(first, first + len);
                System.out.println(result + " " + len);
            } else {
                System.out.println(" 0");
            }

        }
    }

}
