package OnlineTest;

import java.util.LinkedList;
import java.util.Scanner;

public class Pingduoduo4 {
    public void maxDiffInWindows(int[] nums, int window){
        if(nums == null || nums.length == 0)
            return;
        LinkedList<Integer> max_list = new LinkedList<Integer>();
        LinkedList<Integer> min_list = new LinkedList<Integer>();
        for(int i = 0; i < window; i++){
            while (!max_list.isEmpty() && nums[max_list.getLast()] <= nums[i])
                max_list.removeLast();
            while (!min_list.isEmpty() && nums[min_list.getLast()] >= nums[i])
                min_list.removeLast();
            max_list.addLast(i);
            min_list.addLast(i);
        }
        for(int i = window; i < nums.length; i++){
            //System.out.println(max_list);
            //System.out.println(min_list);
            System.out.print((nums[max_list.getFirst()] - nums[min_list.getFirst()])+" ");
            while (!max_list.isEmpty() && nums[max_list.getLast()] <= nums[i])
                max_list.removeLast();
            while (!max_list.isEmpty() && max_list.getFirst() <= i - window)
                max_list.removeFirst();


            while (!min_list.isEmpty() && nums[min_list.getLast()] >= nums[i])
                min_list.removeLast();
            while (!min_list.isEmpty() && min_list.getFirst() <= i - window)
                min_list.removeFirst();
            max_list.addLast(i);
            min_list.addLast(i);
        }
        while (!max_list.isEmpty() && !min_list.isEmpty()) {
            System.out.print((nums[max_list.getFirst()] - nums[min_list.getFirst()])+" ");
            max_list.removeFirst();
            min_list.removeFirst();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str1 = sc.nextLine();
            String str2 = sc.nextLine();
            String[] strs1 = str1.split(" ");

            int len = Integer.parseInt(strs1[0]);
            int window = Integer.parseInt(strs1[1]);
            String[] strs2 = str2.split(" ");
            int[] nums = new int[len];
            for(int i = 0; i < len; i++){
                nums[i] = Integer.parseInt(strs2[i]);
            }
            new Pingduoduo4().maxDiffInWindows(nums, window);
        }
    }
}