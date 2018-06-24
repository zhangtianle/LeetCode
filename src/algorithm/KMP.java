package algorithm;

public class KMP {

    public void test() {
        System.out.println(kmpSubString("BBC ABCDAB ABCDABCDABDE", "ABCDABD"));
    }

    public boolean kmpSubString(String str1, String str2) {

        return false;
    }

    public int[] matchTable(String str2) {
        int[] table = new int[str2.length()];
        for (int i = 0; i < str2.length(); i++) {
            String f = str2.substring(0, i);
            String l = str2.substring(i, str2.length());
            // TODO

        }
        return null;
    }
}
