package leetcode;

import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Given an absolute path for a file (Unix-style), simplify it.
 * For example,
 * path = "/home/", => "/home"
 * path = "/a/./b/../../c/", => "/c"
 *
 * Created by Kyle on 2017/3/11.
 */
public class SimplifyPath {
    public String simplifyPath(String path) {

        String rst = "";

        String[] paths = path.split("/");
        Stack<String> stack = new Stack();
        for (String s : paths) {
            if (!"".equals(s)) {
                if("..".equals(s)) {
                    if(!stack.isEmpty()) {
                        stack.pop();
                    }
                }else if (".".equals(s)) {

                }else {
                    stack.push(s);
                }
            }
        }

        for (String s : stack) {
            rst = rst + "/" + s;
        }

        if (rst == "") {
            rst = "/";
        }

        return rst;
    }

    @Test
    public void test() {

        System.out.println(simplifyPath("/a/../c"));
    }
}
