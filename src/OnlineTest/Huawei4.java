package OnlineTest;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Huawei4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            // 正则匹配，（规则：有0个或多个负号 加上 一个或多个数字）
            String reg="(\\-*\\d+)";
            Pattern p = Pattern.compile(reg);
            Matcher m = p.matcher(str);
            // 结果
            int sum = 0;
            // 使用正则表达式提取字符串中所有符合规则的数字，并对每一个遍历求和
            while(m.find()) {
                String s = m.group(1);
                // 找到含有负号的数字
                if (s.contains("-")) {
                    // 判断数字前面有几个负号
                    int count = 0;
                    for (int i = 0; i < s.length(); i++) {
                        if (s.charAt(i) == '-') {
                            count++;
                        } else {
                            break;
                        }
                    }
                    // 将数字转为int类型
                    int t = Integer.parseInt(s.substring(count, s.length()));

                    // 如果含有偶数个负号，则为正，否则为负
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
