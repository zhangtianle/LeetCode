package nowcoder;

import java.util.Scanner;

public class TreasureMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String s = sc.nextLine();
            String t = sc.nextLine();
            if (t.length() > s.length()) {
                System.out.print("No");
            } else {
                int si = 0;
                int ti = 0;
                for (int i = 0; i < s.length(); i++) {
                    if (ti < t.length() && t.charAt(ti) == s.charAt(i)) {
                        ti++;
                    }
                }
                if (ti == t.length()) {
                    System.out.print("Yes");
                } else {
                    System.out.print("No");
                }
            }
        }
    }
}
