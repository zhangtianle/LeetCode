package OnlineTest;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Huawei4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            String reg="(\\-*\\d+)";
            Pattern p = Pattern.compile(reg);
            Matcher m = p.matcher(str);
            int sum = 0;
            while(m.find()) {
                String s = m.group(1);
                if (s.contains("-")) {
                    int count = 0;
                    for (int i = 0; i < s.length(); i++) {
                        if (s.charAt(i) == '-') {
                            count++;
                        } else {
                            break;
                        }
                    }
                    int t = Integer.parseInt(s.substring(count, s.length()));
                    if (count % 2 == 0) {
                        sum += t;
                    } else {
                        sum = sum - t;
                    }
                } else {
                    sum += Integer.parseInt(s);
                }
            }
            System.out.println(sum);

        }
    }

}
