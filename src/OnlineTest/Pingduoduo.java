package OnlineTest;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Pingduoduo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            String[] ss = s.split(":");
            int hours = Integer.parseInt(ss[0]);
            int mins = Integer.parseInt(ss[1]);

            int minD = mins * 6;
            double hoursD = hours * 30 + mins * 0.5;

            double r = Math.abs(minD - hoursD);

            if (r > 360) {
                r = r - 360;
            }

            if (r > 180) {
                r = 360 - r;
            }

            if (isInt(r)) {
                System.out.println((int) r);
            } else {
                System.out.println(r);
            }
        }

    }
    public static boolean isInt(double dou) {
        Pattern pattern = Pattern.compile("\\d+\\.[0]");
        return pattern.matcher(dou + "").matches();
    }
}
