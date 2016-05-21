import org.junit.Test;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    @Test
    public void test() {
        int[] arrayToSort = new int[] { 48, 5, 89, 80, 81, 23, 45, 16, 2 };
        System.out.println("排序前");
        for (int i = 0; i < arrayToSort.length; i++)
            System.out.println(arrayToSort[i]);
        // 调用数组的静态排序方法sort
        Arrays.sort(arrayToSort);
        System.out.println("排序后");
        for (int i = 0; i < arrayToSort.length; i++)
            System.out.println(arrayToSort[i]);
    }
}
