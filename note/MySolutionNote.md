# LeetCode 解题笔记
## 1.Two Sum
20160423
> Given an array of integers, return indices of the two numbers such that they add up to a specific target.
> You may assume that each input would have exactly one solution.
  
> Example:
```
Given nums = [2, 7, 11, 15], target = 9,
Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
```

看到这道题，看到第一眼就是比较简单，随手写了一个双重循环，然后提交，顺利通过，但是提交后发现时间远远大于其他答案，时间复杂度为O(n^2.)后查看了下其他人的解题，发现使用hashmap可以使复杂度降为O(n)，代码如下：  
```java
public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> m = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            m.put(nums[i] ,i);
        }
        for (int i=0; i<nums.length; i++ ) {
            int d = target - nums[i];
            if ( m.containsKey(d) && m.get(d) != i) {
                return new int[] {i, m.get(d)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
```

## 2.Add Two Numbers
20160423
> You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two 
> numbers and return it as a linked list.
  
> Example:
```
Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
```

  
```java
 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode head = new ListNode(0);
        ListNode current = head;
        int carry = 0;
        while (l1 != null && l2 != null) {
            int i = carry + l1.val + l2.val;
            current.next = new ListNode(i % 10);
            current = current.next;
            carry = i / 10;
            l1 = l1.next;
            l2 = l2.next;
        }

        while (l2 != null) {
            int i = carry + l2.val;
            current.next = new ListNode(i % 10);
            current = current.next;
            carry = i / 10;
            l2 = l2.next;
        }

        while (l1 != null) {
            int i = carry + l1.val;
            current.next = new ListNode(i % 10);
            current = current.next;
            carry = i / 10;
            l1 = l1.next;
        }

        if (carry != 0 ) {
            current.next = new ListNode(carry);
        }
        return head.next;
    }
```

## 11. Container With Most Water
20160521
> Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0).  
> Find two lines, which together with x-axis forms a container, such that the container contains the most water.
> Note: You may not slant the container.

*Solution*
AKA, the general idea to find some max is to go through all cases where max value can possibly occur and keep updating the max value. The efficiency of the scan depends on the size of cases you plan to scan. To increase efficiency, all we need to do is to find a smart way of scan to cut off the useless cases and meanwhile 100% guarantee the max value can be reached through the rest of cases.

In this problem, the smart scan way is to set two pointers initialized at both ends of the array. Every time move the smaller value pointer to inner array. Then after the two pointers meet, all possible max cases have been scanned and the max situation is 100% reached somewhere in the scan. Following is a brief prove of this.

Given a1,a2,a3.....an as input array. Lets assume a10 and a20 are the max area situation. We need to prove that a10 can be reached by left pointer and during the time left pointer stays at a10, a20 can be reached by right pointer. That is to say, the core problem is to prove: when left pointer is at a10 and right pointer is at a21, the next move must be right pointer to a20.

Since we are always moving the pointer with the smaller value, i.e. if a10 > a21, we should move pointer at a21 to a20, as we hope. Why a10 >a21? Because if a21>a10, then area of a10 and a20 must be less than area of a10 and a21. Because the area of a10 and a21 is at least height[a10] * (21-10) while the area of a10 and a20 is at most height[a10] * (20-10). So there is a contradiction of assumption a10 and a20 has the max area. So, a10 must be greater than a21, then next move a21 has to be move to a20. The max cases must be reached.

```java
public int maxArea(int[] height) {
    int left = 0, right = height.length - 1;
    int maxArea = 0;

    while (left < right) {
        maxArea = Math.max(maxArea, Math.min(height[left], height[right])
                * (right - left));
        if (height[left] < height[right])
            left++;
        else
            right--;
    }

    return maxArea;
}
```