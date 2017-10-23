package nowcoder.huawei;

import java.util.*;

/**
 * Created by Kyle on 2017/8/23.
 */
public class AugTest {
    public static void main(String[] args)throws Exception{

        System.out.println(dupMax(4879));

//        test();
    }

    public static void test() {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int[] a = new int[10];
            long l = scanner.nextLong();

            for (int i = 0; i < 10; i++) {
                a[i] = 0;
            }
            long m = l;
            while (m != 0) {
                a[(int) m % 10]++;
                m /= 10;
            }

            String ls = l + "";
            char[] chars = ls.toCharArray();
            for (char c : chars) {

            }

        }
    }

    public static String dupMax(int num){
        char[] cha=(num+"").toCharArray();
        char[] res=new char[cha.length];
        int index=0;
        Arrays.sort(cha);
        for(int i=cha.length-1;i>0;i--){
            if(cha[i]==cha[i-1])
                cha[i]=0;
        }
        String Res="";
        for(int i=cha.length-1;i>-1;i--){
            if(cha[i]!=0)
                Res+=cha[i];
        }

        return Res;
    }
}
