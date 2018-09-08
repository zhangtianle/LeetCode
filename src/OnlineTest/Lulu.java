package OnlineTest;

import java.util.Scanner;

public class Lulu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str1 = scanner.nextLine();
            String str2 = scanner.nextLine();

            boolean flag = true;
            for (int i = 0; i < str2.length(); i++) {
                if (!str1.contains(String.valueOf(str2.charAt(i)))) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }
}
