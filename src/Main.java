import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    @Test
    public void test() {
        Map<Character,Integer> m = new HashMap<>();
        System.out.println(m.put('a',2));
        System.out.println(m.put('b',3));
        System.out.println(m.put('a',1));
        System.out.println(m.put('a',5));
    }
}
