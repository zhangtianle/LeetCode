package OnlineTest;

import java.util.Scanner;
import java.util.Stack;

public class Lulu2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str1 = scanner.nextLine();
            String str2 = scanner.nextLine();

            Stack<Character> stack = new Stack<>();

            int len1 = str1.length();
            int len2 = str2.length();

            int add = 0;

            // 把大的放到str1
            if (len1 < len2) {
                int temp = len1;
                String temps = str1;

                len1 = len2;
                str1 = str2;

                len2 = temp;
                str2 = temps;
            }

            int dif = len1 - len2;
            for (int i = 0; i < dif; i++) {
                str2 = 'a' + str2;
            }

            for (int i = len2 - 1; i >= 0 ; i--) {
                char r = (char) (add + str2.charAt(i) + str1.charAt(i) - 'a');
                // 产生进位
                if (r > 'z') {
                    add = 1;
                    r = (char) (r - 'z');
                } else {
                    add = 0;
                }
                stack.add(r);
            }

            stack.add((char) (add + 'a'));

            while (!stack.isEmpty()) {
                System.out.print(stack.pop());
            }
        }
    }
}
