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