/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        String input = Integer.toString(x);
        int len = input.length();
        for(int l = 0, r=len-1;l<len/2;l++,r--){
            if(input.charAt(l)!=input.charAt(r)) {
                return false;
            }
        }

        return true;
    }
}
// @lc code=end

