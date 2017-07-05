package nowcoder.huawei;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Kyle on 2017/7/5.
 * 题目描述
 开发一个坐标计算工具， A表示向左移动，D表示向右移动，W表示向上移动，S表示向下移动。从（0,0）点开始移动，从输入字符串里面读取一些坐标，并将最终输入结果输出到输出文件里面。

 输入：
 合法坐标为A(或者D或者W或者S) + 数字（两位以内）
 坐标之间以;分隔。
 非法坐标点需要进行丢弃。如AA10;  A1A;  $%$;  YAD; 等。
 下面是一个简单的例子 如：
 A10;S20;W10;D30;X;A1A;B10A11;;A10;

 处理过程：

 起点（0,0）

 +   A10   =  （-10,0）
 +   S20   =  (-10,-20)
 +   W10  =  (-10,-10)
 +   D30  =  (20,-10)
 +   x    =  无效
 +   A1A   =  无效
 +   B10A11   =  无效
 +  一个空 不影响
 +   A10  =  (10,-10)

 结果 （10， -10）

 输入描述:
 一行字符串

 输出描述:
 最终坐标，以,分隔
 示例1
 输入

 A10;S20;W10;D30;X;A1A;B10A11;;A10;
 输出

 10,-10
 *
 *
 */
public class CoordinateCalculation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String sInput = s.nextLine();
        String[] ss = sInput.split(";");

        int x = 0;
        int y = 0;

        Pattern p = Pattern.compile("[AWSD][0-9]{1,2}");
        for(String s1 : ss) {
            Matcher m = p.matcher(s1);
            if (m.matches()) {
                char dir = s1.charAt(0);
                int lens = Integer.parseInt(s1.substring(1, s1.length()));
                if (dir == 'A') {
                    x -= lens;
                } else if (dir == 'W') {
                    y += lens;
                } else if (dir == 'S') {
                    y -= lens;
                } else {
                    x += lens;
                }
            }
        }

        System.out.println(x + "," + y);
    }
}
