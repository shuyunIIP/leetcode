package com.hot100;

import java.util.HashMap;
import java.util.Map;

/**
 * 1. 两数之和
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案，并且你不能使用两次相同的元素。
 * 你可以按任意顺序返回答案。
 *
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1]
 */
public class LeetCode0001 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            if(map.containsKey(target-num)){
                return new int[]{map.get(target-num),i};
            }else{
                map.put(num,i);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        LeetCode0001 solution = new LeetCode0001();
        int[] ans = solution.twoSum(new int[]{2,7,11,15},9);
        StringBuilder sb = new StringBuilder("[");
        if(ans !=null){
            sb.append(ans[0]).append(",").append(ans[1]);
        }
        sb.append("]");
        System.out.println(sb.toString());
    }
}
