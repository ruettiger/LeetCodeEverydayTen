package com.rudy.study.oneday;

import java.util.HashMap;
import java.util.HashSet;

/*3. 无重复字符的最长子串
     给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。

     示例 1:
     输入: "abcabcbb"
     输出: 3
     解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。

     示例 2:
     输入: "bbbbb"
     输出: 1
     解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。

     示例 3:
     输入: "pwwkew"
     输出: 3
     解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
*/
public class LongestPalindrome {
    public int lengthOfLongestSubstring1(String s) {
        if (s.length() < 2) return s.length();
        HashSet set = new HashSet();
        int max = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length(); j++) {
                String str = s.substring(i, j + 1);
                char[] chars = str.toCharArray();
                set.clear();
                for (int k = 0; k < chars.length; k++) {
                    if (!set.add(chars[k])) break;
                    max = Math.max(max, k + 1);
                }
            }
        }
        return max;
    }

    public int lengthOfLongestSubstring2(String s) {
        int start = 0;
        int end = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            while (s.substring(start, end).contains(s.substring(i, i + 1))) {
                start++;
            }
            max = Math.max(max, end - start);
            end++;
        }
        return max;
    }
}
