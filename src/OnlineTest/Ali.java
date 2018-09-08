package OnlineTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ali {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            String points = scanner.nextLine();

            String[] xg = s.split(",");
            String[] split = points.split(",");

            Point p = new Point(Integer.parseInt(xg[0]), Integer.parseInt(xg[1]));

            List<Point> list = new ArrayList<>();
            for (int i = 0; i < split.length - 1; ) {
                Point temp = new Point(Integer.parseInt(split[i]), Integer.parseInt(split[i+1]));
                list.add(temp);
                i = i + 2;
            }

            if (isInRegion(p, list)) {
                System.out.println("yes,0");
            } else {
                int min = Integer.MAX_VALUE;
                for (Point region : list) {
                    min = Math.min(Math.abs(region.x - p.x) + Math.abs(region.y - p.y), min);
                }
                System.out.println("no," + min);
            }
        }

    }

    private static boolean isInRegion(Point p, List<Point> pointList) {
        for (Point model : pointList) {
            if (p.equals(model)) {
                return true;
            }
        }
        Point p1;
        Point p2;
        int count = 0;
        int x1, y1, x2, y2;
        for (int i = 0; i < pointList.size() - 1; i++) {
            p1 = pointList.get(i);
            p2 = pointList.get(i + 1);
            x1 = p1.x;
            x2 = p2.x;
            y1 = p1.y;
            y2 = p2.y;
            if (y1 == y2) {
                continue;
            }
            if (p.y < Math.min(y1, y2)) {
                continue;
            }
            if (p.y > Math.max(y1, y2)) {
                continue;
            }
            int x = x2 - ((x2 - x1) * (y2 - p.y) / (y2 - y1));
            if (x < p.x) {
                continue;
            }
            count++;
        }
        return count % 2 == 1;
    }

    static class Point {
        int x;
        int y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
