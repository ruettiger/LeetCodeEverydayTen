package com.rudy.study.oneday;

/*
1.两数之和
给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。

示例:
给定 nums = [2, 7, 11, 15], target = 9
因为 nums[0] + nums[1] = 2 + 7 = 9
所以返回 [0, 1]
 */
/*
力扣第一题解题思路：
1.暴力求解 时间复杂度O(N2) 空间复杂度O(1)
2.2遍哈希 时间复杂度O(N) 空间复杂度O(N)
3.1遍哈希 时间复杂度O(N) 空间复杂度O(N)

总结：
1.方法一：暴力求解给出的是遍历一个数组找出不懂数字组合的方法。
2.
 */
public class TwoSum {
    public int[] twoSum1(int[] nums, int target) {

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) return new int[]{i, j};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public int[] twoSum2(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            
        }
    }

    public int[] twoSum3(int[] nums, int target) {

    }
}
