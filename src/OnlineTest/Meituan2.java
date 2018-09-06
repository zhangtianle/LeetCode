package OnlineTest;

import java.util.Scanner;

public class Meituan2 {
    public static int
    findMaxLength(int[] nums, int k){
        if(nums == null || nums.length == 0)
            return 0;
        int[] cnts = new int[nums.length];
        int c = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                cnts[i] = 1;
                c +=1;
            }
        }
        if(nums.length - c <= k)
            return nums.length;
        int[] res = {Integer.MIN_VALUE};
        findMaxLength(nums, cnts, k, res);
        return res[0];
    }
    public static void findMaxLength(int[] nums, int[] cnt, int k, int[] res){
        if(k == 0){
            int tmp = 0;
            for(int i = 0; i < cnt.length; i++){
                if(cnt[i] == 1)
                    tmp +=1;
                else{
                    res[0] = res[0] > tmp ? res[0] : tmp;
                    tmp = 0;
                }
            }
            res[0] = res[0] > tmp ? res[0] : tmp;
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if (nums[i] == 0 && cnt[i] == 0){
                cnt[i] = 1;
                findMaxLength(nums, cnt, k - 1, res);
                cnt[i] = 0;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[] nums = new int[N];
            for(int i = 0; i < N; i++){
                nums[i] = sc.nextInt();
            }
            System.out.println(findMaxLength(nums, K));
        }
    }
}
