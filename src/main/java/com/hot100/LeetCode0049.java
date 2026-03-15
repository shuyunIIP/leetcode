package com.hot100;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 49. 字母异位词分组
 * 给你一个字符串数组，请你将 字母异位词 组合在一起。可以按任意顺序返回结果列表。
 *
 * 输入: strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
 * 输出: [["bat"],["nat","tan"],["ate","eat","tea"]]
 */
public class LeetCode0049 {

    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String,List<String>> map = new HashMap<>();
       for(String s:strs){
           char[] chars = s.toCharArray();
           Arrays.sort(chars);
           String key = new String(chars);
           List<String> list = map.getOrDefault(key,new ArrayList<>());
           list.add(s);
           map.put(key,list);
       }
       return map.values().stream().toList();
    }

    public List<List<String>> groupAnagrams1(String[] strs) {
        return Arrays.stream(strs).collect(Collectors.groupingBy(str->{
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            return new String(chars);
        })).values().stream().toList();
    }
}
