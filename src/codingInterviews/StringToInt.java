package codingInterviews;

import org.junit.Test;

public class StringToInt {
    public int StrToInt(String str) {
        if (str == null || str.trim() == "") {
            return 0;
        }
        int fuhao = 1;
        int num = 0;
        int weishu = 1;
        for (int i = str.length() - 1; i >= 0; i--) {
            char a = str.charAt(i);
            if (i == 0) {
                if (a == '+')
                    fuhao = 1;
                else if (a == '-')
                    fuhao = 0;
            } else if (a < '0' || a > '9') {
                return 0;
            }
            if (a >= '0' && a <= '9') {
                num += weishu * (a - '0');
                weishu *= 10;
            }
        }
        if (fuhao == 0)
            num = -num;
        return num;
    }

    @Test
    public void test() {
        System.out.println(StrToInt(""));
    }
}

