package huawei;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Kyle on 2017/8/23.
 */
public class ddd {
    public static void main(String[] args)throws Exception{
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            long l = scanner.nextLong();

            String lString = l + "";
            char[] c = lString.toCharArray();
            Set<Character> set = new HashSet<>();
            String sInt = "";
            for (Character cc : c) {
                if (!set.contains(cc)) {
                    set.add(cc);
                    sInt += cc;
                }
            }
            System.out.println(sInt);
        }
    }
}
