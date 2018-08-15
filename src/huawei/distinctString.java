package huawei;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;


public class distinctString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.next();
            Set<Character> set = new LinkedHashSet<>();
            for (int i = 0; i < s.length(); i++) {
                set.add(s.charAt(i));
            }
            for (char c : set) {
                System.out.print(c);
            }

        }
    }
}
