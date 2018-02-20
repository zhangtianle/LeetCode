package codingInterviews;

import org.junit.Test;

public class NumbersAppearOnce {
    //num1,num2分别为长度为1的数组。传出参数
    //将num1[0],num2[0]设置为返回结果
    public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
        int xor = 0;
        for (int i = 0; i < array.length; i++) {
            xor = xor ^ array[i];
        }

        // 找到第一个为1的位置
        int index = 0;
        while ((xor & 1) == 0) {
            xor = xor >> 1;
            index++;
        }

        // 将原数组按照index位是否为1分为两组
        int[] numOne = new int[array.length];
        int one = 0;
        int[] numTwo = new int[array.length];
        int two = 0;
        for (int j = 0; j < array.length; j++) {
            if (((array[j] >> index) & 1) == 1) {
                numOne[one++] = array[j];
            } else {
                numTwo[two++] = array[j];
            }
        }

        num1[0] = getNum(numOne);
        num2[0] = getNum(numTwo);
    }

    private int getNum(int[] arr) {
        int r = 0;
        for (int i = 0; i < arr.length; i++) {
            r ^= arr[i];
        }
        return r;
    }

    @Test
    public void test() {
        FindNumsAppearOnce(new int[]{2,4,3,6,3,2,5,5}, new int[1], new int[1]);
    }
}
