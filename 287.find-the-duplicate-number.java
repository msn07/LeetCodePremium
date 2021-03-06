/*
 * @lc app=leetcode id=287 lang=java
 *
 * [287] Find the Duplicate Number
 *
 * https://leetcode.com/problems/find-the-duplicate-number/description/
 *
 * algorithms
 * Medium (51.80%)
 * Likes:    3186
 * Dislikes: 378
 * Total Accepted:    241.4K
 * Total Submissions: 465.9K
 * Testcase Example:  '[1,3,4,2,2]'
 *
 * Given an array nums containing n + 1 integers where each integer is between
 * 1 and n (inclusive), prove that at least one duplicate number must exist.
 * Assume that there is only one duplicate number, find the duplicate one.
 * 
 * Example 1:
 * 
 * 
 * Input: [1,3,4,2,2]
 * Output: 2
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: [3,1,3,4,2]
 * Output: 3
 * 
 * Note:
 * 
 * 
 * You must not modify the array (assume the array is read only).
 * You must use only constant, O(1) extra space.
 * Your runtime complexity should be less than O(n^2).
 * There is only one duplicate number in the array, but it could be repeated
 * more than once.
 * 
 * 
 */

// @lc code=start
class Solution {
    public int findDuplicate(int[] nums) {
        // fast catch slow means there is a loop
        int slow = nums[0], fast = nums[0];
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        // find the start of loop -> duplicate num
        int ans = nums[0];
        while (ans != slow) {
            ans = nums[ans];
            slow = nums[slow];
        }
        return slow;
    }
}
// @lc code=end
