package nowcoder;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            String t = sc.nextLine();

            int sLen = s.length();
            int tLen = t.length();

            int dif = sLen - tLen;

            int count = 0;

            for (int i = 0; i <= dif ; i++) {
                for (int j = 0; j < tLen; j++) {
                    if (s.charAt(j+i) != t.charAt(j)) {
                        count++;
                    }
                }
            }


            System.out.println(count);

        }
    }


}
