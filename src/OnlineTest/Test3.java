package OnlineTest;


import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.next();
            char[] chars = str.toCharArray();
            System.out.println(core(chars));
        }
    }

    private static int core(char[] chars) {
        return (int)(Math.random() * 10);
    }


    private static boolean huiwen(char[] chars) {
        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] != chars[chars.length / 2 - 1]) {
                return false;
            }
        }
        return true;
    }

}
