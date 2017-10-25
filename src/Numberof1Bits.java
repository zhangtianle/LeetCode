import org.junit.Test;

/**
 * Created by Kyle on 2017/10/25.
 */
public class Numberof1Bits {

    public int hammingWeight(int n) {
        int num = 0;
        String s = Integer.toBinaryString(n);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                num++;
            }
        }
        return num;
    }

    public int hammingW(int n) {
        int num = 0;
        while (n != 0) {
            num = num + (n & 1);
            n = n >>> 1;
        }
        return num;
    }

    @Test
    public void test() {
        System.out.println(hammingW(11));
    }
}
