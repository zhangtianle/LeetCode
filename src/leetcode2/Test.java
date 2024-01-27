import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        // int a[][]={{1,2},{1,3},{3,1},{1,-1},{-2,0}};
        // int maxl = a[0][0];
        // int minl = a[0][0];
        // int maxr = a[0][1];
        // int minr = a[0][1];
        // for (int i = 0; i<a.length; i++) {
        //     maxl = Math.max(a[i][0], maxl);
        //     minl = Math.min(a[i][0], minl);

        //     maxr = Math.max(a[i][1], maxr);
        //     minr = Math.min(a[i][1], minr);
        // }
        // System.out.println(Math.min(maxl-minl, maxr-minr));
        System.out.println(longestValidParentheses("(()"));
    }

        public static int longestValidParentheses(String s) {
            if (s==null || s.isEmpty()) {
                return 0;
            }
            int sLen = s.length();
            int len = s.length();
            while (len>0) {
                for(int i=0; i<=sLen-len; i++) {
                    String ss = s.substring(i, len+i);
                    if (isVaild(ss)) {
                        return len;
                    } 
                }
                len--;
            }
            return 0;
        }

    private static boolean isVaild(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.add('(');
            } else if (s.charAt(i) == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else {
                return false;
            }
        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
        
}