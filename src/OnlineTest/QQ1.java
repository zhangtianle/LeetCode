package OnlineTest;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QQ1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int k = scanner.nextInt();
            String a = scanner.next();
            String b = scanner.next();

            Set<String> subStringSet = new HashSet<>();
            for (int i = 0; i <= a.length() - k; i++) {
                String sub = a.substring(i, i + k);
                subStringSet.add(sub);
            }

            int count = 0;
            for (String s : subStringSet) {
                int c = countNum4(b, s);
                count += c;
            }
            System.out.println(count);
        }
    }

    private static int countNum(String b, String subString) {
        int count = 0;
        int index = 0;
        while ((index = b.indexOf(subString, index)) != -1) {
            index++;
            count++;
        }
        return count;
    }

    private static int countNum2(String b, String subString) {
        int count = 0;
        int len = subString.length();
        for (int i = 0; i <= b.length() - len; i++) {
            if (b.substring(i, i + len).equals(subString)) {
                count++;
            }
        }
        return count;
    }

    private static int countNum3(String b, String subString) {
        int count = 0;
        int leng = b.length();
        int j = 0;
        for (int i = 0; i < leng; i++) {
            if (b.charAt(i) == subString.charAt(j)) {
                j++;
                if (j == subString.length()) {
                    count++;
                    j = 0;
                }
            } else {
                i = i - j;
                j = 0;
            }
        }

        return count;
    }

    public static int countNum4(String srcText, String findText) {
        int count = 0;
        Pattern p = Pattern.compile(findText);
        Matcher m = p.matcher(srcText);
        while (m.find()) {
            count++;
        }
        return count;
    }


}
