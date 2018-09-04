package OnlineTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Qinya3 {

    static String good = "{\"high cost performance\",\"Great place\",\"Have a good time\",\"quite special\",\"good place\",\"easy of access\",\"Very worth a visit\", \"tickets are cheap\", \"convenient traffic\", \"overall feels good\", \"worth to see\", \"very convenient traffic\", \"very fun\", \"a good place\", \"The ticket is cost-effective\", \"the overall feeling is good\", \"the place worth going\", \"the view is good\", \"the overall is not bad\", \"feel good\", \"the scenery is very good\", \"the scenery is not bad\", \"I like it very much\", \"Really good\", \"It's worth seeing\", \"The ticket is not expensive\", \"The ticket is very cheap\", \"The scenery is not bad\", \"The price is very good\", \"It's still very good\", \"The scenery is very good\", \"The environment is great\", \"The scenery is OK\", \"The air is very fresh\", \"Very worth seeing\", \"Very worth going\", \"Good view\", \"Good traffic\",\" Value this price\", \"good value for money\"}";
    static String bad = "{\"low cost performance\", \"I don't prefer it\", \"Nothing fun\", \"Nothing special\", \"Nothing good-looking\", \"Traffic is not very convenient\", \"Nothing special\", \"Tickets are too expensive\", \"Traffic inconvenient\", \"The overall feeling is bad\", \"Nothing to play\", \"Never come again\", \"Nothing to see\", \"Feeling bad\", \"Tickets are a bit expensive\", \"very bad\", \"The scenery is bad\", \"There is nothing to watch\", \"I don't like it\", \"The price is a bit expensive\", \"cost performance is too low\", \"I feel not good\", \"not high cost performance\", \"Not very fun\", \"Tickets are not cheap \", \"traffic is not convenient\", \"the scenery is not good\", \"nothing to play\", \"too commercial\", \"tickets are expensive\", \"fare is a bit expensive\", \"nothing to see\", \"price not cheap\", \"price is very high\", \"ticket too expensive\", \"The traffic is not good\", \"The ticket is too expensive\", \"The scenery is very poor\", \"Not worth the price\", \"The traffic is bad\"}";

    public static void main(String[] args) {

        Map<String, Integer> mapGood = trainMap(good);
        Map<String, Integer> mapBad = trainMap(bad);

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            s = s.toLowerCase();
            s = s.replaceAll(",", " ");
            String[] ss = s.split(" ");
            float goodCount = 0;
            float badCount = 0;
            for (int i = 0; i < ss.length; i++) {
                if (mapGood.containsKey(ss[i])) {
                    goodCount += mapGood.get(ss[i]);
                }
                if (mapBad.containsKey(ss[i])) {
                    badCount += mapBad.get(ss[i]);
                }
            }
            if ((goodCount / mapGood.get("#count")) > (badCount / mapBad.get("#count"))) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }


    private static Map<String, Integer> trainMap(String str) {
        str = str.toLowerCase();
        str = str.replaceAll("\"", "");
        str = str.replaceAll(",", " ");

        int count = 0;

        Map<String, Integer> map = new HashMap<>();
        String[] strings = str.split(" ");
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals("")) {
                continue;
            }
            count++;
            if (map.containsKey(strings[i])) {
                map.put(strings[i], map.get(strings[i]) + 1);
            } else {
                map.put(strings[i], 1);
            }
        }
        map.put("#count", count);
        return map;
    }
}
