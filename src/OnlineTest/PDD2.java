package OnlineTest;

import java.util.Scanner;

public class PDD2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String ss = scanner.nextLine();
            int len = ss.length();
            int i = 1;
            while (i <= len) {
                if (len % i == 0) {
                    int times = len / i;
                    String subs = ss.substring(0, i);
                    StringBuffer sb = new StringBuffer();
                    for (int j = 0; j < times; j++) {
                        sb.append(subs);
                    }
                    if (sb.toString().equals(ss)) {
                        System.out.println(subs);
                        break;
                    }
                }
                i++;
            }
        }
    }
}
