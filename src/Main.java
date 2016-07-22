import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        String T = sc.next();
        sPrint(ar(S,T));
    }



    public static boolean ar(String S, String  T) {
        Set<Character> ms = new HashSet<>();
        Set<Character> ts = new HashSet<>();
        int sLength = S.length();
        int tLength = T.length();
        if (sLength != tLength) {
            return false;
        } else {
            for (int i = 0; i < sLength; i++) {
                char si = S.charAt(i);
                char ti = T.charAt(i);
                if (si != ti) {
                    ms.add(si);
                    ts.add(ti);
                }
            }
        }
        if (ms.size() == 1 || ts.size() == 1 || (ms.size() == 2 && ts.size() == 2 && ms.equals(ts))) {
            return true;
        } else {
            return false;
        }
    }

    public static void sPrint(boolean b) {
        if (b) {
            System.out.println("Possible");
        } else {
            System.out.println("Impossible");
        }
    }

}
