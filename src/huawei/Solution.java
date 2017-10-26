package huawei;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            // 输入数据
            String sEmail = scanner.next();
            String result = "";

            // 匹配是否为邮箱
            Pattern p = Pattern.compile("[\\w&#=\\+\\$\\-\\,/\\?!~\\(\\)]+@[0-9a-zA-Z-]+\\.{1}\\w*?");
            Matcher m = p.matcher(sEmail);
            if (m.matches()) {
                String[] splitMail = sEmail.split("@");
                String[] splitCom = splitMail[1].split("\\.");
                // @前面少于3位不做匿名化 或 @与。<= 119
                int mailLength = splitMail[0].length();
                if (mailLength < 3 && splitCom[0].length() <= 119) {
                    result = sEmail;
                } else {
                    // 匿名化
                    String newName = splitMail[0].subSequence(0, mailLength - 3) + "***";
                    result = newName + "@" + splitMail[1];
                }
                System.out.print(result);
            }
        }
    }
}
