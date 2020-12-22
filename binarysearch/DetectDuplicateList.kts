fun solve(nums: IntArray): Int {
    var slow = nums[0];
    var fast = nums[0];
    slow = nums[slow]
    fast = nums[nums[fast]]
    while (slow != fast) {
        slow = nums[slow]
        fast = nums[nums[fast]]
    }
    slow = nums[0];
    while (slow != fast) {
        slow = nums[slow]
        fast = nums[fast]
    }
    return fast;
}

solve(intArrayOf(1,2,3,1))